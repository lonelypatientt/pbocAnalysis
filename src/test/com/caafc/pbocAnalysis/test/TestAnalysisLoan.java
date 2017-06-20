/*
 * Copyright (c) 2014 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: jseds
 * create: 2014-9-18 下午09:34:29
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.test;

import java.text.ParseException;
import java.util.Map;

import com.caafc.pbocAnalysis.util.AnalysisLoan;

/**
 * TODO 请填写注释.
 * @author Administrator 
 * @version $Revision:$
 */
public class TestAnalysisLoan {

	/**
	 * @param args
	 * @throws Exception 
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException, Exception {
		String s = "1.2007年11月12日机构“PS”发放的50,000元（人民币）农户贷款，业务号X，其他担保，不定期归还,2008年06月10日到期。已于2009年11月结清。";
		
		//String s = "1.2012年07月13日机构“PI”发放的80,000元（人民币）个人汽车贷款，业务号X，抵押担保，48期，按月归还,2016年07月13日到期。已变成呆账，最近一次还款日期为2013年03月25日，余额为72,144元。";
		
		//String s = "1.2013年05月21日机构“FV”发放的43,000元（人民币）个人汽车贷款，业务号X，抵押担保，36期，按月归还,2016年05月21日到期。已于2014年04月结清。";
		
		//String s = "1.2013年06月14日机构“YR”发放的35,630元（人民币）个人汽车贷款，业务号X，抵押担保，036期，按月归还，2016年06月14日到期。截至2014年03月14日，";
		
		Map m = AnalysisLoan.getLoanType(s);
		
		Map m1 = AnalysisLoan.getLoanTypeOther(s);
		
		Map m2 = AnalysisLoan.getLoanTypeOtherIncludeJieQing(s);
		
		String ss = AnalysisLoan.getLoanTypeO(s);
		
		System.out.println(m.get("loanDueNum"));
		System.out.println(m1.get("loanDueNum"));
		System.out.println(m2.get("loanDueNum"));		
		System.out.println(ss);
	}

}
