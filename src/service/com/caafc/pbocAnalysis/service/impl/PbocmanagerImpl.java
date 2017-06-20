/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016-11-16 下午03:09:37
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.service.impl;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.springframework.util.CollectionUtils;

import com.alibaba.fastjson.JSONObject;
import com.caafc.pbocAnalysis.common.Constant;
import com.caafc.pbocAnalysis.dto.RePladminpunishment;
import com.caafc.pbocAnalysis.dto.RePlassetdispositionsum;
import com.caafc.pbocAnalysis.dto.RePlawardcreditinfo;
import com.caafc.pbocAnalysis.dto.RePlcontractinfo;
import com.caafc.pbocAnalysis.dto.RePlcurraccountinfo;
import com.caafc.pbocAnalysis.dto.RePlcurroverdue;
import com.caafc.pbocAnalysis.dto.RePlfellbackdebtsum;
import com.caafc.pbocAnalysis.dto.RePlforceexecution;
import com.caafc.pbocAnalysis.dto.RePllatest24monthpaymentstate;
import com.caafc.pbocAnalysis.dto.RePlmessageheader;
import com.caafc.pbocAnalysis.dto.RePloverduerecord;
import com.caafc.pbocAnalysis.dto.RePlrecorddetail;
import com.caafc.pbocAnalysis.dto.RePlrepayinfo;
import com.caafc.pbocAnalysis.dto.RePlundestoryloancard;
import com.caafc.pbocAnalysis.dto.RePlundestorystandardloa;
import com.caafc.pbocAnalysis.service.Pbocmanager;
import com.caafc.pbocAnalysis.util.AnalysisJsonUtil;
import com.caafc.pbocAnalysis.util.DateUtil;
import com.caafc.pbocAnalysis.vo.CardDetailVo;
import com.caafc.pbocAnalysis.vo.LoanDetailVo;
import com.caafc.pbocAnalysis.vo.PlguaranteeinfoVo;
import com.caafc.pbocAnalysis.vo.RePlloancardVo;

/**
 * TODO 请填写注释.
 * 
 * @author ronin
 * @version $Revision:$
 */
public class PbocmanagerImpl implements Pbocmanager {

	/**
	 * 计算信用卡产品的最近6个月的平均额度使用率
	 * 
	 * @param pbocResponse
	 * @param reportNo
	 * @throws Exception
	 */
	public String getCCardAvgLimitRate6M(List<RePlloancardVo> cardList) throws Exception {
		String cCardAvgLimitRate6M = "";
		
		if(CollectionUtils.isEmpty(cardList)){
			return Constant.SPECIAL_VAL_NONE_96;
		}
		
		//分子为空的数量
		int fenziCount = 0;
		//分母为空的数量
		int fenmuCount = 0;
		
		//分子
		BigDecimal fenzi = BigDecimal.ZERO;
		//分母
		BigDecimal fenmu = BigDecimal.ZERO;
		
		// 信用卡授信信息
		RePlawardcreditinfo awardInfo = null;
		// 信用卡使用/还款记录
		RePlrepayinfo repayInfo = null;
		
		for (RePlloancardVo vo : cardList) {
			// 获取信用卡授信信息
			awardInfo = AnalysisJsonUtil.getRePlawardcreditinfo(vo);
			// 信用卡状态
			String state = "";
			//获取帐户类型
			String accountType = "";
			if(null != awardInfo){
				//获取信用卡授信信息里面的状态
				state = awardInfo.getStateStr();
				accountType = awardInfo.getCurrency();
			}
			if(Constant.STATE_XIAOHU.equals(state)){
				continue;
			}else if("美元账户".equals(accountType)){
				continue;
			}else{
				if(awardInfo == null){
					fenmuCount++;
				}else{
					//授信金额
					BigDecimal creditlimitamount = awardInfo.getCreditlimitamount();
					if(creditlimitamount == null){
						fenmuCount++;
					}else{
						fenmu = fenmu.add(creditlimitamount);
					}
				}
			}
			
			// 获取信用卡使用/还款记录
			repayInfo = AnalysisJsonUtil.getRePlrepayinfo(vo);
			if(repayInfo == null){
				fenziCount++;
			}else{
				//最近6个月平均使用额度/最近6个月平均透支余额
				BigDecimal latest6monthusedavgamount = repayInfo.getLatest6monthusedavgamount();
				if(latest6monthusedavgamount == null){
					fenziCount++;
				}else{
					fenzi = fenzi.add(latest6monthusedavgamount);
				}
			}
		}
		//分母缺失，则取-9999
		if(fenmuCount == cardList.size()){
			return "-9999";
		}
		//分母为0，则取-9998
		if (fenmu.intValue() == 0) {
			return "-9998";
		}
		
		//分子缺失，则取-9997
		if(fenziCount == cardList.size()){
			return "-9997";
		}
		
		BigDecimal rate = fenzi.divide(fenmu, 10, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100));
		
		// 计算平均额度使用率
		cCardAvgLimitRate6M =numberFormat(rate.setScale(2, BigDecimal.ROUND_HALF_UP));
		return cCardAvgLimitRate6M;
	}

	/**
	 * 计算最近6个月内信贷产品的最大逾期期数
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getCreditLoanMaxOverdue6M(List<LoanDetailVo> loanDetailList, List<CardDetailVo> cardDetailList, RePlmessageheader header) throws Exception {
		return getCreditLoanMaxOverdue(loanDetailList, cardDetailList, header, 6, 5, 6);
	}

	/**
	 * 计算最近12个月信贷产品的最大逾期期数
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getCreditLoanMaxOverdue12M(List<LoanDetailVo> loanDetailList, List<CardDetailVo> cardDetailList, RePlmessageheader header) throws Exception {
		return getCreditLoanMaxOverdue(loanDetailList, cardDetailList, header, 12, 11, 12);
	}

	/**
	 * 计算最近24个月内信贷产品的最大逾期期数
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getCreditLoanMaxOverdue24M(List<LoanDetailVo> loanDetailList, List<CardDetailVo> cardDetailList, RePlmessageheader header) throws Exception {
		return getCreditLoanMaxOverdue(loanDetailList, cardDetailList, header, 24, 23, 24);
	}

	/**
	 * 信用卡的最大逾期期数共用方法
	 * 
	 * @param pbocReport
	 * @return
	 * @throws Exception
	 */
	private String getCreditLoanMaxOverdue(List<LoanDetailVo> loanDetailList, List<CardDetailVo> cardDetailList, RePlmessageheader header, int step1Val, int step2Val, int step3Val)
			throws Exception {
		String creditLoanMaxOverdue = "";

		// 没有贷款、贷记卡信息
		if (CollectionUtils.isEmpty(loanDetailList) && CollectionUtils.isEmpty(cardDetailList)) {
			return Constant.SPECIAL_VAL_NONE_98;
		}
		// 初始化最终结果值
		int maxVal = 0;

		// 获取征信报告查询时间
		String queryTime = getDate1(header.getQuerytime());

		// 处理贷款相关逻辑
		if (!CollectionUtils.isEmpty(loanDetailList)) {
			for (LoanDetailVo vo : loanDetailList) {
				int tempVal = loanMaxOverdue(vo, queryTime, step1Val, step2Val, step3Val);
				maxVal = (maxVal > tempVal) ? maxVal : tempVal;
			}

		}

		// 处理贷记卡相关逻辑
		if (!CollectionUtils.isEmpty(cardDetailList)) {
			for (CardDetailVo vo : cardDetailList) {
				int tempVal = cCardMaxOverdue(vo, queryTime, step1Val, step2Val, step3Val);
				maxVal = (maxVal > tempVal) ? maxVal : tempVal;
			}
		}
		creditLoanMaxOverdue = String.valueOf(maxVal);
		return creditLoanMaxOverdue;
	}
	
	/**
	 * 计算所有信贷产品最大账龄
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getCreditLoanMaxZL(List<LoanDetailVo> loanDetailList, List<CardDetailVo> cardDetailList, RePlmessageheader header) throws Exception {
		String creditLoanMaxZL = "";

		// 没有信息
		if (CollectionUtils.isEmpty(loanDetailList) && CollectionUtils.isEmpty(cardDetailList)) {
			return Constant.SPECIAL_VAL_NONE_98;
		}

		// 初始化最终结果值
		int maxVal = 0;
		// 初始化临时存储值
		int tempVal = 0;

		// 获取报告时间
		String reportTime = getDate1(header.getReportcreatetime());

		// 贷款合同信息
		RePlcontractinfo con = null;
		// 贷款信息处理
		if (!CollectionUtils.isEmpty(loanDetailList)) {
			for (LoanDetailVo vo : loanDetailList) {
				// 获取贷款合同信息
				con = vo.getContract();
				if (null == con) {
					continue;
				}
				String opendate = getDate1(con.getOpendate());
				tempVal = DateUtil.getMonths(reportTime, opendate);
				maxVal = (maxVal > tempVal) ? maxVal : tempVal;
			}
		}

		// 信用卡授信信息
		RePlawardcreditinfo ac = null;
		// 信用卡信息处理
		if (!CollectionUtils.isEmpty(cardDetailList)) {
			for (CardDetailVo vo : cardDetailList) {
				// 获取信用卡授信信息
				ac = vo.getAwardInfo();
				if (null == ac) {
					continue;
				}
				String opendate = getDate1(ac.getOpendate());
				tempVal = DateUtil.getMonths(reportTime, opendate);
				maxVal = (maxVal > tempVal) ? maxVal : tempVal;
			}
		}

		creditLoanMaxZL = String.valueOf(maxVal);
		return creditLoanMaxZL;
	}

	/**
	 * 计算最近6个月内信贷产品累计逾期次数
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getCreditLoanOverdueNum6M(List<LoanDetailVo> loanDetailList, List<CardDetailVo> cardDetailList, RePlmessageheader header) throws Exception {
		return getCreditLoanOverdueNum(loanDetailList, cardDetailList, header, 6);
	}

	/**
	 * 计算最近12个月内信贷产品累计逾期次数
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getCreditLoanOverdueNum12M(List<LoanDetailVo> loanDetailList, List<CardDetailVo> cardDetailList, RePlmessageheader header) throws Exception {
		return getCreditLoanOverdueNum(loanDetailList, cardDetailList, header, 12);
	}

	/**
	 * 计算最近24个月内信贷产品累计逾期次数
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getCreditLoanOverdueNum24M(List<LoanDetailVo> loanDetailList, List<CardDetailVo> cardDetailList, RePlmessageheader header) throws Exception {
		return getCreditLoanOverdueNum(loanDetailList, cardDetailList, header, 24);
	}
		
	/**
	 * 信贷产品累计逾期次数共用方法
	 * 
	 * @param pbocReport
	 * @return
	 * @throws Exception
	 */
	private String getCreditLoanOverdueNum(List<LoanDetailVo> loanDetailList, List<CardDetailVo> cardDetailList, RePlmessageheader header, int stepVal) throws Exception {
		String creditLoanOverdueNum = "";

		// 没有贷款、信用卡信息
		if (CollectionUtils.isEmpty(loanDetailList) && CollectionUtils.isEmpty(cardDetailList)) {
			return Constant.SPECIAL_VAL_NONE_98;
		}
		// 初始化最终汇总结果值
		int totalCount = 0;

		// 获取征信报告查询时间
		String queryTime = getDate1(header.getQuerytime());

		// 处理贷款相关逻辑
		if (!CollectionUtils.isEmpty(loanDetailList)) {
			for (LoanDetailVo vo : loanDetailList) {
				// 初始化临时存储值
				int tempVal = loanSumOverdue(vo, queryTime, stepVal);
				totalCount = totalCount + tempVal;
			}

		}

		// 处理信用卡相关逻辑
		if (!CollectionUtils.isEmpty(cardDetailList)) {
			for (CardDetailVo vo : cardDetailList) {
				// 初始化临时存储值
				int tempVal = cCardSumOverdue(vo, queryTime, stepVal);
				totalCount = totalCount + tempVal;
			}
		}

		creditLoanOverdueNum = String.valueOf(totalCount);
		return creditLoanOverdueNum;
	}
	
	/**
	 * 计算最近3个月信贷审批查询次数
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getCreditLoanQueryNum3M(List<RePlrecorddetail> recordList, RePlmessageheader header) throws Exception {
		return getCreditLoanQueryNum(recordList, header, 3);
	}

	/**
	 * 计算最近6个月信贷审批查询次数
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getCreditLoanQueryNum6M(List<RePlrecorddetail> recordList, RePlmessageheader header) throws Exception {
		return getCreditLoanQueryNum(recordList, header, 6);
	}

	/**
	 * 计算最近12个月信贷审批查询次数
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getCreditLoanQueryNum12M(List<RePlrecorddetail> recordList, RePlmessageheader header) throws Exception {
		return getCreditLoanQueryNum(recordList, header, 12);
	}

	/**
	 * 计算信贷查询次数共用方法
	 * 
	 * @param pbocReport
	 * @param month
	 * @return
	 */
	private String getCreditLoanQueryNum(List<RePlrecorddetail> recordList, RePlmessageheader header,  int month) {
		String creditLoanQueryNum = "";
		
		if (CollectionUtils.isEmpty(recordList)) {
			return Constant.SPECIAL_VAL_NONE_93;
		}

		// 按照查询原因筛选“信用卡审批”和“贷款审批”的记录，同一操作员同一月的同一查询原因为同一条记录
		List<RePlrecorddetail> resultList = new ArrayList<RePlrecorddetail>();
		for (RePlrecorddetail rd : recordList) {
			if (rd.getQueryreason().equals(Constant.QUERY_REASON_LOAN)
					|| rd.getQueryreason().equals(Constant.QUERY_REASON_CREDITCARD)) {
				// 记录不重复，放入新的结果集中
				if (!resultList.contains(rd)) {
					resultList.add(rd);
				}
			}
		}

		// 初始化统计结果集
		int count = 0;

		// 获取征信报告查询时间
		String queryTime = getDate1(header.getQuerytime());

		// 筛选查询日期与征信报告查询时间间隔月数小于等于month个月的记录
		for (RePlrecorddetail rd : resultList) {
			// 查询日期
			String dataR = getDate1(rd.getQuerydate());
			int months = DateUtil.getMonths(dataR, queryTime)+1;
			if (months <= month) {
				count++;
			}
		}

		creditLoanQueryNum = String.valueOf(count);
		return creditLoanQueryNum;
	}

	/**
	 * 计算申请人（征信报告）是否有征信
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getPbocReportFlag(List<LoanDetailVo> loanDetailList, List<CardDetailVo> cardDetailList) throws Exception {
		String pbocReportFlag = "1";

		// 没有相关信息
		if (CollectionUtils.isEmpty(loanDetailList) && CollectionUtils.isEmpty(cardDetailList)) {
			return "0";
		}

		return pbocReportFlag;
	}

	/**
	 * 计算申请人（征信报告）贷款当前逾期期数
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getLoanOverdueNum(List<LoanDetailVo> loanDetailList) throws Exception {
		String loanOverdueNum = "";

		// 没有相关信息
		if (CollectionUtils.isEmpty(loanDetailList)) {
			return Constant.SPECIAL_VAL_NONE_97;
		}

		// 初始化最终结果值
		int maxVal = 0;

		for (LoanDetailVo vo : loanDetailList) {
			List<RePlcurroverdue> curroverdueList = vo.getCurroverdueList();
			if (!CollectionUtils.isEmpty(curroverdueList)) {
				// 处理逾期信息
				for (RePlcurroverdue rePlcurroverdue : curroverdueList) {
					// 初始化临时存储值
					int tempVal = 0;
					// “当前逾期期数>0”且“当前逾期金额”>0
					if (rePlcurroverdue.getCurroverduecyc().intValue() > 0
							&& rePlcurroverdue.getCurroverdueamount().compareTo(BigDecimal.ZERO) == 1) {
						tempVal = rePlcurroverdue.getCurroverduecyc().intValue();
						maxVal = (maxVal > tempVal) ? maxVal : tempVal;
					}
				}
			}
		}

		loanOverdueNum = String.valueOf(maxVal);
		return loanOverdueNum;
	}

	/**
	 * 计算申请人（征信报告）贷款状态
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getLoanStatus(List<LoanDetailVo> loanDetailList) throws Exception {
		String loanStatus = "";
		// 没有相关信息
		if (CollectionUtils.isEmpty(loanDetailList)) {
			return Constant.SPECIAL_VAL_NONE_97;
		}

		// 初始化最终结果值
		int maxVal = 0;

		// 贷款合同信息
		RePlcontractinfo contract = null;
		
		for (LoanDetailVo vo : loanDetailList) {
			// 初始化临时存储值
			int tempVal = 0;
			// 获取贷款合同信息
			contract = vo.getContract();
			// 贷款状态
			String state = vo.getState();
			
			if (Constant.STATE_DAIZHANG.equals(state)) {//呆账
				if(null == contract){
					continue;
				}
				//获取余额
				BigDecimal balance = contract.getBalance();
				if(null == balance){
					balance = BigDecimal.ZERO;
				}
				if (balance.compareTo(BigDecimal.ZERO) == 1) {
					tempVal = 1;
				} else {
					tempVal = 0;
				}
				maxVal = (maxVal > tempVal) ? maxVal : tempVal;
			}

		}

		loanStatus = String.valueOf(maxVal);
		return loanStatus;
	}

	/**
	 * 计算申请人（征信报告）信用卡当期逾期期数
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getCCardOverdueNum(List<CardDetailVo> cardDetailList) throws Exception {
		String dCardOverdueNum = "";
		// 获取信用卡
		if (CollectionUtils.isEmpty(cardDetailList)) {
			return Constant.SPECIAL_VAL_NONE_96;
		}

		// 初始化最终结果值
		int maxVal = 0;

		//信用卡使用/还款记录
		RePlrepayinfo info = null;
		
		for (CardDetailVo vo : cardDetailList) {
			// 初始化临时存储值
			int tempVal = 0;
			// 获取信用卡使用/还款记录
			info = vo.getRepayInfo();
			if (null == info) {
				continue;
			}
			// “当前逾期期数>0”且“当前逾期金额”>0
			if (info.getCurroverduecyc().intValue() > 0
					&& info.getCurroverdueamount().compareTo(BigDecimal.ZERO) == 1) {
				tempVal = info.getCurroverduecyc().intValue();
				maxVal = (maxVal > tempVal) ? maxVal : tempVal;
			}
		}

		dCardOverdueNum = String.valueOf(maxVal);
		return dCardOverdueNum;
	}
	
	/**
	 * 计算申请人（征信报告）信用卡状态
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getCCardStatus(List<CardDetailVo> cardDetailList) throws Exception {
		String cCardStatus = "";
		// 获取信用卡
		if (CollectionUtils.isEmpty(cardDetailList)) {
			return Constant.SPECIAL_VAL_NONE_96;
		}

		// 初始化最终结果值
		int maxVal = 0;
		// 信用卡授信信息
		RePlawardcreditinfo awardInfo = null;
		// 信用卡使用/还款记录
		RePlrepayinfo repayInfo = null;
		
		for (CardDetailVo vo : cardDetailList) {
			// 初始化临时存储值
			int tempVal = 0;
			// 获取信用卡授信信息
			awardInfo = vo.getAwardInfo();
			// 获取信用卡使用/还款记录
			repayInfo = vo.getRepayInfo();
			// 信用卡状态
			String state = "";
			if(null != awardInfo){
				//获取信用卡授信信息里面的状态
				state = awardInfo.getStateStr();
			}
			// 若信用卡授信信息息里面的状态为空，则去获取使用还款记录信息里面的状态
			if (StringUtils.isBlank(state)) {
				if(null != repayInfo){
					state = repayInfo.getState();
				}
			}

			if (Constant.STATE_DAIZHANG.equals(state)) {
				if(null == awardInfo){
					continue;
				}
				//获取余额
				BigDecimal balance = awardInfo.getBalance();
				if(null == balance){
					balance = BigDecimal.ZERO;
				}
				if (balance.compareTo(BigDecimal.ZERO) == 1) {
					tempVal = 1;
				} else {
					tempVal = 0;
				}
				maxVal = (maxVal > tempVal) ? maxVal : tempVal;
			}
		}

		cCardStatus = String.valueOf(maxVal);
		return cCardStatus;
	}

	/**
	 * 计算申请人（征信报告）近24个月贷款最高逾期期数
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getLoanMaxOverdue24M(List<LoanDetailVo> loanDetailList, RePlmessageheader header) throws Exception {
		String loanMaxOverdue24M = "";

		// 没有贷款信息
		if (CollectionUtils.isEmpty(loanDetailList)) {
			return Constant.SPECIAL_VAL_NONE_97;
		}
		// 初始化最终结果值
		int maxVal = 0;

		// 获取征信报告查询时间
		String queryTime = getDate1(header.getQuerytime());

		// 处理贷款相关逻辑
		if (!CollectionUtils.isEmpty(loanDetailList)) {
			for (LoanDetailVo vo : loanDetailList) {
				// 初始化临时存储值
				int tempVal = loanMaxOverdue(vo, queryTime, 24, 23, 24);
				maxVal = (maxVal > tempVal) ? maxVal : tempVal;
			}

		}
		
		loanMaxOverdue24M = String.valueOf(maxVal);
		return loanMaxOverdue24M;
	}

	/**
	 * 计算申请人（征信报告）近24个月贷款累计逾期期数
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getLoanSumOverdue24M(List<LoanDetailVo> loanDetailList, RePlmessageheader header) throws Exception {
		String loanSumOverdue24M = "";

		// 没有贷款信息
		if (CollectionUtils.isEmpty(loanDetailList)) {
			return Constant.SPECIAL_VAL_NONE_97;
		}
		// 初始化最终汇总结果值
		int totalCount = 0;

		// 获取征信报告查询时间
		String queryTime = getDate1(header.getQuerytime());

		// 处理贷款相关逻辑
		if (!CollectionUtils.isEmpty(loanDetailList)) {
			for (LoanDetailVo vo : loanDetailList) {
				// 初始化临时存储值
				int tempVal = loanSumOverdue(vo, queryTime, 24);
				totalCount = totalCount + tempVal;
			}

		}
		
		loanSumOverdue24M = String.valueOf(totalCount);
		return loanSumOverdue24M;
	}

	/**
	 * 计算申请人（征信报告）近24个月信用卡最高逾期期数
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getCCardMaxOverdue24M(List<CardDetailVo> cardDetailList, RePlmessageheader header) throws Exception {
		String cCardMaxOverdue24M = "";

		// 贷记卡信息
		if (CollectionUtils.isEmpty(cardDetailList)) {
			return Constant.SPECIAL_VAL_NONE_96;
		}
		// 初始化最终结果值
		int maxVal = 0;

		// 获取征信报告查询时间
		String queryTime = getDate1(header.getQuerytime());


		// 处理信用卡相关逻辑
		if (!CollectionUtils.isEmpty(cardDetailList)) {
			for (CardDetailVo vo : cardDetailList) {
				// 初始化临时存储值
				int tempVal = cCardMaxOverdue(vo, queryTime, 24, 23, 24);
				maxVal = (maxVal > tempVal) ? maxVal : tempVal;
			}
		}
		cCardMaxOverdue24M = String.valueOf(maxVal);
		return cCardMaxOverdue24M;
	}

	/**
	 * 计算申请人（征信报告）近24个月信用卡累计逾期期数
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getCCardSumOverdue24M(List<CardDetailVo> cardDetailList, RePlmessageheader header) throws Exception {
		String creditLoanOverdueNum = "";

		// 贷记卡信息
		if (CollectionUtils.isEmpty(cardDetailList)) {
			return Constant.SPECIAL_VAL_NONE_96;
		}
		// 初始化最终汇总结果值
		int totalCount = 0;

		// 获取征信报告查询时间
		String queryTime = getDate1(header.getQuerytime());


		// 处理信用卡相关逻辑
		if (!CollectionUtils.isEmpty(cardDetailList)) {
			for (CardDetailVo vo : cardDetailList) {
				// 初始化临时存储值
				int tempVal = cCardSumOverdue(vo, queryTime, 24);
				totalCount = totalCount + tempVal;
			}
		}

		creditLoanOverdueNum = String.valueOf(totalCount);
		return creditLoanOverdueNum;
	}

	/**
	 * 计算申请人（征信报告）额度使用率超过80%的信用卡的张数
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getCCardOut80Rate(List<CardDetailVo> cardDetailList) throws Exception {
		String cCardOut80Rate = "";

		// 没有相关信息
		if (CollectionUtils.isEmpty(cardDetailList)) {
			return Constant.SPECIAL_VAL_NONE_96;
		}

		// 初始化统计结果值
		int count = 0;
		// 信用卡授信信息
		RePlawardcreditinfo ac = null;
		// 信用卡使用/还款记录
		RePlrepayinfo rp = null;
		for (CardDetailVo vo : cardDetailList) {
			// 计算（已用额度或者余额/授信额度）*100初始化
			BigDecimal result = BigDecimal.ZERO;

			// 获取信用卡授信信息
			ac = vo.getAwardInfo();
			if (null == ac) {
				continue;
			}
			// 获取信用卡使用/还款记录
			rp = vo.getRepayInfo();
			if (null == rp) {
				continue;
			}
			// 已用额度
			BigDecimal usedcreditlimitamount = rp.getUsedcreditlimitamount();
			// 授信额度
			BigDecimal creditlimitamount = ac.getCreditlimitamount();

			// 若分母为0则赋值为80
			if (creditlimitamount.compareTo(BigDecimal.ZERO) == 0) {
				result = new BigDecimal(80);
			} else {
				result = usedcreditlimitamount.divide(creditlimitamount, 10, BigDecimal.ROUND_HALF_UP)
						.multiply(new BigDecimal(100));
			}

			if (result.compareTo(new BigDecimal(80)) == 1) {
				count++;
			}
		}

		cCardOut80Rate = String.valueOf(count);
		return cCardOut80Rate;
	}

	/**
	 * 计算申请人（征信报告）呆账信息汇总笔数
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getBadAccountNum(JSONObject pbocReport) throws Exception {
		String badAccountNum = "";
		// 获取呆账信息汇总
		RePlfellbackdebtsum fb = AnalysisJsonUtil.getRePlfellbackdebtsum(pbocReport);

		if (null == fb) {
			return Constant.SPECIAL_VAL_NONE_94;
		}

		// 直接读取呆账信息汇总笔数
		Integer count = fb.getCount();
		if(count != null ){
			badAccountNum = String.valueOf(count);
		}
		return badAccountNum;
	}

	/**
	 * 计算申请人（征信报告）资产处置信息汇总笔数
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getAssetDisposals(JSONObject pbocReport) throws Exception {
		String assetDisposals = "";
		RePlassetdispositionsum ad = AnalysisJsonUtil.getRePlassetdispositionsum(pbocReport);
		if (null == ad) {
			return Constant.SPECIAL_VAL_NONE_94;
		}

		// 直接读取资产处置信息汇总笔数
		Integer count = ad.getCount();
		if(count != null ){
			assetDisposals = String.valueOf(count);
		}
		return assetDisposals;
	}

	/**
	 * 计算申请人（征信报告）是否存在强制执行记录
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getCourtExecutions(JSONObject pbocReport) throws Exception {
		String courtExecutions = Constant.NO;
		// 获取强制执行记录
		List<RePlforceexecution> list = AnalysisJsonUtil.getRePlforceexecution(pbocReport);
		if (!CollectionUtils.isEmpty(list)) {
			courtExecutions = Constant.YES;
		}
		
		return courtExecutions;
	}

	/**
	 * 计算申请人（征信报告）是否存在行政处罚记录
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getApRecordFlag(JSONObject pbocReport) throws Exception {
		String apRecordFlag = Constant.NO;
		// 获取行政处罚记录
		List<RePladminpunishment> list = AnalysisJsonUtil.getRePladminpunishment(pbocReport);
		if (!CollectionUtils.isEmpty(list)) {
			apRecordFlag = Constant.YES;
		}
		return apRecordFlag;
	}
	
	/**
	 * 计算准贷记卡
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getSemiCreditCard(JSONObject pbocReport) throws Exception {
		String semiCreditCard = "";
		//获取准贷记卡信息
		List<RePlloancardVo> list = AnalysisJsonUtil.getRePlstandardloancard(pbocReport);
		if(CollectionUtils.isEmpty(list)){
			return Constant.SPECIAL_VAL_NONE_98;
		}
		
		// 初始化最终结果值
		int maxVal = 0;
		// 最近24个月还款状态
		RePllatest24monthpaymentstate paymentstate = null;
		
		for (RePlloancardVo vo : list) {
			// 初始化临时存储值
			int tempVal = 0;
			// 获取最近24个月还款状态
			paymentstate = AnalysisJsonUtil
					.getRePllatest24monthpaymentstate(vo.getRePllatest24monthpaymentstateSet());
			if(null == paymentstate){
				continue;
			}
			String state = paymentstate.getLatest24state();
			if(StringUtils.isNotBlank(state)){
				//获取最后一期还款状态
				String lastState = state.substring(state.length()-1, state.length());
				if(StringUtils.isNumeric(lastState)){
					tempVal = Integer.parseInt(lastState);
				}
			}
			maxVal = (maxVal > tempVal) ? maxVal : tempVal;
		}
		
		semiCreditCard = String.valueOf(maxVal);
		return semiCreditCard;
	}

	/**
	 * 计算贷款历史逾期比例
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getLoanHisOverdueRate(List<LoanDetailVo> loanDetailList, RePlmessageheader header) throws Exception {
		String loanHisOverdueRate = "";

		// 没有贷款信息
		if (CollectionUtils.isEmpty(loanDetailList)) {
			return Constant.SPECIAL_VAL_NONE_97;
		}
		// 初始化最终汇总结果值
		BigDecimal maxVal = BigDecimal.ZERO;
		
		// 获取征信报告查询时间
		String queryTime = getDate1(header.getQuerytime());
		
		// 贷款合同信息
		RePlcontractinfo contract = null;
		
		for (LoanDetailVo vo : loanDetailList) {
			// 获取贷款合同信息
			contract = vo.getContract();
			if(contract == null){
				continue;
			}
			
			//近24个月贷款累计逾期期数
			int tempVal = loanSumOverdue(vo, queryTime, 24);
			BigDecimal sumOverdue = new BigDecimal(tempVal);
			
			//初始临时存储值
			BigDecimal tempVal2 = BigDecimal.ZERO;
			//获取状态
			String state = vo.getState();
			
			if (Constant.STATE_ZHENGCHANG.equals(state) || Constant.STATE_YUQI.equals(state) || Constant.STATE_DEFAULT.equals(state)){
				if(vo.getPaymentstate() == null){
					continue;
				}
				int period = getCountRepayStateOrIsN(vo.getPaymentstate(), queryTime, 24);
				if(period > 0){
					tempVal2 = sumOverdue.divide(new BigDecimal(period), 10, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100));
				}
			} else if (Constant.STATE_ZHUANCHU.equals(state) || Constant.STATE_JIEQING.equals(state)){
				String stateEndDate = contract.getStateENDdate();
				if(StringUtils.isNotBlank(stateEndDate)){
					stateEndDate = getDate2(stateEndDate);
					String StartDate24 = getStartDate(queryTime);
					int period = DateUtil.getMonths(stateEndDate, StartDate24);
					if(period > 0){
						tempVal2 = sumOverdue.divide(new BigDecimal(period), 10, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100));
					}
				}
			}
			
			maxVal = maxVal.compareTo(tempVal2) == 1 ? maxVal : tempVal2;
		}
		loanHisOverdueRate = numberFormat(maxVal.setScale(2, BigDecimal.ROUND_HALF_UP));
		return loanHisOverdueRate;
	}

	/**
	 * 计算单张信用卡历史逾期比例
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getOneCcardHisOverdueRate(List<CardDetailVo> cardDetailList, RePlmessageheader header) throws Exception {
		String oneCcardHisOverdueRate = "";

		// 没有贷记卡信息
		if (CollectionUtils.isEmpty(cardDetailList)) {
			return Constant.SPECIAL_VAL_NONE_96;
		}
		
		// 获取征信报告查询时间
		String queryTime = getDate1(header.getQuerytime());
		
		// 初始化最终汇总结果值
		BigDecimal maxVal = BigDecimal.ZERO;
		// 信用卡授信信息
		RePlawardcreditinfo ac = null;
		
		for (CardDetailVo vo : cardDetailList) {
			
			// 获取信用卡授信信息
			ac = vo.getAwardInfo();
			if (null == ac) {
				continue;
			}
		
			//近24个月贷记卡累计逾期期数
			int tempVal = cCardSumOverdue(vo, queryTime,24);
			BigDecimal sumOverdue = new BigDecimal(tempVal);
			//初始临时存储值
			BigDecimal tempVal2 = BigDecimal.ZERO;
			//获取状态
			String state = vo.getState();
			
			if(tempVal > 1){
				if (Constant.STATE_ZHENGCHANG.equals(state) || Constant.STATE_ZHIFU.equals(state) || Constant.STATE_DEFAULT.equals(state)) {
					if(vo.getPaymentstate() == null){
						continue;
					}
					int period = getCountRepayStateOrIsN(vo.getPaymentstate(), queryTime, 24);
					if(period > 0){
						tempVal2 = sumOverdue.divide(new BigDecimal(period), 10, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100));
					}
				} else if (Constant.STATE_XIAOHU.equals(state)) {
					String stateEndDate = ac.getStateENDdate();
					if(StringUtils.isNotBlank(stateEndDate)){
						stateEndDate = getDate2(stateEndDate);
						String StartDate24 = getStartDate(queryTime);
						int period = DateUtil.getMonths(stateEndDate, StartDate24);
						if(period > 0){
							tempVal2 = sumOverdue.divide(new BigDecimal(period), 10, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100));
						}
					}
				}
				maxVal = maxVal.compareTo(tempVal2) == 1 ? maxVal : tempVal2;
			}
		}
		
		oneCcardHisOverdueRate =numberFormat(maxVal.setScale(2, BigDecimal.ROUND_HALF_UP));
		return oneCcardHisOverdueRate;
	}

	/**
	 * 计算多张信用卡历史逾期比例
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getManyCcardHisOverdueRate(List<CardDetailVo> cardDetailList, RePlmessageheader header) throws Exception {
		String manyCcardHisOverdueRate = "";

		// 没有贷记卡信息
		if (CollectionUtils.isEmpty(cardDetailList)) {
			return Constant.SPECIAL_VAL_NONE_96;
		}
		
		// 初始化最终汇总结果值
		int count = 0;
		
		// 获取征信报告查询时间
		String queryTime = getDate1(header.getQuerytime());
		
		// 信用卡授信信息
		RePlawardcreditinfo ac = null;
		
		for (CardDetailVo vo : cardDetailList) {
			// 获取信用卡授信信息
			ac = vo.getAwardInfo();
			if (null == ac) {
				continue;
			}
			
			//近24个月信用卡累计逾期期数
			int tempVal = cCardSumOverdue(vo, queryTime, 24);
			BigDecimal sumOverdue = new BigDecimal(tempVal);
			//初始临时存储值
			BigDecimal tempVal2 = BigDecimal.ZERO;
			
			//获取状态
			String state = vo.getState();
			
			if (Constant.STATE_ZHENGCHANG.equals(state) || Constant.STATE_ZHIFU.equals(state) || Constant.STATE_DEFAULT.equals(state)) {
				if(vo.getPaymentstate() == null){
					continue;
				}
				int period = getCountRepayStateOrIsN(vo.getPaymentstate(), queryTime, 24);
				if(period > 0){
					tempVal2 = sumOverdue.divide(new BigDecimal(period), 10, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100));
				}
			} else if (Constant.STATE_XIAOHU.equals(state)) {
				String stateEndDate = ac.getStateENDdate();
				if(StringUtils.isNotBlank(stateEndDate)){
					stateEndDate = getDate2(stateEndDate);
					String StartDate24 = getStartDate(queryTime);
					int period = DateUtil.getMonths(stateEndDate, StartDate24);
					if(period > 0){
						tempVal2 = sumOverdue.divide(new BigDecimal(period), 10, BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100));
					}
				}
			}
			
			if(tempVal2.compareTo(new BigDecimal(30))==1){
				count++;
			}
		}
		
		if(count >= 2){
			manyCcardHisOverdueRate = "1";
		}else{
			manyCcardHisOverdueRate = "0";
		}
		
		return manyCcardHisOverdueRate;
	}
	
	/**
	 * 计算申请人（征信报告）贷款月负债
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getLoanMonthLiabilities(List<LoanDetailVo> loanDetailList) throws Exception {
		String loanMonthLiabilities = "";
		// 没有贷款信息
		if (CollectionUtils.isEmpty(loanDetailList)) {
			return Constant.SPECIAL_VAL_NONE_97;
		}
		//初始化最终结果值
		BigDecimal sumVal = BigDecimal.ZERO;
		
		// 获取贷款合同信息
		RePlcontractinfo contract = null;
		// 获取贷款当前账户信息
		RePlcurraccountinfo account = null;
		
		for (LoanDetailVo vo : loanDetailList) {
			// 初始化临时存储值
			BigDecimal tempVal = BigDecimal.ZERO;
			// 获取贷款合同信息
			contract = vo.getContract();
			if(contract == null){
				continue;
			}
			// 获取贷款当前账户信息
			account = vo.getAccount();
			if(account == null){
				continue;
			}
			// 贷款状态,获取贷款合同信息里面的状态
			String state = contract.getStateStr();
			// 如果贷款合同里面的状态为空，则去获取当前账户信息里面的状态
			if (StringUtils.isBlank(state)) {
				state = account.getState();
			}
			
			//最终状态为空 ，赋值为未结清
			if(StringUtils.isBlank(state)){
				state = Constant.STATE_DEFAULT;
			}
			
			if (Constant.STATE_ZHENGCHANG.equals(state) || Constant.STATE_YUQI.equals(state) || Constant.STATE_DEFAULT.equals(state)) {//未结清（正常、逾期）
				//原取值位当前账户信息里面的剩余金额，2017-1-22修改为取贷款合同里面的合同金额
				BigDecimal amount = contract.getCreditlimitamount();
				if(null == amount){
					continue;
				}
				//到期日
				String enddate = getDate1(contract.getEnddate());
				//发放日期
				String opendate = getDate1(contract.getOpendate());
				//贷款期限=到期日-发放日期
				int period = DateUtil.getMonths(opendate, enddate);
				if(period > 0){
					tempVal = amount.divide(new BigDecimal(period), 10, BigDecimal.ROUND_HALF_UP);
					sumVal = sumVal.add(tempVal);
				}
			}
		}
		loanMonthLiabilities = numberFormat(sumVal);
		return loanMonthLiabilities;
	}
	
	/**
	 * 信用卡产品最大账龄
	 * 
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public String getRESERVED_1(List<CardDetailVo> cardDetailList, RePlmessageheader header) throws Exception {
		String creditLoanMaxZL = "";

		// 没有信息
		if (CollectionUtils.isEmpty(cardDetailList)) {
			return Constant.SPECIAL_VAL_NONE_96;
		}

		// 初始化最终结果值
		int maxVal = 0;
		// 初始化临时存储值
		int tempVal = 0;

		// 获取报告时间
		String reportTime = getDate1(header.getReportcreatetime());
		
		// 信用卡授信信息
		RePlawardcreditinfo ac = null;

		// 信用卡信息处理
		if (!CollectionUtils.isEmpty(cardDetailList)) {
			for (CardDetailVo vo : cardDetailList) {
				// 获取信用卡授信信息
				ac = vo.getAwardInfo();
				if (null == ac) {
					continue;
				}
				String opendate = getDate1(ac.getOpendate());
				tempVal = DateUtil.getMonths(reportTime, opendate);
				maxVal = (maxVal > tempVal) ? maxVal : tempVal;
			}
		}

		creditLoanMaxZL = String.valueOf(maxVal);
		return creditLoanMaxZL;
	}
	
	/**
	 * 住房贷款笔数
	 */
	public String getRESERVED_2(List<LoanDetailVo> loanDetailList) throws Exception {
		String RESERVED_2 = "";
		//没有贷款信息
		if(CollectionUtils.isEmpty(loanDetailList)){
			return Constant.SPECIAL_VAL_NONE_97;
		}
		//汇总贷款种类的帐户数量
		int count = 0;
		
		// 获取贷款合同信息
		RePlcontractinfo contract = null;
		
		for (LoanDetailVo vo : loanDetailList) {
			// 获取贷款合同信息
			contract = vo.getContract();
			if(contract == null){
				continue;
			}
			//获取合同贷款类型
			String type = contract.getType();
			if ("11".equals(type) || "12".equals(type) || "13".equals(type)) {
				count++;
			}
		}
		RESERVED_2 = String.valueOf(count);
		
		return RESERVED_2;
	}
	
	/**
	 * 信用卡产品的最近6个月的平均额度使用率（授信概要）
	 */
	public String getRESERVED_3(JSONObject pbocReport) throws Exception {
		String RESERVED_3 = "";

		// 查询准贷记卡：最近6个月平均透支余额、授信总额（人民币）
		RePlundestorystandardloa zdjk = AnalysisJsonUtil.getRePlundestorystandardloa(pbocReport);
		// 查询贷记卡：最近6个月平均使用额度、授信总额
		RePlundestoryloancard djk = AnalysisJsonUtil.getRePlundestoryloancard(pbocReport);

		if (zdjk == null && djk == null) {
			RESERVED_3 = Constant.SPECIAL_VAL_NONE_94;
			return RESERVED_3;
		}

		BigDecimal creditlimitZdj = null;
		BigDecimal avgamountZdj = null;
		if (zdjk != null) {
			creditlimitZdj = zdjk.getCreditlimit();
			avgamountZdj = zdjk.getLatest6monthusedavgamount();
		}

		BigDecimal creditlimitDjc = null;
		BigDecimal avgamountDjc = null;
		if (djk != null) {

			creditlimitDjc = djk.getCreditlimit();
			avgamountDjc = djk.getLatest6monthusedavgamount();
		}

		// 判断分子是否缺失
		if (avgamountZdj == null && avgamountDjc == null) {
			return RESERVED_3 = "-9997";
		}
		// 判断分母是否缺失
		if (creditlimitZdj == null && creditlimitDjc == null) {
			return RESERVED_3 = "-9999";
		}

		if (creditlimitZdj == null)
			creditlimitZdj = new BigDecimal(0);
		if (creditlimitDjc == null)
			creditlimitDjc = new BigDecimal(0);
		if (avgamountZdj == null)
			avgamountZdj = new BigDecimal(0);
		if (avgamountDjc == null)
			avgamountDjc = new BigDecimal(0);
		// 判断分母是否为0
		if (creditlimitZdj.add(creditlimitDjc).intValue() == 0) {
			return RESERVED_3 = "-9998";
		}
		// 计算平均额度使用率
		BigDecimal rate = avgamountZdj.add(avgamountDjc).divide(creditlimitZdj.add(creditlimitDjc), 10,
			BigDecimal.ROUND_HALF_UP).multiply(new BigDecimal(100));

		// 计算平均额度使用率
		RESERVED_3 = numberFormat(rate.setScale(2, BigDecimal.ROUND_HALF_UP));
		
		return RESERVED_3;
	}
	
	/**
	 * 最近24个月内准贷记卡产品的最大逾期期数（不考虑呆账）
	 */
	public String getPO_SEMICREDITCARDNO(List<CardDetailVo> ZcardDetailList, RePlmessageheader header) throws Exception{
		String getPO_SEMICREDITCARDNO = "";

		// 准贷记卡信息
		if (CollectionUtils.isEmpty(ZcardDetailList)) {
			return Constant.SPECIAL_VAL_NONE_92;
		}
		// 初始化最终结果值
		int maxVal = 0;

		// 获取征信报告查询时间
		String queryTime = getDate1(header.getQuerytime());


		// 处理准贷记卡相关逻辑
		if (!CollectionUtils.isEmpty(ZcardDetailList)) {
			for (CardDetailVo vo : ZcardDetailList) {
				// 初始化临时存储值
				int tempVal = zCardMaxOverdueND(vo, queryTime, 24, 23, 24);
				maxVal = (maxVal > tempVal) ? maxVal : tempVal;
			}
		}
		getPO_SEMICREDITCARDNO = String.valueOf(maxVal);
		return getPO_SEMICREDITCARDNO;
	}
	
	/**
	 * 最近24个月内贷款产品的最大逾期期数（不考虑呆账）
	 */
	public String getPO_LOANTOPDUENUM24NO(List<LoanDetailVo> loanDetailList, RePlmessageheader header){
		String PO_LOANTOPDUENUM24NO = "";

		// 没有贷款信息
		if (CollectionUtils.isEmpty(loanDetailList)) {
			return Constant.SPECIAL_VAL_NONE_97;
		}
		// 初始化最终结果值
		int maxVal = 0;

		// 获取征信报告查询时间
		String queryTime = getDate1(header.getQuerytime());

		// 处理贷款相关逻辑
		if (!CollectionUtils.isEmpty(loanDetailList)) {
			for (LoanDetailVo vo : loanDetailList) {
				// 初始化临时存储值
				int tempVal = loanMaxOverdueND(vo, queryTime, 24, 23, 24);
				maxVal = (maxVal > tempVal) ? maxVal : tempVal;
			}

		}
		
		PO_LOANTOPDUENUM24NO = String.valueOf(maxVal);
		return PO_LOANTOPDUENUM24NO;
	}
	
	/**
	 * 最近24个月内单个贷款产品的累计逾期期数（不考虑呆账）
	 */
	public String getPO_LOANSUMDUENUM24NO(List<LoanDetailVo> loanDetailList, RePlmessageheader header){
		String PO_LOANSUMDUENUM24NO = "";

		// 没有贷款信息
		if (CollectionUtils.isEmpty(loanDetailList)) {
			return Constant.SPECIAL_VAL_NONE_97;
		}
		// 初始化最终汇总结果值
		int totalCount = 0;

		// 获取征信报告查询时间
		String queryTime = getDate1(header.getQuerytime());

		// 处理贷款相关逻辑
		if (!CollectionUtils.isEmpty(loanDetailList)) {
			for (LoanDetailVo vo : loanDetailList) {
				// 初始化临时存储值
				int tempVal = loanSumOverdueND(vo, queryTime, 24);
				totalCount = totalCount + tempVal;
			}

		}
		
		PO_LOANSUMDUENUM24NO = String.valueOf(totalCount);
		return PO_LOANSUMDUENUM24NO;
	}
	
	/**
	 * 最近24个月内单张贷记卡产品的最大逾期期数（不考虑呆账）
	 */
	public String getPO_DEBITCARDTOP24DUENUMNO(List<CardDetailVo> DcardDetailList,RePlmessageheader header) throws Exception{
		String PO_DEBITCARDTOP24DUENUMNO = "";

		// 贷记卡信息
		if (CollectionUtils.isEmpty(DcardDetailList)) {
			return Constant.SPECIAL_VAL_NONE_95;
		}
		// 初始化最终结果值
		int maxVal = 0;

		// 获取征信报告查询时间
		String queryTime = getDate1(header.getQuerytime());


		// 处理信用卡相关逻辑
		if (!CollectionUtils.isEmpty(DcardDetailList)) {
			for (CardDetailVo vo : DcardDetailList) {
				// 初始化临时存储值
				int tempVal = dCardMaxOverdueND(vo, queryTime, 24, 23, 24);
				maxVal = (maxVal > tempVal) ? maxVal : tempVal;
			}
		}
		PO_DEBITCARDTOP24DUENUMNO = String.valueOf(maxVal);
		return PO_DEBITCARDTOP24DUENUMNO;
	}
	
	/**
	 * 最近24个月内单张贷记卡产品的累计逾期期数(不考虑呆账)
	 */
	public String getPO_DEBITCARDSUM24DUENUMNO(List<CardDetailVo> DcardDetailList,RePlmessageheader header){
		String PO_DEBITCARDSUM24DUENUMNO = "";

		// 贷记卡信息
		if (CollectionUtils.isEmpty(DcardDetailList)) {
			return Constant.SPECIAL_VAL_NONE_95;
		}
		// 初始化最终汇总结果值
		int totalCount = 0;

		// 获取征信报告查询时间
		String queryTime = getDate1(header.getQuerytime());


		// 处理信用卡相关逻辑
		if (!CollectionUtils.isEmpty(DcardDetailList)) {
			for (CardDetailVo vo : DcardDetailList) {
				// 初始化临时存储值
				int tempVal = dCardSumOverdueND(vo, queryTime, 24);
				totalCount = totalCount + tempVal;
			}
		}

		PO_DEBITCARDSUM24DUENUMNO = String.valueOf(totalCount);
		return PO_DEBITCARDSUM24DUENUMNO;
	}
	
	/**
	 * 担保贷款五级分类
	 */
	public String getPO_ASSUREFIVE(List<PlguaranteeinfoVo> guaranteeList) throws Exception{
		String PO_ASSUREFIVE = "";
		int tempVal = -1;
		int tempStepVal = -1;
		int maxVal = -1;
		if(CollectionUtils.isEmpty(guaranteeList)){
//			return Constant.SPECIAL_VAL_NONE_91;
			tempVal = 0;
		}
		for(PlguaranteeinfoVo vo : guaranteeList){
			if(null == vo.getRePlguarantee()){
				tempVal = 0;
			}else{
				String class5state = vo.getRePlguarantee().getClass5state();
				if(Constant.STATE_GUANZHU.equals(class5state) || Constant.STATE_CIJI.equals(class5state) || Constant.STATE_KEYI.equals(class5state) || Constant.STATE_SUNSHI.equals(class5state)){
					tempVal = 1;
				}else{
					tempVal = 0;
				}
			}
			tempStepVal = (tempStepVal > tempVal) ? tempStepVal : tempVal;
		}
		maxVal = (maxVal > tempStepVal) ? maxVal : tempStepVal;
		PO_ASSUREFIVE = String.valueOf(maxVal);
		return PO_ASSUREFIVE;
	}
	
	/**
	 * 申请人（征信报告）呆账信息汇总笔数
	 */
	public String getPO_BADDEBTSNUM(JSONObject pbocReport,List<LoanDetailVo> loanDetailList,List<CardDetailVo> cardDetailList) throws Exception{
		
		String PO_BADDEBTSNUM = "";
		
		int maxVal = -9999999;
		
		int PO_BADDEBTSNUMDZ = Integer.valueOf(getPO_BADDEBTSNUMDZ(pbocReport));
		
		int PO_BADDEBTSNUMDK = Integer.valueOf(getPO_BADDEBTSNUMDK(loanDetailList));
		
		int PO_BADDEBTSNUMCC = Integer.valueOf(getPO_BADDEBTSNUMCC(cardDetailList));
		
		maxVal = (maxVal > PO_BADDEBTSNUMDZ) ? maxVal : PO_BADDEBTSNUMDZ;
		maxVal = (maxVal > PO_BADDEBTSNUMDK) ? maxVal : PO_BADDEBTSNUMDK;
		maxVal = (maxVal > PO_BADDEBTSNUMCC) ? maxVal : PO_BADDEBTSNUMCC;
		
		PO_BADDEBTSNUM = String.valueOf(maxVal);
		return PO_BADDEBTSNUM;
		
		
//		String PO_BADDEBTSNUM = "";
//		BigDecimal b = new BigDecimal(0);
//		int maxVal = -1;
//		int tempVal1 = -1;
//		int tempVal2 = -1;
//		int tempVal3 = -1;
//		int tempStepVal2 = -1;
//		int tempStepVal3 = -1;
//		
//		// 获取呆账信息汇总
//		RePlfellbackdebtsum fb = AnalysisJsonUtil.getRePlfellbackdebtsum(pbocReport);
//
//		if (null == fb) {
//			return Constant.SPECIAL_VAL_NONE_94;
//		}
//
//		// 直接读取呆账信息汇总笔数
//		Integer count = fb.getCount();
//		BigDecimal balance = fb.getBalance();
//		if(count>0 && balance.compareTo(b) == 1){
//			tempVal1 = 1;
//		}else if(count>0 && balance.compareTo(b) == 0){
//			tempVal1 = 0;
//		}else{
//			tempVal1 = 2;
//		}
//		
//		
//		//获取贷款信息
//		if(CollectionUtils.isEmpty(loanDetailList) && CollectionUtils.isEmpty(cardDetailList)){
//			return Constant.SPECIAL_VAL_NONE_98;
//		}else{
//			for(LoanDetailVo vo : loanDetailList){
//				String state = "";
//				RePlcurraccountinfo cc = vo.getAccount();
//				BigDecimal dbalance = cc.getBalance();
//				//获取贷款合同信息里面的状态
//				if(null != vo.getContract()){
//					state = vo.getState();
//				}
//				//如果合同信息状态为空，则去获取当前帐户信息里的状态
//				if(StringUtils.isBlank(state)){
//					state = cc.getState();
//				}
//				// 最终状态为空 ，赋值为未结清
//				if(StringUtils.isBlank(state)){
//					state = Constant.STATE_DEFAULT;
//				}
//				if(Constant.STATE_DAIZHANG.equals(state) && dbalance.compareTo(b) == 1){
//					tempVal2 = 1;
//				}else if(Constant.STATE_DAIZHANG.equals(state) && dbalance.compareTo(b) == 0){
//					tempVal2 = 0;
//				}else{
//					tempVal2 = 2;
//				}
//				tempStepVal2 = (tempStepVal2 > tempVal2) ? tempStepVal2 : tempVal2;
//			}
//		}
//		
//		//获取信用卡信息
//		if(CollectionUtils.isEmpty(cardDetailList) && CollectionUtils.isEmpty(loanDetailList)){
//			return Constant.SPECIAL_VAL_NONE_98;
//		}else{
//			for(CardDetailVo vo : cardDetailList){
//				String state = "";
//				RePlawardcreditinfo ac = vo.getAwardInfo();
//				BigDecimal cbalance = ac.getBalance();
//				//获取信用卡授信信息里面的状态
//				if(null != vo.getAwardInfo()){
//					state = vo.getState();
//				}
//				//如果合同信息里面的状态为空，则去获取当前帐户信息里面的状态
//				if(StringUtils.isBlank(state)){
//					state = ac.getState();
//				}
//				//最终状态为空，赋值为未结清
//				if(StringUtils.isBlank(state)){
//					state = Constant.STATE_DEFAULT;
//				}
//				if(Constant.STATE_DAIZHANG.equals(state) && cbalance.compareTo(b) == 1){
//					tempVal3 = 1;
//				}else if(Constant.STATE_DAIZHANG.equals(state) && cbalance.compareTo(b) == 0){
//					tempVal3 = 0;
//				}else{
//					tempVal3 = 2;
//				}
//				tempStepVal3 = (tempStepVal3 > tempVal3) ? tempStepVal3 : tempVal3;
//			}
//		}
//		tempStepVal2 = (tempStepVal2 > tempVal1) ? tempStepVal2 : tempVal1;
//		maxVal = (tempStepVal2 > tempStepVal3) ? tempStepVal2 : tempStepVal3;
//		PO_BADDEBTSNUM = String.valueOf(maxVal);
//		return PO_BADDEBTSNUM;
	}
	
	/**
	 * 获取呆账笔数（概要）
	 * @param pbocReport
	 * @return
	 * @throws Exception
	 */
	public String getPO_BADDEBTSNUMDZ(JSONObject pbocReport)throws Exception{
		String PO_BADDEBTSNUMDZ = "";
		BigDecimal b = new BigDecimal(0);
		int maxVal = -3;
		int tempVal = -3;
		// 获取呆账信息汇总
		RePlfellbackdebtsum fb = AnalysisJsonUtil.getRePlfellbackdebtsum(pbocReport);

		if (null == fb) {
			return Constant.SPECIAL_VAL_NONE_98;
		}

		// 直接读取呆账信息汇总笔数
		Integer count = fb.getCount();
		BigDecimal balance = fb.getBalance();
		if(count>0 && balance.compareTo(b) == 1){
			tempVal = 1;
		}else if(count>0 && balance.compareTo(b) == 0){
			tempVal = 0;
		}else{
			tempVal = -2;
		}
		maxVal = (maxVal > tempVal) ? maxVal : tempVal;
		PO_BADDEBTSNUMDZ = String.valueOf(maxVal);
		return PO_BADDEBTSNUMDZ;
	}
	
	/**
	 * 获取呆账笔数(贷款)
	 * @param loanDetailList
	 * @return
	 * @throws Exception
	 */
	public String getPO_BADDEBTSNUMDK(List<LoanDetailVo> loanDetailList)throws Exception{
		String PO_BADDEBTSNUMDK = "";
		BigDecimal b = new BigDecimal(0);
		int tempVal = -3;
		int tempStepVal = -3;
		int maxVal = -3;
		//获取贷款信息
		if(CollectionUtils.isEmpty(loanDetailList)){
			return Constant.SPECIAL_VAL_NONE_98;
		}else{
			for(LoanDetailVo vo : loanDetailList){
				String state = "";
				if(Constant.STATE_JIEQING.equals(vo.getState())){
					tempVal = -2;
				}else{
					RePlcontractinfo po = vo.getContract();
//					RePlcurraccountinfo cc = vo.getAccount();
					BigDecimal dbalance = po.getBalance();
					//获取贷款合同信息里面的状态
					if(null != vo.getContract()){
						state = vo.getState();
					}
					//如果合同信息状态为空，则去获取当前帐户信息里的状态
					if(StringUtils.isBlank(state)){
						state = po.getState();
					}
					// 最终状态为空 ，赋值为未结清
					if(StringUtils.isBlank(state)){
						state = Constant.STATE_DEFAULT;
					}
					if(Constant.STATE_DAIZHANG.equals(state) && dbalance.compareTo(b) == 1){
						tempVal = 1;
					}else if(Constant.STATE_DAIZHANG.equals(state) && dbalance.compareTo(b) == 0){
						tempVal = 0;
					}else{
						tempVal = -2;
					}
				}
				tempStepVal = (tempStepVal > tempVal) ? tempStepVal : tempVal;
			}
		}
		maxVal = (maxVal > tempStepVal) ? maxVal : tempStepVal;
		PO_BADDEBTSNUMDK = String.valueOf(maxVal);
		return PO_BADDEBTSNUMDK;
	}
	
	/**
	 * 获取呆账笔数（信用卡）
	 * @param cardDetailList
	 * @return
	 * @throws Exception
	 */
	public String getPO_BADDEBTSNUMCC(List<CardDetailVo> cardDetailList)throws Exception{
		String PO_BADDEBTSNUMCC = "";
		BigDecimal b = new BigDecimal(0);
		int tempVal = -3;
		int tempStepVal = -3;
		int maxVal = -3;
		//获取信用卡信息
		if(CollectionUtils.isEmpty(cardDetailList)){
			return Constant.SPECIAL_VAL_NONE_98;
		}else{
			for(CardDetailVo vo : cardDetailList){
				String state = "";
				if(Constant.STATE_JIEQING.equals(vo.getState())){
					tempVal = -2;
				}else{
					RePlawardcreditinfo ac = vo.getAwardInfo();
					BigDecimal cbalance = ac.getBalance();
					//获取信用卡授信信息里面的状态
					if(null != vo.getAwardInfo()){
						state = vo.getState();
					}
					//如果合同信息里面的状态为空，则去获取当前帐户信息里面的状态
					if(StringUtils.isBlank(state)){
						state = ac.getState();
					}
					//最终状态为空，赋值为未结清
					if(StringUtils.isBlank(state)){
						state = Constant.STATE_DEFAULT;
					}
					if(Constant.STATE_DAIZHANG.equals(state) && cbalance.compareTo(b) == 1){
						tempVal = 1;
					}else if(Constant.STATE_DAIZHANG.equals(state) && cbalance.compareTo(b) == 0){
						tempVal = 0;
					}else{
						tempVal = -2;
					}
				}
				tempStepVal = (tempStepVal > tempVal) ? tempStepVal : tempVal;
			}
		}
		maxVal = (maxVal > tempStepVal) ? maxVal : tempStepVal;
		PO_BADDEBTSNUMCC = String.valueOf(maxVal);
		return PO_BADDEBTSNUMCC;
	}
	
	
	/**
	 * 申请人（征信报告）信用卡当期逾期期数(贷记卡)
	 */
	public String getPO_CREDITCARDCURDUED(List<CardDetailVo> DcardDetailList) throws Exception{
		String PO_CREDITCARDCURDUED = "";
		// 获取贷记卡
		if (CollectionUtils.isEmpty(DcardDetailList)) {
			return Constant.SPECIAL_VAL_NONE_95;
		}

		// 初始化最终结果值
		int maxVal = 0;

		//信用卡使用/还款记录
		RePlrepayinfo info = null;
		
		for (CardDetailVo vo : DcardDetailList) {
			// 初始化临时存储值
			int tempVal = 0;
			// 获取信用卡使用/还款记录
			info = vo.getRepayInfo();
			if (null == info) {
				continue;
			}
			// “当前逾期期数>0”且“当前逾期金额”>0
			if (info.getCurroverduecyc().intValue() > 0
					&& info.getCurroverdueamount().compareTo(BigDecimal.ZERO) == 1) {
				tempVal = info.getCurroverduecyc().intValue();
				maxVal = (maxVal > tempVal) ? maxVal : tempVal;
			}
		}

		PO_CREDITCARDCURDUED = String.valueOf(maxVal);
		return PO_CREDITCARDCURDUED;
	}
	
	

	/**
	 * 时间处理：类似2014.10.18 转为yyyy-MM-dd
	 */
	private String getDate1(String dateStr) {
		return dateStr.replace(".", "-");
	}

	/**
	 * 时间处理：类似201410 转为yyyy-MM-dd
	 */
	private String getDate2(String dateStr) {
		return dateStr.substring(0, 4) + "-" + dateStr.substring(4, 6);
	}
	
	/**
	 * 映射后24个月的时间范围的开始日期
	 * 实际上是：报告查询时间减去23个月
	 * @param dateStr 征信报告查询时间
	 * @return
	 * @throws ParseException 
	 */
	private String getStartDate(String queryDate) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");  
        Date date = sdf.parse(queryDate); 
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, -23);
        
        Date date1 = calendar.getTime();
        String reStr = sdf.format(date1); 
        
		return reStr;
	}
	
	/**
	 * 获取映射后的最大还款状态值
	 * 
	 * @param repayState 24个月还款状态记录
	 * @param month 所需要映射的月份
	 * @return 最大值
	 */
	private int getMaxReapyState(RePllatest24monthpaymentstate paymentstate, String queryTime, int month) {
		//补全状态
		String repayState = repairState(paymentstate, queryTime);
		
		// 获取需要映射月份的状态
		repayState = repayState.substring(repayState.length() - month, repayState.length());

		// 初始化还款记录最大值
		int maxVal = 0;

		char[] ca = repayState.toCharArray();
		for (int i = 0; i < ca.length; i++) {
			String stateStr = String.valueOf(ca[i]);
			if (StringUtils.isNumeric(stateStr)) {
				int state = Integer.parseInt(stateStr);
				maxVal = (maxVal > state) ? maxVal : state;
			}
		}

		return maxVal;
	}

	/**
	 * 统计映射后的还款状态大于零的个数
	 * 
	 * @param repayState 24个月还款状态记录
	 * @param month 所需要映射的月份
	 * @return 最大值
	 */
	private int getCountRepayState(RePllatest24monthpaymentstate paymentstate, String queryTime, int month) {
		//补全状态
		String repayState = repairState(paymentstate, queryTime);
		
		// 获取需要映射月份的状态
		repayState = repayState.substring(repayState.length() - month, repayState.length());

		// 初始化统计个数值
		int count = 0;

		char[] ca = repayState.toCharArray();
		for (int i = 0; i < ca.length; i++) {
			String stateStr = String.valueOf(ca[i]);
			if (StringUtils.isNumeric(stateStr)) {
				int state = Integer.parseInt(stateStr);
				if (state > 0) {
					count++;
				}
			}
		}
		return count;
	}
	
	/**
	 * 统计映射后的还款状态大于零或者是N的个数
	 * 
	 * @param repayState 24个月还款状态记录
	 * @param month 所需要映射的月份
	 * @return 最大值
	 */
	private int getCountRepayStateOrIsN(RePllatest24monthpaymentstate paymentstate, String queryTime, int month) {
		//补全状态
		String repayState = repairState(paymentstate, queryTime);
		
		// 获取需要映射月份的状态
		repayState = repayState.substring(repayState.length() - month, repayState.length());
		
		// 初始化统计个数值
		int count = 0;
		
		char[] ca = repayState.toCharArray();
		for (int i = 0; i < ca.length; i++) {
			String stateStr = String.valueOf(ca[i]);
			if (StringUtils.isNumeric(stateStr)) {
				int state = Integer.parseInt(stateStr);
				if (state > 0) {
					count++;
				}
			}else if ("N".equals(stateStr)){
				count++;
			}
		}
		return count;
	}
	
	/**
	 * 补全状态
	 * @param paymentstate
	 * @param queryTime
	 * @return
	 */
	private String repairState(RePllatest24monthpaymentstate paymentstate, String queryTime){
		String repayState = paymentstate.getLatest24state();
		String beginDate = getDate2(paymentstate.getBeginmonth());
		int length = DateUtil.getMonths(beginDate, queryTime)+1;
		if(length<24){
			length=24;
		}
		
		if (repayState.length() < length) {
			// 缺位的位数
			int lackNum = length - repayState.length();
			// 补齐还款记录
			for (int i = 0; i < lackNum; i++) {
				repayState = repayState + "无";
			}
		}
		return repayState;
	}
	
	/**
	 * 贷款最大逾期期数共用方法
	 * @param vo 贷款信息
	 * @param queryTime 征信报告查询时间
	 * @param step1Val 变量1
	 * @param step2Val 变量2
	 * @param step3Val 变量3
	 * @return
	 */
	private int loanMaxOverdue(LoanDetailVo vo, String queryTime, int step1Val, int step2Val, int step3Val){
		// 初始化临时存储值
		int tempVal = 0;
		// 获取贷款合同信息
		RePlcontractinfo contract = vo.getContract();
		// 获取贷款当前账户信息
		RePlcurraccountinfo account = vo.getAccount();
		// 贷款状态
		String state = vo.getState();
		
		if (Constant.STATE_DAIZHANG.equals(state)) {// 呆账
			if(null == contract){
				return tempVal;
			}
			//获取当前余额
			BigDecimal balance = contract.getBalance();
			if(null == balance){
				balance = BigDecimal.ZERO;
			}
			// 若余额大于0，则取值为8
			if (balance.compareTo(BigDecimal.ZERO) == 1) {
				tempVal = 8;
			} else {// 否则计算最近一次还款日与征信报告查询时间的月份差，若计算结果小于6，则取值为8，否则取值为0
				// 获取最近一次还款日期
				if(null == account){
					return tempVal;
				}
				String latelyRepayDay = getDate1(account.getRecentpaydate());
				int months = DateUtil.getMonths(latelyRepayDay, queryTime);
				if (months < step1Val) {
					tempVal = 8;
				} else {
					tempVal = 0;
				}
			}

		} else if (Constant.STATE_ZHUANCHU.equals(state) || Constant.STATE_JIEQING.equals(state)) {// 转出、结清情况
			// 获取逾期/透支记录信息描述
			List<RePloverduerecord> overdueList = vo.getOverdueList();
			if (!CollectionUtils.isEmpty(overdueList)) {
				for (RePloverduerecord od : overdueList) {
					int tempVal2 = 0;
					// 逾期月份
					String overdueMonth = od.getMonth();
					if (!"--".equals(overdueMonth)) {
						overdueMonth = getDate1(overdueMonth);
						int months = DateUtil.getMonths(overdueMonth, queryTime);
						if(months <= step2Val){
							tempVal2 = od.getLastmonths();
							tempVal = (tempVal > tempVal2) ? tempVal : tempVal2;
						}
					}
				}
				
			}
		} else if (Constant.STATE_ZHENGCHANG.equals(state) || Constant.STATE_YUQI.equals(state) || Constant.STATE_DEFAULT.equals(state)) {// 正常、逾期情况
			// 获取最近24个月还款状态
			RePllatest24monthpaymentstate paymentstate = vo.getPaymentstate();
			if (null != paymentstate) {
				tempVal = getMaxReapyState(paymentstate, queryTime, step3Val);
			}

		}
		return tempVal;
	}
	
	/**
	 * 贷款最大逾期期数共用方法(不考虑呆账)
	 * @param vo 贷款信息
	 * @param queryTime 征信报告查询时间
	 * @param step1Val 变量1
	 * @param step2Val 变量2
	 * @param step3Val 变量3
	 * @return
	 */
	private int loanMaxOverdueND(LoanDetailVo vo, String queryTime, int step1Val, int step2Val, int step3Val){
		// 初始化临时存储值
		int tempVal = 0;
		// 贷款状态
		String state = vo.getState();
		
		if (Constant.STATE_ZHUANCHU.equals(state) || Constant.STATE_JIEQING.equals(state)) {// 转出、结清情况
			// 获取逾期/透支记录信息描述
			List<RePloverduerecord> overdueList = vo.getOverdueList();
			if (!CollectionUtils.isEmpty(overdueList)) {
				for (RePloverduerecord od : overdueList) {
					int tempVal2 = 0;
					// 逾期月份
					String overdueMonth = od.getMonth();
					if (!"--".equals(overdueMonth)) {
						overdueMonth = getDate1(overdueMonth);
						int months = DateUtil.getMonths(overdueMonth, queryTime);
						if(months <= step2Val){
							tempVal2 = od.getLastmonths();
							tempVal = (tempVal > tempVal2) ? tempVal : tempVal2;
						}
					}
				}
				
			}
		} else if (Constant.STATE_ZHENGCHANG.equals(state) || Constant.STATE_YUQI.equals(state) || Constant.STATE_DEFAULT.equals(state)) {// 正常、逾期情况
			// 获取最近24个月还款状态
			RePllatest24monthpaymentstate paymentstate = vo.getPaymentstate();
			if (null != paymentstate) {
				tempVal = getMaxReapyState(paymentstate, queryTime, step3Val);
			}

		}
		return tempVal;
	}
	
	/**
	 * 贷款累计逾期次数共用方法
	 * @param vo 贷款信息
	 * @param queryTime 征信报告查询时间
	 * @param stepVal 月份变量
	 * @return
	 */
	private int loanSumOverdue(LoanDetailVo vo, String queryTime, int stepVal){
		// 初始化临时存储值
		int tempVal = 0;
		// 获取贷款合同信息
		RePlcontractinfo contract = vo.getContract();
		// 获取贷款当前账户信息
		RePlcurraccountinfo account = vo.getAccount();
		// 贷款状态
		String state = vo.getState();
		
		if (Constant.STATE_DAIZHANG.equals(state)) {// 呆账
			if(null == contract){
				return tempVal;
			}
			//获取余额
			BigDecimal balance = contract.getBalance();
			if(null == balance){
				balance = BigDecimal.ZERO;
			}
			// 若余额大于0，则取值为stepVal
			if (balance.compareTo(BigDecimal.ZERO) == 1) {
				tempVal = stepVal;
			} else {// 最近一次还款日与征信报告查询时间的月份差+1
				// 获取最近一次还款日期
				if(null == account){
					return tempVal;
				}
				String latelyRepayDay = getDate1(account.getRecentpaydate());
				int months = DateUtil.getMonths(latelyRepayDay, queryTime) + 1;
				if (months <= 0 || months > stepVal) {
					tempVal = 0;
				} else if (months >= 1 && months <= stepVal) {
					tempVal = stepVal - months;
				}
			}

		} else if (Constant.STATE_ZHUANCHU.equals(state) || Constant.STATE_JIEQING.equals(state)) {// 转出、结清情况
			// 获取逾期/透支记录信息描述
			List<RePloverduerecord> overdueList = vo.getOverdueList();
			if (!CollectionUtils.isEmpty(overdueList)) {
				for (RePloverduerecord od : overdueList) {
					// 逾期月份
					String overdueMonth = od.getMonth();
					if (!"--".equals(overdueMonth)) {
						overdueMonth = getDate1(overdueMonth);
						int months = DateUtil.getMonths(overdueMonth, queryTime);
						if (months < stepVal) {
							tempVal++;
						}
					}
				}
			}
		} else if (Constant.STATE_ZHENGCHANG.equals(state) || Constant.STATE_YUQI.equals(state) || Constant.STATE_DEFAULT.equals(state)) {// 正常、逾期情况
			// 获取最近24个月还款状态
			RePllatest24monthpaymentstate paymentstate = vo.getPaymentstate();
			if (null != paymentstate) {
				tempVal = getCountRepayState(paymentstate, queryTime, stepVal);
			}
		}
		return tempVal;
	}
	
	/**
	 * 贷款累计逾期次数共用方法(不考虑呆账)
	 * @param vo 贷款信息
	 * @param queryTime 征信报告查询时间
	 * @param stepVal 月份变量
	 * @return
	 */
	private int loanSumOverdueND(LoanDetailVo vo, String queryTime, int stepVal){
		// 初始化临时存储值
		int tempVal = 0;
		int tempVal1 = 0;
		int tempVal2 = 0;
		// 贷款状态
		String state = vo.getState();
		if (Constant.STATE_ZHUANCHU.equals(state) || Constant.STATE_JIEQING.equals(state)) {// 转出、结清情况
			// 获取逾期/透支记录信息描述
			List<RePloverduerecord> overdueList = vo.getOverdueList();
			if (!CollectionUtils.isEmpty(overdueList)) {
				for (RePloverduerecord od : overdueList) {
					// 逾期月份
					String overdueMonth = od.getMonth();
					if (!"--".equals(overdueMonth)) {
						overdueMonth = getDate1(overdueMonth);
						int months = DateUtil.getMonths(overdueMonth, queryTime);
						if (months < stepVal) {
							tempVal1++;
						}
					}
				}
			}
		} else if (Constant.STATE_ZHENGCHANG.equals(state) || Constant.STATE_YUQI.equals(state) || Constant.STATE_DEFAULT.equals(state)) {// 正常、逾期情况
			// 获取最近24个月还款状态
			RePllatest24monthpaymentstate paymentstate = vo.getPaymentstate();
			if (null != paymentstate) {
				tempVal2 = getCountRepayState(paymentstate, queryTime, stepVal);
			}
		}
		tempVal = (tempVal1 > tempVal2) ? tempVal1 : tempVal2;
		return tempVal;
	}
	
	/**
	 * 信用卡最大逾期期数共用方法
	 * @param vo 信用卡信息
	 * @param queryTime 征信报告查询时间
	 * @param step1Val 变量1
	 * @param step2Val 变量2
	 * @param step3Val 变量3
	 * @return
	 */
	private int cCardMaxOverdue(CardDetailVo vo, String queryTime, int step1Val, int step2Val, int step3Val){
		// 初始化临时存储值
		int tempVal = 0;
		// 获取信用卡授信信息
		RePlawardcreditinfo awardInfo = vo.getAwardInfo();
		// 获取信用卡使用/还款记录
		RePlrepayinfo repayInfo = vo.getRepayInfo();
		// 信用卡状态
		String state = vo.getState();
		
		if (Constant.STATE_DAIZHANG.equals(state)) {// 呆账
			if(null == awardInfo || null == repayInfo){
				return tempVal;
			}
			//获取余额
			BigDecimal balance = awardInfo.getBalance();
			if(null == balance){
				balance = BigDecimal.ZERO;
			}
			// 若余额大于0，则取值为8
			if (balance.compareTo(BigDecimal.ZERO) == 1) {
				tempVal = 8;
			} else {// 否则计算最近一次还款日与征信报告查询时间的月份差，若计算结果小于step1Val，则取值为8，否则取值为0
					// 获取最近一次还款日期
				String latelyRepayDay = getDate1(repayInfo.getRecentpaydate());
				int months = DateUtil.getMonths(latelyRepayDay, queryTime);
				if (months < step1Val) {
					tempVal = 8;
				} else {
					tempVal = 0;
				}
			}

		} else if (Constant.STATE_XIAOHU.equals(state)) {// 销户
			// 获取逾期/透支记录信息描述
			List<RePloverduerecord> overdueList = vo.getOverdueList();
			if (!CollectionUtils.isEmpty(overdueList)) {
				for (RePloverduerecord od : overdueList) {
					int tempVal2 = 0;
					// 逾期月份
					String overdueMonth = od.getMonth();
					if (!"--".equals(overdueMonth)) {
						overdueMonth = getDate1(overdueMonth);
						int months = DateUtil.getMonths(overdueMonth, queryTime);
						if(months <= step2Val){
							tempVal2 = od.getLastmonths();
							tempVal = (tempVal > tempVal2) ? tempVal : tempVal2;
						}
					}
				}
			}
		} else if (Constant.STATE_ZHENGCHANG.equals(state) || Constant.STATE_ZHIFU.equals(state) || Constant.STATE_DEFAULT.equals(state) ||Constant.STATE_DONGJIE.equals(state)) {// 正常、止付、冻结
			// 获取最近24个月还款状态
			RePllatest24monthpaymentstate paymentstate = vo.getPaymentstate();
			if (null != paymentstate) {
				tempVal = getMaxReapyState(paymentstate, queryTime, step3Val);
			}
		}
		return tempVal;
	}
	
	/**
	 * 贷记卡最大逾期期数共用方法(不考虑呆账)
	 * @param vo 信用卡信息
	 * @param queryTime 征信报告查询时间
	 * @param step1Val 变量1
	 * @param step2Val 变量2
	 * @param step3Val 变量3
	 * @return
	 */
	private int dCardMaxOverdueND(CardDetailVo vo, String queryTime, int step1Val, int step2Val, int step3Val){
		// 初始化临时存储值
		int tempVal = 0;
		// 信用卡状态
		String state = vo.getState();
		if (Constant.STATE_XIAOHU.equals(state)) {// 销户
			// 获取逾期/透支记录信息描述
			List<RePloverduerecord> overdueList = vo.getOverdueList();
			if (!CollectionUtils.isEmpty(overdueList)) {
				for (RePloverduerecord od : overdueList) {
					int tempVal2 = 0;
					// 逾期月份
					String overdueMonth = od.getMonth();
					if (!"--".equals(overdueMonth)) {
						overdueMonth = getDate1(overdueMonth);
						int months = DateUtil.getMonths(overdueMonth, queryTime);
						if(months <= step2Val){
							tempVal2 = od.getLastmonths();
							tempVal = (tempVal > tempVal2) ? tempVal : tempVal2;
						}
					}
				}
			}
		} else if (Constant.STATE_ZHENGCHANG.equals(state) || Constant.STATE_ZHIFU.equals(state) || Constant.STATE_DEFAULT.equals(state) || Constant.STATE_DONGJIE.equals(state)) {// 正常、止付、冻结
			// 获取最近24个月还款状态
			RePllatest24monthpaymentstate paymentstate = vo.getPaymentstate();
			if (null != paymentstate) {
				tempVal = getMaxReapyState(paymentstate, queryTime, step3Val);
			}
		}
		return tempVal;
	}
	
	/**
	 * 准贷记卡最大逾期期数共用方法(不考虑呆账)
	 * @param vo 信用卡信息
	 * @param queryTime 征信报告查询时间
	 * @param step1Val 变量1
	 * @param step2Val 变量2
	 * @param step3Val 变量3
	 * @return
	 */
	private int zCardMaxOverdueND(CardDetailVo vo, String queryTime, int step1Val, int step2Val, int step3Val){
		// 初始化临时存储值
		int tempVal = 0;
		// 信用卡状态
		String state = vo.getState();
		
		if (Constant.STATE_XIAOHU.equals(state)) {// 销户
			// 获取逾期/透支记录信息描述
			List<RePloverduerecord> overdueList = vo.getOverdueList();
			if (!CollectionUtils.isEmpty(overdueList)) {
				for (RePloverduerecord od : overdueList) {
					int tempVal2 = 0;
					// 逾期月份
					String overdueMonth = od.getMonth();
					if (!"--".equals(overdueMonth)) {
						overdueMonth = getDate1(overdueMonth);
						int months = DateUtil.getMonths(overdueMonth, queryTime);
						if(months <= step2Val){
							tempVal2 = od.getLastmonths();
							tempVal = (tempVal > tempVal2) ? tempVal : tempVal2;
						}
					}
				}
			}
		} else if (Constant.STATE_ZHENGCHANG.equals(state) || Constant.STATE_ZHIFU.equals(state) || Constant.STATE_DEFAULT.equals(state) ||Constant.STATE_DONGJIE.equals(state)) {// 正常、止付、冻结
			// 获取最近24个月还款状态
			RePllatest24monthpaymentstate paymentstate = vo.getPaymentstate();
			if (null != paymentstate) {
				tempVal = getMaxReapyState(paymentstate, queryTime, step3Val);
			}
		}
		return tempVal;
	}
	
	/**
	 * 信用卡累计逾期次数共用方法
	 * @param vo 信用卡信息
	 * @param queryTime 征信报告查询时间
	 * @param stepVal 变量月份值
	 * @return
	 */
	private int cCardSumOverdue(CardDetailVo vo, String queryTime, int stepVal){
		// 初始化临时存储值
		int tempVal = 0;
		// 获取信用卡授信信息
		RePlawardcreditinfo awardInfo = vo.getAwardInfo();
		// 获取信用卡使用/还款记录
		RePlrepayinfo repayInfo = vo.getRepayInfo();
		// 信用卡状态
		String state = vo.getState();
		
		if (Constant.STATE_DAIZHANG.equals(state)) {// 呆账
			if(null == awardInfo || null == repayInfo){
				return tempVal;
			}
			//获取余额
			BigDecimal balance = awardInfo.getBalance();
			if(null == balance){
				balance = BigDecimal.ZERO;
			}
			// 若余额大于0，则取值为stepVal
			if (balance.compareTo(BigDecimal.ZERO) == 1) {
				tempVal = stepVal;
			} else {// 最近一次还款日与征信报告查询时间的月份差+1
					// 获取最近一次还款日期
				String latelyRepayDay = getDate1(repayInfo.getRecentpaydate());
				int months = DateUtil.getMonths(latelyRepayDay, queryTime) + 1;
				if (months <= 0 || months > stepVal) {
					tempVal = 0;
				} else if (months >= 1 && months <= stepVal) {
					tempVal = stepVal - months;
				}
			}

		} else if (Constant.STATE_XIAOHU.equals(state)) {// 销户
			// 获取逾期/透支记录信息描述
			List<RePloverduerecord> overdueList = vo.getOverdueList();
			if (!CollectionUtils.isEmpty(overdueList)) {
				for (RePloverduerecord od : overdueList) {
					// 逾期月份
					String overdueMonth = od.getMonth();
					if (!"--".equals(overdueMonth)) {
						overdueMonth = getDate1(overdueMonth);
						int months = DateUtil.getMonths(overdueMonth, queryTime);
						if (months < stepVal) {
							tempVal++;
						}
					}
				}
			}
		} else if (Constant.STATE_ZHENGCHANG.equals(state) || Constant.STATE_ZHIFU.equals(state) || Constant.STATE_DEFAULT.equals(state) ||Constant.STATE_DONGJIE.equals(state)) {// 正常、止付、冻结
			// 获取最近24个月还款状态
			RePllatest24monthpaymentstate paymentstate = vo.getPaymentstate();
			if (null != paymentstate) {
				tempVal = getCountRepayState(paymentstate, queryTime, stepVal);
			}
		}
		
		return tempVal;
	}
	
	/**
	 * 贷记卡累计逾期次数共用方法(不考虑呆账)
	 * @param vo 信用卡信息
	 * @param queryTime 征信报告查询时间
	 * @param stepVal 变量月份值
	 * @return
	 */
	private int dCardSumOverdueND(CardDetailVo vo, String queryTime, int stepVal){
		// 初始化临时存储值
		int tempVal = 0;
		int tempVal1 = 0;
		int tempVal2 = 0;
		// 信用卡状态
		String state = vo.getState();
		if (Constant.STATE_XIAOHU.equals(state)) {// 销户
			// 获取逾期/透支记录信息描述
			List<RePloverduerecord> overdueList = vo.getOverdueList();
			if (!CollectionUtils.isEmpty(overdueList)) {
				for (RePloverduerecord od : overdueList) {
					// 逾期月份
					String overdueMonth = od.getMonth();
					if (!"--".equals(overdueMonth)) {
						overdueMonth = getDate1(overdueMonth);
						int months = DateUtil.getMonths(overdueMonth, queryTime);
						if (months < stepVal) {
							tempVal1++;
						}
					}
				}
			}
		} else if (Constant.STATE_ZHENGCHANG.equals(state) || Constant.STATE_ZHIFU.equals(state) || Constant.STATE_DEFAULT.equals(state) ||Constant.STATE_DONGJIE.equals(state)) {// 正常、止付、冻结
			// 获取最近24个月还款状态
			RePllatest24monthpaymentstate paymentstate = vo.getPaymentstate();
			if (null != paymentstate) {
				tempVal2 = getCountRepayState(paymentstate, queryTime, stepVal);
			}
		}
		tempVal = (tempVal1 > tempVal2) ? tempVal1 : tempVal2;
		return tempVal;
	}
	
	/**
	 * 格式化
	 * @param number
	 * @return
	 */
	private String numberFormat(BigDecimal number){
		DecimalFormat myformat = new DecimalFormat("#.##");
		String str = myformat.format(number);
		return str;
	}

}