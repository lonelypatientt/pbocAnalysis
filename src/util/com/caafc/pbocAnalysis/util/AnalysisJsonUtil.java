/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016年11月22日 下午4:32:45
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.util.CollectionUtils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.caafc.pbocAnalysis.dto.RePladminpunishment;
import com.caafc.pbocAnalysis.dto.RePlassetdispositionsum;
import com.caafc.pbocAnalysis.dto.RePlawardcreditinfo;
import com.caafc.pbocAnalysis.dto.RePlciviljudgement;
import com.caafc.pbocAnalysis.dto.RePlcontractinfo;
import com.caafc.pbocAnalysis.dto.RePlcurraccountinfo;
import com.caafc.pbocAnalysis.dto.RePlcurroverdue;
import com.caafc.pbocAnalysis.dto.RePlfellbackdebtsum;
import com.caafc.pbocAnalysis.dto.RePlforceexecution;
import com.caafc.pbocAnalysis.dto.RePlguarantee;
import com.caafc.pbocAnalysis.dto.RePlguaranteeinfo;
import com.caafc.pbocAnalysis.dto.RePlidentity;
import com.caafc.pbocAnalysis.dto.RePllatest24monthpaymentstate;
import com.caafc.pbocAnalysis.dto.RePlmessageheader;
import com.caafc.pbocAnalysis.dto.RePloverduerecord;
import com.caafc.pbocAnalysis.dto.RePlqueryreq;
import com.caafc.pbocAnalysis.dto.RePlrecorddetail;
import com.caafc.pbocAnalysis.dto.RePlrepayinfo;
import com.caafc.pbocAnalysis.dto.RePlundestoryloancard;
import com.caafc.pbocAnalysis.dto.RePlundestorystandardloa;
import com.caafc.pbocAnalysis.vo.RePlloanVo;
import com.caafc.pbocAnalysis.vo.RePlloancardVo;

/**
 * TODO 请填写注释.
 * @author zdsp 
 * @version $Revision:$
 */
public class AnalysisJsonUtil {
	
	
	/**
	 * 获取查询人信息
	 * @return
	 */
	public static RePlqueryreq getRePlqueryreq(JSONObject pbocReport){
		String jsonStr = pbocReport.getString("rePlqueryreqSet");
		List<RePlqueryreq> list = new ArrayList<RePlqueryreq>(); 
		list = JSONObject.parseArray(jsonStr, RePlqueryreq.class);
		if(!CollectionUtils.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}
	/**
	 * 获取身份信息
	 * @return
	 */
	public static RePlidentity getRePlidentity(JSONObject pbocReport){
		String jsonStr = pbocReport.getString("rePlidentitySet");
		List<RePlidentity> list = new ArrayList<RePlidentity>(); 
		list = JSONObject.parseArray(jsonStr, RePlidentity.class);
		if(!CollectionUtils.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}
	
	/**
	 * 获取报告头描述
	 */
	public static RePlmessageheader getRePlmessageheader(JSONObject pbocReport){
		String jsonStr = pbocReport.getString("rePlmessageheaderSet");
		List<RePlmessageheader> list = new ArrayList<RePlmessageheader>(); 
		list = JSONObject.parseArray(jsonStr, RePlmessageheader.class);
		if(!CollectionUtils.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}
	
	/**
	 * 获取未销户贷记卡信息汇总
	 */
	public static RePlundestoryloancard getRePlundestoryloancard(JSONObject pbocReport){
		String jsonStr = pbocReport.getString("rePlundestoryloancardSet");
		List<RePlundestoryloancard> list = new ArrayList<RePlundestoryloancard>(); 
		list = JSONObject.parseArray(jsonStr, RePlundestoryloancard.class);
		if(!CollectionUtils.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}
	
	/**
	 * 获取未销户准贷记卡信息汇总
	 */
	public static RePlundestorystandardloa getRePlundestorystandardloa(JSONObject pbocReport){
		String jsonStr = pbocReport.getString("rePlundestorystandardloaSet");
		List<RePlundestorystandardloa> list = new ArrayList<RePlundestorystandardloa>(); 
		list = JSONObject.parseArray(jsonStr, RePlundestorystandardloa.class);
		if(!CollectionUtils.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}
	
	/**
	 * 获取呆账信息汇总
	 * @param pbocReport
	 * @return
	 */
	public static RePlfellbackdebtsum getRePlfellbackdebtsum(JSONObject pbocReport){
		String jsonStr = pbocReport.getString("rePlfellbackdebtsumSet");
		List<RePlfellbackdebtsum> list = new ArrayList<RePlfellbackdebtsum>(); 
		list = JSONObject.parseArray(jsonStr, RePlfellbackdebtsum.class);
		if(!CollectionUtils.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}
	
	/**
	 * 获取资产信息汇总
	 * @param pbocReport
	 * @return
	 */
	public static RePlassetdispositionsum getRePlassetdispositionsum(JSONObject pbocReport){
		String jsonStr = pbocReport.getString("rePlassetdispositionsumSet");
		List<RePlassetdispositionsum> list = new ArrayList<RePlassetdispositionsum>(); 
		list = JSONObject.parseArray(jsonStr, RePlassetdispositionsum.class);
		if(!CollectionUtils.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}
	
	
	/**
	 * 获取信贷审批查询记录明细
	 * @param pbocReport
	 * @return
	 */
	public static List<RePlrecorddetail> getRePlrecorddetail(JSONObject pbocReport){
		String jsonStr = pbocReport.getString("rePlrecorddetailSet");
		List<RePlrecorddetail> list = new ArrayList<RePlrecorddetail>(); 
		list = JSONObject.parseArray(jsonStr, RePlrecorddetail.class);
		return list;
	}
	
	/**
	 * 获取民事判决记录
	 * @param pbocReport
	 * @return
	 */
	public static List<RePlciviljudgement> getRePlciviljudgement(JSONObject pbocReport){
		String jsonStr = pbocReport.getString("rePlciviljudgementSet");
		List<RePlciviljudgement> list = new ArrayList<RePlciviljudgement>(); 
		list = JSONObject.parseArray(jsonStr, RePlciviljudgement.class);
		return list;
	}
	
	/**
	 * 获取行政处罚记录
	 * @param pbocReport
	 * @return
	 */
	public static List<RePladminpunishment> getRePladminpunishment(JSONObject pbocReport){
		String jsonStr = pbocReport.getString("rePladminpunishmentSet");
		List<RePladminpunishment> list = new ArrayList<RePladminpunishment>(); 
		list = JSONObject.parseArray(jsonStr, RePladminpunishment.class);
		return list;
	}
	
	/**
	 * 获取强制执行记录
	 * @param pbocReport
	 * @return
	 */
	public static List<RePlforceexecution> getRePlforceexecution(JSONObject pbocReport){
		String jsonStr = pbocReport.getString("rePlforceexecutionSet");
		List<RePlforceexecution> list = new ArrayList<RePlforceexecution>(); 
		list = JSONObject.parseArray(jsonStr, RePlforceexecution.class);
		return list;
	}
	
	
	/**
	 * 获取信用卡信息（含贷记卡、准贷记卡）
	 * @param pbocReport
	 * @return
	 */
	public static List<RePlloancardVo> getCreditCard(JSONObject pbocReport){
		List<RePlloancardVo> resultList = new ArrayList<RePlloancardVo>();
		
		//获取贷记卡
		List<RePlloancardVo> clist = getRePlloancard(pbocReport); 
		if(!CollectionUtils.isEmpty(clist)){
			resultList.addAll(clist);
		}
		
		//获取准贷记卡信息
		List<RePlloancardVo> slist = getRePlstandardloancard(pbocReport); 
		if(!CollectionUtils.isEmpty(slist)){
			resultList.addAll(slist);
		}
		
		return resultList;
	}
	
	/**
	 * 获取贷记卡
	 * @param pbocReport
	 * @return
	 */
	public static List<RePlloancardVo> getRePlloancard(JSONObject pbocReport){
		List<RePlloancardVo> list = new ArrayList<RePlloancardVo>(); 
		String jsonStr = pbocReport.getString("rePlloancardSet");
		list = JSONObject.parseArray(jsonStr, RePlloancardVo.class);
		return list;
	}
	
	/**
	 * 获取准贷记卡
	 * @param pbocReport
	 * @return
	 */
	public static List<RePlloancardVo> getRePlstandardloancard(JSONObject pbocReport){
		List<RePlloancardVo> list = new ArrayList<RePlloancardVo>(); 
		String jsonStr2 = pbocReport.getString("rePlstandardloancardSet");
		list = JSONObject.parseArray(jsonStr2, RePlloancardVo.class);
		return list;
	}
	
	
	/**
	 * 获取当前账户信息（贷款）
	 */
	public static RePlcurraccountinfo getRePlcurraccountinfo(RePlloanVo vo){
		String jsonStr = vo.getRePlcurraccountinfoSet();
		List<RePlcurraccountinfo> list = new ArrayList<RePlcurraccountinfo>(); 
		list = JSONObject.parseArray(jsonStr, RePlcurraccountinfo.class);
		if(!CollectionUtils.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}
	
	/**
	 * 获取贷款的合同信息
	 */
	public static RePlcontractinfo getRePlcontractinfo(RePlloanVo vo){
		String jsonStr = vo.getRePlcontractinfoSet();
		List<RePlcontractinfo> list = new ArrayList<RePlcontractinfo>(); 
		list = JSONObject.parseArray(jsonStr, RePlcontractinfo.class);
		if(!CollectionUtils.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}
	
	/**
	 * 获取当前逾期信息（贷款）
	 * @param pbocReport
	 * @return
	 */
	public static List<RePlcurroverdue> getRePlcurroverdue(RePlloanVo vo){
		String jsonStr = vo.getRePlcurroverdueSet();
		List<RePlcurroverdue> list = new ArrayList<RePlcurroverdue>(); 
		list = JSONObject.parseArray(jsonStr, RePlcurroverdue.class);
		return list;
	}
	
	/**
	 * 获取使用/还款情况（信用卡）
	 */
	public static RePlrepayinfo getRePlrepayinfo(RePlloancardVo vo){
		String jsonStr = vo.getRePlrepayinfoSet();
		List<RePlrepayinfo> list = new ArrayList<RePlrepayinfo>(); 
		list = JSONObject.parseArray(jsonStr, RePlrepayinfo.class);
		if(!CollectionUtils.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}
	
	/**
	 * 获取信用卡授信情况
	 */
	public static RePlawardcreditinfo getRePlawardcreditinfo(RePlloancardVo vo){
		String jsonStr = vo.getRePlawardcreditinfoSet();
		List<RePlawardcreditinfo> list = new ArrayList<RePlawardcreditinfo>(); 
		list = JSONObject.parseArray(jsonStr, RePlawardcreditinfo.class);
		if(!CollectionUtils.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}
	
	/**
	 * 获取逾期/透支记录信息描述
	 * 传入五年内的逾期记录json串
	 */
	public static List<RePloverduerecord> getRePloverduerecord(String jsonStr){
		JSONArray array = JSONArray.parseArray(jsonStr);
		if(null == array){
			return null;
		}
		List<RePloverduerecord> result = new ArrayList<RePloverduerecord>(); 
		for (Iterator<Object> iterator = array.iterator(); iterator.hasNext();) {
			JSONObject obj = (JSONObject) iterator.next();
			String overdueStr = obj.getString("rePloverduerecordSet");
			List<RePloverduerecord> list = JSONObject.parseArray(overdueStr, RePloverduerecord.class);
			if(!CollectionUtils.isEmpty(list)){
				result.addAll(list);
			}
		}
		return result;
	}
	
	
	/**
	 * 获取最近24个月还款状态
	 * 传入最近24个月还款状态json串
	 */
	public static RePllatest24monthpaymentstate getRePllatest24monthpaymentstate(String jsonStr){
		List<RePllatest24monthpaymentstate> list = new ArrayList<RePllatest24monthpaymentstate>(); 
		list = JSONObject.parseArray(jsonStr, RePllatest24monthpaymentstate.class);
		RePllatest24monthpaymentstate state = null;
		if(!CollectionUtils.isEmpty(list)){
			state = list.get(0);
		}
		return state;
	}
	
	/**
	 * 获取贷款信息
	 * @param pbocReport
	 * @return
	 */
	public static List<RePlloanVo> getRePlloan(JSONObject pbocReport){
		String jsonStr = pbocReport.getString("rePlloanSet");
		List<RePlloanVo> list = new ArrayList<RePlloanVo>(); 
		list = JSONObject.parseArray(jsonStr, RePlloanVo.class);
		return list;
	}
	
	/***
	 * 获取贷款对外担保信息
	 * @param pbocReport
	 * @return
	 */
	public static List<RePlguaranteeinfo> getRePlguaranteeinfo(JSONObject pbocReport){
		String jsonStr = pbocReport.getString("rePlguaranteeinfoSet");
		List<RePlguaranteeinfo> list = new ArrayList<RePlguaranteeinfo>();
		list = JSONObject.parseArray(jsonStr,RePlguaranteeinfo.class);
		return list;
	}
	
	/**
	 * 获取五级分类
	 * @param info
	 * @return
	 */
	public static RePlguarantee getRePlguarantee(RePlguaranteeinfo info){
		String jsonStr = info.getRePlguaranteeSet();
		List<RePlguarantee> list = new ArrayList<RePlguarantee>();
		list = JSONObject.parseArray(jsonStr,RePlguarantee.class);
		if(!CollectionUtils.isEmpty(list)){
			return list.get(0);
		}
		return null;
	}
	
}
