/*
 * Copyright (c) 2014 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: jseds
 * create: 2014-5-30 下午02:23:00
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.webService.pbocService;


/**
 * 经营消费贷征信公共类
 * 
 * @author qiangxk
 * @version $Revision:$
 */
public class ServiceCommonMethodConsume {

//	private SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
//
//	private SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd");
//	
//	private SimpleDateFormat formats = new SimpleDateFormat("yyyyMM");
//
//	private int custM = Integer.parseInt(DateUtil.getMonths(0));// 当前月份日期
//
//	private int lastM = Integer.parseInt(DateUtil.getMonths(-1));// 当前月的上一个月日期
//
//	/**
//	 * 首张贷记卡、准贷记卡，首笔贷款发放日
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public BigDecimal[] getCreditTipMonth(PbocSummary pboc) throws ParseException, Exception {
//
//		Set<PbocCreditTip> listPC = pboc.getPbocCreditTips();
//		Iterator djkh = (Iterator) listPC.iterator();
//
//		BigDecimal loanMth = new BigDecimal(19000101);// 贷款
//		BigDecimal lcisdMth = new BigDecimal(19000101);// 贷记卡
//		BigDecimal slcisdMth = new BigDecimal(19000101);// 准贷记卡
//
//		while (djkh.hasNext()) {
//			PbocCreditTip pct = (PbocCreditTip) djkh.next();
//			// 贷款
//			if (StringUtil.isNotEmpty(pct.getFitLpMth())) {
//				loanMth = new BigDecimal(pct.getFitLpMth().replace(".", "") + 01);
//			}
//			// 贷记卡
//			if (StringUtil.isNotEmpty(pct.getFitLcIsdMth())) {
//				lcisdMth = new BigDecimal(pct.getFitLcIsdMth().replace(".", "") + 01);
//			}
//			// 准贷记卡
//			if (StringUtil.isNotEmpty(pct.getFitSlcIsdMth())) {
//				slcisdMth = new BigDecimal(pct.getFitSlcIsdMth().replace(".", "") + 01);
//			}
//		}
//		BigDecimal[] CreditTipMonth = new BigDecimal[3];
//		CreditTipMonth[0] = loanMth;
//		CreditTipMonth[1] = lcisdMth;
//		CreditTipMonth[2] = slcisdMth;
//
//		return CreditTipMonth;
//	}
//
//	/**
//	 * 当前未结清贷款账户数,余额
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public BigDecimal[] getLoanCnt(PbocSummary pboc) {
//
//		Set<PbocUnslSummary> listPUS = pboc.getPbocUnslSummaries();
//		Iterator loan = (Iterator) listPUS.iterator();
//
//		BigDecimal loanNum = new BigDecimal(0);
//		BigDecimal loanAmt = new BigDecimal(0);
//		while (loan.hasNext()) {
//			PbocUnslSummary pbocUnslSummary = (PbocUnslSummary) loan.next();
//			// 当前未结清贷款账户数
//			if (pbocUnslSummary.getLoanCnt() != null) {
//				loanNum = pbocUnslSummary.getLoanCnt();
//			}
//			// 未结清贷款余额
//			if (pbocUnslSummary.getBalance() != null) {
//				loanAmt = pbocUnslSummary.getBalance();
//			}
//		}
//		BigDecimal[] loans = new BigDecimal[2];
//		loans[0] = loanNum;
//		loans[1] = loanAmt;
//
//		return loans;
//	}
//
//	/**
//	 * 当前未结清贷记卡账户数、已用额度、授信总额
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public BigDecimal[] getLcisdCnt(PbocSummary pboc) {
//
//		Set<PbocUncancelLcSummary> listPULS = pboc.getPbocUncancelLcSummaries();
//		Iterator lcisd = (Iterator) listPULS.iterator();
//		BigDecimal lcisdCnt = new BigDecimal(0);
//		BigDecimal lcisdAmt = new BigDecimal(0);
//		BigDecimal creditAmt = new BigDecimal(0);
//		while (lcisd.hasNext()) {
//			PbocUncancelLcSummary pls = (PbocUncancelLcSummary) lcisd.next();
//			// 当前未结清贷记卡账户数
//			if (pls.getActCnt() != null) {
//				lcisdCnt = pls.getActCnt();
//			}
//			// 未销户贷记卡已用额度
//			if (pls.getUsedAmt() != null) {
//				lcisdAmt = pls.getUsedAmt();
//			}
//			// 未销户贷记卡授信总额
//			if (pls.getCreditAmt() != null) {
//				creditAmt = pls.getCreditAmt();
//			}
//		}
//		BigDecimal[] lcisds = new BigDecimal[3];
//		lcisds[0] = lcisdCnt;
//		lcisds[1] = lcisdAmt;
//		lcisds[2] = creditAmt;
//
//		return lcisds;
//	}
//
//	/**
//	 * 当前未结清准贷记卡账户数、透支额度、授信总额
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public BigDecimal[] getSlcisdCnt(PbocSummary pboc) {
//
//		Set<PbocUncancelSlcSummary> listPUSl = pboc.getPbocUncancelSlcSummaries();
//		Iterator slcisd = (Iterator) listPUSl.iterator();
//
//		BigDecimal slcisdCnt = new BigDecimal(0);// 当前未结清准贷记卡账户数
//		BigDecimal slcisdAmt = new BigDecimal(0);// 未销户准贷记卡透支额度
//		BigDecimal creditAmts = new BigDecimal(0);// 未销户准贷记卡授信总额
//
//		while (slcisd.hasNext()) {
//			PbocUncancelSlcSummary pss = (PbocUncancelSlcSummary) slcisd.next();
//			// 当前未结清准贷记卡账户数
//			if (pss.getActCnt() != null) {
//				slcisdCnt = pss.getActCnt();
//			}
//			// 未销户准贷记卡透支额度
//			if (pss.getOverdraft() != null) {
//				slcisdAmt = pss.getOverdraft();
//			}
//			// 未销户准贷记卡授信总额
//			if (pss.getCreditAmt() != null) {
//				creditAmts = pss.getCreditAmt();
//			}
//		}
//		BigDecimal[] slcisds = new BigDecimal[3];
//		slcisds[0] = slcisdCnt;
//		slcisds[1] = slcisdAmt;
//		slcisds[2] = creditAmts;
//
//		return slcisds;
//	}
//
//	/**
//	 * 状态为不良对外担保金额 担保贷款五级分类（统计分类为次级、可疑、损失的记录的担保金额合计）
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int getBadGuarantAmt(PbocSummary pboc) {
//
//		Set<PbocGuaranteeSummary> listPGS = pboc.getPbocGuaranteeSummaries();
//		Iterator listPgs = (Iterator) listPGS.iterator();
//		int guarantAmt = 0;// 担保金额--默认值
//		while (listPgs.hasNext()) {
//			PbocGuaranteeSummary pbocGuaranteeSummary = (PbocGuaranteeSummary) listPgs.next();
//			Set<PbocGuaranteeDetail> lpd = pbocGuaranteeSummary.getPbocGuaranteeDetails();
//			if (lpd.size() != 0) {
//				Iterator lpdsS = (Iterator) lpd.iterator();
//				while (lpdsS.hasNext()) {
//					PbocGuaranteeDetail pbocGuaranteeDetail = (PbocGuaranteeDetail) lpdsS.next();
//					if (pbocGuaranteeDetail.getRiskGradeFive() != null
//							&& !pbocGuaranteeDetail.getRiskGradeFive().equals("")) {
//						// 担保状态为：次级--3，可疑--4，损失--5
//						if (pbocGuaranteeDetail.getRiskGradeFive().equals("3")
//								|| pbocGuaranteeDetail.getRiskGradeFive().equals("4")
//								|| pbocGuaranteeDetail.getRiskGradeFive().equals("5")) {
//							// 担保金额
//							guarantAmt = guarantAmt + pbocGuaranteeDetail.getGlAmt().intValue();
//						}
//					}
//				}
//			}
//		}
//		return guarantAmt;
//	}
//
//	/**
//	 * 是否有授信记录---默认值为：空 （无贷款、信用卡、准贷记卡记录）或（有贷记卡、准贷记卡记录且状态为未激活）=否
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public String getTrustRecordInd(PbocSummary pboc) throws ParseException, Exception {
//
//		String countYQD = "0";// 默认值--无
//		
//		boolean loanCode = false;//贷款授信记录
//		boolean loanCardCode = false;//贷记卡授信记录
//		boolean sldCode = false;//准贷记卡授信记录
//		// 贷款
//		Set<PbocLoanSummary> PLSS = pboc.getPbocLoanSummaries();
//		if (PLSS.size() != 0) {
//			loanCode = true;
////			return countYQD;
//		}
//		// 贷记卡
//		Set<PbocLoancardSummary> loancardSummaries = pboc.getPbocLoancardSummaries();
//		Iterator iterator = (Iterator) loancardSummaries.iterator();
//		while (iterator.hasNext()) {
//			PbocLoancardSummary psd = (PbocLoancardSummary) iterator.next();
//			if (StringUtil.isNotEmpty(psd.getCcStatus())) {
//				if (psd.getCcStatus().equals(CardStatus.WJH.getValue())) {
//					loanCardCode = false;
//				} else {
//					loanCardCode = true;
//					break;
//				}
//			}
//		}
//		// 准贷记卡
//		Set<PbocSldSummary> pss = pboc.getPbocSldSummaries();
//		Iterator ss = (Iterator) pss.iterator();
//		while (ss.hasNext()) {
//			PbocSldSummary summary = (PbocSldSummary) ss.next();
//			if (StringUtil.isNotEmpty(summary.getCcStatus())) {
//				if (summary.getCcStatus().equals(CardStatus.WJH.getValue())) {
//					sldCode = false;
//				} else {
//					sldCode = true;
//					break;
//				}
//			}
//		}
//
//		if(loanCode || loanCardCode || sldCode){
//			countYQD = "1";
//		}
//		return countYQD;
//	}
//
//	/**
//	 * 他行存量自有住房/商业用房抵押经营贷余额合计
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int getLoanAmt(PbocSummary pboc) throws ParseException, Exception {
//		ServiceCommonMethod se = new ServiceCommonMethod();
//		Set<PbocLoanSummary> PLSS = pboc.getPbocLoanSummaries();
//		Iterator plss = (Iterator) PLSS.iterator();
//		int loanAmts = 0;
//		while (plss.hasNext()) {
//			PbocLoanSummary pbocs = (PbocLoanSummary) plss.next();
//			// 判断五类分级为正常，当前无逾期
//			if (se.Checktrue(pbocs) == true) {
//				if (StringUtil.isNotEmpty(pbocs.getDescription())) {
//					Map<String, String> type = AnalysisLoan.getLoanTypeOther(pbocs.getDescription());
//
//					String comapanyType = AnalysisLoan.getComapanyType(pbocs.getDescription());
//					String loanType = AnalysisLoan.getLoanTypeO(pbocs.getDescription());
//					if (type != null && StringUtil.isNotEmpty(comapanyType) && !comapanyType.equals("江苏银行")
//							&& StringUtil.isNotEmpty(loanType) && loanType.equals("个人经营性贷款")
//							&& type.get("loanType") != null && type.get("loanType").equals("抵押")) {
//						loanAmts = loanAmts + pbocs.getCapitalBalance().intValue();
//					}
//				}
//			}
//		}
//		return loanAmts;
//	}
//
//	/**
//	 * 单笔-贷款/贷记卡/准贷记卡-最大逾期金额
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public BigDecimal[] getMaxYuQiAmt(PbocSummary pboc) {
//
//		Set<PbocOdSummary> ods = pboc.getPbocOdSummaries();
//		Iterator pods = (Iterator) ods.iterator();
//		int loanAmt = 0;// 贷款最大逾期金额
//		int djkAmt = 0;// 贷记卡最大逾期金额
//		int zdjkAmt = 0;// 准贷记卡最大逾期金额
//
//		while (pods.hasNext()) {
//			PbocOdSummary pbocOdSummary = (PbocOdSummary) pods.next();
//			// 贷款最大逾期金额
//			if (pbocOdSummary.getLoanOdBalMthMax() != null) {
//				loanAmt = pbocOdSummary.getLoanOdBalMthMax().intValue() > loanAmt ? pbocOdSummary.getLoanOdBalMthMax()
//						.intValue() : loanAmt;
//			}
//
//			// 贷记卡最大逾期金额
//			if (pbocOdSummary.getLcOdBalMthMax() != null) {
//				djkAmt = pbocOdSummary.getLcOdBalMthMax().intValue() > djkAmt ? pbocOdSummary.getLcOdBalMthMax()
//						.intValue() : djkAmt;
//			}
//			// 准贷记卡最大逾期金额
//			if (pbocOdSummary.getSlcOdBalMthMax() != null) {
//				zdjkAmt = pbocOdSummary.getSlcOdBalMthMax().intValue() > zdjkAmt ? pbocOdSummary.getSlcOdBalMthMax()
//						.intValue() : zdjkAmt;
//			}
//		}
//		BigDecimal[] maxAmt = new BigDecimal[3];
//
//		maxAmt[0] = new BigDecimal(loanAmt);
//		maxAmt[1] = new BigDecimal(djkAmt);
//		maxAmt[2] = new BigDecimal(zdjkAmt);
//
//		return maxAmt;
//	}
//
//	/**
//	 * 贷款/贷记卡/准贷记卡最长逾期月数
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public BigDecimal[] getMaxMonths(PbocSummary pboc) {
//
//		Set<PbocOdSummary> ods = pboc.getPbocOdSummaries();
//		Iterator pods = (Iterator) ods.iterator();
//		int loanMaxMonths = 0;// 贷款
//		int djkMaxMonths = 0;// 贷记卡
//		int zdjkMaxMonths = 0;// 准贷记卡
//		while (pods.hasNext()) {
//			PbocOdSummary pbocOdSummary = (PbocOdSummary) pods.next();
//
//			// 贷款逾期最长逾期月数
//			if (pbocOdSummary.getLoanOdMthMax() != null) {
//				loanMaxMonths = pbocOdSummary.getLoanOdMthMax().intValue() > loanMaxMonths ? pbocOdSummary
//						.getLoanOdMthMax().intValue() : loanMaxMonths;
//			}
//			// 贷记卡逾期最长逾期月数
//			if (pbocOdSummary.getLcOdMthMax() != null) {
//				djkMaxMonths = pbocOdSummary.getLcOdMthMax().intValue() > djkMaxMonths ? pbocOdSummary.getLcOdMthMax()
//						.intValue() : djkMaxMonths;
//			}
//			// 准贷记卡60天以上透支最长透支月数
//			if (pbocOdSummary.getSlcOdMthMax() != null) {
//				zdjkMaxMonths = pbocOdSummary.getSlcOdMthMax().intValue() > zdjkMaxMonths ? pbocOdSummary
//						.getSlcOdMthMax().intValue() : zdjkMaxMonths;
//			}
//		}
//		BigDecimal[] MaxmaMonths = new BigDecimal[3];
//
//		MaxmaMonths[0] = new BigDecimal(loanMaxMonths);
//		MaxmaMonths[1] = new BigDecimal(djkMaxMonths);
//		MaxmaMonths[2] = new BigDecimal(zdjkMaxMonths);
//
//		return MaxmaMonths;
//	}
//
//	/**
//	 * 贷款/贷记卡/准贷记卡累计逾期月数
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public BigDecimal[] getTotalMonths(PbocSummary pboc) {
//
//		Set<PbocOdSummary> ods = pboc.getPbocOdSummaries();
//		Iterator pods = (Iterator) ods.iterator();
//		int loanTotalMonth = 0;// 贷款
//		int djkTotalMonth = 0;// 贷记卡
//		int zdjkTotalMonth = 0;// 准贷记卡
//
//		while (pods.hasNext()) {
//			PbocOdSummary pbocOdSummary = (PbocOdSummary) pods.next();
//
//			// 贷款累计逾期月数
//			if (pbocOdSummary.getLoanOdMth() != null) {
//				loanTotalMonth = loanTotalMonth + pbocOdSummary.getLoanOdMth().intValue();
//			}
//			// 贷记卡累计逾期月数
//			if (pbocOdSummary.getLcOdMth() != null) {
//				djkTotalMonth = djkTotalMonth + pbocOdSummary.getLcOdMth().intValue();
//			}
//			// 准贷记卡累计逾期月数
//			if (pbocOdSummary.getSlcOdMth60() != null) {
//				zdjkTotalMonth = zdjkTotalMonth + pbocOdSummary.getSlcOdMth60().intValue();
//			}
//		}
//		BigDecimal[] TotalMonth = new BigDecimal[3];
//
//		TotalMonth[0] = new BigDecimal(loanTotalMonth);
//		TotalMonth[1] = new BigDecimal(djkTotalMonth);
//		TotalMonth[2] = new BigDecimal(zdjkTotalMonth);
//
//		return TotalMonth;
//
//	}
//
//	/**
//	 * 贷款/贷记卡/准贷记卡单月最高逾期总额 贷款/贷记卡/准贷记卡累计逾期月数 贷款/贷记卡/准贷记卡最长逾期月数
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int[] getMaxAmountPerMonth(PbocSummary pboc) {
//
//		Set<PbocOdSummary> ods = pboc.getPbocOdSummaries();
//		Iterator pods = (Iterator) ods.iterator();
//		int naxAmt = 0;// 单月最高逾期总额
//		int totalMonths = 0;// 累计逾期月数
//		int maxMonths = 0;// 最长逾期月数
//
//		while (pods.hasNext()) {
//			PbocOdSummary pbocOdSummary = (PbocOdSummary) pods.next();
//			/** 贷款/贷记卡/准贷记卡单月最高逾期总额 */
//			// 贷款逾期单月最高逾期总额
//			if (pbocOdSummary.getLoanOdBalMthMax() != null) {
//				naxAmt = naxAmt + pbocOdSummary.getLoanOdBalMthMax().intValue();
//			}
//
//			// 贷记卡逾期单月最高逾期总额
//			if (pbocOdSummary.getLcOdBalMthMax() != null) {
//				naxAmt = naxAmt + pbocOdSummary.getLcOdBalMthMax().intValue();
//			}
//			// 准贷记卡60天以上透支单月最高透支余额
//			if (pbocOdSummary.getSlcOdBalMthMax() != null) {
//				naxAmt = naxAmt + pbocOdSummary.getSlcOdBalMthMax().intValue();
//			}
//
//			/** 贷款/贷记卡/准贷记卡累计逾期月数 */
//			// 贷款逾期月份数
//			if (pbocOdSummary.getLoanOdMth() != null) {
//				totalMonths = totalMonths + pbocOdSummary.getLoanOdMth().intValue();
//			}
//			// 贷记卡逾期月份数
//			if (pbocOdSummary.getLcOdMth() != null) {
//				totalMonths = totalMonths + pbocOdSummary.getLcOdMth().intValue();
//			}
//			// 准贷记卡60天以上透支月份数
//			if (pbocOdSummary.getSlcOdMth60() != null) {
//				totalMonths = totalMonths + pbocOdSummary.getSlcOdMth60().intValue();
//			}
//
//			/** 贷款/贷记卡/准贷记卡最长逾期月数 */
//			// 贷款逾期月份数
//			if (pbocOdSummary.getLoanOdMthMax() != null) {
//				maxMonths = maxMonths + pbocOdSummary.getLoanOdMthMax().intValue();
//			}
//			// 贷记卡逾期月份数
//			if (pbocOdSummary.getLcOdMthMax() != null) {
//				maxMonths = maxMonths + pbocOdSummary.getLcOdMthMax().intValue();
//			}
//			// 准贷记卡60天以上透支月份数
//			if (pbocOdSummary.getSlcOdMthMax() != null) {
//				maxMonths = maxMonths + pbocOdSummary.getSlcOdMthMax().intValue();
//			}
//		}
//		int[] loan = new int[3];
//		loan[0] = naxAmt;
//		loan[1] = totalMonths;
//		loan[2] = maxMonths;
//
//		return loan;
//	}
//
//	/**
//	 * 他行住房贷款笔数（含已结清） 他行其他贷款笔数（含已结清）
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int[] getLoanNum(PbocSummary pboc) throws ParseException, Exception {
//
//		Set<PbocLoanSummary> PLSS = pboc.getPbocLoanSummaries();
//		Iterator plss = (Iterator) PLSS.iterator();
//		int homeLoanNum = 0;// 他行住房贷款笔数（含已结清）
//		int otherLoanNum = 0;// 他行其他贷款笔数（含已结清）
//		while (plss.hasNext()) {
//			PbocLoanSummary pbocs = (PbocLoanSummary) plss.next();
//			if (StringUtil.isNotEmpty(pbocs.getDescription())) {
//				String comapanyType = AnalysisLoan.getComapanyType(pbocs.getDescription());
//				//通过loantype字段来判断 modified by luqian at 20140909
//				String loanType = pbocs.getLoanType();
//				// 他行住房贷款笔数（含已结清）
//				if (StringUtil.isNotEmpty(comapanyType) && !comapanyType.equals("江苏银行")
//						&& StringUtil.isNotEmpty(loanType) && loanType.equals(LoanType.ZF.getValue())) {
//					homeLoanNum++;
//				}
//				// 他行其他贷款笔数（含已结清）
//				if (StringUtil.isNotEmpty(comapanyType) && !comapanyType.equals("江苏银行")
//						&& StringUtil.isNotEmpty(loanType) && !loanType.equals(LoanType.ZF.getValue())) {
//					otherLoanNum++;
//				}
//			}
//		}
//
//		int[] LoanNum = new int[2];
//		LoanNum[0] = homeLoanNum;
//		LoanNum[1] = otherLoanNum;
//
//		return LoanNum;
//	}
//
//	/**
//	 * 当前未结清住房贷款账户数
//	 * 
//	 * 根据信贷交易信息明细中的贷款信息部分统计得出，
//	 * 根据贷款的描述信息中“贷款种类细分（个人住房贷款）、贷款机构名称（非江苏银行）”计算，
//	 * 仅包含未结清销户的贷款
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int getWjqHouseLoanNum(PbocSummary pboc) throws ParseException, Exception {
//
//		Set<PbocLoanSummary> PLSS = pboc.getPbocLoanSummaries();
//		Iterator plss = (Iterator) PLSS.iterator();
//		int houseLoanNum = 0;// 未结清住房贷款账户数
//		while (plss.hasNext()) {
//			PbocLoanSummary pbocs = (PbocLoanSummary) plss.next();
//			if (StringUtil.isNotEmpty(pbocs.getDescription())) {
//				String comapanyType = AnalysisLoan.getComapanyType(pbocs.getDescription());
//				//贷款类型 modified by luqian at 20140909
//				String loanType = pbocs.getLoanType();
//				//账户状态 modified by luqian at 20141204
//				String loanStatus = pbocs.getLoanStatus();
//				// 未结清住房贷款账户数
//				if (StringUtil.isNotEmpty(comapanyType) && !comapanyType.equals("江苏银行")
//						&& StringUtil.isNotEmpty(loanType) && loanType.equals(LoanType.ZF.getValue())
//						&& StringUtil.isNotEmpty(loanStatus) && !loanStatus.equals(LoanStatus.JQ.getValue())) {
//					houseLoanNum++;
//				}
//			}
//		}
//
//		return houseLoanNum;
//	}
//	
//	/**
//	 * 特殊风险交易 默认值：无
//	 * 
//	 * 根据借款人贷款、贷记卡、准贷记卡有无所列类别的特殊交易信息记录判断。 特殊交易类型包括担保人代偿、以资抵债、呆帐、冻结、止付等。
//	 * 
//	 * 判断规则：
//	 * 1）特殊交易类型为担保人代还或以资抵债；
//	 * 2）贷款、贷记卡、准贷记卡的交易信息明细中描述信息中出现“呆账”、“冻结”、“止付”等状态描述词时；
//	 * 3）逾期及违约信息概要处呆账信息汇总、资产处置信息汇总、保证人代偿信息汇总中“笔数”大于等于1时。
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public String getSpecialTrade(PbocSummary pboc) throws ParseException, Exception {
//		// 有无特殊风险情况
//		String specialTrade = "0";// 默认值--无
//		// 贷款特殊交易类型
//		if("0".equals(specialTrade)){
//			Set<PbocLoanSummary> listPLsS = pboc.getPbocLoanSummaries();
//			Iterator<PbocLoanSummary> listPs = listPLsS.iterator();
//			while (listPs.hasNext()) {
//				PbocLoanSummary pbocLoanSummaryss = listPs.next();
//				if (pbocLoanSummaryss.getSpecialTradeType() != null && !pbocLoanSummaryss.getSpecialTradeType().equals("")) {
//					if (pbocLoanSummaryss.getSpecialTradeType().equals("2")// 担保人代还
//							|| pbocLoanSummaryss.getSpecialTradeType().equals("3")) {// 以资抵债
//						specialTrade = "1";
//						break;
//					}
//				}
//				
//				if (pbocLoanSummaryss.getDescription() != null && !pbocLoanSummaryss.getDescription().equals("")) {
//					// 判断是否有呆账
//					if (AnalysisLoan.getTrue(pbocLoanSummaryss.getDescription())) {
//						specialTrade = "1";
//						break;
//					}
//				}
//			}
//		}
//		
//		// 准贷记卡
//		if("0".equals(specialTrade)){
//			Set<PbocSldSummary> ps = pboc.getPbocSldSummaries();
//			Iterator<PbocSldSummary> psList = ps.iterator();
//			while (psList.hasNext()) {
//				PbocSldSummary pss = psList.next();
//				if (pss.getSpecialTradeType() != null && !pss.getSpecialTradeType().equals("")) {
//					if (pss.getSpecialTradeType().equals("2") // 担保人代还
//							|| pss.getSpecialTradeType().equals("3")) {// 以资抵债
//						specialTrade = "1";
//						break;
//					}
//				}
//				
//				if (pss.getDescription() != null && !pss.getDescription().equals("")) {
//					// 判断是否有冻结，止付,呆账
//					if (AnalysisLoan.getTrue(pss.getDescription())) {
//						specialTrade = "1";
//						break;
//					}
//				}
//			}
//		}
//		
//		
//		// 贷记卡
//		if("0".equals(specialTrade)){
//			Set<PbocLoancardSummary> pls = pboc.getPbocLoancardSummaries();
//			Iterator<PbocLoancardSummary> listls = pls.iterator();
//			while (listls.hasNext()) {
//				PbocLoancardSummary psd = listls.next();
//				if (psd.getSpecialTradeType() != null && !psd.getSpecialTradeType().equals("")) {
//					if (psd.getSpecialTradeType().equals("2") // 担保人代还
//							|| psd.getSpecialTradeType().equals("3")) {// 以资抵债
//						specialTrade = "1";
//						break;
//					}
//				}
//				
//				if (psd.getDescription() != null && !psd.getDescription().equals("")) {
//					// 判断是否有冻结、止付、呆账
//					if (AnalysisLoan.getTrue(psd.getDescription())) {
//						specialTrade = "1";
//						break;
//					}
//				}
//			}
//		}
//		
//		
//		//逾期及违约信息概要处呆账信息汇总、资产处置信息汇总、保证人代偿信息汇总中“笔数”大于等于1
//		if("0".equals(specialTrade)){
//			Set<PbocOdBaSummary> pobs = pboc.getPbocOdBaSummaries();
//			Iterator<PbocOdBaSummary> itPobs = pobs.iterator();
//			while(itPobs.hasNext()){
//				PbocOdBaSummary pob = itPobs.next();
//				if(pob.getBadActCnt().intValue() >= 1 
//						|| pob.getAdCnt().intValue() >= 1
//						|| pob.getAsrPayCnt().intValue() >= 1){
//					
//					specialTrade = "1";
//					break;
//				}
//			}
//		}
//		
//		return specialTrade;
//	}
//
//	/**
//	 * 是否参加社保 社保欠缴日期
//	 * 
//	 * 根据养老保险金最新缴存记录，判断‘缴费状态’不为‘参保缴费’或‘信息更新日期’ 如果不为上月或本月时，
//	 * 即为欠缴。欠缴日期为‘信息更新日期’的下一个月首日。
//	 * 
//	 * 缴费状态为“参保缴费”，如果信息更新日期不为“本月”或“上月”，则欠缴日期为信息更新日期下月， 
//	 * 缴费状态不为“参保缴费”，则欠缴日期为信息更新日期下月（不考虑信息更新日期是否为“本月”或“上月”）。
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public String[] IsNotSBao(PbocSummary pboc) throws ParseException, Exception {
//
//		String socialInsurance = "0";// 是否参加社保--默认无
//		String insuranceMissDate = "19000101";// 社保欠缴日期
//
//		if (pboc.getPbocAiInRecords().size() != 0) {
//			Set<PbocAiInRecord> parSet = pboc.getPbocAiInRecords();// 社保参缴记录表
//			Iterator parIterator = (Iterator) parSet.iterator();
//			Date maxDate = null;// 更新日期
//			String actStatus = "0";// 缴费状态
//			while (parIterator.hasNext()) {
//				PbocAiInRecord pbocAccFundRecord = (PbocAiInRecord) parIterator.next();
//				Date endMth = pbocAccFundRecord.getOccureDate();// 更新日期
//				if (endMth != null) {
//					if (maxDate == null) {
//						maxDate = endMth;
//						actStatus = pbocAccFundRecord.getActStatus();
//					} else {
//						if (DateUtil.compareDate(endMth, maxDate) == 1) {
//							maxDate = endMth;
//							actStatus = pbocAccFundRecord.getActStatus();
//						}
//					}
//				}
//			}
//			socialInsurance = "1";
//			//避免缴费状态出现空指针 20140916
//			if(actStatus == null){
//				actStatus = "0";
//			}
//			
//			// 社保欠缴起始日期
//			if (maxDate != null) {
//				String date1 = format.format(maxDate);
//				Calendar cabig = Calendar.getInstance();
//				cabig.setTime(format.parse(date1));
//				int dates = Integer.parseInt(formats.format(cabig.getTime()));
//				// 缴费状态---参保缴费
//				if (actStatus.equals("1")) {
//					// 信息更新日期不为本月或上月
//					if (dates != custM && dates != lastM) {
//						// 欠缴起始日期为更新日期下月
//						insuranceMissDate = DateUtil.getNextMonth(date1);
//					}
//				} else {
//					insuranceMissDate = DateUtil.getNextMonth(date1);
//				}
//			}
//		}
//		String[] social = new String[2];
//
//		social[0] = socialInsurance;
//		social[1] = insuranceMissDate;
//
//		return social;
//	}
//
//	/**
//	 * 是否缴纳公积金 公积金欠缴起始日期
//	 * 
//	 * “缴费状态”不为“缴交”或“缴至月份”如果不为上月或本月时，即为欠缴
//	 * 
//	 * 缴费状态为缴交，如果缴至月份为”本月“或“上月”则欠缴起始日期为缴至月份下一月， 如果缴费状态不为缴交，
//	 * 则欠缴起始日期为缴至月份下一月（不判断缴至月份是否为本月或上月）。
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public String[] IsNotGjj(PbocSummary pboc) throws ParseException, Exception {
//
//		Set<PbocAccFundRecord> air = pboc.getPbocAccFundRecords();
//		Iterator listls = (Iterator) air.iterator();
//		String reserveFundInd = "0";// 是否缴纳公积金
//		String fundMissDate = "19000101";// 公积金欠缴起始日期
//		while (listls.hasNext()) {
//			PbocAccFundRecord pbocAccFundRecord = (PbocAccFundRecord) listls.next();
//			reserveFundInd = "1";
//			if (pbocAccFundRecord.getEndMth() != null) {
//				int dates = Integer.parseInt(pbocAccFundRecord.getEndMth().replace(".", ""));
//				String date = String.valueOf(pbocAccFundRecord.getEndMth().replace(".", "") + "01");
//				// 缴费状态为缴交
//				if (pbocAccFundRecord.getFundStatus().equals("1")) {
//					// 缴至月份 不为上月或本月
//					if (dates != custM && dates != lastM) {
//						fundMissDate = DateUtil.getNextMonth(date);
//					}
//				} else {
//					// 缴费状态不为缴交，则欠缴起始日期即为缴至月份下月（不考虑缴至月份是否为本月或上月）
//					fundMissDate = DateUtil.getNextMonth(date);
//				}
//			}
//		}
//		String[] reserve = new String[2];
//		reserve[0] = reserveFundInd;
//		reserve[1] = fundMissDate;
//
//		return reserve;
//	}
//
//	/**
//	 * 当前状态为逾期的账户数
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public BigDecimal[] getYuQiAcctNum(PbocSummary pboc) {
//
//		// 贷款
//		Set<PbocLoanSummary> ppl = pboc.getPbocLoanSummaries();
//		Iterator ppls = (Iterator) ppl.iterator();
//		int loanNum = 0;
//		while (ppls.hasNext()) {
//			PbocLoanSummary lsd = (PbocLoanSummary) ppls.next();
//			if (lsd.getCurOdTerm() != null && lsd.getCurOdTerm().intValue() != 0) {
//				loanNum++;
//			}
//		}
//		// 贷记卡
//		Set<PbocLoancardSummary> pts = pboc.getPbocLoancardSummaries();
//		Iterator ptss = (Iterator) pts.iterator();
//		int djkNum = 0;
//		while (ptss.hasNext()) {
//			PbocLoancardSummary lcst = (PbocLoancardSummary) ptss.next();
//			if (lcst.getCurOdTerm() != null && lcst.getCurOdTerm().intValue() != 0) {
//				djkNum++;
//			}
//		}
//		// 准贷记卡的 逾期期数要-1
//		Set<PbocSldSummary> pssl = pboc.getPbocSldSummaries();
//		Iterator zdjks = (Iterator) pssl.iterator();
//		int zdjkNum = 0;
//		while (zdjks.hasNext()) {
//			PbocSldSummary lcsp = (PbocSldSummary) zdjks.next();
//			if (lcsp.getOdMthMax() != null && lcsp.getOdMthMax().intValue() - 1 > 0) {
//				zdjkNum++;
//			}
//		}
//
//		BigDecimal[] AcctNum = new BigDecimal[3];
//
//		AcctNum[0] = new BigDecimal(loanNum);// 贷款
//		AcctNum[1] = new BigDecimal(djkNum);// 贷记卡
//		AcctNum[2] = new BigDecimal(zdjkNum);// 准贷记卡
//
//		return AcctNum;
//	}
//
//	/**
//	 * 信贷账户最近num个月内最坏逾期状态
//	 * 统计时间：根据查询月从贷款还款记录明细（已结清的账户根据逾期记录明细）向前推6个月，包含本月（例如查询月为2014年7月，最近6个月就是7月-2月）；
//	 * 
//	 * "如果无征信报告赋值999，有征信但无贷款明细赋值998
//	 * 
//	 * 最坏逾期状态根据查询月从贷款、准贷记卡、贷记卡还款明细（贷款最后一个还款月对应的日期为应还款日， 
//	 * 信用卡最后一个还款月对应的日期为账单日）中向前推num个月（含查询月），取其中发生逾期月份的最大数，
//	 * 如无逾期记录，则为0，准贷记卡还款记录标志为2时算作逾期。
//	 * 
//	 * 贷款、信用卡、准贷记卡状态：所有状态的账户。当有账户状态为“呆账”、“冻结”、“止付”时赋值“997”。"
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws Exception
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int getBadsL6MfinalM(PbocSummary pboc, int num) throws Exception {
//
//		//包含本月，所以实际是往前num-1个月，如查询日期是9月，往前6个月就是4月
//		num = num - 1;
//		// 贷款
//		Set<PbocLoanSummary> pls = pboc.getPbocLoanSummaries();
//		Iterator pbocpls = (Iterator) pls.iterator();
//		int loanYuQi = 0;// 贷款逾期期数---默认0
//		int loanYuQiTemp = 0;// 贷款逾期期数中间值---默认0
//		while (pbocpls.hasNext()) {
//			PbocLoanSummary pss = (PbocLoanSummary) pbocpls.next();
//
//			if (StringUtil.isNotEmpty(pss.getLoanStatus())) {
//				// 状态为“呆账”，给默认值997
//				if (pss.getLoanStatus().equals(LoanStatus.DZ.getValue())) {
//					loanYuQi = 997;
//				
//				} else {
//					// 根据查询月往前num个月的日期
//					Date lastMonth = format.parse(DateUtil.getMonthByDate(num, pboc.getQueryTime()));
//					if (pss.getPayDate() != null) {
//						Date payDate = pss.getPayDate();// 应还款日
//	
//						// 应还款日期大于报告生成日期近n个月日期
//						if (Integer.parseInt(format.format(payDate)) >= Integer.parseInt(format.format(lastMonth))) {
//							// 应还款日与报告生成日期前n个月日期之间的间隔月数
//							int month = DateUtil.getMonths(lastMonth, payDate);
//							// month在查询日期范围内
//							if (month <= num) {
//								int n = 23 - month;
//								loanYuQiTemp = countDJK(pss.getPaymentStatusM24(), n);
//								//取多张卡中的最大值 modified by luqian at 20140909
//								loanYuQi = loanYuQi > loanYuQiTemp ? loanYuQi : loanYuQiTemp;
//							}
//						}
//					}
//				}
//			}
//		}
//		// 贷记卡
//		Set<PbocLoancardSummary> plsd = pboc.getPbocLoancardSummaries();
//		Iterator pbocls = (Iterator) plsd.iterator();
//		int loanCardYuQi = 0;// 贷记卡逾期期数---默认0
//		int loanCardYuQiTemp = 0;// 贷记卡逾期期数中间值---默认0
//		while (pbocls.hasNext()) {
//			PbocLoancardSummary plss = (PbocLoancardSummary) pbocls.next();
//
//			if (StringUtil.isNotEmpty(plss.getCcStatus())) {
//				// 状态为“呆账”、“冻结”、“止付”时赋值“997”
//				if (plss.getCcStatus().equals(CardStatus.DZ.getValue())
//						|| plss.getCcStatus().equals(CardStatus.ZF.getValue())
//						|| plss.getCcStatus().equals(CardStatus.DJ.getValue())) {
//					loanCardYuQi = 997;
//				
//				} else {
//					// 根据查询月往前num个月的日期
//					Date lastMonth = format.parse(DateUtil.getMonthByDate(num, pboc.getQueryTime()));
//					if (plss.getBillDate() != null) {
//						Date payDate = plss.getBillDate();// 账单日
//	
//						// 应还款日期大于报告生成日期近n个月日期
//						if (Integer.parseInt(format.format(payDate)) >= Integer.parseInt(format.format(lastMonth))) {
//							// 应还款日与报告生成日期前n个月日期之间的间隔月数
//							int month = DateUtil.getMonths(lastMonth, payDate);
//							// month在查询日期范围内
//							if (month <= num) {
//								int n = 23 - month;
//								loanCardYuQiTemp = countDJK(plss.getPaymentStatusM24(), n);
//								//取多张卡中的最大值 modified by luqian at 20140909
//								loanCardYuQi = loanCardYuQi > loanCardYuQiTemp ? loanCardYuQi : loanCardYuQiTemp;
//							}
//						}
//					}
//				}
//			}
//		}
//
//		// 准贷记卡
//		Set<PbocSldSummary> psls = pboc.getPbocSldSummaries();
//		Iterator pbocsls = (Iterator) psls.iterator();
//		int sldYuQi = 0;// 准贷记卡逾期期数---默认0
//		int sldYuQiTemp = 0;// 准贷记卡逾期期数中间值---默认0
//		while (pbocsls.hasNext()) {
//			PbocSldSummary plsl = (PbocSldSummary) pbocsls.next();
//
//			if (StringUtil.isNotEmpty(plsl.getCcStatus())) {
//				// 状态为“呆账”、“冻结”、“止付”时赋值“997”
//				if (plsl.getCcStatus().equals(CardStatus.DZ.getValue())
//						|| plsl.getCcStatus().equals(CardStatus.ZF.getValue())
//						|| plsl.getCcStatus().equals(CardStatus.DJ.getValue())) {
//					loanCardYuQi = 997;
//				
//				} else {
//					// 根据查询月往前num个月的日期
//					Date lastMonth = format.parse(DateUtil.getMonthByDate(num, pboc.getQueryTime()));
//					if (plsl.getBillDate() != null) {
//						Date payDate = plsl.getBillDate();// 账单日
//	
//						// 应还款日期大于报告生成日期近n个月日期
//						if (Integer.parseInt(format.format(payDate)) >= Integer.parseInt(format.format(lastMonth))) {
//							// 应还款日与报告生成日期前n个月日期之间的间隔月数
//							int month = DateUtil.getMonths(lastMonth, payDate);
//							// month在查询日期范围内
//							if (month <= num) {
//								int n = 23 - month;
//								sldYuQiTemp = countZDJK(plsl.getPaymentStatusM24(), n);
//								//取多张卡中的最大值 modified by luqian at 20140909
//								sldYuQi = sldYuQi > sldYuQiTemp ? sldYuQi : sldYuQiTemp;
//							}
//						}
//					}
//				}
//			}
//		}
//
//		int[] nums = new int[3];
//		nums[0] = loanYuQi;
//		nums[1] = loanCardYuQi;
//		nums[2] = sldYuQi;
//
//		int maxNum = 0;
//		for (int i = 0; i < nums.length; i++) {
//			if (maxNum < nums[i]) {
//				maxNum = nums[i];
//			}
//		}
//		return maxNum;
//
//	}
//
//	/**
//	 * 判断是否为数字
//	 * 
//	 * @param s
//	 * @return
//	 */
//	public Boolean testIsNum(String s) {
//		Pattern pattern = Pattern.compile("[0-9]*");
//		return pattern.matcher(s).matches();
//	}
//
//	/**
//	 * 获取贷记卡，贷款逾期最大值
//	 * 
//	 * @param s
//	 * @param num
//	 * @return
//	 */
//	public int countDJK(String s, int n) {
//		int maxNum = 0;
//		if (s != null && !s.equals("")) {
//			String[] YuQiNum = new String[24];
//			for (int i = n; i < 24; i++) {
//				String lastOne = s.substring(i, i + 1);
//				YuQiNum[i] = lastOne;
//				if (testIsNum(YuQiNum[i])) {
//					int num = Integer.parseInt(YuQiNum[i]);
//					maxNum = num > maxNum ? num : maxNum;
//				}
//			}
//		}
//		return maxNum;
//	}
//
//	/**
//	 * 获取准贷记卡逾期最大值
//	 * 
//	 * @param s
//	 * @param num
//	 * @return
//	 */
//	public int countZDJK(String s, int n) {
//		int maxNum = 0;
//		if (s != null && !s.equals("")) {
//			String[] YuQiNum = new String[24];
//			for (int i = n; i < 24; i++) {
//				String lastOne = s.substring(i, i + 1);
//				YuQiNum[i] = lastOne;
//				if (testIsNum(YuQiNum[i]) == true) {
//					int num = Integer.parseInt(YuQiNum[i]);
//					maxNum = num - 1 > maxNum ? num - 1 : maxNum;
//				}
//			}
//		}
//		return maxNum;
//	}
//
//	/**
//	 * 贷款最近6个月内最坏逾期状态
//	 * 
//	 * 账户状态：所有状态的贷款；
//	 * 统计时间：根据查询月从贷款还款记录明细（已结清的账户根据逾期记录明细）向前推6个月，
//	 * 包含本月（例如查询月为2014年7月，最近6个月就是7月-2月）；
//	 * 取值规则：取所有贷款账户逾期的最大期数，其中准贷记卡还款记录为2时才算作逾期。
//	 * 特殊情况赋值：
//	 * ①客户在人行征信系统中无征信报告存在（即查无此人）算作“无征信报告”，赋值999；
//	 * ②客户有征信报告但无任何信贷账户信息算作“缺失”，赋值998；
//	 * ③客户征信报告有信贷记录发生过，但无逾期发生，赋值0；
//	 * ④客户征信报告中有贷款记录为“呆账”时，赋值997。
//	 * 
//	 * @param pboc
//	 * @param num
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int getBadL6MfinalM(PbocSummary pboc, int num) throws ParseException, Exception {
//		//包含本月（例如查询月为2014年7月，最近6个月就是7月-2月）,所以实际是num - 1
//		num = num - 1;
//		Set<PbocLoanSummary> pls = pboc.getPbocLoanSummaries();
//		Iterator pbocpls = (Iterator) pls.iterator();
//		int loanYuQi = 0;// 默认-无逾期
//		int loanYuQiTemp = 0;
//		while (pbocpls.hasNext()) {
//			PbocLoanSummary pbocLoanSummary = (PbocLoanSummary) pbocpls.next();
//			if (StringUtil.isNotEmpty(pbocLoanSummary.getLoanStatus())
//					&& pbocLoanSummary.getLoanStatus().equals(LoanStatus.DZ.getValue())) {
//				loanYuQi = 997;
//			} else {
//				// 取报告生成日期近6个月的日期
//				Date lastMonth = format.parse(DateUtil.getMonthByDate(num, pboc.getReportCreateTime()));
//				if (pbocLoanSummary.getPayDate() != null) {
//					Date payDate = pbocLoanSummary.getPayDate();// 应还款日
//
//					// 应还款日期大于报告生成日期近n个月日期
//					if (Integer.parseInt(format.format(payDate)) >= Integer.parseInt(format.format(lastMonth))) {
//						// 应还款日与报告生成日期前n个月日期之间的间隔月数
//						int month = DateUtil.getMonths(lastMonth, payDate);
//						// month在查询日期范围内
//						if (month < num) {
//							int n = 23 - month;
//							loanYuQiTemp = countDJK(pbocLoanSummary.getPaymentStatusM24(), n);
//							//取多张卡中的最大值
//							loanYuQi = loanYuQi > loanYuQiTemp ? loanYuQi : loanYuQiTemp;
//						}
//					}
//				}
//			}
//		}
//		return loanYuQi;
//	}
//
//	/**
//	 * 最近12个月逾期过的月份数
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	public int credotCardCountYuQi6(PbocSummary pboc) throws ParseException, Exception {
//		ServiceCommonMethodPFK sc = new ServiceCommonMethodPFK();
//		return sc.yqCount(pboc, 12, null, null, null);
//	}
//
//	/**
//	 * 信用卡额度使用率(房贷，消费贷)
//	 * 
//	 * 账户状态：所有状态的信用卡账户；
//	 * 取值规则：根据征信报告中的（用两张表中的“已用额度”+“透支额度”除以
//	 * 未销户贷记卡信息汇总和未销户准贷记卡信息汇总两张表中的“授信总额”相加）计算得出。
//	 * 特殊情况赋值：
//	 * ①客户在人行征信系统中无征信报告存在（即查无此人）算作“无征信报告”，赋值999
//	 * ②客户有征信报告但无任何信用卡账户信息或仅有已销户或未激活的信用卡账户信息算作“缺失”，赋值998
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public float countDJKS(PbocSummary pboc) {
//		float counts = 0;
//		// 准贷记卡
//		Set<PbocSldSummary> psls = pboc.getPbocSldSummaries();
//		Iterator pbocsls = (Iterator) psls.iterator();
//		float countAll = 0;// 授信总额
//		float count = 0;// 透支余额\已用额度
//		int zdjkSize = psls.size();
//		int zdjkSize0 = 0;
//		while (pbocsls.hasNext()) {
//			PbocSldSummary plsl = (PbocSldSummary) pbocsls.next();
//				// 状态为“销户”、“未激活”时计数
//				if (plsl.getCcStatus().equals(CardStatus.XH.getValue())
//						|| plsl.getCcStatus().equals(CardStatus.WJH.getValue())){
//					zdjkSize0++;
//				}
//		}
//		
//		//贷记卡
//		Set<PbocLoancardSummary> plsv = pboc.getPbocLoancardSummaries();
//		Iterator<PbocLoancardSummary> listlsv = plsv.iterator();
//		int djkSize = plsv.size();
//		int djkSize0 = 0;
//		while (listlsv.hasNext()) {
//			PbocLoancardSummary psd = listlsv.next();
//			// 状态为“销户”、“未激活”时计数
//			if (psd.getCcStatus().equals(CardStatus.XH.getValue())
//					|| psd.getCcStatus().equals(CardStatus.WJH.getValue())){
//				djkSize0++;
//			}
//		}
//		//仅有已销户或未激活的信用卡账户信息算作“缺失”，赋值998
//		if(zdjkSize0 == zdjkSize && djkSize0 == djkSize){
//			return 998;
//		}
//		//未销户贷记卡汇总
//		Set<PbocUncancelLcSummary> pulsSet=pboc.getPbocUncancelLcSummaries();
//		Iterator pulsIterator = (Iterator) pulsSet.iterator();
//		while (pulsIterator.hasNext()) {
//			PbocUncancelLcSummary puls = (PbocUncancelLcSummary) pulsIterator.next();
//				// 已使用额度
//				if (puls.getUsedAmt()!=null){
//					count=count+puls.getUsedAmt().floatValue();
//				}
//				// 授信额度
//				if (puls.getCreditAmt()!=null){
//					countAll=countAll+puls.getCreditAmt().floatValue();
//				}
//		}
//		
//		//未销户准贷记卡汇总
//		Set<PbocUncancelSlcSummary> pussSet=pboc.getPbocUncancelSlcSummaries();
//		Iterator pussIterator = (Iterator) pussSet.iterator();
//		while (pussIterator.hasNext()) {
//			PbocUncancelSlcSummary puss = (PbocUncancelSlcSummary) pussIterator.next();
//			// 透支余额
//			if (puss.getOverdraft()!=null){
//				count=count+puss.getOverdraft().floatValue();
//			}
//			// 授信额度
//			if (puss.getCreditAmt()!=null){
//				countAll=countAll+puss.getCreditAmt().floatValue();
//			}
//		}
//		//信用卡额度使用率=(“已用额度”+“透支额度”)/授信总额
//		if(countAll==0){
//			countAll=1;
//		}
//		counts=count/countAll;
//		return counts;
//	}
//
//	/**
//	 * 电信欠缴月数
//	 * 
//	 * 电信缴费记录（统计当前缴费状态为“欠费”的累计记录数）
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public int getTelPay(PbocSummary pboc) {
//		// 电信欠缴月数
//		Set<PbocTelPayRecord> listPS = pboc.getPbocTelPayRecords();
//		Iterator list = (Iterator) listPS.iterator();
//		int count2 = 0;
//		while (list.hasNext()) {
//			PbocTelPayRecord pbocTelPayRecord = (PbocTelPayRecord) list.next();
//			// 统计当前缴费状态为“欠费”的累计记录数
//			if (StringUtil.isNotEmpty(pbocTelPayRecord.getPayStatus()) && pbocTelPayRecord.getPayStatus().equals("2")) {
//				count2++;
//			}
//		}
//		return count2;
//	}
//
//	/**
//	 * 个人月均负债——对外担保
//	 * 
//	 * 取“对外担保信息”的“担保贷款本金余额”，存在多笔的，合并计算。
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int countAllDWDB(PbocSummary pboc) {
//		Set<PbocGuaranteeSummary> listPLSS = pboc.getPbocGuaranteeSummaries();
//		Iterator listPs = (Iterator) listPLSS.iterator();
//		int countMothlyPayMortgage = 0;
//		while (listPs.hasNext()) {
//			PbocGuaranteeSummary pbocGuaranteeSummary = (PbocGuaranteeSummary) listPs.next();
//			Set<PbocGuaranteeDetail> ds = pbocGuaranteeSummary.getPbocGuaranteeDetails();
//			Iterator s = (Iterator) ds.iterator();
//			while (s.hasNext()) {
//				PbocGuaranteeDetail pbocGuaranteeDetail = (PbocGuaranteeDetail) s.next();
//				// 担保贷款本金余额
//				if (pbocGuaranteeDetail.getGlBalance() != null) {
//					countMothlyPayMortgage = countMothlyPayMortgage + pbocGuaranteeDetail.getGlBalance().intValue();
//				}
//			}
//		}
//		return countMothlyPayMortgage;
//	}
//
//	/**
//	 * 获取申请人：工作单位名称和单位地址
//	 * 
//	 * 工作单位名称：取“职业信息”信息更新日期最新的一条记录中的“工作单位”字段项。 
//	 * 单位地址：取“职业信息”信息更新日期最新的一条记录中的“单位地址”字段项。
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public String[] getProAddress(PbocSummary pboc) {
//		Set<PbocProfessional> listPLSS = pboc.getPbocProfessionals();
//		Iterator listPs = (Iterator) listPLSS.iterator();
//		String corpName = ""; // 工作单位名称
//		String corpGeo = ""; // 单位地址
//		Date updateDateTemp = new Date(0);//初始日期
//		Date updateDate = null;//信息更新日期
//		while (listPs.hasNext()) {
//			PbocProfessional pbocProfessional = (PbocProfessional) listPs.next();
//
//			updateDate = pbocProfessional.getOccurDate();
//			
//			if(updateDate.after(updateDateTemp)){
//				updateDateTemp = updateDate;
//				// 工作单位名称
//				if (StringUtil.isNotEmpty(pbocProfessional.getEmployerName())) {
//					corpName = pbocProfessional.getEmployerName();
//				}
//				// 单位地址
//				if (StringUtil.isNotEmpty(pbocProfessional.getEmployerAddress())) {
//					corpGeo = pbocProfessional.getEmployerAddress();
//				}
//			}
//			
//		}
//
//		String[] address = new String[2];
//		address[0] = corpName; // 工作单位名称
//		address[1] = corpGeo; // 单位地址
//
//		return address;
//	}
//
//	/**
//	 * 获取申请人：居住地址
//	 * 
//	 * 取“居住信息”信息更新日期最新的一条记录中的“居住地址”字段项。
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public String getLiveAddress(PbocSummary pboc) {
//		Set<PbocResidence> listPLSS = pboc.getPbocResidences();
//		Iterator listPs = (Iterator) listPLSS.iterator();
//		String corpName = ""; // 居住地址
//		while (listPs.hasNext()) {
//			PbocResidence pbocResidence = (PbocResidence) listPs.next();
//			// 居住地址
//			if (StringUtil.isNotEmpty(pbocResidence.getAdress())) {
//				corpName = pbocResidence.getAdress();
//			}
//		}
//		return corpName;
//	}
//
//	/**
//	 * 近2个月本行审批征信查询次数（同一机构两周内因同一原因查询算作一次） 
//	 * 近2个月他行审批征信查询次数（同一机构两周内因同一原因查询算作一次）
//	 * 
//	 * 根据李洁要求： 
//	 * 从查询日期往前推2个月获得起始日期，在该两个月内，从起始日期开始，
//	 * 以两周作为一个计数单位，在该两周内，同一机构同一查询原因算作是一次查询，
//	 * 当查询操作员为null时，算作他行，并且，只要有一个操作员是null即为一次查询
//	 * 
//	 * @param pboc
//	 * @param n
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int[] getQueryNum(PbocSummary pboc) throws ParseException, Exception {
//
//		Set<PbocLaQueryDetail> listPlqd = pboc.getPbocLaQueryDetails();
//
//		Map mapIn = new HashMap(); // 本行
//		Map mapOu = new HashMap(); // 他行
//		int countOLastTwo = 0;// 操作员为null时，视为他行
//
//		// 取距离PBOC征信报告概要信息中“查询请求时间”2个月的日期
//		String lastTwoMoth = DateUtil.getMonthByDate(2, pboc.getQueryTime());
//		Date date1 = DateUtil.addMoreDay(format.parse(lastTwoMoth), 13);// 第一个14天日期
//		Date date2 = DateUtil.addMoreDay(format.parse(format.format(date1)), 14);// 第二个14天日期
//		Date date3 = DateUtil.addMoreDay(format.parse(format.format(date2)), 14);// 第三个14天日期
//		Date date4 = DateUtil.addMoreDay(format.parse(format.format(date3)), 14);// 第四个14天日期
//
//		// PBOC征信报告概要信息中“查询请求时间”
//		String queryTime = format.format(pboc.getQueryTime());
//		
//		Iterator listPd = (Iterator) listPlqd.iterator();
//		while (listPd.hasNext()) {
//			PbocLaQueryDetail pld = (PbocLaQueryDetail) listPd.next();
//
//			String reasonCode = pld.getQueryReason();// 查询原因
//
//			// PBOC征信信贷审批查询记录明细表_查询日期
//			String queryDate = format.format(pld.getQueryDate());
//			// 查询操作员
//			if (pld.getOperator() != null && !pld.getOperator().equals("") && !"null".equals(pld.getOperator())) {
//				if (pld.getOperator().length() > 4) {
//					// 查询操作员为江苏银行
//					if (pld.getOperator().substring(0, 4).equals("江苏银行")) {// 我行
//						// 查询原因为：02--贷款审批，03---信用卡审批
//						if (reasonCode.equals("02") || reasonCode.equals("03")) {
//							// 查询日期在第一个14天以内
//							if (Integer.parseInt(queryDate) >= Integer.parseInt(lastTwoMoth)
//									&& Integer.parseInt(queryDate) <= Integer.parseInt(format.format(date1))) {
//								// 将查询原因和第一个14天的日期存入map，以便于去重
//								mapIn.put(reasonCode + "+" + format.format(date1), "");
//							}
//							// 查询日期在第二个14天以内
//							else if (Integer.parseInt(queryDate) > Integer.parseInt(format.format(date1))
//									&& Integer.parseInt(queryDate) <= Integer.parseInt(format.format(date2))) {
//								mapIn.put(reasonCode + "+" + format.format(date2), "");
//							}
//							// 查询日期在第三个14天以内
//							else if (Integer.parseInt(queryDate) > Integer.parseInt(format.format(date2))
//									&& Integer.parseInt(queryDate) <= Integer.parseInt(format.format(date3))) {
//								mapIn.put(reasonCode + "+" + format.format(date3), "");
//							}
//							// 查询日期在第四个14天以内
//							else if (Integer.parseInt(queryDate) > Integer.parseInt(format.format(date3))
//									&& Integer.parseInt(queryDate) <= Integer.parseInt(format.format(date4))) {
//								mapIn.put(reasonCode + "+" + format.format(date4), "");
//							}
//							// 查询日期在第四个14天和征信报告查询日期之间。
//							else if (Integer.parseInt(queryDate) > Integer.parseInt(format.format(date4))
//									&& Integer.parseInt(queryDate) <= Integer.parseInt(queryTime)) {
//								mapIn.put(reasonCode + "+" + queryTime, "");
//							}
//						}
//					}
//				} else {
//					/** 他行 */
//					// 查询原因为：02--贷款审批，03---信用卡审批
//					if (reasonCode.equals("02") || reasonCode.equals("03")) {
//						// 查询日期在第一个14天以内
//						if (Integer.parseInt(queryDate) >= Integer.parseInt(lastTwoMoth)
//								&& Integer.parseInt(queryDate) <= Integer.parseInt(format.format(date1))) {
//							// 将操作员、查询原因和第一个14天日期存入map，以便于去重
//							mapOu.put(pld.getOperator() + "+" + reasonCode + "+" + format.format(date1), "");
//						}
//						// 查询日期在第二个14天以内
//						else if (Integer.parseInt(queryDate) > Integer.parseInt(format.format(date1))
//								&& Integer.parseInt(queryDate) <= Integer.parseInt(format.format(date2))) {
//							mapOu.put(pld.getOperator() + "+" + reasonCode + "+" + format.format(date2), "");
//						}
//						// 查询日期在第三个14天以内
//						else if (Integer.parseInt(queryDate) > Integer.parseInt(format.format(date2))
//								&& Integer.parseInt(queryDate) <= Integer.parseInt(format.format(date3))) {
//							mapOu.put(pld.getOperator() + "+" + reasonCode + "+" + format.format(date3), "");
//						}
//						// 查询日期在第四个14天以内
//						else if (Integer.parseInt(queryDate) > Integer.parseInt(format.format(date3))
//								&& Integer.parseInt(queryDate) <= Integer.parseInt(format.format(date4))) {
//							mapOu.put(pld.getOperator() + "+" + reasonCode + "+" + format.format(date4), "");
//						}
//						// 查询日期在第四个14天和征信报告查询日期之间。
//						else if (Integer.parseInt(queryDate) > Integer.parseInt(format.format(date4))
//								&& Integer.parseInt(queryDate) <= Integer.parseInt(queryTime)) {
//							mapOu.put(pld.getOperator() + "+" + reasonCode + "+" + queryTime, "");
//						}
//					}
//				}
//			} else {
//				/** 当查询操作员为”null“时，算作他行（不考虑两周内相同查询原因情况）*/
//				
//				if (Integer.parseInt(queryDate) >= Integer.parseInt(lastTwoMoth)
//						&& Integer.parseInt(queryDate) <= Integer.parseInt(queryTime)) {
//					// 查询原因为：02--贷款审批，03---信用卡审批
//					if (reasonCode.equals("02") || reasonCode.equals("03")) {
//						countOLastTwo++;
//					}
//				}
//			}
//		}
//		int[] NUM = new int[2];
//		NUM[0] = mapIn.size();
//		NUM[1] = mapOu.size() + countOLastTwo;
//		
//		return NUM;
//	}
//	
//	/**
//	 * 近n个月本行审批征信查询次数（同一机构两周内因同一原因查询算作一次） 
//	 * 近n个月他行审批征信查询次数（同一机构两周内因同一原因查询算作一次）
//	 * 
//	 * 统计时间：从查询日期往前推12个月，包含本月（例如查询日期为2014年4月15日，
//	 * 过去12个月就是2014年4月15日-2013年4月1日）；
//	 * 查询类型：信用卡或贷款审批查询，但是对于同一机构在两周（自然日）内，相同的查询原因和操作员算作一次。
//	 * 是否区分我行或他行：不区分。
//	 * 特殊情况赋值：
//	 * ①客户在人行征信系统中无征信报告存在（即查无此人）算作“无征信报告”，赋值999
//	 * ②客户有征信报告但无查询信息算作“缺失”，赋值998
//	 * ③客户征信报告有查询信息但无信贷审批查询记录，赋值0
//	 * 
//	 * 根据李洁要求： 
//	 * 从查询日期往前推n个月获得起始日期，在该两个月内，从起始日期开始，
//	 * 以两周作为一个计数单位，在该两周内，同一机构同一查询原因算作是一次查询，
//	 * 当查询操作员为null时，算作他行，并且，只要有一个操作员是null即为一次查询
//	 * 
//	 * @param pboc
//	 * @param n	月份数
//	 * @return
//	 * @throws ParseException
//	 */
//	/*@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int[] getQueryNum(PbocSummary pboc, int n) throws ParseException, Exception {
//
//		Set<PbocLaQueryDetail> listPlqd = pboc.getPbocLaQueryDetails();
//
//		Set<String> selfSet = new HashSet<String>(); // 本行
//		Set<String> otherSet = new HashSet<String>(); // 他行
//		int countOLastN = 0;// 操作员为null时，视为他行
//
//		//PBOC征信报告概要信息中“查询请求时间”
//		Date queryTime = pboc.getQueryTime();
//		List<Date> dateList = new ArrayList<Date>();
//		
//		//获得n个月之前的日期，从1号开始
//		String nMouthBefore = DateUtil.getMonthByDate(n, queryTime, 1);
//		//日期减一天
//		Date beginDate = DateUtil.decreaseOneDay(format.parse(nMouthBefore));
//		dateList.add(beginDate);
//		//获得两个日期之间相隔的天数
//		int dayNum = DateUtil.getDay(beginDate, queryTime);
//		
//		if(dayNum >= 14){
//			//计算总共有多少个两周
//			int m = dayNum/14;
//			// 取距离PBOC征信报告概要信息中“查询请求时间”n个月的日期
//			Date tempDate = beginDate;
//			for(int i = 0; i < m; i++ ){
//				// 获得每隔14天日期
//				Date date2 = DateUtil.addMoreDay(format.parse(format.format(tempDate)), 14);
//				dateList.add(date2);
//				
//				tempDate = date2;
//			}
//		}
//
//		if(dayNum % 14 != 0){
//			dateList.add(queryTime);
//		}
//		
//		int listSize = dateList.size();
//		
//		Iterator listPd = (Iterator) listPlqd.iterator();
//		while (listPd.hasNext()) {
//			PbocLaQueryDetail pld = (PbocLaQueryDetail) listPd.next();
//
//			String reasonCode = pld.getQueryReason();// 查询原因
//
//			// PBOC征信信贷审批查询记录明细表_查询日期
//			Date queryDate = pld.getQueryDate();
//			
//			//如果查询日期在beginDate之前，则无需进入下面循环
//			if(queryDate.before(beginDate)){
//				continue;
//			}
//			// 查询操作员
//			if (pld.getOperator() != null && !pld.getOperator().equals("") && !"null".equals(pld.getOperator())) {
//				if (pld.getOperator().length() > 4) {
//					// 查询操作员为江苏银行
//					if (pld.getOperator().substring(0, 4).equals("江苏银行")) {// 我行
//						// 查询原因为：02--贷款审批，03---信用卡审批
//						if (reasonCode.equals("02") || reasonCode.equals("03")) {
//							// 查询日期在第i个14天以内
//							for(int i = 0; i < listSize - 1; i++){
//								if (queryDate.after(dateList.get(i)) 
//										&& (queryDate.before(dateList.get(i+1))
//												|| DateUtil.compareDate(queryDate, dateList.get(i+1)) == 0)) {
//									// 将查询原因和第i个14天的日期存入set，以便于去重
//									selfSet.add(reasonCode + "+" + format.format(dateList.get(i+1)));
//									break;
//								}else{
//									continue;
//								}
//							}
//						}
//					}
//				} else {
//					*//** 他行 *//*
//					// 查询原因为：02--贷款审批，03---信用卡审批
//					if (reasonCode.equals("02") || reasonCode.equals("03")) {
//						// 查询日期在第i个14天以内
//						for(int i = 0; i < listSize - 1; i++){
//							if (queryDate.after(dateList.get(i)) 
//									&& (queryDate.before(dateList.get(i+1))
//											|| DateUtil.compareDate(queryDate, dateList.get(i+1)) == 0)) {
//								// 将查询原因和第i个14天的日期存入set，以便于去重
//								otherSet.add(pld.getOperator() + "+" + reasonCode + "+" + format.format(dateList.get(i+1)));
//								break;
//							}else{
//								continue;
//							}
//						}
//					}
//				}
//			} else {
//				*//** 当查询操作员为”null“时，算作他行（不考虑两周内相同查询原因情况）*//*
//				if (queryDate.after(dateList.get(0))
//						&& (queryDate.before(queryTime)
//								|| DateUtil.compareDate(queryDate, queryTime) == 0)) {
//					// 查询原因为：02--贷款审批，03---信用卡审批
//					if (reasonCode.equals("02") || reasonCode.equals("03")) {
//						countOLastN++;
//					}
//				}
//			}
//		}
//		int[] NUM = new int[2];
//		NUM[0] = selfSet.size();
//		NUM[1] = otherSet.size() + countOLastN;
//		
//		return NUM;
//	}*/
//	
//	/**
//	 * 统计时间：从查询日期往前推12个月，包含本月（例如查询日期为2014年4月15日，过去12个月就是2014年4月15日-2013年4月1日）；
//	 * 是否区分我行或他行：不区分。
//	 * 计算规则：
//	 * 第一步：计算客户在统计时间内征信查询次数，不区分信用卡或贷款审批查询，同一机构在统计时间内的查询次数算作一次。
//	 * 操作员为NULL的，算作不同机构。
//	 * 第二步：计算客户在统计时间内新增信用卡（包括贷记卡和准贷记卡）和贷款账户数。
//	 * （1）贷记卡在统计时间内同一机构新增多个账户的，算作一个账户；
//	 * （2）准贷记卡、贷款在统计时间内同一机构新增多个账户的，有一算一；
//	 * （3）是否在统计时间内新增根据描述信息中发放日期计算。
//	 * 第三步：该字段取值等于第一步计算结果减去第二步计算结果，如果取值小于0，则为0.
//	 * 特殊情况赋值：（同之前，没有变化）
//	 * ①客户在人行征信系统中无征信报告存在（即查无此人）算作“无征信报告”，赋值999
//	 * ②客户有征信报告但无查询信息算作“缺失”，赋值998
//	 * ③客户征信报告有查询信息但无信贷审批查询记录，赋值0
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int getQueryNum(PbocSummary pboc, int n) throws ParseException, Exception {
//
//		int[] num = new int[2];
//		
//		//PBOC征信报告概要信息中“查询请求时间”
//		Date queryTime = pboc.getQueryTime();
//		//日期加一天
//		Date endDate = DateUtil.addOneDay(queryTime);
//		
//		//获得n个月之前的日期，从1号开始
//		String nMouthBefore = DateUtil.getMonthByDate(n, queryTime, 1);
//		//日期减一天
//		Date beginDate = DateUtil.decreaseOneDay(format.parse(nMouthBefore));
//		
//		//第一步：计算客户在统计时间内征信查询次数，不区分信用卡或贷款审批查询，同一机构在统计时间内的查询次数算作一次。
//		num[0] = getQueryTimes(pboc, beginDate, endDate);
//		
//		//第二步：计算客户在统计时间内新增信用卡（包括贷记卡和准贷记卡）和贷款账户数。
//		num[1] = newAccountNums(pboc, beginDate, endDate);
//		
//		//第三步：该字段取值等于第一步计算结果减去第二步计算结果，如果取值小于0，则为0.
//		int returnNum = num[0] - num[1];
//		
//		if(returnNum < 0){
//			returnNum = 0;
//		}
//		
//		return returnNum;
//	}
//
//	/**
//	 * 统计时间：从查询日期往前推12个月，包含本月（例如查询日期为2014年4月15日，过去12个月就是2014年4月15日-2013年4月1日）；
//	 * 是否区分我行或他行：不区分。
//	 * 计算规则：
//	 * 第二步：计算客户在统计时间内新增信用卡（包括贷记卡和准贷记卡）和贷款账户数。
//	 * （1）贷记卡在统计时间内同一机构新增多个账户的，算作一个账户；
//	 * （2）准贷记卡、贷款在统计时间内同一机构新增多个账户的，有一算一；
//	 * （3）是否在统计时间内新增根据描述信息中发放日期计算。
//	 * 
//	 * @param pboc
//	 * @param beginDate
//	 * @param endDate
//	 * @return
//	 * @throws Exception 
//	 * @throws ParseException 
//	 */
//	private int newAccountNums(PbocSummary pboc, Date beginDate, Date endDate) throws ParseException, Exception {
//		int cardAccounts = 0;//贷记卡账户数
//		int sldAccounts = 0;//准贷记卡账户数
//		int loanAccounts = 0;//贷款账户数
//		//贷记卡
//		Set<PbocLoancardSummary> loanCardSummaries = pboc.getPbocLoancardSummaries();
//		
//		Iterator<PbocLoancardSummary> cardIter = loanCardSummaries.iterator();
//		Set<String> cardSet = new HashSet<String>();
//		while(cardIter.hasNext()){
//			PbocLoancardSummary cardSummary = cardIter.next();
//			String des = cardSummary.getDescription();
//			
//			if(!StringUtil.isEmpty(des)){
//				//解析描述信息
//				Map<String, String> rm = AnalysisCreditCard.getCreditCardType(des);
//				Date loanOccureDate = format.parse(rm.get("loanOccureDate"));
//				
//				//贷记卡在统计时间内同一机构新增多个账户的，算作一个账户；
//				if(loanOccureDate.after(beginDate) 
//						&& loanOccureDate.before(endDate)){
//					cardSet.add(rm.get("org"));
//				}
//			}
//			
//		}
//		
//		cardAccounts = cardSet.size();
//		
//		
//		//准贷记卡
//		Set<PbocSldSummary> sldSummaries = pboc.getPbocSldSummaries();
//		
//		Iterator<PbocSldSummary> sldIter = sldSummaries.iterator();
//		while(sldIter.hasNext()){
//			PbocSldSummary sldSummary = sldIter.next();
//			String des = sldSummary.getDescription();
//			
//			if(!StringUtil.isEmpty(des)){
//				//解析描述信息
//				Map<String, String> rm = AnalysisCreditCard.getCreditCardType(des);
//				Date loanOccureDate = format.parse(rm.get("loanOccureDate"));
//				
//				//贷记卡在统计时间内同一机构新增多个账户的，算作一个账户；
//				if(loanOccureDate.after(beginDate) 
//						&& loanOccureDate.before(endDate)){
//					sldAccounts++;
//				}
//			}
//		}
//		
//		//贷款
//		Set<PbocLoanSummary> loanSummaries = pboc.getPbocLoanSummaries();
//		
//		Iterator<PbocLoanSummary> loanIter = loanSummaries.iterator();
//		while(loanIter.hasNext()){
//			PbocLoanSummary loanSummary = loanIter.next();
//			String des = loanSummary.getDescription();
//			
//			if(!StringUtil.isEmpty(des)){
//				//解析描述信息
//				Map<String, String> rm = AnalysisLoan.getLoanType(des);
//				Date loanOccureDate = format2.parse(rm.get("loanOccureDate"));
//				
//				//贷记卡在统计时间内同一机构新增多个账户的，算作一个账户；
//				if(loanOccureDate.after(beginDate) 
//						&& loanOccureDate.before(endDate)){
//					loanAccounts++;
//				}
//			}
//		}
//		
//		return cardAccounts + sldAccounts + loanAccounts;
//	}
//
//	/**
//	 * 统计时间：从查询日期往前推12个月，包含本月（例如查询日期为2014年4月15日，过去12个月就是2014年4月15日-2013年4月1日）；
//	 * 是否区分我行或他行：不区分。
//	 * 计算规则：
//	 * 计算客户在统计时间内征信查询次数，不区分信用卡或贷款审批查询，同一机构在统计时间内的查询次数算作一次。
//	 * @param pboc
//	 * @param n
//	 * @return
//	 * @throws ParseException 
//	 */
//	private int getQueryTimes(PbocSummary pboc, Date beginDate, Date endDate) throws ParseException {
//		Set<PbocLaQueryDetail> listPlqd = pboc.getPbocLaQueryDetails();
//
//		Set<String> querySet = new HashSet<String>(); 
//		int countOLastN = 0;// 操作员为null时,算作不同机构
//
//		Iterator<PbocLaQueryDetail> listPd = listPlqd.iterator();
//		while (listPd.hasNext()) {
//			PbocLaQueryDetail pld = listPd.next();
//
//			String reasonCode = pld.getQueryReason();// 查询原因
//
//			// PBOC征信信贷审批查询记录明细表_查询日期
//			Date queryDate = pld.getQueryDate();
//			
//			//如果查询日期在beginDate之前，则无需进入下面循环
//			if(queryDate.before(beginDate)){
//				continue;
//			}
//			// 查询操作员
//			if (pld.getOperator() != null && !pld.getOperator().equals("") && !"null".equals(pld.getOperator())) {
//				// 查询原因为：02--贷款审批，03---信用卡审批
//				if (reasonCode.equals("02") || reasonCode.equals("03")) {
//					if (queryDate.after(beginDate) 
//							&& queryDate.before(endDate)) {
//						if(pld.getOperator().indexOf("江苏银行")>=0){
//							// 将查询机构存入set，以便于去重
//							querySet.add("江苏银行");
//						}else{
//							// 将查询机构存入set，以便于去重
//							querySet.add(pld.getOperator());
//						}
//						
//					}else{
//						continue;
//					}
//				}
//			} else {
//				/** 当查询操作员为“null”时，算作不同机构 */
//				if (queryDate.after(beginDate)
//						&& queryDate.before(endDate)) {
//					// 查询原因为：02--贷款审批，03---信用卡审批
//					if (reasonCode.equals("02") || reasonCode.equals("03")) {
//						countOLastN++;
//					}
//				}
//			}
//		}
//		return querySet.size() + countOLastN;
//	}
}
