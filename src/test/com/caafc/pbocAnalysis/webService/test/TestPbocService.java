/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016-11-18 上午10:22:54
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.webService.test;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.caafc.pbocAnalysis.webService.pbocService.PbocRequest;
import com.caafc.pbocAnalysis.webService.pbocService.PbocResponse;
import com.caafc.pbocAnalysis.webService.pbocService.PbocService;

/**
 * TODO 请填写注释.
 * @author Administrator 
 * @version $Revision:$
 */
public class TestPbocService {

	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		JaxWsProxyFactoryBean fa = new JaxWsProxyFactoryBean();
		fa.setServiceClass(PbocService.class);	// 审批
		
		fa.setAddress("http://localhost:8080/pbocAnalysis/PbocService");
		
		PbocService service = (PbocService) fa.create();
		PbocRequest pbocRequest = new PbocRequest();
		
//		pbocRequest.setPbocFilePath("/zxbg/zxbg/20160117/Card320107198204054213By105600450.a");//2016011700002587571066
//		pbocRequest.setPbocFilePath("/zxbg/zxbg/20160120/Card530103198909151527By171036114.a");//2016012000002596432203
//		pbocRequest.setPbocFilePath("/zxbg/zxbg/20160310/Card441721198609234034By111327091.a");//2016031000002694738383
//		pbocRequest.setPbocFilePath("/zxbg/zxbg/20140604/Card11010519630816212XBy162646.a");//2014060400001699477467
//		pbocRequest.setPbocFilePath("/zxbg/zxbg/20140608/Card420102196902282013By145913.a");//2014060800001703212233
//		pbocRequest.setPbocFilePath("/zxbg/zxbg/20140612/Card110104198301123024By084524.a");//2014061200001707559589
//		pbocRequest.setPbocFilePath("/zxbg/zxbg/20160410/Card620102199110207235By095204527.a");
//		pbocRequest.setPbocFilePath("/zxbg/zxbg/20160410/Card622301198610207110By102953612.a");
//		pbocRequest.setPbocFilePath("/zxbg/zxbg/20140603/Card610123197701077779By102512.a");
//		pbocRequest.setPbocFilePath("/zxbg/zxbg/20161015/Card430581199208074997By093633884.a");//姓名不符
//		pbocRequest.setPbocFilePath("/zxbg/zxbg/20151101/Card130221199305245918By120223.a");//查无此人信息
//		pbocRequest.setPbocFilePath("/zxbg/zxbg/20161103/Card532901198304121811By141423875.a");
//		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170119/Card433122198808221512By150207616.a");
//		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170119/Card430981197507271117By161309141.a");
//		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170321/Card132626197010026028By104715995.a");
//		pbocRequest.setPbocFilePath("/zxbg/zxbg/20160113/Card131026198702261011By182105747.a");
//		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170215/Card130603196503251230By105455967.a");
//		pbocRequest.setPbocFilePath("/zxbg/zxbg/20160712/Card海5344239By123328005.a");
		
		
		
		
//		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170321/Card14273219860214721XBy085638.a");
		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170321/Card511321198008237711By094907767.a");
//		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170321/Card45242419741107198XBy133218667.a");
//		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170321/Card132626197010026028By104715995.a");
//		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170321/Card220322197501071200By101621926.a");
//		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170321/Card340123197210103359By162537499.a");
//		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170321/Card340222197412200519By162411649.a");
//		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170321/Card341202198301080016By152239956.a");
//		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170321/Card342901197911096013By143854971.a");
//		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170321/Card350582199107084041By102657771.a");
//		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170321/Card370832199010143355By101805781.a");
//		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170321/Card411082198409202424By153346608.a");
//		pbocRequest.setPbocFilePath("/ZXJX/cfstest/20170321/Card420703198512252415By112330587.a");
		// 客户类型
//		pbocRequest.setPbocHtmlPath("/home/dwinst/test/qweqasd");
		
	
		PbocResponse _return = service.pbocTarget(pbocRequest);
		long end = System.currentTimeMillis();
		long time = end -start;
		System.out.println("耗时："+time);
		System.out.println("报告编号>>>>>>: " + _return.getReportNo());
		System.out.println("结果编码>>>>>>: " + _return.getResultCode());
		System.out.println("结果信息>>>>>>: " + _return.getResultMessage());
		System.out.println("手机号码>>>>>>: " + _return.getMobile());
		System.out.println("信用卡产品的最近6个月的平均额度使用率>>>>>>: " + _return.getCCardAvgLimitRate6M());
		System.out.println("最近6个月内信贷产品的最大逾期期数>>>>>>>>: " + _return.getCreditLoanMaxOverdue6M());
		System.out.println("最近12个月内信贷产品的最大逾期期数>>>>>>: " + _return.getCreditLoanMaxOverdue12M());
		System.out.println("最近24个月内信贷产品的最大逾期期数>>>>>>: " + _return.getCreditLoanMaxOverdue24M());
		System.out.println("所有信贷产品最大账龄>>>>>>: " + _return.getCreditLoanMaxZL());
		System.out.println("最近6个月内信贷产品累计逾期次数>>>>>>: " + _return.getCreditLoanOverdueNum6M());
		System.out.println("最近12个月内信贷产品累计逾期次数>>>>>>: " + _return.getCreditLoanOverdueNum12M());
		System.out.println("最近24个月内信贷产品累计逾期次数>>>>>>: " + _return.getCreditLoanOverdueNum24M());
		System.out.println("最近3个月信贷审批查询次数>>>>>>: " + _return.getCreditLoanQueryNum3M());
		System.out.println("最近6个月信贷审批查询次数>>>>>>: " + _return.getCreditLoanQueryNum6M());
		System.out.println("最近12个月信贷审批查询次数>>>>>>: " + _return.getCreditLoanQueryNum12M());
		System.out.println("申请人（征信报告）是否有征信>>>>>>: " + _return.getPbocReportFlag());
		System.out.println("申请人（征信报告）贷款当前逾期期数>>>>>>: " + _return.getLoanOverdueNum());
		System.out.println("申请人（征信报告）贷款状态>>>>>>: " + _return.getLoanStatus());
		System.out.println("申请人（征信报告）信用卡当期逾期期数>>>>>>: " + _return.getCCardOverdueNum());
		System.out.println("申请人（征信报告）信用卡状态>>>>>>: " + _return.getCCardStatus());
		System.out.println("申请人（征信报告）近24个月贷款最高逾期期数>>>>>>: " + _return.getLoanMaxOverdue24M());
		System.out.println("申请人（征信报告）近24个月贷款累计逾期期数>>>>>>: " + _return.getLoanSumOverdue24M());
		System.out.println("申请人（征信报告）近24个月信用卡最高逾期期数>>>>>>: " + _return.getCCardMaxOverdue24M());
		System.out.println("申请人（征信报告）近24个月信用卡累计逾期期数>>>>>>: " + _return.getCCardSumOverdue24M());
		System.out.println("申请人（征信报告）额度使用率超过80%的信用卡的张数>>>>>>: "+ _return.getCCardOut80Rate());
		System.out.println("申请人（征信报告）呆账信息汇总笔数>>>>>>: " + _return.getBadAccountNum());
		System.out.println("申请人（征信报告）资产处置信息汇总笔数>>>>>>: " + _return.getAssetDisposals());
		System.out.println("申请人（征信报告）是否存在强制执行记录>>>>>>: " + _return.getCourtExecutions());
		System.out.println("申请人（征信报告）是否存在行政处罚记录>>>>>>: " + _return.getApRecordFlag());
		System.out.println("准贷记卡>>>>>>: " + _return.getSemiCreditCard());
		System.out.println("贷款历史逾期比例>>>>>>: " + _return.getLoanHisOverdueRate());
		System.out.println("单张信用卡历史逾期比例>>>>>>: " + _return.getOneCcardHisOverdueRate());
		System.out.println("多张信用卡历史逾期比例>>>>>>: " + _return.getManyCcardHisOverdueRate());
		System.out.println("申请人（征信报告）贷款月负债>>>>>>: " + _return.getLoanMonthLiabilities());
		System.out.println("信用卡产品最大账龄>>>>>: " + _return.getRESERVED_1());
		System.out.println("住房贷款笔数>>>>>: " + _return.getRESERVED_2());
		System.out.println("信用卡产品的最近6个月的平均额度使用率（授信概要）>>>>>: " + _return.getRESERVED_3());
		
		System.out.println("最近24个月内准贷记卡产品的最大逾期期数（不考虑呆账）>>>>>>: " + _return.getPO_SEMICREDITCARDNO());
		System.out.println("最近24个月内贷款产品的最大逾期期数（不考虑呆账）>>>>>>: " + _return.getPO_LOANTOPDUENUM24NO());
		System.out.println("最近24个月内单个贷款产品的累计逾期期数（不考虑呆账）>>>>>>: " + _return.getPO_LOANSUMDUENUM24NO());
		System.out.println("最近24个月内单张贷记卡产品的最大逾期期数（不考虑呆账）>>>>>>: " + _return.getPO_DEBITCARDTOP24DUENUMNO());
		System.out.println("最近24个月内单张贷记卡产品的累计逾期期数>>>>>>: " + _return.getPO_DEBITCARDSUM24DUENUMNO());
		System.out.println("担保贷款五级分类>>>>>>: " + _return.getPO_ASSUREFIVE());
		System.out.println("申请人（征信报告）呆账信息汇总笔数： " + _return.getPO_BADDEBTSNUM());
		System.out.println("申请人（征信报告）信用卡当期逾期期数>>>>>>: " + _return.getPO_CREDITCARDCURDUED());
	}
}
