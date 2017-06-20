/*
 * Copyright (c) 2014 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: jseds
 * create: 2014-1-13 上午09:30:22
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.webService.pbocService;


/**
 * 人行征信数据封装
 * 
 * @author pengxn@彭向南
 * @mail:pengxn@skyon.com.cn
 * @telephone:18805812905
 * @version $Revision:$
 */
public class ServiceCommonMethod {

//	private SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
//
//	private SimpleDateFormat formats = new SimpleDateFormat("yyyyMM");
//
//	private int custM = Integer.parseInt(DateUtil.getMonths(0));//本月日期
//
//	private int lastM = Integer.parseInt(DateUtil.getMonths(-1));//上一个月日期
//	
//	/**
//	 * 获取公积金最大缴至月份
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public Date getMaxEndMth(PbocSummary pboc) throws ParseException, Exception{
//		Set<PbocAccFundRecord> pafrSet =pboc.getPbocAccFundRecords();//公积金参缴记录表
//		Iterator pafrIterator = (Iterator) pafrSet.iterator();
//		Date maxDate=null;//最大缴至月份
//		while(pafrIterator.hasNext()){
//			PbocAccFundRecord pbocAccFundRecord=(PbocAccFundRecord)pafrIterator.next();
//			String endMth=pbocAccFundRecord.getEndMth();//缴至月份3
//			if(StringUtil.isNotEmpty(endMth)){
//				Date endMthDate = formats.parse(endMth.replace(".", ""));
//				if(maxDate==null){
//					maxDate=endMthDate;
//				}else{
//					if(DateUtil.compareDate(endMthDate,maxDate)==1){
//						maxDate=endMthDate;
//					}
//				}
//			}
//			
//		}
//		return maxDate;
//	}
//	
//	/**
//	 * 是否缴纳公积金
//	 * 
//	 * @param inputMap
//	 * @param pboc
//	 * @param ReserveFund 欠缴字段
//	 * @param ReserveFundMissDate欠缴日期字段
//	 * @param bigDates 最大缴至月份
//	 * @throws ParseException
//	 */
//	public Map<String, Object> IsNotGjj(Map<String, Object> inputMap, PbocSummary pboc, String ReserveFund,
//			String ReserveFundMissDate, Date bigDates) throws ParseException, Exception {
//		// 是否缴纳公积金
//		if (pboc.getPbocAccFundRecords().size() != 0) {
//			inputMap.put(ReserveFund, "1");
//			// 公积金欠缴起始日期
//			if (bigDates==null) {
//				inputMap.put(ReserveFund, "0");
//				inputMap.put(ReserveFundMissDate, new BigDecimal("19000101"));
//			} else {
//				//Date bigDate = formats.parse(bigDates.replace(".", ""));
//				// 获取 公积金最新缴费记录
//				Calendar cabig = Calendar.getInstance();
//				cabig.setTime(bigDates);
//				int now = Integer.parseInt(formats.format(cabig.getTime()));
//				// 公积金欠缴起始日期
//				if (now != custM && now != lastM) {
//					String dateDay = DateUtil.getNextMonth(format.format(bigDates));
//					inputMap.put(ReserveFundMissDate, new BigDecimal(dateDay));
//				} else {
//					inputMap.put(ReserveFundMissDate, new BigDecimal("19000101"));
//				}
//			}
//
//		} else {
//			inputMap.put(ReserveFund, "0");
//			inputMap.put(ReserveFundMissDate, new BigDecimal("19000101"));
//		}
//		return inputMap;
//	}
//
//	/**
//	 * 是否缴纳社保
//	 * 
//	 * @param inputMap
//	 * @param pboc
//	 * @param ReserveFund
//	 * @param ReserveFundMissDate
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public Map<String, Object> IsNotSBao(Map<String, Object> inputMap, PbocSummary pboc, String SocialInsurance,
//			String SocialInsuranceMissDate) throws ParseException, Exception {
//		// 是否参加社会保险PBOC_AI_IN_RECORD
//		if (pboc.getPbocAiInRecords().size() != 0) {
//			Set<PbocAiInRecord> parSet =pboc.getPbocAiInRecords();//社保参缴记录表
//			Iterator parIterator = (Iterator) parSet.iterator();
//			Date maxDate=null;//更新日期
//			String actStatus="";//缴费状态
//			while(parIterator.hasNext()){
//				PbocAiInRecord pbocAccFundRecord=(PbocAiInRecord)parIterator.next();
//				Date endMth=pbocAccFundRecord.getOccureDate();//更新日期
//				if(endMth!=null){
//					if(maxDate==null){
//						maxDate=endMth;
//						actStatus=pbocAccFundRecord.getActStatus();
//					}else{
//						if(DateUtil.compareDate(endMth,maxDate)==1){
//							maxDate=endMth;
//							actStatus=pbocAccFundRecord.getActStatus();
//						}
//					}
//				}
//				
//				
//			}
//			inputMap.put(SocialInsurance, "1");
//			// 社保欠缴起始日期
//			// String[] aiInRecords = pbocSummaryManager.findPbocAiInRecord(pboc.getId());
//			if (maxDate==null) {
//				inputMap.put(SocialInsurance, "0");
//				inputMap.put(SocialInsuranceMissDate, new BigDecimal("19000101"));
//			} else {
//				String date1 = format.format(maxDate);
//				Calendar cabig = Calendar.getInstance();
//				cabig.setTime(format.parse(date1));
//				int dates = Integer.parseInt(formats.format(cabig.getTime()));
//				if (actStatus.equals("1")) {
//					inputMap.put(SocialInsuranceMissDate, new BigDecimal("19000101"));
//				} else {
//					if (dates != custM && dates != lastM) {
//						String dateOther = DateUtil.getNextMonth(date1);
//						inputMap.put(SocialInsuranceMissDate, new BigDecimal(dateOther));
//					} else {
//						inputMap.put(SocialInsuranceMissDate, new BigDecimal(19000101));
//					}
//				}
//			}
//		} else {
//			inputMap.put(SocialInsurance, "0");
//			inputMap.put(SocialInsuranceMissDate, new BigDecimal("19000101"));
//		}
//		return inputMap;
//	}
//
//	/**
//	 * // 他行住房贷款月还款额PBOC_LOAN_SUMMARY他行商用房贷款月还款额
//	 * 
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public BigDecimal[] countOtherHomeLoanMonthlyPay(PbocSummary pboc) 
//		throws ParseException, Exception {
//		BigDecimal[] LM = new BigDecimal[2];
//		Set<PbocLoanSummary> listPLS = pboc.getPbocLoanSummaries();
//		Iterator listP = (Iterator) listPLS.iterator();
//		BigDecimal count = new BigDecimal(0);
//		BigDecimal counts = new BigDecimal(0);
//		while (listP.hasNext()) {
//			PbocLoanSummary pbocLoanSummary = (PbocLoanSummary) listP.next();
//			// 他行住房贷款月还款额个人住房贷款，个人商用房贷款
//			if (pbocLoanSummary.getDescription() != null && !pbocLoanSummary.getDescription().equals("")) {
//				// 五级分类为正常、当前无逾期”判断
//				if (Checktrue(pbocLoanSummary) == true) {
//					if (StringUtil.isNotEmpty(pbocLoanSummary.getDescription())) {
//						Map<String, String> type = AnalysisLoan.getLoanTypeOther(pbocLoanSummary.getDescription());
//						String loanType = AnalysisLoan.getLoanTypeO(pbocLoanSummary.getDescription());
//						String comType = AnalysisLoan.getComapanyType(pbocLoanSummary.getDescription());
//						if (type != null && StringUtil.isNotEmpty(comType) && !comType.equals("江苏银行")
//								&& StringUtil.isNotEmpty(type.get("loanCard")) && type.get("loanCard").equals("个人住房贷款")) {
//							if (type.get("loanType").equals("抵押") || type.get("loanType").equals("组合")) {
//								if (pbocLoanSummary.getLoanMoney() != null) {
//									int monthPay = pbocLoanSummary.getLoanMoney().intValue()
//											/ Integer.parseInt(type.get("loanDueNum"));
//									if (pbocLoanSummary.getPlanPayAmt() != null
//											&& !"".equals(pbocLoanSummary.getPlanPayAmt())) {
//										if (monthPay <= pbocLoanSummary.getPlanPayAmt().intValue()) {
//											count = count.add(pbocLoanSummary.getPlanPayAmt());
//										}
//									}
//								}
//							}
//						} else if (!comType.equals("江苏银行")) {
//							if (loanType != null) {
//								if (type != null && StringUtil.isNotEmpty(type.get("loanType"))
//										&& loanType.equals("个人商用房贷款") || loanType.equals("个人商住两用房贷款")) {
//									if (type.get("loanType").equals("抵押") || type.get("loanType").equals("组合")) {
//										{
//											if (pbocLoanSummary.getLoanMoney()!=null) {
//												int monthPay = pbocLoanSummary.getLoanMoney().intValue()
//														/ Integer.parseInt(type.get("loanDueNum"));
//												if (pbocLoanSummary.getPlanPayAmt() != null
//														&& !"".equals(pbocLoanSummary.getPlanPayAmt())) {
//													if (monthPay <= pbocLoanSummary.getPlanPayAmt().intValue()) {
//														counts = counts.add(pbocLoanSummary.getPlanPayAmt());
//													}
//												}
//											}
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//		LM[0] = count;
//		LM[1] = counts;
//		return LM;
//	}
//
//	// /**
//	// * // 家庭月均负债——信用卡（准贷记卡）透支
//	// * // 家庭月均负债——一次性到期还本的抵/质押贷款
//	// * @param pboc
//	// * @param inputMap
//	// * @param Abnormal
//	// * @return
//	// * @throws ParseException
//	// */
//	// @SuppressWarnings({ "unchecked", "rawtypes" })
//	// public Map<String, Object> familyMonthPay(PbocSummary pboc,Map<String, Object> inputMap,
//	// String[] Abnormal) throws ParseException{
//	// Set<PbocSpouse> listPsp = pboc.getPbocSpouses();
//	// int countSp = 0;
//	// int countSpodz = 0;
//	// int countSpoxb = 0;
//	// Iterator listPsc = (Iterator) listPsp.iterator();
//	// try {
//	// while (listPsc.hasNext()) {
//	// PbocSpouse pbocSpouse = (PbocSpouse) listPsc.next();
//	// PbocSummary pbocs = pbocSummaryManager.getPbocSummary(pbocSpouse.getCertificateNo(),
//	// pbocSpouse.getCertificateType());
//	// countSp = countSp + countAllTZ(pbocs);
//	// }
//	// } catch (Exception e) {
//	// countSp = 0;
//	// }
//	// inputMap.put(Abnormal[0], countAllTZ(pboc) + countSp);
//	// // 家庭月均负债——一次性到期还本的抵/质押贷款
//	// try {
//	// while (listPsc.hasNext()) {
//	// PbocSpouse pbocSpouse = (PbocSpouse) listPsc.next();
//	// PbocSummary pbocs = pbocSummaryManager.getPbocSummary(pbocSpouse.getCertificateNo(),
//	// pbocSpouse.getCertificateType());
//	// countSpodz = countSpodz + countAllOneDZ(pbocs);
//	// }
//	// } catch (Exception e) {
//	// countSpodz = 0;
//	// }
//	// inputMap.put(Abnormal[1], countAllOneDZ(pboc) + countSpodz);
//	// // 家庭月均负债——一次性到期还本的信用/保证贷款
//	// try {
//	// while (listPsc.hasNext()) {
//	// PbocSpouse pbocSpouse = (PbocSpouse) listPsc.next();
//	// PbocSummary pbocs = pbocSummaryManager.getPbocSummary(pbocSpouse.getCertificateNo(),
//	// pbocSpouse.getCertificateType());
//	// countSpoxb = countSpoxb + countAllOneXB(pbocs);
//	// }
//	// } catch (Exception e) {
//	// countSpoxb = 0;
//	// }
//	// inputMap.put(Abnormal[2], countAllOneXB(pboc) + countSpoxb);
//	// // 家庭月均负债——分期偿还的抵/质押贷款
//	// int countSpfqdz = 0;
//	// try {
//	// while (listPsc.hasNext()) {
//	// PbocSpouse pbocSpouse = (PbocSpouse) listPsc.next();
//	// PbocSummary pbocs = pbocSummaryManager.getPbocSummary(pbocSpouse.getCertificateNo(),
//	// pbocSpouse.getCertificateType());
//	// countSpfqdz = countSpfqdz + countAllFQDZ(pbocs);
//	// }
//	// } catch (Exception e) {
//	// countSpfqdz = 0;
//	// }
//	// inputMap.put(Abnormal[3], countAllFQDZ(pboc) + countSpfqdz);
//	// // 家庭月均负债——分期偿还的信用/保证贷款
//	// int countSpfqxb = 0;
//	// try {
//	// while (listPsc.hasNext()) {
//	// PbocSpouse pbocSpouse = (PbocSpouse) listPsc.next();
//	// PbocSummary pbocs = pbocSummaryManager.getPbocSummary(pbocSpouse.getCertificateNo(),
//	// pbocSpouse.getCertificateType());
//	// countSpfqxb = countSpfqxb + countAllFQXB(pbocs);
//	// }
//	// } catch (Exception e) {
//	// countSpfqxb = 0;
//	// }
//	// inputMap.put(Abnormal[4], countAllFQXB(pboc) + countSpfqxb);
//	// // 家庭月均负债——对外担保
//	// int countSpdwdb = 0;
//	// try {
//	// while (listPsc.hasNext()) {
//	// PbocSpouse pbocSpouse = (PbocSpouse) listPsc.next();
//	// PbocSummary pbocs = pbocSummaryManager.getPbocSummary(pbocSpouse.getCertificateNo(),
//	// pbocSpouse.getCertificateType());
//	// countSpdwdb = countSpdwdb + countAllDWDB(pbocs);
//	// }
//	// } catch (Exception e) {
//	// countSpdwdb = 0;
//	// }
//	// inputMap.put(Abnormal[5], countAllDWDB(pboc) + countSpdwdb);
//	//
//	// return inputMap;
//	//
//	// }
//	/**
//	 * // 近N个月本行审批征信查询次数
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int[] countQuery(PbocSummary pboc, int n) throws ParseException, Exception {
//		int[] LM = new int[2];
//		Set<PbocLaQueryDetail> listPlqd = pboc.getPbocLaQueryDetails();
//		// 取查询日期近n个月的日期
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//		int countILastN = 0;
//		int countOLastN = 0;
//		String lastNMonth = DateUtil.getMonthByDate(n, pboc.getQueryTime());//取距离PBOC征信报告概要信息中“查询请求时间”n个月的日期
//		String queryTime = sdf.format(pboc.getQueryTime());//PBOC征信报告概要信息中“查询请求时间”
//		Iterator<PbocLaQueryDetail> listPd = listPlqd.iterator();
//		while (listPd.hasNext()) {
//			PbocLaQueryDetail pbocLaQueryDetail = listPd.next();
//			// 我行
//			String queryDate = sdf.format(pbocLaQueryDetail.getQueryDate());//PBOC征信信贷审批查询记录明细表_查询日期
//			//查询操作员
//			if (pbocLaQueryDetail.getOperator() != null && !pbocLaQueryDetail.getOperator().equals("")) {
//				if (pbocLaQueryDetail.getOperator().length() > 4) {
//					//查询操作员为江苏银行
//					if (pbocLaQueryDetail.getOperator().substring(0, 4).equals("江苏银行")) {
//						//查询日期介于“查询请求日期前n个月的日期”和“查询请求日期”之间。
//						if (Integer.parseInt(queryDate) >= Integer.parseInt(lastNMonth)
//								&& Integer.parseInt(queryDate) <= Integer.parseInt(queryTime)) {
//							//查询原因为：02--贷款审批，03---信用卡审批
//							if (pbocLaQueryDetail.getQueryReason().equals("02")
//									|| pbocLaQueryDetail.getQueryReason().equals("03")) {
//								countILastN++;
//							}
//						}
//					}
//				} else {
//					// 他行
//					if (Integer.parseInt(queryDate) >= Integer.parseInt(lastNMonth)
//							&& Integer.parseInt(queryDate) <= Integer.parseInt(queryTime)) {
//						if (pbocLaQueryDetail.getQueryReason().equals("02")
//								|| pbocLaQueryDetail.getQueryReason().equals("03")) {
//							countOLastN++;
//						}
//					}
//				}
//			} else {
//				// 他行
//				if (Integer.parseInt(queryDate) >= Integer.parseInt(lastNMonth)
//						&& Integer.parseInt(queryDate) <= Integer.parseInt(queryTime)) {
//					if (pbocLaQueryDetail.getQueryReason().equals("02")
//							|| pbocLaQueryDetail.getQueryReason().equals("03")) {
//						countOLastN++;
//					}
//				}
//			}
//		}
//
//		LM[0] = countILastN;
//		LM[1] = countOLastN;
//		return LM;
//	}
//	
//	/**
//	 * 近N个月审批征信查询次数
//	 * 统计时间：从查询日期往前推12个月，包含本月（例如查询日期为2014年4月15日，过去12个月就是2014年4月15日-2013年4月1日）；
//	 * 查询类型：信用卡或贷款审批查询；
//	 * 是否区分我行或他行：不区分。
//	 * （消费贷，房贷专用）
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int[] countQueryForNew(PbocSummary pboc, int n) throws ParseException, Exception {
//		int[] LM = new int[2];
//		Set<PbocLaQueryDetail> listPlqd = pboc.getPbocLaQueryDetails();
//		// 取查询日期近n个月的日期
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//		int countILastN = 0;
//		int countOLastN = 0;
//		//取距离PBOC征信报告概要信息中“查询请求时间”n个月的日期
//		String lastNMonth = DateUtil.getMonthByDate(n, pboc.getQueryTime(), 1);
//		String queryTime = sdf.format(pboc.getQueryTime());//PBOC征信报告概要信息中“查询请求时间”
//		Iterator<PbocLaQueryDetail> listPd = listPlqd.iterator();
//		while (listPd.hasNext()) {
//			PbocLaQueryDetail pbocLaQueryDetail = listPd.next();
//			// 我行
//			String queryDate = sdf.format(pbocLaQueryDetail.getQueryDate());//PBOC征信信贷审批查询记录明细表_查询日期
//			//查询操作员
//			if (pbocLaQueryDetail.getOperator() != null && !pbocLaQueryDetail.getOperator().equals("")) {
//				if (pbocLaQueryDetail.getOperator().length() > 4) {
//					//查询操作员为江苏银行
//					if (pbocLaQueryDetail.getOperator().substring(0, 4).equals("江苏银行")) {
//						//查询日期介于“查询请求日期前n个月的日期”和“查询请求日期”之间。
//						if (Integer.parseInt(queryDate) >= Integer.parseInt(lastNMonth)
//								&& Integer.parseInt(queryDate) <= Integer.parseInt(queryTime)) {
//							//查询原因为：02--贷款审批，03---信用卡审批
//							if (pbocLaQueryDetail.getQueryReason().equals("02")
//									|| pbocLaQueryDetail.getQueryReason().equals("03")) {
//								countILastN++;
//							}
//						}
//					}
//				} else {
//					// 他行
//					if (Integer.parseInt(queryDate) >= Integer.parseInt(lastNMonth)
//							&& Integer.parseInt(queryDate) <= Integer.parseInt(queryTime)) {
//						if (pbocLaQueryDetail.getQueryReason().equals("02")
//								|| pbocLaQueryDetail.getQueryReason().equals("03")) {
//							countOLastN++;
//						}
//					}
//				}
//			} else {
//				// 他行
//				if (Integer.parseInt(queryDate) >= Integer.parseInt(lastNMonth)
//						&& Integer.parseInt(queryDate) <= Integer.parseInt(queryTime)) {
//					if (pbocLaQueryDetail.getQueryReason().equals("02")
//							|| pbocLaQueryDetail.getQueryReason().equals("03")) {
//						countOLastN++;
//					}
//				}
//			}
//		}
//
//		LM[0] = countILastN;
//		LM[1] = countOLastN;
//		return LM;
//	}
//
//	/**
//	 * 有无特殊交易类型
//	 * 
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public Map<String, Object> specialTrade(PbocSummary pboc, Map<String, Object> inputMap, String Abnormal)
//			throws ParseException, Exception {
//		// 有无特殊风险情况
//		// 贷款特殊交易类型
//		Set<PbocLoanSummary> listPLsS = pboc.getPbocLoanSummaries();
//		Iterator listPs = (Iterator) listPLsS.iterator();
//		while (listPs.hasNext()) {
//			PbocLoanSummary pbocLoanSummaryss = (PbocLoanSummary) listPs.next();
//			if (pbocLoanSummaryss.getSpecialTradeType() != null && !pbocLoanSummaryss.getSpecialTradeType().equals("")) {
//				if (pbocLoanSummaryss.getSpecialTradeType().equals("2")
//						|| pbocLoanSummaryss.getSpecialTradeType().equals("3")) {
//					inputMap.put(Abnormal, "1");
//					break;
//				}
//			}
//			if (pbocLoanSummaryss.getLoanStatus() != null && !pbocLoanSummaryss.getLoanStatus().equals("")) {
//				if (pbocLoanSummaryss.getLoanStatus().equals(LoanStatus.DZ.getValue())) {
//					inputMap.put(Abnormal, "1");
//					break;
//				}
//			}
//		}
//		// 准贷记卡
//		Set<PbocSldSummary> ps = pboc.getPbocSldSummaries();
//		Iterator psList = (Iterator) ps.iterator();
//		while (psList.hasNext()) {
//			PbocSldSummary pss = (PbocSldSummary) psList.next();
//			if (pss.getSpecialTradeType() != null && !pss.getSpecialTradeType().equals("")) {
//				if (pss.getSpecialTradeType().equals("2") || pss.getSpecialTradeType().equals("3")) {
//					inputMap.put(Abnormal, "1");
//					break;
//				}
//			}
//			if (pss.getCcStatus() != null && !pss.getCcStatus().equals("")) {
//				if (pss.getCcStatus().equals(CardStatus.DZ.getValue())) {
//					inputMap.put(Abnormal, "1");
//					break;
//				}
//			}
//			if (pss.getDescription() != null && !pss.getDescription().equals("")) {
//				if (AnalysisLoan.getTrue(pss.getDescription())) {
//					inputMap.put(Abnormal, "1");
//					break;
//				}
//			}
//		}
//		// 贷记卡
//		Set<PbocLoancardSummary> pls = pboc.getPbocLoancardSummaries();
//		Iterator listls = (Iterator) pls.iterator();
//		while (listls.hasNext()) {
//			PbocLoancardSummary psd = (PbocLoancardSummary) listls.next();
//			if (psd.getSpecialTradeType() != null && !psd.getSpecialTradeType().equals("")) {
//				if (psd.getSpecialTradeType().equals("2") || psd.getSpecialTradeType().equals("3")) {
//					inputMap.put(Abnormal, "1");
//					break;
//				}
//			}
//			if (psd.getCcStatus() != null && !psd.getCcStatus().equals("")) {
//				if (psd.getCcStatus().equals(CardStatus.DZ.getValue())) {//4-呆账
//					inputMap.put(Abnormal, "1");
//					break;
//				}
//			}
//			if (psd.getDescription() != null && !psd.getDescription().equals("")) {
//				if (AnalysisLoan.getTrue(psd.getDescription())) {
//					inputMap.put(Abnormal, "1");
//					break;
//				}
//			}
//		}
//		if (inputMap.get(Abnormal) == null || inputMap.get(Abnormal).equals("")) {
//			inputMap.put(Abnormal, "0");
//		}
//		return inputMap;
//	}
//
//	/**
//	 * // 贷款累计逾期次数 / 贷款最高逾期期数
//	 * 
//	 * @param pboc
//	 * @param LoanArrearTimes
//	 * @param LoanArrearHighest
//	 * @param inputMap
//	 */
//	@SuppressWarnings("unchecked")
//	public Map<String, Object> overDate(PbocSummary pboc, String LoanArrearTimes, String LoanArrearHighest,
//			Map<String, Object> inputMap) {
//		Set<PbocOdSummary> listPod = pboc.getPbocOdSummaries();
//		if (listPod.size() > 0) {
//			try {
//				// 贷款累计逾期次数
//				BigDecimal pBOCLoanArrearTimes = (BigDecimal) (StringUtil.isNotEmpty(listPod.iterator().next()
//						.getLoanOdMth()
//						+ "") ? listPod.iterator().next().getLoanOdMth() : 0);
//				inputMap.put(LoanArrearTimes, pBOCLoanArrearTimes);
//
//			} catch (Exception e) {
//				inputMap.put(LoanArrearTimes, -1);
//			}
//
//			// 贷款最高逾期期数
//			try {
//				BigDecimal pBOCLoanArrearHighest = (BigDecimal) (StringUtil.isNotEmpty(listPod.iterator().next()
//						.getLoanOdMthMax()
//						+ "") ? listPod.iterator().next().getLoanOdMthMax() : 0);
//				inputMap.put(LoanArrearHighest, pBOCLoanArrearHighest);
//			} catch (Exception e) {
//				inputMap.put(LoanArrearHighest, -1);
//			}
//		} else {
//			inputMap.put(LoanArrearTimes, 0);
//			inputMap.put(LoanArrearHighest, 0);
//		}
//		return inputMap;
//	}
//	
//	/**
//	 * 借款人信用卡近24个月最大连续逾期期数
//	 * 
//	 * 借款人征信信用卡24个月还款状态中最大的逾期期数
//	 * 即每笔贷款中是数值的最大值那个数值，然后取最大那个数值
//	 * 
//	 * @param pboc
//	 * @param n
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int[] overMaxLoanNum(PbocSummary pboc) {
//
//		// 贷款
//		Set<PbocLoanSummary> listPls = pboc.getPbocLoanSummaries();
//		Iterator<PbocLoanSummary> pLss = listPls.iterator();
//		int maxLoanYuQiNum = 0;
//		while (pLss.hasNext()) {
//			PbocLoanSummary pbocLoanSummary = pLss.next();
//			int loanYuQiNum = 0;
//			if (StringUtil.isNotEmpty(pbocLoanSummary.getPaymentStatusM24())) {
//				//获取近24个月最大逾期期数
//				loanYuQiNum = maxCountDJK(pbocLoanSummary.getPaymentStatusM24());
//			}
//			maxLoanYuQiNum = loanYuQiNum > maxLoanYuQiNum ? loanYuQiNum : maxLoanYuQiNum;
//		}
//		// 贷记卡
//		Set<PbocLoancardSummary> listPlsd = pboc.getPbocLoancardSummaries();
//		Iterator<PbocLoancardSummary> pLssd = listPlsd.iterator();
//		int maxLoancardYuQiNum = 0;
//		while (pLssd.hasNext()) {
//			PbocLoancardSummary pbocLoancardSummary = pLssd.next();
//			int loancardYuQiNum = 0;
//			if (StringUtil.isNotEmpty(pbocLoancardSummary.getPaymentStatusM24())) {
//				//获取近24个月最大逾期期数
//				loancardYuQiNum = maxCountDJK(pbocLoancardSummary.getPaymentStatusM24());
//			}
//			maxLoancardYuQiNum = loancardYuQiNum > maxLoancardYuQiNum ? loancardYuQiNum : maxLoancardYuQiNum;
//		}
//		int[] yuQiNum = new int[2];
//		yuQiNum[0] = maxLoanYuQiNum;// 贷款
//		yuQiNum[1] = maxLoancardYuQiNum;// 贷记卡
//
//		return yuQiNum;
//	}
//	/**
//	 * 获取近24个月最大逾期期数
//	 * @param s
//	 * @return
//	 */
//	public int maxCountDJK(String s) {
//		int maxNum = 0;
//		if (s != null && !s.equals("")) {
//			String[] YuQiNum = new String[24];
//			for (int i = 0; i < 24; i++) {
//				String lastOne = s.substring(i, i + 1);
//				YuQiNum[i] = lastOne;
//				//建议将if (testIsNum(YuQiNum[i]) == true)改成if (testIsNum(YuQiNum[i]))
//				if (testIsNum(YuQiNum[i]) == true) {
//					int num = Integer.parseInt(YuQiNum[i]);
//					maxNum = num > maxNum ? num : maxNum;
//				}
//			}
//		}
//		return maxNum;
//	}
//	
//	/**
//	 * 借款人信用卡、贷款最大累计逾期期数
//	 * 
//	 * 分别统计借款人征信每笔贷款24个月还款状态中逾期期数大于0的月份数，然后取最大值
//	 * 即累计每笔贷款信息中是数字的数量，然后取最大的那笔贷款数量
//	 * 
//	 * @param pboc
//	 * @param n
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int[] overDateLoanNum(PbocSummary pboc) {
//
//		// 贷款
//		Set<PbocLoanSummary> listPls = pboc.getPbocLoanSummaries();
//		Iterator<PbocLoanSummary> pLss = listPls.iterator();
//		int maxLoanYuQiNum = 0;
//		while (pLss.hasNext()) {
//			PbocLoanSummary pbocLoanSummary = pLss.next();
//			int loanYuQiNum = 0;
//			if (StringUtil.isNotEmpty(pbocLoanSummary.getPaymentStatusM24())) {
//				// 根据近24个月判断是否逾期
//				for (int i = 0; i < pbocLoanSummary.getPaymentStatusM24().length(); i++) {
//					if (testIsNum(pbocLoanSummary.getPaymentStatusM24().substring(i, i + 1)) == true) {
//						loanYuQiNum++;
//					}
//				}
//			}
//			maxLoanYuQiNum = loanYuQiNum > maxLoanYuQiNum ? loanYuQiNum : maxLoanYuQiNum;
//		}
//
//		// 贷记卡
//		Set<PbocLoancardSummary> listPlsd = pboc.getPbocLoancardSummaries();
//		Iterator plssd = (Iterator) listPlsd.iterator();
//		
//		int maxLoanCardYuQiNum = 0;
//		while (plssd.hasNext()) {
//			PbocLoancardSummary pbocLoancardSummary = (PbocLoancardSummary) plssd.next();
//			int loanCardYuQiNum = 0;
//			if (StringUtil.isNotEmpty(pbocLoancardSummary.getPaymentStatusM24())) {
//				// 根据近24个月判断是否逾期
//				for (int i = 0; i < pbocLoancardSummary.getPaymentStatusM24().length(); i++) {
//					if (testIsNum(pbocLoancardSummary.getPaymentStatusM24().substring(i, i + 1)) == true) {
//						loanCardYuQiNum++;
//					}
//				}
//			}
//			maxLoanCardYuQiNum = loanCardYuQiNum > maxLoanCardYuQiNum ? loanCardYuQiNum : maxLoanCardYuQiNum;
//		}
//
//		int[] maxYuQiNum = new int[2];
//		maxYuQiNum[0] = maxLoanYuQiNum;// 贷款
//		maxYuQiNum[1] = maxLoanCardYuQiNum;// 贷记卡
//
//		return maxYuQiNum;
//	}
//
//	/**
//	 * 当前状态为逾期的贷款, 贷记卡,准贷记卡 // 账户数
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int[] getOverDateLoan(PbocSummary pboc) {
//		int[] LM = new int[3];
//		// 当前状态为逾期的贷款账户数
//		int countYQD = 0;
//		Set<PbocLoanSummary> PLsS = pboc.getPbocLoanSummaries();
//		Iterator pLsS = (Iterator) PLsS.iterator();
//		while (pLsS.hasNext()) {
//			PbocLoanSummary pbocLoanSummaryss = (PbocLoanSummary) pLsS.next();
//			if (StringUtil.isNotEmpty(pbocLoanSummaryss.getLoanStatus())) {
//				if (pbocLoanSummaryss.getLoanStatus().equals(LoanStatus.ZC.getValue())) {//0-正常
//					if (countDJK(pbocLoanSummaryss.getPaymentStatusM24()) == 1
//							|| countDJK(pbocLoanSummaryss.getPaymentStatusM24()) > 1) {
//						countYQD++;
//
//					}
//				}
//			}
//		}
//		// 贷记卡
//		int countYQDJ = 0;
//		Set<PbocLoancardSummary> loancardSummaries = pboc.getPbocLoancardSummaries();
//		Iterator iterator = (Iterator) loancardSummaries.iterator();
//		while (iterator.hasNext()) {
//			PbocLoancardSummary psd = (PbocLoancardSummary) iterator.next();
//			if (StringUtil.isNotEmpty(psd.getCcStatus())) {
//				if (psd.getCcStatus().equals(CardStatus.ZC.getValue()/*"1"*/)) {
//					if (countDJK(psd.getPaymentStatusM24()) == 1 || countDJK(psd.getPaymentStatusM24()) > 1) {
//						countYQDJ++;
//
//					}
//				}
//			}
//		}
//		// 准贷记卡
//		int countYQZD = 0;
//		Set<PbocSldSummary> pss = pboc.getPbocSldSummaries();
//		Iterator ss = (Iterator) pss.iterator();
//		while (ss.hasNext()) {
//			PbocSldSummary summary = (PbocSldSummary) ss.next();
//			if (StringUtil.isNotEmpty(summary.getCcStatus())) {
//				if (summary.getCcStatus().equals(CardStatus.ZC.getValue()/*"1"*/)) {
//					if (countDJK(summary.getPaymentStatusM24()) == 2 || countDJK(summary.getPaymentStatusM24()) > 2) {
//						countYQZD++;
//					}
//				}
//			}
//		}
//		LM[0] = countYQD;
//		LM[1] = countYQDJ;
//		LM[2] = countYQZD;
//		return LM;
//	}
//
//	/**
//	 * 状态为不良对外担保笔数
//	 * 担保贷款五级分类（统计分类为次级、可疑、损失的记录数汇总）
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int getBadGuarant(PbocSummary pboc) {
//		// 状态为不良对外担保笔数
//		Set<PbocGuaranteeSummary> listPGS = pboc.getPbocGuaranteeSummaries();
//		Iterator listPgs = (Iterator) listPGS.iterator();
//		int countbl = 0;
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
//							countbl++;
//						}
//					}
//				}
//			}
//		}
//		return countbl;
//	}
//
//	/**
//	 * // 电信欠缴月数
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int getTelPay(PbocSummary pboc) {
//		// 电信欠缴月数
//		Set<PbocTelPayRecord> listPS = pboc.getPbocTelPayRecords();
//		Iterator list = (Iterator) listPS.iterator();
//		int count2 = 0;
//		while (list.hasNext()) {
//			PbocTelPayRecord pbocTelPayRecord = (PbocTelPayRecord) list.next();
//			if (pbocTelPayRecord.getOweMth() != null && !pbocTelPayRecord.getOweMth().equals("")) {
//				count2 = count2 + pbocTelPayRecord.getOweMth().intValue();
//			}
//		}
//		return count2;
//	}
//
//	/**
//	 * 五级分类为正常、当前无逾期”判断
//	 * 
//	 * @param pbocLoanSummary
//	 * @return
//	 */
//	public Boolean Checktrue(PbocLoanSummary pbocLoanSummary) {
//		Boolean five = false;
//		Boolean lastOnes = false;
//
//		if (StringUtil.isNotEmpty(pbocLoanSummary.getFiveGrade())) {
//			// 正常
//			if (pbocLoanSummary.getFiveGrade().equals("1")) {
//				five = true;
//			}
//			if (StringUtil.isNotEmpty(pbocLoanSummary.getPaymentStatusM24())) {
//				String lastOne = pbocLoanSummary.getPaymentStatusM24().substring(23);
//				if (testIsNum(lastOne) != true) {
//					lastOnes = true;
//				}
//			}
//		}
//		return five && lastOnes;
//
//	}
//
//	/**
//	 * 有无授信:true 有： false :无
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public Boolean checkSX(PbocSummary pboc) {
//		// 贷款
//		Boolean dk = false;
//		Set<PbocLoanSummary> listPLsSs = pboc.getPbocLoanSummaries();
//		if (listPLsSs.size() > 0) {
//			dk = true;
//		}
//
//		// 准贷记卡
//		Boolean zdjk = false;
//		Set<PbocSldSummary> psb = pboc.getPbocSldSummaries();
//		Iterator psListb = (Iterator) psb.iterator();
//		while (psListb.hasNext()) {
//			PbocSldSummary pss = (PbocSldSummary) psListb.next();
//			if (pss.getCcStatus() != null && !pss.getCcStatus().equals("")) {
//				if (!pss.getCcStatus().equals(CardStatus.WJH.getValue()/*"6"*/)) {
//					zdjk = true;
//					break;
//				}
//			}
//		}
//		// 贷记卡
//		Boolean djk = false;
//		Set<PbocLoancardSummary> plsv = pboc.getPbocLoancardSummaries();
//		Iterator listlsv = (Iterator) plsv.iterator();
//		while (listlsv.hasNext()) {
//			PbocLoancardSummary psd = (PbocLoancardSummary) listlsv.next();
//			if (psd.getCcStatus() != null && !psd.getCcStatus().equals("")) {
//				if (!psd.getCcStatus().equals(CardStatus.WJH.getValue()/*"6"*/)) {
//					djk = true;
//					break;
//				}
//			}
//		}
//		return dk || djk || zdjk;
//	}
//
//	/**
//	 * 住房公积金贷款月还款额 取符合条件的每笔贷款明细的“本月应还款”累加。
//	 * 
//	 * 根据信贷交易信息明细中的贷款信息部分统计得出，根据贷款的描述信息
//	 * 中“贷款种类细分（个人公积金贷款）、按月归还、五级分类为正常、当前无
//	 * 逾期”判断，取“本月应还款”数据项累加。
//	 * 
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int countCompany(PbocSummary pbocSummary) throws ParseException, Exception {
//		Set<PbocLoanSummary> listPLSS = pbocSummary.getPbocLoanSummaries();
//		Iterator listPs = (Iterator) listPLSS.iterator();
//		int countMothlyPayMortgage = 0;
//		while (listPs.hasNext()) {
//			PbocLoanSummary pbocLoanSummary = (PbocLoanSummary) listPs.next();
//			// 住房公积金贷款月还款额
//			if (pbocLoanSummary.getDescription() != null && !pbocLoanSummary.getDescription().equals("")) {
//				// 五级分类和逾期判断
//				if (Checktrue(pbocLoanSummary) == true) {
//					Map<String, String> type = AnalysisLoan.getLoanTypeOther(pbocLoanSummary.getDescription());
//					if (type != null && StringUtil.isNotEmpty(type.get("loanCard"))
//							&& type.get("loanCard").equals("个人公积金贷款")) {
//						if (type.get("loanType").equals("抵押") || type.get("loanType").equals("组合")) {
//							if (pbocLoanSummary.getLoanMoney() != null) {
//								int monthPay = pbocLoanSummary.getLoanMoney().intValue()
//										/ Integer.parseInt(type.get("loanDueNum"));
//								if (pbocLoanSummary.getPlanPayAmt() != null
//										&& !"".equals(pbocLoanSummary.getPlanPayAmt())) {
//									if (monthPay <= pbocLoanSummary.getPlanPayAmt().intValue()) {
//										countMothlyPayMortgage = countMothlyPayMortgage
//												+ pbocLoanSummary.getPlanPayAmt().intValue();
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//
//		return countMothlyPayMortgage;
//	}
//
//	/**
//	 * //个人月均负债(抵押/质押贷款部分)
//	 * 
//	 * @throws ParseException
//	 */
//	public int countAll(PbocSummary pbocSummary) throws ParseException, Exception {
//		@SuppressWarnings("unchecked")
//		Set<PbocLoanSummary> listPLSS = pbocSummary.getPbocLoanSummaries();
//		@SuppressWarnings("rawtypes")
//		Iterator listPs = (Iterator) listPLSS.iterator();
//		int countMothlyPayMortgage = 0;
//		while (listPs.hasNext()) {
//			PbocLoanSummary pbocLoanSummarys = (PbocLoanSummary) listPs.next();
//			Map<String, String> rm = AnalysisLoan.getLoanTypeOther(pbocLoanSummarys.getDescription());
//			// 长度为0时为呆账或结清
//			if (rm.size() != 0) {
//				if (rm.get("loanType").toString().equals("抵押/质押")) {
//					if (rm.get("rePayType").toString().equals("一次性归还")) {
//						countMothlyPayMortgage = +(Integer.parseInt(rm.get("loanMoney").toString()) / Integer
//								.parseInt(rm.get("loanDueNum").toString()));
//					}
//					if (rm.get("rePayType").toString().equals("按月归还")) {
//						if (pbocLoanSummarys.getPlanPayAmt() != null) {
//							countMothlyPayMortgage = +pbocLoanSummarys.getPlanPayAmt().intValue();
//						}
//					}
//				}
//			}
//		}
//
//		return countMothlyPayMortgage;
//
//	}
//
//	/**
//	 * 他行抵押方式经营贷余额合计:取信贷交易信息明细的贷款信息中他行的，品种为经营贷的，担保方式为抵押的余额合计。s
//	 * 
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int countOtherCompany(PbocSummary pbocSummary) throws ParseException, Exception {
//		Set<PbocLoanSummary> listPLSS = pbocSummary.getPbocLoanSummaries();
//		Iterator listPs = (Iterator) listPLSS.iterator();
//		int countMothlyPayMortgage = 0;
//		while (listPs.hasNext()) {
//			PbocLoanSummary pbocLoanSummarys = (PbocLoanSummary) listPs.next();
//			Map<String, String> rm = AnalysisLoan.getLoanTypeOther(pbocLoanSummarys.getDescription());
//			// 长度为0时为呆账或结清
//			try {
//				if (rm.size() != 0) {
//					if (Checktrue(pbocLoanSummarys) == true) {
//						if (!AnalysisLoan.getComapanyType(pbocLoanSummarys.getDescription()).equals("江苏银行")
//								&& rm.get("loanType").toString().equals("抵押")
//								&& rm.get("loanCard").toString().equals("个人经营性贷款")) {
//							if (pbocLoanSummarys.getCapitalBalance() != null) {
//								countMothlyPayMortgage = countMothlyPayMortgage
//										+ pbocLoanSummarys.getCapitalBalance().intValue();
//							}
//
//						}
//					}
//				}
//			} catch (Exception e) {
//				countMothlyPayMortgage = 0;
//			}
//
//		}
//
//		return countMothlyPayMortgage;
//
//	}
//
//	/**
//	 * 个人月均负债(信用/保证贷款部分)
//	 * 
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int countAllOther(PbocSummary pbocSummary) throws ParseException, Exception {
//		Set<PbocLoanSummary> listPLSS = pbocSummary.getPbocLoanSummaries();
//		Iterator listPs = (Iterator) listPLSS.iterator();
//		int countMothlyPayMortgage = 0;
//		int otherData = 0;
//		int otherDatas = 0;
//		while (listPs.hasNext()) {
//			PbocLoanSummary pbocLoanSummarys = (PbocLoanSummary) listPs.next();
//			Map<String, String> rm = AnalysisLoan.getLoanTypeOther(pbocLoanSummarys.getDescription());
//
//			if (rm.size() != 0) {
//				if (rm.get("loanType").toString().equals("信用/保证")) {
//					if (rm.get("rePayType").toString().equals("一次性归还")) {
//						countMothlyPayMortgage = countMothlyPayMortgage
//								+ (Integer.parseInt(rm.get("loanMoney").toString()) / Integer.parseInt(rm.get(
//									"loanDueNum").toString()));
//					}
//					if (rm.get("rePayType").toString().equals("按月归还")) {
//						if (pbocLoanSummarys.getPlanPayAmt() != null) {
//							countMothlyPayMortgage = countMothlyPayMortgage
//									+ pbocLoanSummarys.getPlanPayAmt().intValue();
//						}
//					}
//				}
//			}
//		}
//		// 1.存量债务中信用卡（准贷记卡）透支，按未偿还额的信用卡（准贷记卡）透支额×10%计算。PBOC_SLD_SUMMARY
//		// 长度为0时为呆账或结清
//		// 本字段取征信报告中未销户贷记卡汇总信息的已用额度字段和未销户准贷记卡的透支余额字段。
//		// PBOC_UNCANCEL_LC_SUMMARY PBOC_UNCANCEL_SLC_SUMMARY
//		Set<PbocUncancelLcSummary> listPUL = pbocSummary.getPbocUncancelLcSummaries();
//		Iterator listpul = (Iterator) listPUL.iterator();
//		while (listpul.hasNext()) {
//			PbocUncancelLcSummary pbocUncancelLcSummary = (PbocUncancelLcSummary) listpul.next();
//			if (pbocUncancelLcSummary.getUsedAmt() != null) {
//				otherData = otherData + (int) (pbocUncancelLcSummary.getUsedAmt().intValue() * (0.1));
//			}
//		}
//		Set<PbocUncancelSlcSummary> listPUS = pbocSummary.getPbocUncancelSlcSummaries();
//		Iterator listpus = (Iterator) listPUS.iterator();
//		while (listpus.hasNext()) {
//			PbocUncancelSlcSummary pbocUncancelSlcSummary = (PbocUncancelSlcSummary) listpus.next();
//			if (pbocUncancelSlcSummary.getOverdraft() != null) {
//				otherDatas = otherDatas + (int) (pbocUncancelSlcSummary.getOverdraft().intValue() * (0.1));
//			}
//		}
//		return countMothlyPayMortgage + otherData + otherDatas;
//
//	}
//
//	/**
//	 * 个人月均负债——一次性到期还本的抵/质押贷款 取本金余额字段
//	 * 
//	 * 根据信贷交易信息明细中的贷款信息部分统计得出，当贷款种类细分为
//	 * 个人住房贷款、个人商用房（含商住两用）贷款、个人公积金贷款时，
//	 * 根据贷款的“担保方式：抵押、质押、组合担保；（贷款发放金额/期数）＞本月应还款”判断，
//	 * 取每笔贷款的本金余额累加后除以36.当为其他贷款品种时，
//	 * 根据贷款的“担保方式：抵押、质押；（贷款发放金额/期数）＞本月应还款”判断，
//	 * 取每笔贷款的本金余额累加后除以36.
//	 * 
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int countAllOneDZ(PbocSummary pbocSummary) throws Exception {
//		Set<PbocLoanSummary> listPLSS = pbocSummary.getPbocLoanSummaries();
//		Iterator listPs = (Iterator) listPLSS.iterator();
//		int countMothlyPayMortgage = 0;
//
//		while (listPs.hasNext()) {
//			PbocLoanSummary pbocLoanSummarys = (PbocLoanSummary) listPs.next();
//			if (pbocLoanSummarys.getDescription() != null && !pbocLoanSummarys.getDescription().equals("")) {
//				//解析贷款语句
//				Map<String, String> rm = AnalysisLoan.getLoanTypeOther(pbocLoanSummarys.getDescription());
//				if (rm.size() != 0) {
//					//贷款种类细分为个人住房贷款、个人商用房（含商住两用）贷款、个人公积金贷款
//					if (checkLoan(pbocLoanSummarys.getDescription())) {
//						//担保方式：抵押、质押、组合担保
//						if (rm.get("loanType").toString().equals("质押") || rm.get("loanType").toString().equals("抵押")
//								|| rm.get("loanType").toString().equals("组合")) {
//							if (pbocLoanSummarys.getLoanMoney() != null) {
//								//贷款金额/期数
//								int monthPay = pbocLoanSummarys.getLoanMoney().intValue()
//										/ Integer.parseInt(rm.get("loanDueNum"));
//								if (pbocLoanSummarys.getPlanPayAmt() != null
//										&& !"".equals(pbocLoanSummarys.getPlanPayAmt())) {
//									//贷款金额/期数 > 每月应还额
//									if (monthPay > pbocLoanSummarys.getPlanPayAmt().intValue()) {
//										if (pbocLoanSummarys.getCapitalBalance() != null) {
//											//本金余额累加/36
//											countMothlyPayMortgage = countMothlyPayMortgage
//													+ (pbocLoanSummarys.getCapitalBalance().intValue() / 36);
//										}
//									}
//								}
//
//							}
//						}
//					} else {
//						if (rm.get("loanType").toString().equals("质押") || rm.get("loanType").toString().equals("抵押")) {
//							if (pbocLoanSummarys.getLoanMoney() != null) {
//								int monthPay = pbocLoanSummarys.getLoanMoney().intValue()
//										/ Integer.parseInt(rm.get("loanDueNum"));
//								if (pbocLoanSummarys.getPlanPayAmt() != null
//										&& !"".equals(pbocLoanSummarys.getPlanPayAmt())) {
//									if (monthPay > pbocLoanSummarys.getPlanPayAmt().intValue()) {
//										if (pbocLoanSummarys.getCapitalBalance() != null) {
//											countMothlyPayMortgage = countMothlyPayMortgage
//													+ (pbocLoanSummarys.getCapitalBalance().intValue() / 36);
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//		return countMothlyPayMortgage;
//
//	}
//	/**
//	 * 个人月均负债——一次性到期还本的抵/质押贷款（不含住房、公积金贷款）
//	 * 
//	 * 根据信贷交易信息明细中的贷款信息部分统计得出，当贷款种类为 个人商用房（含商住两用）贷款时，
//	 * 根据贷款的“担保方式：“抵押、质押、组合担保”；（贷款发放金额/期数）>本月应还款”判断，
//	 * 取每笔贷款的本金余额累加后除以36.
//	 * 当为其他贷款品种时(除去个人住房贷和公积金贷)，根据贷款的“担保方式：“抵押、质押”；（贷款发放金额/期数）>本月应还款”判断，
//	 * 取每笔贷款的本金余额累加后除以36.
//	 * 
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int countAllOneDZEXFD(PbocSummary pbocSummary) throws Exception {
//		Set<PbocLoanSummary> listPLSS = pbocSummary.getPbocLoanSummaries();
//		Iterator listPs = (Iterator) listPLSS.iterator();
//		int countMothlyPayMortgage = 0;
//
//		while (listPs.hasNext()) {
//			PbocLoanSummary pbocLoanSummarys = (PbocLoanSummary) listPs.next();
//			if (pbocLoanSummarys.getDescription() != null && !pbocLoanSummarys.getDescription().equals("")) {
//				//解析贷款语句
//				Map<String, String> rm = AnalysisLoan.getLoanTypeOther(pbocLoanSummarys.getDescription());
//				if (rm.size() != 0) {
//					String s = AnalysisLoan.getLoanTypeO(pbocLoanSummarys.getDescription());
//					//个人商用房（含商住两用）贷款时，
//					if (s!=null&&s.equals("个人商用房贷款")) {
//						//担保方式：抵押、质押、组合担保
//						if (rm.get("loanType").toString().equals("质押") || rm.get("loanType").toString().equals("抵押")
//								|| rm.get("loanType").toString().equals("组合")) {
//							if (pbocLoanSummarys.getLoanMoney() != null) {
//								//贷款金额/期数
//								int monthPay = pbocLoanSummarys.getLoanMoney().intValue()
//										/ Integer.parseInt(rm.get("loanDueNum"));
//								if (pbocLoanSummarys.getPlanPayAmt() != null
//										&& !"".equals(pbocLoanSummarys.getPlanPayAmt())) {
//									//贷款金额/期数 > 每月应还额
//									if (monthPay > pbocLoanSummarys.getPlanPayAmt().intValue()) {
//										if (pbocLoanSummarys.getCapitalBalance() != null) {
//											//本金余额累加/36
//											countMothlyPayMortgage = countMothlyPayMortgage
//													+ (pbocLoanSummarys.getCapitalBalance().intValue() / 36);
//										}
//									}
//								}
//
//							}
//						}
//					} else  if (s==null||(!s.equals("个人商用房贷款")&&!s.equals("个人住房贷款")&&!s.equals("个人公积金贷款"))) {
//						if (rm.get("loanType").toString().equals("质押") || rm.get("loanType").toString().equals("抵押")) {
//							if (pbocLoanSummarys.getLoanMoney() != null) {
//								int monthPay = pbocLoanSummarys.getLoanMoney().intValue()
//										/ Integer.parseInt(rm.get("loanDueNum"));
//								if (pbocLoanSummarys.getPlanPayAmt() != null
//										&& !"".equals(pbocLoanSummarys.getPlanPayAmt())) {
//									if (monthPay > pbocLoanSummarys.getPlanPayAmt().intValue()) {
//										if (pbocLoanSummarys.getCapitalBalance() != null) {
//											countMothlyPayMortgage = countMothlyPayMortgage
//													+ (pbocLoanSummarys.getCapitalBalance().intValue() / 36);
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//		return countMothlyPayMortgage;
//
//	}
//	/**
//	 * 
//	 * @param s
//	 * @return
//	 * @throws ParseException
//	 */
//	public Boolean checkLoan(String des) throws ParseException, Exception {
//		String s = AnalysisLoan.getLoanTypeO(des);
//		Boolean test = false;
//		if (s != null) {
//			if (s.equals("个人住房贷款") || s.equals("个人商用房贷款") || s.equals("个人公积金贷款")) {
//				test = true;
//			}
//		}
//		return test;
//
//	}
//	
//	/**
//	 * 
//	 * @param s
//	 * @return
//	 * @throws ParseException
//	 */
//	public Boolean checkLoanNew(String des) throws ParseException, Exception {
//		String s = AnalysisLoan.getLoanTypeO(des);
//		Boolean test = false;
//		if (s != null) {
//			if (s.equals("个人商用房贷款")) {
//				test = true;
//			}
//		}
//		return test;
//
//	}
//
//	/**
//	 * 个人月均负债——一次性到期还本的信用/保证贷款 取本金余额字段
//	 * 
//	 * 根据信贷交易信息明细中的贷款信息部分统计得出，当贷款种类细分为个人住房贷款、
//	 * 个人商用房（含商住两用）贷款、个人公积金贷款时，根据贷款的“担保方式：非抵押、
//	 * 质押、组合担保；（贷款发放金额/期数）＞本月应还款”判断，取每笔贷款的本金余额
//	 * 累加后除以36.当为其他贷款品种时，根据贷款的“担保方式：非抵押、质押；
//	 * （贷款发放金额/期数）＞本月应还款”判断，取每笔贷款的本金余额累加后除以36.
//	 * 
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int countAllOneXB(PbocSummary pbocSummary) throws Exception  {
//		Set<PbocLoanSummary> listPLSS = pbocSummary.getPbocLoanSummaries();
//		Iterator listPs = (Iterator) listPLSS.iterator();
//		int countMothlyPayMortgage = 0;
//		while (listPs.hasNext()) {
//			PbocLoanSummary pbocLoanSummarys = (PbocLoanSummary) listPs.next();
//			if (pbocLoanSummarys.getDescription() != null && !pbocLoanSummarys.getDescription().equals("")) {
//				//解析贷款描述信息
//				Map<String, String> rm = AnalysisLoan.getLoanTypeOther(pbocLoanSummarys.getDescription());
//				if (rm.size() != 0) {
//					//贷款种类细分为个人住房贷款、个人商用房（含商住两用）贷款、个人公积金贷款
//					if (checkLoan(pbocLoanSummarys.getDescription())) {
//						//担保方式：非抵押、质押、组合担保
//						if (!rm.get("loanType").toString().equals("质押") && !rm.get("loanType").toString().equals("抵押")
//								&& !rm.get("loanType").toString().equals("组合")) {
//							if (pbocLoanSummarys.getLoanMoney() != null) {
//								//贷款金额/期数
//								int monthPay = pbocLoanSummarys.getLoanMoney().intValue()
//										/ Integer.parseInt(rm.get("loanDueNum"));
//								if (pbocLoanSummarys.getPlanPayAmt() != null
//										&& !"".equals(pbocLoanSummarys.getPlanPayAmt())) {
//									//贷款金额/期数 > 每月应还额
//									if (monthPay > pbocLoanSummarys.getPlanPayAmt().intValue()) {
//										//本金余额累加/36
//										if (pbocLoanSummarys.getCapitalBalance() != null) {
//											countMothlyPayMortgage = countMothlyPayMortgage
//													+ (pbocLoanSummarys.getCapitalBalance().intValue() / 36);
//										}
//									}
//								}
//							}
//						}
//					} else {
//						if (!rm.get("loanType").toString().equals("质押") && !rm.get("loanType").toString().equals("抵押")) {
//							if (pbocLoanSummarys.getLoanMoney() != null) {
//								int monthPay = pbocLoanSummarys.getLoanMoney().intValue()
//										/ Integer.parseInt(rm.get("loanDueNum"));
//								if (pbocLoanSummarys.getPlanPayAmt() != null
//										&& !"".equals(pbocLoanSummarys.getPlanPayAmt())) {
//									if (monthPay > pbocLoanSummarys.getPlanPayAmt().intValue()) {
//										if (pbocLoanSummarys.getCapitalBalance() != null) {
//											countMothlyPayMortgage = countMothlyPayMortgage
//													+ (pbocLoanSummarys.getCapitalBalance().intValue() / 36);
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//		return countMothlyPayMortgage;
//
//	}
//	/**
//	 * 个人月均负债——一次性到期还本的信用/保证贷款（不含住房、公积金贷款）
//	 * 
//	 * 根据信贷交易信息明细中的贷款信息部分统计得出，当贷款种类为 个人商用房（含商住两用）贷款时，
//	 * 根据贷款的“担保方式：非“抵押、质押、组合担保”；（贷款发放金额/期数）>本月应还款”判断，
//	 * 取每笔贷款的本金余额累加后除以36.
//	 * 当为其他贷款品种时(除去个人住房贷和公积金贷)，根据贷款的“担保方式：非“抵押、质押”；（贷款发放金额/期数）>本月应还款”判断，
//	 * 取每笔贷款的本金余额累加后除以36.
//	 * 
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int countAllOneXBEXFD(PbocSummary pbocSummary) throws Exception  {
//		Set<PbocLoanSummary> listPLSS = pbocSummary.getPbocLoanSummaries();
//		Iterator listPs = (Iterator) listPLSS.iterator();
//		int countMothlyPayMortgage = 0;
//		while (listPs.hasNext()) {
//			PbocLoanSummary pbocLoanSummarys = (PbocLoanSummary) listPs.next();
//			if (pbocLoanSummarys.getDescription() != null && !pbocLoanSummarys.getDescription().equals("")) {
//				//解析贷款描述信息
//				Map<String, String> rm = AnalysisLoan.getLoanTypeOther(pbocLoanSummarys.getDescription());
//				if (rm.size() != 0) {
//					String s = AnalysisLoan.getLoanTypeO(pbocLoanSummarys.getDescription());
//					//个人商用房（含商住两用）贷款时，
//					if (s!=null&&s.equals("个人商用房贷款")) {
//						//担保方式：非抵押、质押、组合担保
//						if (!rm.get("loanType").toString().equals("质押") && !rm.get("loanType").toString().equals("抵押")
//								&& !rm.get("loanType").toString().equals("组合")) {
//							if (pbocLoanSummarys.getLoanMoney() != null) {
//								//贷款金额/期数
//								int monthPay = pbocLoanSummarys.getLoanMoney().intValue()
//										/ Integer.parseInt(rm.get("loanDueNum"));
//								if (pbocLoanSummarys.getPlanPayAmt() != null
//										&& !"".equals(pbocLoanSummarys.getPlanPayAmt())) {
//									//贷款金额/期数 > 每月应还额
//									if (monthPay > pbocLoanSummarys.getPlanPayAmt().intValue()) {
//										//本金余额累加/36
//										if (pbocLoanSummarys.getCapitalBalance() != null) {
//											countMothlyPayMortgage = countMothlyPayMortgage
//													+ (pbocLoanSummarys.getCapitalBalance().intValue() / 36);
//										}
//									}
//								}
//							}
//						}
//					} else if (s==null||(!s.equals("个人商用房贷款")&&!s.equals("个人住房贷款")&&!s.equals("个人公积金贷款"))) {
//						if (!rm.get("loanType").toString().equals("质押") && !rm.get("loanType").toString().equals("抵押")) {
//							if (pbocLoanSummarys.getLoanMoney() != null) {
//								int monthPay = pbocLoanSummarys.getLoanMoney().intValue()
//										/ Integer.parseInt(rm.get("loanDueNum"));
//								if (pbocLoanSummarys.getPlanPayAmt() != null
//										&& !"".equals(pbocLoanSummarys.getPlanPayAmt())) {
//									if (monthPay > pbocLoanSummarys.getPlanPayAmt().intValue()) {
//										if (pbocLoanSummarys.getCapitalBalance() != null) {
//											countMothlyPayMortgage = countMothlyPayMortgage
//													+ (pbocLoanSummarys.getCapitalBalance().intValue() / 36);
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//		return countMothlyPayMortgage;
//
//	}
//
//	/**
//	 * 个人月均负债——分期偿还的抵/质押贷款
//	 * 
//	 * 根据信贷交易信息明细中的贷款信息部分统计得出，当贷款种类细分为个人住房贷款、
//	 * 个人商用房（含商住两用）贷款、个人公积金贷款时，
//	 * 根据贷款的“担保方式：抵押、质押、组合担保；（贷款发放金额/期数）≤本月应还款”判断，
//	 * 取每笔贷款的本月应还款累加.
//	 * 当为其他贷款品种时，根据贷款的“担保方式：抵押、质押；（贷款发放金额/期数）≤本月应还款”判断，
//	 * 取每笔贷款的本月应还款累加.
//	 * 
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int countAllFQDZ(PbocSummary pbocSummary) throws ParseException, Exception {
//		Set<PbocLoanSummary> listPLSS = pbocSummary.getPbocLoanSummaries();
//		Iterator listPs = (Iterator) listPLSS.iterator();
//		int countMothlyPayMortgage = 0;
//
//		while (listPs.hasNext()) {
//			PbocLoanSummary pbocLoanSummarys = (PbocLoanSummary) listPs.next();
//			if (pbocLoanSummarys.getDescription() != null && !pbocLoanSummarys.getDescription().equals("")) {
//				//解析贷款描述信息
//				Map<String, String> rm = AnalysisLoan.getLoanTypeOther(pbocLoanSummarys.getDescription());
//				if (rm.size() != 0) {
//					//贷款种类细分为个人住房贷款、个人商用房（含商住两用）贷款、个人公积金贷款
//					if (checkLoan(pbocLoanSummarys.getDescription())) {
//						//担保方式：抵押、质押、组合担保
//						if (rm.get("loanType").toString().equals("质押") || rm.get("loanType").toString().equals("抵押")
//								|| rm.get("loanType").toString().equals("组合")) {
//							countMothlyPayMortgage = getPlanPayAmtAll(pbocLoanSummarys, countMothlyPayMortgage, rm);
//						}
//					} else {
//						if (rm.get("loanType").toString().equals("质押") || rm.get("loanType").toString().equals("抵押")) {
//							countMothlyPayMortgage = getPlanPayAmtAll(pbocLoanSummarys, countMothlyPayMortgage, rm);
//						}
//					}
//				}
//			}
//		}
//
//		return countMothlyPayMortgage;
//
//	}
//
//	/**
//	 * 个人月均负债——分期偿还的抵/质押贷款（不含住房、公积金贷款）
//	 * 
//	 * 根据信贷交易信息明细中的贷款信息部分统计得出，当贷款种类为 个人商用房（含商住两用）贷款时，
//	 * 根据贷款的“担保方式：抵押、质押、组合担保；（贷款发放金额/期数）≤本月应还款”判断，
//	 * 取每笔贷款的本月应还款累加.
//	 * 当为其他贷款品种时，根据贷款的“担保方式：抵押、质押；（贷款发放金额/期数）≤本月应还款”判断，
//	 * 取每笔贷款的本月应还款累加.
//	 * 
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int countAllFQDZNew(PbocSummary pbocSummary) throws ParseException, Exception {
//		Set<PbocLoanSummary> listPLSS = pbocSummary.getPbocLoanSummaries();
//		Iterator listPs = (Iterator) listPLSS.iterator();
//		int countMothlyPayMortgage = 0;
//
//		while (listPs.hasNext()) {
//			PbocLoanSummary pbocLoanSummarys = (PbocLoanSummary) listPs.next();
//			if (pbocLoanSummarys.getDescription() != null && !pbocLoanSummarys.getDescription().equals("")) {
//				//解析贷款描述信息
//				Map<String, String> rm = AnalysisLoan.getLoanTypeOther(pbocLoanSummarys.getDescription());
//				if (rm.size() != 0) {
//					//贷款种类细分为个人住房贷款、个人商用房（含商住两用）贷款、个人公积金贷款
//					if (checkLoan(pbocLoanSummarys.getDescription())) {
//						//只取个人商用房（含商住两用）贷款
//						if (checkLoanNew(pbocLoanSummarys.getDescription())) {
//							//担保方式：抵押、质押、组合担保
//							if (rm.get("loanType").toString().equals("质押") || rm.get("loanType").toString().equals("抵押")
//									|| rm.get("loanType").toString().equals("组合")) {
//								countMothlyPayMortgage = getPlanPayAmtAll(pbocLoanSummarys, countMothlyPayMortgage, rm);
//							}
//						}
//					} else {
//						if (rm.get("loanType").toString().equals("质押") || rm.get("loanType").toString().equals("抵押")) {
//							countMothlyPayMortgage = getPlanPayAmtAll(pbocLoanSummarys, countMothlyPayMortgage, rm);
//						}
//					}
//				}
//			}
//		}
//
//		return countMothlyPayMortgage;
//
//	}
//	
//	/**
//	 * 获得贷款每月应还款额的累加
//	 * @param pbocLoanSummarys 贷款信息
//	 * @param countMothlyPayMortgage 每月应还款额累加
//	 * @param rm 解析贷款描述信息map
//	 * @return
//	 */
//	private int getPlanPayAmtAll(PbocLoanSummary pbocLoanSummarys, int countMothlyPayMortgage, Map<String, String> rm){
//		if (pbocLoanSummarys.getLoanMoney() != null) {
//			int monthPay = pbocLoanSummarys.getLoanMoney().intValue()
//					/ Integer.parseInt(rm.get("loanDueNum"));
//			if (pbocLoanSummarys.getPlanPayAmt() != null
//					&& !"".equals(pbocLoanSummarys.getPlanPayAmt())) {
//				//贷款金额/期数 <= 每月应还额
//				if (monthPay <= pbocLoanSummarys.getPlanPayAmt().intValue()) {
//					if (pbocLoanSummarys.getPlanPayAmt() != null) {
//						//本月应还款累加
//						countMothlyPayMortgage += pbocLoanSummarys.getPlanPayAmt().intValue();
//					}
//				}
//			}
//		}
//		
//		return countMothlyPayMortgage;
//	}
//	/**
//	 * 个人月均负债——分期偿还的信用/保证贷款
//	 * 根据信贷交易信息明细中的贷款信息部分统计得出，
//	 * 当贷款种类细分为个人住房贷款、 个人商用房（含商住两用）贷款、个人公积金贷款时， 
//	 * 根据贷款的“担保方式：非抵押、质押、组合担保；（贷款发放金额/期数）≤本月应还款”判断，
//	 * 取每笔贷款的每月应还款额累加.
//	 * 当为其他贷款品种时，根据贷款的“担保方式：非抵押、质押；（贷款发放金额/期数）≤本月应还款”判断，
//	 * 取每笔贷款的每月应还款额累加.
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int countAllFQXB(PbocSummary pbocSummary) throws ParseException, Exception {
//		Set<PbocLoanSummary> listPLSS = pbocSummary.getPbocLoanSummaries();
//		Iterator listPs = (Iterator) listPLSS.iterator();
//		int countMothlyPayMortgage = 0;
//		while (listPs.hasNext()) {
//			PbocLoanSummary pbocLoanSummarys = (PbocLoanSummary) listPs.next();
//			if (pbocLoanSummarys.getDescription() != null && !pbocLoanSummarys.getDescription().equals("")) {
//				Map<String, String> rm = AnalysisLoan.getLoanTypeOther(pbocLoanSummarys.getDescription());
//				if (rm.size() != 0) {
//					//贷款种类细分为个人住房贷款、个人商用房（含商住两用）贷款、个人公积金贷款
//					if (checkLoan(pbocLoanSummarys.getDescription())) {
//						if (!rm.get("loanType").toString().equals("质押") && !rm.get("loanType").toString().equals("抵押")
//								&& !rm.get("loanType").toString().equals("组合")) {
//							if (pbocLoanSummarys.getLoanMoney() != null) {
//								//贷款金额/期数
//								int monthPay = pbocLoanSummarys.getLoanMoney().intValue()
//										/ Integer.parseInt(rm.get("loanDueNum"));
//								if (pbocLoanSummarys.getPlanPayAmt() != null
//										&& !"".equals(pbocLoanSummarys.getPlanPayAmt())) {
//									//贷款金额/期数 <= 每月应还额
//									if (monthPay <= pbocLoanSummarys.getPlanPayAmt().intValue()) {
//										if (pbocLoanSummarys.getPlanPayAmt() != null) {
//											//每月应还款额累加
//											countMothlyPayMortgage = countMothlyPayMortgage
//													+ pbocLoanSummarys.getPlanPayAmt().intValue();
//										}
//									}
//								}
//							}
//						}
//					} else {
//						if (!rm.get("loanType").toString().equals("质押") && !rm.get("loanType").toString().equals("抵押")) {
//							if (pbocLoanSummarys.getLoanMoney() != null) {
//								int monthPay = pbocLoanSummarys.getLoanMoney().intValue()
//										/ Integer.parseInt(rm.get("loanDueNum"));
//								if (pbocLoanSummarys.getPlanPayAmt() != null
//										&& !"".equals(pbocLoanSummarys.getPlanPayAmt())) {
//									if (monthPay <= pbocLoanSummarys.getPlanPayAmt().intValue()) {
//										if (pbocLoanSummarys.getPlanPayAmt() != null) {
//											//每月应还款额累加
//											countMothlyPayMortgage = countMothlyPayMortgage
//													+ pbocLoanSummarys.getPlanPayAmt().intValue();
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//		return countMothlyPayMortgage;
//
//	}
//	/**
//	 * 个人月均负债——分期偿还的信用/保证贷款（不含住房、公积金贷款）
//	 * 根据信贷交易信息明细中的贷款信息部分统计得出，
//	 * 当贷款种类为 个人商用房（含商住两用）贷款时，
//	 * 根据贷款的“担保方式：非“抵押、质押、组合担保”；（贷款发放金额/期数）≤本月应还款”判断，
//	 * 取每笔贷款的本月应还款累加.
//	 * 当为其他贷款品种时(除去个人住房贷和公积金贷)，根据贷款的“担保方式：非“抵押、质押”；（贷款发放金额/期数）≤本月应还款”判断，
//	 * 取每笔贷款的本月应还款累加.
//	 * 
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int countAllFQXBEXFD(PbocSummary pbocSummary) throws ParseException, Exception {
//		Set<PbocLoanSummary> listPLSS = pbocSummary.getPbocLoanSummaries();
//		Iterator listPs = (Iterator) listPLSS.iterator();
//		int countMothlyPayMortgage = 0;
//		while (listPs.hasNext()) {
//			PbocLoanSummary pbocLoanSummarys = (PbocLoanSummary) listPs.next();
//			if (pbocLoanSummarys.getDescription() != null && !pbocLoanSummarys.getDescription().equals("")) {
//				Map<String, String> rm = AnalysisLoan.getLoanTypeOther(pbocLoanSummarys.getDescription());
//				if (rm.size() != 0) {
//					String s = AnalysisLoan.getLoanTypeO(pbocLoanSummarys.getDescription());
//					//个人商用房（含商住两用）贷款时，
//					if (s!=null&&s.equals("个人商用房贷款")) {
//					//if (checkLoan(pbocLoanSummarys.getDescription())) {
//						if (!rm.get("loanType").toString().equals("质押") && !rm.get("loanType").toString().equals("抵押")
//								&& !rm.get("loanType").toString().equals("组合")) {
//							if (pbocLoanSummarys.getLoanMoney() != null) {
//								//贷款金额/期数
//								int monthPay = pbocLoanSummarys.getLoanMoney().intValue()
//										/ Integer.parseInt(rm.get("loanDueNum"));
//								if (pbocLoanSummarys.getPlanPayAmt() != null
//										&& !"".equals(pbocLoanSummarys.getPlanPayAmt())) {
//									//贷款金额/期数 <= 每月应还额
//									if (monthPay <= pbocLoanSummarys.getPlanPayAmt().intValue()) {
//										if (pbocLoanSummarys.getPlanPayAmt() != null) {
//											//每月应还款额累加
//											countMothlyPayMortgage = countMothlyPayMortgage
//													+ pbocLoanSummarys.getPlanPayAmt().intValue();
//										}
//									}
//								}
//							}
//						}
//					} else if (s==null||(!s.equals("个人商用房贷款")&&!s.equals("个人住房贷款")&&!s.equals("个人公积金贷款"))) {
//						if (!rm.get("loanType").toString().equals("质押") && !rm.get("loanType").toString().equals("抵押")) {
//							if (pbocLoanSummarys.getLoanMoney() != null) {
//								int monthPay = pbocLoanSummarys.getLoanMoney().intValue()
//										/ Integer.parseInt(rm.get("loanDueNum"));
//								if (pbocLoanSummarys.getPlanPayAmt() != null
//										&& !"".equals(pbocLoanSummarys.getPlanPayAmt())) {
//									if (monthPay <= pbocLoanSummarys.getPlanPayAmt().intValue()) {
//										if (pbocLoanSummarys.getPlanPayAmt() != null) {
//											//每月应还款额累加
//											countMothlyPayMortgage = countMothlyPayMortgage
//													+ pbocLoanSummarys.getPlanPayAmt().intValue();
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//			}
//		}
//		return countMothlyPayMortgage;
//
//	}
//
//	/**
//	 * 个人月均负债——信用卡（准贷记卡）透支
//	 * 
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public int countAllTZ(PbocSummary pbocSummary) {
//		int otherData = 0;
//		int otherDatas = 0;
//		// 1.存量债务中信用卡（准贷记卡）透支，按未偿还额的信用卡（准贷记卡）透支额×10%计算。PBOC_SLD_SUMMARY
//		// 长度为0时为呆账或结清
//		// 本字段取征信报告中未销户贷记卡汇总信息的已用额度字段和未销户准贷记卡的透支余额字段。
//		// PBOC_UNCANCEL_LC_SUMMARY PBOC_UNCANCEL_SLC_SUMMARY
//		Set<PbocUncancelLcSummary> listPUL = pbocSummary.getPbocUncancelLcSummaries();
//		Iterator listpul = (Iterator) listPUL.iterator();
//		while (listpul.hasNext()) {
//			PbocUncancelLcSummary pbocUncancelLcSummary = (PbocUncancelLcSummary) listpul.next();
//			if (pbocUncancelLcSummary.getUsedAmt() != null) {
//				otherData = otherData + (int) (pbocUncancelLcSummary.getUsedAmt().intValue() * (0.1));
//			}
//		}
//		Set<PbocUncancelSlcSummary> listPUS = pbocSummary.getPbocUncancelSlcSummaries();
//		Iterator listpus = (Iterator) listPUS.iterator();
//		while (listpus.hasNext()) {
//			PbocUncancelSlcSummary pbocUncancelSlcSummary = (PbocUncancelSlcSummary) listpus.next();
//			if (pbocUncancelSlcSummary.getOverdraft() != null) {
//				otherDatas = otherDatas + (int) (pbocUncancelSlcSummary.getOverdraft().intValue() * (0.1));
//			}
//		}
//
//		return otherData + otherDatas;
//
//	}
//
//	/**
//	 * 个人月均负债——对外担保
//	 * 
//	 * 个人对外担保余额/36月推算贷款的月或有的还款额（有明确担保期限的，按担保期限计算）
//	 * 
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int countAllDWDB(PbocSummary pbocSummary) {
//		Set<PbocGuaranteeSummary> listPLSS = pbocSummary.getPbocGuaranteeSummaries();
//		Iterator listPs = (Iterator) listPLSS.iterator();
//		int countMothlyPayMortgage = 0;
//		try {
//			while (listPs.hasNext()) {
//				PbocGuaranteeSummary pbocGuaranteeSummary = (PbocGuaranteeSummary) listPs.next();
//				Set<PbocGuaranteeDetail> ds = pbocGuaranteeSummary.getPbocGuaranteeDetails();
//				Iterator s = (Iterator) ds.iterator();
//				while (listPs.hasNext()) {
//					PbocGuaranteeDetail pbocGuaranteeDetail = (PbocGuaranteeDetail) s.next();
//					//担保贷款发放日期
//					if (pbocGuaranteeDetail.getGlIssueDate() != null
//							&& !pbocGuaranteeDetail.getGlIssueDate().equals("")) {
//						//担保贷款到期日期
//						if (pbocGuaranteeDetail.getGlExpireDate() != null
//								&& !pbocGuaranteeDetail.getGlExpireDate().equals("")) {
//							//担保期限
//							int moths = DateUtil.getMonths(pbocGuaranteeDetail.getGlIssueDate(),
//								pbocGuaranteeDetail.getGlExpireDate());
//							//个人月均负债——对外担保按：“担保贷款本金余额/担保期限”计算
//							countMothlyPayMortgage = countMothlyPayMortgage
//									+ (pbocGuaranteeDetail.getGlBalance().intValue() / moths);
//						} else {
//							//个人月均负债——对外担保按：“担保贷款本金余额/36”计算
//							countMothlyPayMortgage = countMothlyPayMortgage
//									+ (pbocGuaranteeDetail.getGlBalance().intValue() / 36);
//						}
//					} else {
//						countMothlyPayMortgage = countMothlyPayMortgage
//								+ (pbocGuaranteeDetail.getGlBalance().intValue() / 36);
//					}
//
//				}
//			}
//		} catch (Exception e) {
//			countMothlyPayMortgage = 0;
//		}
//		return countMothlyPayMortgage;
//	}
//
//	/**
//	 * 当前分期类贷款月度偿还金额不定期归还贷款月均余额
//	 * 
//	 * 不定期归还贷款月均余额：
//	 * 担保方式为抵押、质押的，该笔贷款不计入月债务支出，
//	 * 其他担保方式的，按照征信报告上的贷款金额/36个月计算贷款的月负债还款额（有明确期限的，按期限计算）。
//	 * 
//	 */
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public int[] countDKMB(PbocSummary pbocSummary) throws ParseException, Exception {
//		Set<PbocLoanSummary> listPLSS = pbocSummary.getPbocLoanSummaries();
//		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//		Iterator listPs = (Iterator) listPLSS.iterator();
//		int countMothlyOnS = 0;//按季
//		int countMothlyOnM = 0;//按月
//		int countYE = 0;//不定期
//		while (listPs.hasNext()) {
//			PbocLoanSummary pbocLoanSummarys = (PbocLoanSummary) listPs.next();
//			Map<String, String> rm = AnalysisLoan.getLoanTypeOther(pbocLoanSummarys.getDescription());
//			// 长度为0时为呆账或结清
//			if (rm.size() != 0) {
//				if (StringUtil.isNotEmpty(rm.get("rePayType")) && rm.get("rePayType").equals("不定期归还")) {
//					if (!rm.get("loanType").toString().equals("质押") && !rm.get("loanType").toString().equals("抵押")){
//						// 不定期归还贷款月均余额
//						if (StringUtil.isNotEmpty(rm.get("loanDueDate"))) {
//							int months = DateUtil.getMonths(new Date(), df.parse(rm.get("loanDueDate").toString()));
//							if (pbocLoanSummarys.getCapitalBalance() != null&&months!=0) {
//								countYE = countYE + (pbocLoanSummarys.getCapitalBalance().intValue() / months);
//							}
//						}else{
//							if (pbocLoanSummarys.getCapitalBalance() != null) {
//								countYE = countYE + (pbocLoanSummarys.getCapitalBalance().intValue() / 36);
//							}
//						}
//					}
//					
//				} else {// 当前分期类贷款月度偿还金额
//					//分期类贷款为按季归还
//					if (StringUtil.isNotEmpty(rm.get("rePayType")) && rm.get("rePayType").equals("按季归还")) {
//						// 本月为初次发放约或非按季的还款月，本月应还款金额为0时
//						if (pbocLoanSummarys.getPlanPayAmt() != null) {
//							if (pbocLoanSummarys.getPlanPayAmt().intValue() == 0
//									&& pbocLoanSummarys.getCapitalBalance() != null&&pbocLoanSummarys.getPayTerm()!=null&&pbocLoanSummarys.getPayTerm().intValue()!=0) {
//								// 本月应还款金额按：本金余额/(剩余还款期数*3) 计算
//								countMothlyOnS = countMothlyOnS
//										+ pbocLoanSummarys.getCapitalBalance().intValue()
//										/ (pbocLoanSummarys.getPayTerm().intValue() * 3);
//							} else {
//								// 本月应还款金额不为0时，本月应还款金额按：本月应还款/3 计算
//								countMothlyOnS = countMothlyOnS
//										+ (pbocLoanSummarys.getPlanPayAmt().intValue() / 3);
//							}
//						}
//					}
//					// 分期类贷款为按月归还
//					if (StringUtil.isNotEmpty(rm.get("rePayType")) && rm.get("rePayType").equals("按月归还")) {
//						// 本月时初次发放月，本月应还款金额为0时
//						if (pbocLoanSummarys.getPlanPayAmt() != null) {
//							if (pbocLoanSummarys.getPlanPayAmt().intValue() == 0
//									&& pbocLoanSummarys.getCapitalBalance() != null&&pbocLoanSummarys.getPayTerm()!=null&&pbocLoanSummarys.getPayTerm().intValue()!=0) {
//								// 本月应还款金额按：本金余额/剩余还款期数 计算
//								countMothlyOnM = countMothlyOnM
//										+ pbocLoanSummarys.getCapitalBalance().intValue()
//										/ pbocLoanSummarys.getPayTerm().intValue();
//							} else {
//								// 本月应还款金额不为0时，本月应还款金额就取“本月应还款金额”
//								countMothlyOnM = countMothlyOnM
//										+ pbocLoanSummarys.getPlanPayAmt().intValue();
//							}
//						}
//					}
////					if (pbocLoanSummarys.getLoanMoney() != null&&Integer.parseInt(rm.get("loanDueNum"))!=0) {
////						int monthPay = pbocLoanSummarys.getLoanMoney().intValue()
////								/ Integer.parseInt(rm.get("loanDueNum"));
////						if (pbocLoanSummarys.getPlanPayAmt() != null && !"".equals(pbocLoanSummarys.getPlanPayAmt())) {
////							if (monthPay <= pbocLoanSummarys.getPlanPayAmt().intValue()) {
////								if (pbocLoanSummarys.getPlanPayAmt() != null) {
////									countMothlyPayMortgage = countMothlyPayMortgage
////											+ pbocLoanSummarys.getPlanPayAmt().intValue();
////								}
////							}
////						}
////					}
//				}
//			}
//		}
//
//		int[] str = new int[3];
//		
//		str[0] = countMothlyOnS;//按季
//		str[1] = countMothlyOnM;//按月
//		str[2] = countYE;//不定期
//		
//		return str;
//
//	}
//
//	/**
//	 * 信用卡最近6个月平均使用额度 （不包括准贷记卡）
//	 * @param pbocSummary
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public double countDJKZDB(PbocSummary pbocSummary) throws ParseException, Exception {
//		//贷记卡
//		Set<PbocLoancardSummary> listPLSS = pbocSummary.getPbocLoancardSummaries();
//		Iterator<PbocLoancardSummary> listPs = listPLSS.iterator();
//		double countMothlyPayMortgage = 0;
//		while (listPs.hasNext()) {
//			PbocLoancardSummary pbocLoancardSummary = listPs.next();
//			try {
//				if (pbocLoancardSummary.getAvgAmtM6() != null) {
//					countMothlyPayMortgage = countMothlyPayMortgage + pbocLoancardSummary.getAvgAmtM6().floatValue()*0.1;
//				}
//			} catch (Exception e) {
//				countMothlyPayMortgage = 0;
//			}
//		}
//		return countMothlyPayMortgage;
//
//	}
//
//	/**
//	 * 根据传入的值传出
//	 * 
//	 * @param num
//	 * @return
//	 */
//	public int intValue(int num) {
//		if (num == 18) {
//			return 5;
//		}
//		if (num == 12) {
//			return 11;
//		}
//		if (num == 0) {
//			return 23;
//		}
//		return 0;
//	}
//
//	/**
//	 * 求num逾期记录
//	 * 
//	 * @return
//	 * @throws ParseException
//	 * @throws NumberFormatException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public BigDecimal[] count(PbocSummary pboc, int num) throws NumberFormatException, ParseException, Exception {
//		
//		String custM = DateUtil.getMonths(0);
//		BigDecimal[] L6M = new BigDecimal[3];
//		int count6md = 0;// 贷款逾期次数
//		int count6mzcd = 0;// 准贷记卡
//		int count6mcd = 0;// 贷记卡
//		try {
//			Set<PbocLoanSummary> listPLsSs = pboc.getPbocLoanSummaries();
//			Iterator listPss = (Iterator) listPLsSs.iterator();
//			while (listPss.hasNext()) {
//				PbocLoanSummary pbocLoanSummaryss = (PbocLoanSummary) listPss.next();
//				if (pbocLoanSummaryss.getLoanStatus() != null && !pbocLoanSummaryss.getLoanStatus().equals("")) {
//					if (pbocLoanSummaryss.getLoanStatus().equals(LoanStatus.DZ.getValue()/*"3"*/)) {// 呆账
//						count6md = 99;// 逾期最高值
//						break;
//					}
//				}
//
//			}
//			// 如果当前贷记卡、准贷记卡、贷款状态为销户、结清或转出的，
//			// 则根据贷款转出日、结清日和贷记卡、准贷记卡的销户日向前推6/12/24个月，
//			// 其中“累计逾期次数”取明细中“逾期记录”表中发生逾期的月份数累加，
//			// “最高逾期期数”取明细中“逾期记录”表中的“逾期持续月数”的最大值。
//			if (count6md != 99) {
//				Iterator listPss2 = (Iterator) listPLsSs.iterator();
//				while (listPss2.hasNext()) {
//					PbocLoanSummary pbocLoanSummaryss = (PbocLoanSummary) listPss2.next();
//					if (StringUtil.isNotEmpty(pbocLoanSummaryss.getLoanStatus())) {
//						if (pbocLoanSummaryss.getLoanStatus().equals(LoanStatus.JQ.getValue()/*"2"*/)// 结清
//								|| pbocLoanSummaryss.getLoanStatus().equals(LoanStatus.CC.getValue()/*"4"*/)) {// 转出
//							// String day = AnalysisLoan.getDay(pbocLoanSummaryss.getDescription());
//							Set<PbocLoanDetail> pd = pbocLoanSummaryss.getPbocLoanDetail();
//							Iterator listPd = (Iterator) pd.iterator();
//							while (listPd.hasNext()) {
//								PbocLoanDetail pbocLoanDetail = (PbocLoanDetail) listPd.next();
//								if (custM != null) {
//									String months = DateUtil.getMonths(intValue(num), custM);
//									if (StringUtil.isNotEmpty(pbocLoanDetail.getOverdueMth())) {
//										int odmonth = Integer.parseInt(pbocLoanDetail.getOverdueMth().replace(".", ""));
//										if (odmonth >= Integer.parseInt(months)) {
//											if (odmonth <= Integer.parseInt(custM)) {
//												count6md = count6md + 1;
//											}
//										}
//									}
//								}
//
//							}
//						} else if (pbocLoanSummaryss.getPaymentStatusM24() != null
//								&& !pbocLoanSummaryss.getPaymentStatusM24().equals("")) {
//							count6md = count6md + countN(num, pbocLoanSummaryss.getPaymentStatusM24(), null);
//						}
//					}
//				}
//			}
//
//			// 准贷记卡
//
//			Set<PbocSldSummary> psb = pboc.getPbocSldSummaries();
//			Iterator psListb = (Iterator) psb.iterator();
//			while (psListb.hasNext()) {
//				PbocSldSummary pss = (PbocSldSummary) psListb.next();
//				if (pss.getCcStatus() != null && !pss.getCcStatus().equals("")) {
//					if (pss.getCcStatus().equals(CardStatus.DZ.getValue()/*"4"*/)) {// 呆账
//						count6mzcd = 99;
//						break;
//					}
//				}
//			}
//			if (count6mzcd != 99) {
//				Iterator psListb2 = (Iterator) psb.iterator();
//				while (psListb2.hasNext()) {
//					PbocSldSummary pss = (PbocSldSummary) psListb2.next();
//					// String day = AnalysisLoan.getDay(pss.getDescription());
//					if (StringUtil.isNotEmpty(pss.getCcStatus())) {
//						if (pss.getCcStatus().equals(CardStatus.XH.getValue()/*"0"*/)) {// 销户
//							Set<PbocSldDetail> psd = pss.getPbocSldDetail();
//							Iterator listPsd = (Iterator) psd.iterator();
//							while (listPsd.hasNext()) {
//								PbocSldDetail pl = (PbocSldDetail) listPsd.next();
//								if (custM != null) {
//									String months = DateUtil.getMonths(intValue(num), custM);
//									if (StringUtil.isNotEmpty(pl.getOdMth())) {
//										int odMonth = Integer.parseInt(pl.getOdMth().replace(".", ""));
//										if (odMonth >= Integer.parseInt(months)) {
//											if (odMonth <= Integer.parseInt(custM)) {
//												count6mzcd = count6mzcd + 1;
//											}
//										}
//									}
//								}
//							}
//						} else if (pss.getPaymentStatusM24() != null && !pss.getPaymentStatusM24().equals("")) {
//							count6mzcd = count6mzcd + countN(num, pss.getPaymentStatusM24(), BusinessType.ZDJK);
//						}
//					}
//				}
//			}
//			// 贷记卡
//
//			Set<PbocLoancardSummary> plsv = pboc.getPbocLoancardSummaries();
//			Iterator listlsv = (Iterator) plsv.iterator();
//			while (listlsv.hasNext()) {
//				PbocLoancardSummary psd = (PbocLoancardSummary) listlsv.next();
//				if (psd.getCcStatus() != null && !psd.getCcStatus().equals("")) {
//					if (psd.getCcStatus().equals(CardStatus.DZ.getValue()/*"4"*/)) {// 呆账
//						count6mcd = 99;
//						break;
//					}
//				}
//			}
//
//			if (count6mcd != 99) {
//				Iterator listlsv2 = (Iterator) plsv.iterator();
//				while (listlsv2.hasNext()) {
//					PbocLoancardSummary psd = (PbocLoancardSummary) listlsv2.next();
//					// String day = AnalysisLoan.getDay(psd.getDescription());
//					if (StringUtil.isNotEmpty(psd.getCcStatus())) {
//						if (psd.getCcStatus().equals(CardStatus.XH.getValue()/*"0"*/)) {// 销户
//							Set<PbocLoancardDetail> pld = psd.getPbocLoancardDetail();
//							Iterator listPsd = (Iterator) pld.iterator();
//							while (listPsd.hasNext()) {
//								PbocLoancardDetail pl = (PbocLoancardDetail) listPsd.next();
//								if (custM != null) {
//									String months = DateUtil.getMonths(intValue(num), custM);
//									if (StringUtil.isNotEmpty(pl.getOverdueMth())) {
//										int odMonth = Integer.parseInt((pl.getOverdueMth() + "").replace(".", ""));
//										if (odMonth >= Integer.parseInt(months)) {
//											if (odMonth <= Integer.parseInt(custM)) {
//												count6mcd = count6mcd + 1;
//											}
//										}
//									}
//								}
//							}
//						} else if (psd.getPaymentStatusM24() != null && !psd.getPaymentStatusM24().equals("")) {
//							count6mcd = count6mcd + countN(num, psd.getPaymentStatusM24(), null);
//						}
//					}
//				}
//			}
//		} catch (Exception e) {
//			L6M[0] = new BigDecimal("-1");
//			L6M[1] = new BigDecimal("-1");
//			L6M[2] = new BigDecimal("-1");
//			return L6M;
//		}
//
//		L6M[0] = new BigDecimal(count6md);
//		L6M[1] = new BigDecimal(count6mcd);
//		L6M[2] = new BigDecimal(count6mzcd);
//		return L6M;
//	}
//
//	/**
//	 * 信用卡总额度使用率 (包括贷记卡和准贷记卡)
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public float countDJKS(PbocSummary pboc) {
//		
//		//贷记卡
//		Set<PbocLoancardSummary> plsv = pboc.getPbocLoancardSummaries();
//		Iterator<PbocLoancardSummary> listlsv = plsv.iterator();
//		float countAll = 0;
//		float count = 0;
//		while (listlsv.hasNext()) {
//			PbocLoancardSummary psd = listlsv.next();
//			if (StringUtil.isNotEmpty(psd.getCcStatus())&& psd.getCcStatus().equals(CardStatus.ZC.getValue()/*"1"*/)) {//正常
//				if (psd.getUseAmt() != null) {
//					count = count + psd.getUseAmt().intValue();
//				}
//				if (psd.getShareAmt() != null) {
//					countAll = countAll + psd.getShareAmt().intValue();
//				}
//			}
//		}
//		//准贷记卡
//		Set<PbocSldSummary> plss = pboc.getPbocSldSummaries();
//		Iterator<PbocSldSummary> listlss = plss.iterator();
//		while (listlss.hasNext()) {
//			PbocSldSummary pss = listlss.next();
//			if (StringUtil.isNotEmpty(pss.getCcStatus()) && pss.getCcStatus().equals(CardStatus.ZC.getValue()/*"1"*/)) {//正常
//				if (pss.getOdAmt() != null) {
//					count = count + pss.getOdAmt().intValue();
//				}
//				if (pss.getShareAmt() != null) {
//					countAll = countAll + pss.getShareAmt().intValue();
//				}
//			}
//		}
//		if (countAll == 0) {
//			countAll = 1;
//			float counts = (float) (count / countAll) * 100;
//			return counts;
//		} else {
//			float counts = (float) (count / countAll) * 100;
//			return counts;
//		}
//
//	}
//
//	/**
//	 * 求最高逾期期数
//	 * 
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public BigDecimal[] countH(PbocSummary pboc, int num) throws ParseException, Exception {
//		
//		String custM = DateUtil.getMonths(0);
//		int high6md = 0;
//		int maxmonth6md = 0;
//		try {
//			Set<PbocLoanSummary> listPLsSs = pboc.getPbocLoanSummaries();
//			Iterator listPss = (Iterator) listPLsSs.iterator();
//			while (listPss.hasNext()) {
//				PbocLoanSummary pbocLoanSummaryss = (PbocLoanSummary) listPss.next();
//				if (pbocLoanSummaryss.getLoanStatus() != null && !pbocLoanSummaryss.getLoanStatus().equals("")) {
//					//贷款状态为呆账
//					if (pbocLoanSummaryss.getLoanStatus().equals(LoanStatus.DZ.getValue())) {
//						high6md = 99;
//						break;
//					}
//				}
//
//			}
//		} catch (Exception e) {
//			high6md = -1;
//		}
//		if (high6md != 99) {
//			Set<PbocLoanSummary> listPLsSs = pboc.getPbocLoanSummaries();
//			Iterator listPss = (Iterator) listPLsSs.iterator();
//			try {
//				while (listPss.hasNext()) {
//					PbocLoanSummary pbocLoanSummaryss = (PbocLoanSummary) listPss.next();
//					if (StringUtil.isNotEmpty(pbocLoanSummaryss.getLoanStatus())) {
//						//贷款状态为结清、转出
//						if (pbocLoanSummaryss.getLoanStatus().equals(LoanStatus.JQ.getValue())/*equals("2")*/
//								|| pbocLoanSummaryss.getLoanStatus().equals(LoanStatus.CC.getValue())) {
//							// String day = AnalysisLoan.getDay(pbocLoanSummaryss.getDescription());
//							Set<PbocLoanDetail> pd = pbocLoanSummaryss.getPbocLoanDetail();
//							Iterator listPd = (Iterator) pd.iterator();
//							while (listPd.hasNext()) {
//								PbocLoanDetail pbocLoanDetail = (PbocLoanDetail) listPd.next();
//								if (custM != null) {
//									String months = DateUtil.getMonths(intValue(num), custM);
//									if (StringUtil.isNotEmpty(pbocLoanDetail.getOverdueMth())) {//逾期月份
//										int odmonth = Integer.parseInt((pbocLoanDetail.getOverdueMth())
//												.replace(".", ""));//逾期月份
//										if (odmonth >= Integer.parseInt(months)) {
//											if (odmonth <= Integer.parseInt(custM)) {
//												if (pbocLoanDetail.getOverdueMthMax() != null) {//逾期持续月数
//													if (pbocLoanDetail.getOverdueMthMax().intValue() > maxmonth6md) {
//														maxmonth6md = pbocLoanDetail.getOverdueMthMax().intValue();
//													}
//												}
//											}
//										}
//									}
//								}
//
//							}
//						} else if (pbocLoanSummaryss.getPaymentStatusM24() != null
//								&& !pbocLoanSummaryss.getPaymentStatusM24().equals("")) {
//							if (countNh(num, pbocLoanSummaryss.getPaymentStatusM24(), null) > high6md) {
//								high6md = countNh(num, pbocLoanSummaryss.getPaymentStatusM24(), null);
//							}
//						}
//					}
//				}
//			} catch (Exception e) {
//				high6md = -1;
//			}
//		}
//
//		// 准贷记卡
//		int high6mzcd = 0;
//		int maxmonth6mzcd = 0;
//		try {
//			Set<PbocSldSummary> psb = pboc.getPbocSldSummaries();
//			Iterator psListb = (Iterator) psb.iterator();
//			while (psListb.hasNext()) {
//				PbocSldSummary pss = (PbocSldSummary) psListb.next();
//				if (pss.getCcStatus() != null && !pss.getCcStatus().equals("")) {
//					if (pss.getCcStatus().equals(CardStatus.DZ.getValue()/*"4"*/)) {//呆账
//						high6mzcd = 99;
//						break;
//					}
//				}
//
//			}
//		} catch (Exception e) {
//			high6mzcd = -1;
//		}
//		if (high6mzcd != 99) {
//			try {
//				Set<PbocSldSummary> psb = pboc.getPbocSldSummaries();
//				Iterator psListb = (Iterator) psb.iterator();
//				while (psListb.hasNext()) {
//					PbocSldSummary pss = (PbocSldSummary) psListb.next();
//					// String day = AnalysisLoan.getDay(pss.getDescription());
//					if (StringUtil.isNotEmpty(pss.getCcStatus())) {
//						if (pss.getCcStatus().equals(CardStatus.XH.getValue()/*"0"*/)) {//销户
//							Set<PbocSldDetail> psd = pss.getPbocSldDetail();
//							Iterator listPsd = (Iterator) psd.iterator();
//							while (listPsd.hasNext()) {
//								PbocSldDetail pl = (PbocSldDetail) listPsd.next();
//								if (custM != null) {
//									String months = DateUtil.getMonths(intValue(num), custM);
//									if (StringUtil.isNotEmpty(pl.getOdMth())) {
//										int odMonth = Integer.parseInt(pl.getOdMth().replace(".", ""));
//										if (odMonth >= Integer.parseInt(months)) {
//											if (odMonth <= Integer.parseInt(custM)) {
//												if (pl.getOdMthMax() != null) {
//													if (pl.getOdMthMax().intValue() > maxmonth6mzcd) {
//														maxmonth6mzcd = pl.getOdMthMax().intValue();
//													}
//												}
//											}
//										}
//									}
//								}
//							}
//						} else if (pss.getPaymentStatusM24() != null && !pss.getPaymentStatusM24().equals("")) {
//							if (countNh(num, pss.getPaymentStatusM24(), BusinessType.ZDJK) > high6mzcd) {
//								high6mzcd = countNh(num, pss.getPaymentStatusM24(), BusinessType.ZDJK);
//							}
//						}
//					}
//				}
//			} catch (Exception e) {
//				high6mzcd = -1;
//			}
//		}
//
//		// 贷记卡
//		int high6mcd = 0;
//		int maxmonth6mcd = 0;
//		try {
//			Set<PbocLoancardSummary> plsv = pboc.getPbocLoancardSummaries();
//			Iterator listlsv = (Iterator) plsv.iterator();
//			while (listlsv.hasNext()) {
//				PbocLoancardSummary psd = (PbocLoancardSummary) listlsv.next();
//				if (psd.getCcStatus() != null && !psd.getCcStatus().equals("")) {
//					if (psd.getCcStatus().equals(CardStatus.DZ.getValue()/*"4"*/)) {//呆账
//						high6mcd = 99;
//						break;
//					}
//				}
//			}
//		} catch (Exception e) {
//			high6mcd = -1;
//		}
//		if (high6mcd != 99) {
//			try {
//				Set<PbocLoancardSummary> plsv = pboc.getPbocLoancardSummaries();
//				Iterator listlsv = (Iterator) plsv.iterator();
//				while (listlsv.hasNext()) {
//					PbocLoancardSummary psd = (PbocLoancardSummary) listlsv.next();
//					// String day = AnalysisLoan.getDay(psd.getDescription());
//					if (StringUtil.isNotEmpty(psd.getCcStatus())) {
//						if (psd.getCcStatus().equals(CardStatus.XH.getValue())) {
//							Set<PbocLoancardDetail> pld = psd.getPbocLoancardDetail();
//							Iterator listPsd = (Iterator) pld.iterator();
//							while (listPsd.hasNext()) {
//								PbocLoancardDetail pl = (PbocLoancardDetail) listPsd.next();
//								if (custM != null) {
//									String months = DateUtil.getMonths(intValue(num), custM);
//									if (StringUtil.isNotEmpty(pl.getOverdueMth())) {
//										int odMonth = Integer.parseInt(pl.getOverdueMth().replace(".", ""));
//										if (odMonth >= Integer.parseInt(months)) {
//											if (odMonth <= Integer.parseInt(custM)) {
//												if (pl.getOverdueMthMax() != null) {
//													if (pl.getOverdueMthMax().intValue() > maxmonth6mcd) {
//														maxmonth6mcd = pl.getOverdueMthMax().intValue();
//													}
//												}
//											}
//										}
//									}
//								}
//							}
//						} else if (psd.getPaymentStatusM24() != null && !psd.getPaymentStatusM24().equals("")) {
//							if (countNh(num, psd.getPaymentStatusM24(), null) > high6mcd) {
//								high6mcd = countNh(num, psd.getPaymentStatusM24(), null);
//							}
//						}
//					}
//				}
//			} catch (Exception e) {
//				high6mcd = -1;
//			}
//		}
//
//		BigDecimal[] L6M = new BigDecimal[3];
//		
//		L6M[0] = new BigDecimal(high6md > maxmonth6md ? high6md : maxmonth6md);
//		L6M[1] = new BigDecimal(high6mcd > maxmonth6mcd ? high6mcd : maxmonth6mcd);
//		L6M[2] = new BigDecimal(high6mzcd > maxmonth6mzcd ? (high6mzcd - 1) : maxmonth6mzcd);
//		
//		return L6M;
//	}
//
//	/**
//	 * 贷款/贷记卡/准贷记卡在过去6,12,24个月贷款最高逾期次数
//	 * 
//	 * @param num 近月份数
//	 * @param s 近24个月还款记录状态
//	 * @param businessType 业务类型
//	 * 
//	 */
//	public int countNh(int num, String s, BusinessType businessType) {
//		int high = 0;
//		String[] last24 = new String[24];// 存放逾期值
//		if (StringUtil.isNotEmpty(s)) {
//			for (int i = num; i < s.length(); i++) {
//				String s1 = s.substring(i, i + 1);
//				last24[i] = s1;
//			}
//			/*
//			 * for (int i = num; i < last24.length; i++) { if (testIsNum(last24[i]) == true) { if
//			 * (Integer.parseInt(last24[i].toString()) > high) { high = Integer.parseInt(last24[i].toString()); } } }
//			 */
//			// 准贷记卡逾期次数>=2才算作逾期
//			if (businessType != null && businessType.getValue().equals(BusinessType.ZDJK.getValue())) {
//				for (int i = num; i < last24.length; i++) {
//					if (testIsNum(last24[i]) && Integer.parseInt(last24[i]) >= 2
//							&& Integer.parseInt(last24[i].toString()) > high) {
//						high = Integer.parseInt(last24[i].toString());
//					}
//				}
//			} else {
//				for (int i = num; i < last24.length; i++) {
//					if (testIsNum(last24[i])) {
//						if (Integer.parseInt(last24[i].toString()) > high) {
//							high = Integer.parseInt(last24[i].toString());
//						}
//					}
//				}
//			}
//
//		}
//		return high;
//	}
//
//	/**
//	 * 贷款/贷记卡/准贷记卡在过去6,12,24个月贷款累计逾期次数
//	 * 
//	 * @param num 近月份数
//	 * @param s 近24个月还款记录状态
//	 * @param businessType 业务类型
//	 * 
//	 */
//	public int countN(int num, String s, BusinessType businessType) {
//		int count = 0;
//		if (StringUtil.isNotEmpty(s)) {
//			String[] last24 = new String[24];
//			for (int i = num; i < s.length(); i++) {
//				String s1 = s.substring(i, i + 1);
//				last24[i] = s1;
//			}
//			if (businessType != null && businessType.getValue().equals(BusinessType.ZDJK.getValue())) {
//				for (int i = num; i < last24.length; i++) {
//					if (testIsNum(last24[i]) && Integer.parseInt(last24[i]) >= 2) {
//						// count = count + Integer.parseInt(last24[i].toString());
//						count = count + 1;
//					}
//				}
//			} else {
//				for (int i = num; i < last24.length; i++) {
//					if (testIsNum(last24[i])) {
//						// count = count + Integer.parseInt(last24[i].toString());
//						count = count + 1;
//					}
//				}
//			}
//
//		}
//		return count;
//	}
//
//	// 当前状态为逾期的准贷记卡数
//	public int countDJK(String s) {
//		int count = 0;
//		if (s != null && !s.equals("")) {
//			String lastOne = s.substring(23);
//			if (testIsNum(lastOne)) {
//				count = count + Integer.parseInt(lastOne);
//			}
//		}
//		return count;
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
//	 * 判断是否逾期
//	 * 
//	 * @param str
//	 * @return
//	 */
//	public Boolean test(String str) {
//		boolean isTrue = false;
//		for (int i = 0; i < str.length(); i++) {
//			if (testIsNum(str.substring(i, i + 1))) {
//				isTrue = true;
//				break;
//			}
//		}
//		return isTrue;
//
//	}
//
//	/**
//	 * 最近N个月是否逾期
//	 * 
//	 * @param s 信用卡还款记录（24个字符，形如NNNN****12341234NNNN**1*）
//	 * @param n N个月为24-n（例如：往前推6个月，n就为18）
//	 * @return 有逾期返回true,无逾期返回false
//	 */
//	public Boolean isYuQi(String s, int n) {
//		boolean isTrue = false;
//		String[] last24 = new String[24];
//		if (StringUtil.isNotEmpty(s)) {
//			for (int i = n; i < s.length(); i++) {
//				String s1 = s.substring(i, i + 1);
//				//将每个月的还款记录放入数组中
//				last24[i] = s1;
//			}
//			for (int i = n; i < last24.length; i++) {
//				if (testIsNum(last24[i])) {
//					isTrue = true;
////					break;
//				}else{
//					isTrue = false;
//				}
//			}
//		}
//		return isTrue;
//	}
//
//	/**
//	 * 统计最近N个月逾期总和 逾期即为1，否则为0
//	 * 
//	 * @param s 信用卡还款记录（24个字符，形如NNNN****12341234NNNN**1*）
//	 * @param n N个月为24-n（例如：往前推6个月，n就为18）
//	 * @return 逾期期数
//	 */
//	public int countYuQi(String s, int n) {
//		int count = 0;
//		String[] last24 = new String[24];
//		if (StringUtil.isNotEmpty(s)) {
//			for (int i = n; i < s.length(); i++) {
//				String s1 = s.substring(i, i + 1);
//				last24[i] = s1;
//			}
//			for (int i = n; i < last24.length; i++) {
//				//布尔值与布尔值之间的比较是多余的，建议可以直接写成if (testIsNum(last24[i]))
//				if (testIsNum(last24[i])) {
//					count = count + 1;
//				}
//			}
//		}
//		return count;
//	}
//	/**
//	 * (个贷专用)
//	 * 主申人信贷当前正常且从未逾期账户数(包含贷款，贷记卡，准贷记卡)
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 * @throws NumberFormatException
//	 */
//	@SuppressWarnings({ "unchecked" })
//	public int countWeiYuQisApproval(PbocSummary pboc) throws NumberFormatException, ParseException, Exception {
//		int count = 0;
//		// 贷款
//		Set<PbocLoanSummary> dkList = pboc.getPbocLoanSummaries();	
//		// 贷记卡
//		Set<PbocLoancardSummary> LDlist = pboc.getPbocLoancardSummaries();	
//		// 准贷记卡
//		Set<PbocSldSummary> sldList = pboc.getPbocSldSummaries();	
//
//		if((dkList==null||dkList.size()<=0)&&(LDlist==null||LDlist.size()<=0)&&(sldList==null||sldList.size()<=0)){
//			count=99;
//		}else{
//			count=countWeiYuQis(pboc);
//		}
//
//		
//		return count;
//	}
//	/**
//	 * 主申人信贷当前正常且从未逾期账户数(包含贷款，贷记卡，准贷记卡)
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 * @throws NumberFormatException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int countWeiYuQis(PbocSummary pboc) throws NumberFormatException, ParseException, Exception {
//		// 贷款
//		int countDk = 0;
//		Set<PbocLoanSummary> dkList = pboc.getPbocLoanSummaries();
//		if (dkList != null && dkList.size() > 0) {
//			Iterator dks = (Iterator) dkList.iterator();
//			while (dks.hasNext()) {
//				PbocLoanSummary ls = (PbocLoanSummary) dks.next();
//				Set<PbocLoanDetail> sl = ls.getPbocLoanDetail();
//				if (ls != null) {
//					
//					if (StringUtil.isNotEmpty(ls.getLoanStatus()) && ls.getLoanStatus().equals(LoanStatus.ZC.getValue()/*"0"*/) && sl.size() <= 0) {// 状态正常
//							if(countN(0, ls.getPaymentStatusM24(), null)<=0){// 判断近24个月时否有逾期
//								countDk++;
//							}
//					}
//				}
//
//			}
//		}
//
//		// 贷记卡
//		Set<PbocLoancardSummary> LDlist = pboc.getPbocLoancardSummaries();
//		Iterator djk = (Iterator) LDlist.iterator();
//		int countDJK = 0;
//		while (djk.hasNext()) {
//			PbocLoancardSummary plds = (PbocLoancardSummary) djk.next();
//			Set<PbocLoancardDetail> ss = plds.getPbocLoancardDetail();
//			if (StringUtil.isNotEmpty(plds.getCcStatus())) {// 状态正常
//				if (StringUtil.isNotEmpty(plds.getCcStatus()) && plds.getCcStatus().equals(CardStatus.ZC.getValue()) && ss.size() <= 0) {
//					if(countN(0, plds.getPaymentStatusM24(), null)<=0){// 判断近24个月时否有逾期
//						countDJK++;
//					}
//
//				}
//			}
//		}
//		// 准贷记卡
//		Set<PbocSldSummary> sldList = pboc.getPbocSldSummaries();
//		Iterator sld = (Iterator) sldList.iterator();
//		int countSld = 0;
//		while (sld.hasNext()) {
//			PbocSldSummary plds = (PbocSldSummary) sld.next();
//			Set<PbocSldDetail> ss = plds.getPbocSldDetail();
//			if (StringUtil.isNotEmpty(plds.getCcStatus()) && plds.getCcStatus().equals(CardStatus.ZC.getValue()/*"1"*/) && ss.size() == 0) {// 状态正常
//				if(countN(0, plds.getPaymentStatusM24(), BusinessType.ZDJK)<=0){// 判断近24个月时否有逾期
//					countSld++;
//
//				}
//			}
//		}
//		return countDJK + countDk + countSld;
//	}
//	/**
//	 * 个贷专用
//	 * //主申人信用卡余额占授信额度的比例大于50的账户数(包含贷记卡和准贷记卡)
//	 * 
//	 * @param pboc
//	 */
//	@SuppressWarnings({ "unchecked" })
//	public int countCreditCardApproval(PbocSummary pboc) {
//		Set<PbocLoancardSummary> plsv = pboc.getPbocLoancardSummaries();// 贷记卡
//		Set<PbocSldSummary> psld = pboc.getPbocSldSummaries();// 准贷记卡
//		int sum = 0;
//		if((plsv==null||plsv.size()<=0)&&(psld==null||psld.size()<=0)){
//			sum=99;
//		}else{
//			sum=countCreditCards(pboc);
//		}
//
//		return sum;
//	}
//
//	/**
//	 * 主申人信用卡余额占授信额度的比例大于50的账户数(包含贷记卡和准贷记卡)
//	 * 
//	 * @param pboc
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int countCreditCards(PbocSummary pboc) {
//		Set<PbocLoancardSummary> plsv = pboc.getPbocLoancardSummaries();// 贷记卡
//		Set<PbocSldSummary> psld = pboc.getPbocSldSummaries();// 准贷记卡
//		Iterator listlsv = (Iterator) plsv.iterator();
//		Iterator listPsld = (Iterator) psld.iterator();
//		int sum = 0;
//		
//		//贷记卡
//		while (listlsv.hasNext()) {
//			PbocLoancardSummary psd = (PbocLoancardSummary) listlsv.next();
//			float allAmt = 0;// 授信额度
//			float useAmt = 0;// 已使用额度
//			if (psd.getUseAmt() != null) {
//				useAmt = psd.getUseAmt().intValue();
//			}
////			if (psd.getShareAmt() != null) {
////				countAll = psd.getShareAmt().intValue();
////			}
//			if (StringUtil.isNotEmpty(psd.getDescription())) {
//				allAmt = Float.parseFloat(AnalysisCreditCard.getCreditCardLimit(psd.getDescription())
//						.replace(",", ""));
//			}
//			if (allAmt != 0) {
//				if ((useAmt / allAmt) > 0.50) {
//					sum++;
//				}
//			}
//		}
//		
//		//准贷记卡
//		while (listPsld.hasNext()) {
//			PbocSldSummary sld = (PbocSldSummary) listPsld.next();
//			float allAmt = 0;// 授信额度
//			float useAmt = 0;// 已使用额度
//			if (sld.getOdAmt() != null) {
//				useAmt = sld.getOdAmt().intValue();
//			}
////			if (sld.getShareAmt() != null) {
////				countAll = sld.getShareAmt().intValue();
////			}
//			if (StringUtil.isNotEmpty(sld.getDescription())) {
//				allAmt = Float.parseFloat(AnalysisCreditCard.getCreditCardLimit(sld.getDescription())
//						.replace(",", ""));
//			}
//			if (allAmt != 0) {
//				if ((useAmt / allAmt) > 0.50) {
//					sum++;
//				}
//			}
//		}
//
//		return sum;
//	}
//	/**
//	 * （个贷专用）
//	 * 主申人信贷未结清且从未逾期账户的最大账龄(包含贷款，贷记卡，借记卡)
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked" })
//	public int acctAgesApproval(PbocSummary pboc) throws ParseException, Exception {
//		int count = 0;
//		// 贷款
//		Set<PbocLoanSummary> dkList = pboc.getPbocLoanSummaries();	
//		// 贷记卡
//		Set<PbocLoancardSummary> LDlist = pboc.getPbocLoancardSummaries();	
//		// 准贷记卡
//		Set<PbocSldSummary> sldList = pboc.getPbocSldSummaries();	
//
//		if((dkList==null||dkList.size()<=0)&&(LDlist==null||LDlist.size()<=0)&&(sldList==null||sldList.size()<=0)){
//			count=99;
//		}else{
//			count=acctAges(pboc);
//		}
//
//		
//		return count;
//	}
//	/**
//	 * 主申人信贷未结清且从未逾期账户的最大账龄(包含贷款，贷记卡，借记卡)
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
//	public int acctAges(PbocSummary pboc) throws ParseException, Exception {
//		// 贷记卡
//		Set<PbocLoancardSummary> LCSlist = pboc.getPbocLoancardSummaries();
//		Iterator list21 = (Iterator) LCSlist.iterator();
//		DateFormat formats = new SimpleDateFormat("yyyyMMdd");
//		Set<PbocCreditTip> listPT = pboc.getPbocCreditTips();
//		int djkAge = 0;
//		int djkAgeMax=0;
//		int zdjkAgeMax=0;
//		int dkAgeMax=0;
//		while (list21.hasNext()) {
//			PbocLoancardSummary pld = (PbocLoancardSummary) list21.next();
//			Set<PbocLoancardDetail> ss = pld.getPbocLoancardDetail();
//
//			// Iterator listpls = (Iterator) ss.iterator();
//			/* while (listpls.hasNext()) { */
//			/*
//			 * if (StringUtil.isEmpty(pld.getCcStatus())&&ss.size() <= 0 ) { if (count[1].intValue() <= 0) { djkAge =
//			 * DateUtil.getMonths(new Date(), formats.parse(listPT.iterator().next().getFitLcIsdMth().replace(".", "") +
//			 * "01")); } } else {
//			 */
//			//贷记卡状态为正常，并且24个月以前也没有逾期记录
//			if (StringUtil.isNotEmpty(pld.getCcStatus()) && ss.size() <= 0 && pld.getCcStatus().equals(CardStatus.ZC.getValue()/*"1"*/)&&StringUtil.isNotEmpty(pld.getDescription())) {
//				String loanT=pld.getDescription();
//				//解析描述语句获得日期（年月日）
//				String yearL = loanT.split("\\.")[1].substring(0, 4);
//				String monthL = loanT.split("\\.")[1].substring(5, 7);
//				String dayL = loanT.split("\\.")[1].substring(8, 10);
//				String date=yearL+"-"+monthL+"-"+dayL;
//				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//				//近24个月里没有逾期记录
//				if(countN(0, pld.getPaymentStatusM24(), null)<=0){
//					djkAge = DateUtil.getMonths(new Date(),df.parse(date));
//					if(djkAge>djkAgeMax){
//						djkAgeMax=djkAge;
//					}
//				}
//			}
//			// }
//			/*
//			 * if (StringUtil.isNotEmpty(pld.getDescription())) { if (ss.size() <= 0 &&
//			 * !pld.getDescription().endsWith("销户")) {// 状态非等于销户且无逾期 if (count[1].intValue() <= 0) { djkAge =
//			 * DateUtil.getMonths(new Date(), formats.parse(listPT.iterator().next().getFitLcIsdMth().replace(".", "") +
//			 * "01")); }
//			 * 
//			 * } }
//			 */
//			// }
//		}
//		// 准贷记卡
//		Set<PbocSldSummary> sldList = pboc.getPbocSldSummaries();
//		Iterator sld = (Iterator) sldList.iterator();
//		int sldAge = 0;
//		while (sld.hasNext()) {
//			PbocSldSummary pld = (PbocSldSummary) sld.next();
//			Set<PbocSldDetail> ss = pld.getPbocSldDetail();
//			/* Iterator listSld = (Iterator) ss.iterator(); */
//			/*
//			 * while (listSld.hasNext()) { PbocSldDetail plds = (PbocSldDetail) listSld.next();
//			 */
//
//			/*
//			 * if (StringUtil.isEmpty(pld.getCcStatus())&&ss.size() <= 0 ) { if (count[2].intValue() <= 0) { sldAge =
//			 * DateUtil.getMonths(new Date(), formats.parse(listPT.iterator().next().getFitSlcIsdMth().replace(".", "")
//			 * + "01")); } } else {
//			 */
//			//准贷记卡状态为正常，并且24个月以前也没有逾期记录
//			if (StringUtil.isNotEmpty(pld.getCcStatus()) && ss.size() <= 0 && pld.getCcStatus().equals(CardStatus.ZC.getValue()/*"1"*/)&&StringUtil.isNotEmpty(pld.getDescription())) {
//				//近24个月里没有逾期记录
//				if(countN(0, pld.getPaymentStatusM24(), BusinessType.ZDJK)<=0){
//					String loanT=pld.getDescription();
//					String yearL = loanT.split("\\.")[1].substring(0, 4);
//					String monthL = loanT.split("\\.")[1].substring(5, 7);
//					String dayL = loanT.split("\\.")[1].substring(8, 10);
//					String date=yearL+"-"+monthL+"-"+dayL;
//					SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//					sldAge = DateUtil.getMonths(new Date(),df.parse(date));
//					if(sldAge>zdjkAgeMax){
//						zdjkAgeMax=sldAge;
//					}
//				}
//
//			}
//			// }
//
//			/*
//			 * if (StringUtil.isEmpty(pld.getCcStatus())) { if (ss.size() <= 0 && !pld.getDescription().endsWith("销户"))
//			 * {// 状态非等于销户且无逾期 if (count[1].intValue() <= 0) { sldAge = DateUtil.getMonths(new Date(),
//			 * formats.parse(listPT.iterator().next().getFitLcIsdMth().replace(".", "") + "01")); }
//			 * 
//			 * } }
//			 */
//			// }
//		}
//		// 贷款
//		Set<PbocLoanSummary> LSlist = pboc.getPbocLoanSummaries();
//		Iterator list211 = (Iterator) LSlist.iterator();
//		int dkAge = 0;
//		while (list211.hasNext()) {
//			PbocLoanSummary pld = (PbocLoanSummary) list211.next();
//			Set<PbocLoanDetail> ssl = pld.getPbocLoanDetail();
//			/*
//			 * Iterator listppls = (Iterator) ssl.iterator(); while (listppls.hasNext()) { PbocLoanDetail plds =
//			 * (PbocLoanDetail) listppls.next();
//			 */
//			/*
//			 * if (StringUtil.isEmpty(pld.getLoanStatus())&&ssl.size() <= 0 ) { if (count[0].intValue() > 0) { dkAge =
//			 * DateUtil.getMonths(new Date(), formats.parse(listPT.iterator().next().getFitLpMth().replace(".", "") +
//			 * "01")); } } else {
//			 */
//			if (StringUtil.isNotEmpty(pld.getLoanStatus()) && ssl.size() <= 0 && pld.getLoanStatus().equals(LoanStatus.ZC .getValue()/*"0"*/)&&pld.getLoanOccureDate()!=null) {
//				if(countN(0, pld.getPaymentStatusM24(), null)<=0){
//					dkAge = DateUtil.getMonths(new Date(),pld.getLoanOccureDate());
//					if(dkAge>dkAgeMax){
//						dkAgeMax=dkAge;
//					}
//				}
//
//			}
//			// }
//			// }
//		}
//		int maxCount = 0;
//		if (dkAgeMax > zdjkAgeMax) {
//			maxCount = dkAgeMax;
//		} else {
//			maxCount = zdjkAgeMax;
//		}
//		return maxCount > djkAgeMax ? maxCount : djkAgeMax;
//	}
//
//	/**
//	 * 检查客户身份信息是否为空，为空返回true否则false
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public boolean checkApplicantIdEntityNull(PbocSummary pboc) {
//		Set<PbocApplicantIdentity> appList = pboc.getPbocApplicantIdentities();// 获取身份信息
//		Iterator appIterator = (Iterator) appList.iterator();
//		while (appIterator.hasNext()) {
//			PbocApplicantIdentity pbocApplicantIdentity = (PbocApplicantIdentity) appIterator.next();
//			if (StringUtil.isNotEmpty(pbocApplicantIdentity.getGender())) {
//				return false;
//			}
//			if (pbocApplicantIdentity.getBirthday() != null) {
//				return false;
//			}
//			if (StringUtil.isNotEmpty(pbocApplicantIdentity.getMaritalState())) {
//				return false;
//			}
//			if (StringUtil.isNotEmpty(pbocApplicantIdentity.getMobileTelephoneNo())) {
//				return false;
//			}
//			if (StringUtil.isNotEmpty(pbocApplicantIdentity.getOfficeTelephoneNo())) {
//				return false;
//			}
//			if (StringUtil.isNotEmpty(pbocApplicantIdentity.getHomeTelephoneNo())) {
//				return false;
//			}
//			if (StringUtil.isNotEmpty(pbocApplicantIdentity.getEduLevel())) {
//				return false;
//			}
//			if (StringUtil.isNotEmpty(pbocApplicantIdentity.getEduDegree())) {
//				return false;
//			}
//			if (StringUtil.isNotEmpty(pbocApplicantIdentity.getPostAdress())) {
//				return false;
//			}
//			if (StringUtil.isNotEmpty(pbocApplicantIdentity.getRegisteredAdress())) {
//				return false;
//			}
//
//		}
//		return true;
//	}
//
//	/**
//	 * // 近N个月客户信贷审核查询记录是否为空 仅限“信用卡审批”和“贷款审批”的查询
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int countLaQuery(PbocSummary pboc, int n) throws ParseException, Exception {
//		int LM = 0;
//		Set<PbocLaQueryDetail> listPlqd = pboc.getPbocLaQueryDetails();
//		// 取查询日期近n个月的日期
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//		String lastMoth = DateUtil.getMonthByDate(n, pboc.getQueryTime());
//		String queryTime = sdf.format(pboc.getQueryTime());
//		Iterator listPd = (Iterator) listPlqd.iterator();
//		while (listPd.hasNext()) {
//			PbocLaQueryDetail pbocLaQueryDetail = (PbocLaQueryDetail) listPd.next();
//			// 我行
//			String queryDate = sdf.format(pbocLaQueryDetail.getQueryDate());
//			if (pbocLaQueryDetail.getOperator()!=null&&pbocLaQueryDetail.getOperator().length() > 4) {
//				if (Integer.parseInt(queryDate) >= Integer.parseInt(lastMoth)
//						&& Integer.parseInt(queryDate) <= Integer.parseInt(queryTime)) {
//					if (pbocLaQueryDetail.getQueryReason().equals("02")
//							|| pbocLaQueryDetail.getQueryReason().equals("03")) {
//						LM++;
//					}
//				}
//			}
//		}
//		return LM;
//	}
//
//	/**
//	 * 客户审核查询记录是否为空 判断规则：客户的审核查询记录明细为空，即全部查询明细为空，贷款信息为空，贷记卡/准贷记卡记录为空。 为空返回true否则false
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings("unchecked")
//	public boolean isNullPobc(PbocSummary pboc) {
//		Set<PbocLaQueryDetail> listPlqd = pboc.getPbocLaQueryDetails();// 查询记录
//		Set<PbocLoancardSummary> LCSlist = pboc.getPbocLoancardSummaries();// 贷记卡
//		Set<PbocSldSummary> sldList = pboc.getPbocSldSummaries();// 准贷记卡
//		Set<PbocLoanSummary> LSlist = pboc.getPbocLoanSummaries();// 贷款
//		if (listPlqd.size() > 0) {
//			return false;
//		}
//		if (LCSlist.size() > 0) {
//			return false;
//		}
//		if (sldList.size() > 0) {
//			return false;
//		}
//		if (LSlist.size() > 0) {
//			return false;
//		}
//		return true;
//	}
//
//	/**
//	 * 主申人信贷过去6个月M1+逾期的月数 
//	 * 信贷：包括贷款，贷记卡和准贷记卡 
//	 * 其中准贷记卡的逾期期数要-2
//	 * 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int countYuQi6(PbocSummary pboc) {
//		// 主申人贷记卡过去6个月M1+逾期的月数
//		Set<PbocLoancardSummary> ps = pboc.getPbocLoancardSummaries();
//		Iterator pl = (Iterator) ps.iterator();
//		int countDJK = 0;
//		while (pl.hasNext()) {
//			PbocLoancardSummary pld = (PbocLoancardSummary) pl.next();
//			if (StringUtil.isNotEmpty(pld.getPaymentStatusM24())) {
//				countDJK = countDJK + countYuQi(pld.getPaymentStatusM24(), 18);
//			}
//		}
//		// 主申人贷款过去6个月M1+逾期的月数
//		Set<PbocLoanSummary> psl = pboc.getPbocLoanSummaries();
//		Iterator pl1 = (Iterator) psl.iterator();
//		int countDK = 0;
//		while (pl1.hasNext()) {
//			PbocLoanSummary pls = (PbocLoanSummary) pl1.next();
//			if (StringUtil.isNotEmpty(pls.getPaymentStatusM24())) {
//				countDK = countDK + countYuQi(pls.getPaymentStatusM24(), 18);
//			}
//		}
//		// 主申人准贷记卡过去6个月M1+逾期的月数     逾期期数要-2
//		Set<PbocSldSummary> psls = pboc.getPbocSldSummaries();
//		Iterator pl11 = (Iterator) psls.iterator();
//		int countZDJK = 0;
//		int countZDJKs =0;
//		while (pl11.hasNext()) {
//			PbocSldSummary plsd = (PbocSldSummary) pl11.next();
//			if (StringUtil.isNotEmpty(plsd.getPaymentStatusM24())) {
//				countZDJK = countZDJK + countYuQi(plsd.getPaymentStatusM24(), 18);
//			}
//		}
//		countZDJKs = (countZDJK - 2) > countZDJKs ? (countZDJK - 2) : countZDJKs;
//		return countDJK + countDK + countZDJKs;
//	}
//	
//	/**
//	 * 所持信用卡账户状态 
//	 * 判断贷记卡出现冻结(2)、止付(3)、呆账(4)，则给相应的值，最终取最大值给决策文件。 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public String cardStatus(PbocSummary pboc){
//		Set<PbocLoancardSummary> listCT = pboc.getPbocLoancardSummaries();
//		Iterator listls = (Iterator) listCT.iterator();
//		int five1 = 1;// 1---> 正常
//		int five2 = 1;
//		int five3 = 1;
//		int five4 = 1;
//		while (listls.hasNext()) {
//			PbocLoancardSummary pbocLS = (PbocLoancardSummary) listls.next();
//			// 已用额度不为空且大于300元，并且贷记卡状态不为空
//			if (pbocLS.getUseAmt() != null && pbocLS.getUseAmt().intValue() > 300
//					&& StringUtil.isNotEmpty(pbocLS.getCcStatus())) {
//				// 2-->冻结 3-->止付 4-->呆账
//				if (pbocLS.getCcStatus().equals(CardStatus.DJ.getValue())) {// 冻结
//					five2 = 2;
//				} else if (pbocLS.getCcStatus().equals(CardStatus.ZF.getValue())) {// 止付
//					five3 = 3;
//				} else if (pbocLS.getCcStatus().equals(CardStatus.DZ.getValue())) {// 呆账
//					five4 = 4;
//				} else {
//					five1 = 1;
//				}
//			}
//		}
//		
//		int[] m1 = new int[4];
//		m1[0] = five1;
//		m1[1] = five2;
//		m1[2] = five3;
//		m1[3] = five4;
//
//		int five5 = 1;
//		for (int i = 0; i < m1.length; i++) {
//			if (m1[i] > five5) {
//				five5 = m1[i];
//			}
//		}
//		return String.valueOf(five5);
//	}
//	
//	/**
//	 * 贷款状态
//	 * 如有多笔贷款，如有一张为非正常，则本字段为非正常。
//	 * 正常给0，不正常给1
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public String loanStatus(PbocSummary pboc) {
//		Set<PbocLoanSummary> listS = pboc.getPbocLoanSummaries();
//		Iterator list31 = (Iterator) listS.iterator();
//		//每笔贷款的状态
//		String loanStatus_each = "0";
//		Set<String> statusSet = new HashSet<String>();
//		while (list31.hasNext()) {
//			PbocLoanSummary pbocLoanSummary = (PbocLoanSummary) list31.next();
//			if (StringUtil.isNotEmpty(pbocLoanSummary.getFiveGrade())) {
//
//				if (pbocLoanSummary.getLoanStatus().equals(LoanStatus.ZC.getValue())) {// 正常
//					loanStatus_each = "0";
//				} else {
//					loanStatus_each = "1";
//				}
//				
//				statusSet.add(loanStatus_each);
//			}
//		}
//		
//		//最终状态
//		String loanStatus = "0";
//		if (statusSet.contains("1")) {
//			loanStatus = "1";
//		} else {
//			loanStatus = "0";
//		}
//		return loanStatus;
//
//	}
//	
//	/**
//	 * 近6个月内逾期金额大于300元的贷记卡、准贷记卡和贷款账户的连续逾期期数
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int maxZL6(PbocSummary pboc) {
//		String month6 = DateUtil.getMonths(-6);// 获取距离当前6个月的日期
//		Set<PbocLoanSummary> pp = pboc.getPbocLoanSummaries();
//		Iterator pls = (Iterator) pp.iterator();
//		int max6Dk = 0;
//		while (pls.hasNext()) {
//			PbocLoanSummary ls = (PbocLoanSummary) pls.next();
//			Set<PbocLoanDetail> sl = ls.getPbocLoanDetail();
//			Iterator listpls = (Iterator) sl.iterator();
//			while (listpls.hasNext()) {
//				PbocLoanDetail sd = (PbocLoanDetail) listpls.next();
//				if (StringUtil.isNotEmpty(sd.getOverdueMth())) {
//					if (Integer.parseInt(sd.getOverdueMth().replace(".", "")) >= Integer.parseInt(month6)) {
//						if (sd.getOverdueAmt() != null) {
//							if (sd.getOverdueAmt().intValue() > 300 && ls.getCurOdTerm() != null) {
//								max6Dk = ls.getCurOdTerm().intValue() > max6Dk ? ls.getCurOdTerm().intValue() : max6Dk;
//							}
//						}
//					}
//				}
//			}
//		}
//		// 贷记卡
//		String month6djk = DateUtil.getMonths(-6);
//		Set<PbocLoancardSummary> pt = pboc.getPbocLoancardSummaries();
//		Iterator plss = (Iterator) pt.iterator();
//		int max6Djk = 0;
//		while (plss.hasNext()) {
//			PbocLoancardSummary lcsd = (PbocLoancardSummary) plss.next();
//			Set<PbocLoancardDetail> lcds = lcsd.getPbocLoancardDetail();
//			Iterator listpl = (Iterator) lcds.iterator();
//			while (listpl.hasNext()) {
//				PbocLoancardDetail sdl = (PbocLoancardDetail) listpl.next();
//				if (StringUtil.isNotEmpty(sdl.getOverdueMth())) {
//					if (Integer.parseInt(sdl.getOverdueMth().replace(".", "")) >= Integer.parseInt(month6djk)) {
//						if (sdl.getOverdueAmt() != null) {
//							if (sdl.getOverdueAmt().intValue() > 300 && lcsd.getCurOdTerm() != null) {
//								max6Djk = lcsd.getCurOdTerm().intValue() > max6Djk ? lcsd.getCurOdTerm().intValue()
//										: max6Djk;
//							}
//						}
//					}
//				}
//			}
//		}
//		// 准贷记卡的 逾期期数要-1
//		String month6zdjk = DateUtil.getMonths(-6);
//		Set<PbocSldSummary> pss = pboc.getPbocSldSummaries();
//		Iterator zdjk = (Iterator) pss.iterator();
//		int max6Zdjk = 0;
//		int max6Zdjks = 0;
//		while (zdjk.hasNext()) {
//			PbocSldSummary lcss = (PbocSldSummary) zdjk.next();
//			Set<PbocSldDetail> lcdd = lcss.getPbocSldDetail();
//			Iterator listpl = (Iterator) lcdd.iterator();
//			while (listpl.hasNext()) {
//				PbocSldDetail psd = (PbocSldDetail) listpl.next();
//				if (StringUtil.isNotEmpty(psd.getOdMth())) {
//					if (Integer.parseInt(psd.getOdMth().replace(".", "")) >= Integer.parseInt(month6zdjk)) {
//						if (psd.getOdAmt() != null) {
//							if (psd.getOdAmt().intValue() > 300 && lcss.getOdMthMax() != null) {
//								max6Zdjk = lcss.getOdMthMax().intValue() > max6Zdjk ? lcss.getOdMthMax().intValue()
//										: max6Zdjk;
//							}
//						}
//					}
//				}
//			}
//		}
//		max6Zdjks = (max6Zdjk - 1) > max6Zdjks ? (max6Zdjk - 1) : max6Zdjks;
//
//		int[] a = new int[3];
//		a[0] = max6Dk;
//		a[1] = max6Djk;
//		a[2] = max6Zdjks;
//
//		int maxz = 0;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] > maxz) {
//				maxz = a[i];
//			}
//		}
//		return maxz;
//	}
//	
//	/**
//	 * 近12个月内逾期金额大于300元的贷记卡、准贷记卡和贷款账户的连续逾期期数
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int maxZL12(PbocSummary pboc){
//		String month12 = DateUtil.getMonths(-12);// 获取距离现在12个月的时间日期
//		Set<PbocLoanSummary> ppl = pboc.getPbocLoanSummaries();
//		Iterator ppls = (Iterator) ppl.iterator();
//		int max12Dk = 0;
//		while (ppls.hasNext()) {
//			PbocLoanSummary lsd = (PbocLoanSummary) ppls.next();
//			Set<PbocLoanDetail> sld = lsd.getPbocLoanDetail();
//			Iterator listpls = (Iterator) sld.iterator();
//			while (listpls.hasNext()) {
//				PbocLoanDetail sdl = (PbocLoanDetail) listpls.next();
//				if (StringUtil.isNotEmpty(sdl.getOverdueMth())) {
//					// 逾期月份大于获取的过去距离现在12个月的日期
//					if (Integer.parseInt(sdl.getOverdueMth().replace(".", "")) >= Integer.parseInt(month12)) {
//							// 逾期金额大于300元并且当前逾期不为空
//							if (sdl.getOverdueAmt() != null&&sdl.getOverdueAmt().intValue() > 300 && lsd.getCurOdTerm() != null) {
//								max12Dk = lsd.getCurOdTerm().intValue() > max12Dk ? lsd.getCurOdTerm().intValue()
//										: max12Dk;
//							}
//					}
//				}
//			}
//		}
//		// 贷记卡
//		String month12djk = DateUtil.getMonths(-12);
//		Set<PbocLoancardSummary> pts = pboc.getPbocLoancardSummaries();
//		Iterator ptss = (Iterator) pts.iterator();
//		int max12Djk = 0;
//		while (ptss.hasNext()) {
//			PbocLoancardSummary lcst = (PbocLoancardSummary) ptss.next();
//			Set<PbocLoancardDetail> lcda = lcst.getPbocLoancardDetail();
//			Iterator listpls = (Iterator) lcda.iterator();
//			while (listpls.hasNext()) {
//				PbocLoancardDetail sds = (PbocLoancardDetail) listpls.next();
//				if (StringUtil.isNotEmpty(sds.getOverdueMth())) {
//					if (Integer.parseInt(sds.getOverdueMth().replace(".", "")) >= Integer.parseInt(month12djk)) {
//						if (sds.getOverdueAmt() != null) {
//							if (sds.getOverdueAmt().intValue() > 300 && lcst.getCurOdTerm() != null) {
//								max12Djk = lcst.getCurOdTerm().intValue() > max12Djk ? lcst.getCurOdTerm().intValue()
//										: max12Djk;
//							}
//						}
//					}
//				}
//			}
//		}
//		// 准贷记卡的 逾期期数要-1
//		String month12zdjk = DateUtil.getMonths(-12);
//		Set<PbocSldSummary> pssl = pboc.getPbocSldSummaries();
//		Iterator zdjks = (Iterator) pssl.iterator();
//		int max12Zdjk = 0;
//		int max12Zdjks = 0;
//		while (zdjks.hasNext()) {
//			PbocSldSummary lcsp = (PbocSldSummary) zdjks.next();
//			Set<PbocSldDetail> lcdt = lcsp.getPbocSldDetail();
//			Iterator listpll = (Iterator) lcdt.iterator();
//			while (listpll.hasNext()) {
//				PbocSldDetail psdd = (PbocSldDetail) listpll.next();
//				if (StringUtil.isNotEmpty(psdd.getOdMth())) {
//					if (Integer.parseInt(psdd.getOdMth().replace(".", "")) >= Integer.parseInt(month12zdjk)) {
//						if (psdd.getOdAmt() != null) {
//							if (psdd.getOdAmt().intValue() > 300 && lcsp.getOdMthMax() != null) {
//								max12Zdjk = lcsp.getOdMthMax().intValue() > max12Zdjk ? lcsp.getOdMthMax().intValue()
//										: max12Zdjk;
//							}
//						}
//					}
//				}
//			}
//		}
//		max12Zdjks = (max12Zdjk - 1) > max12Zdjks ? (max12Zdjk - 1) : max12Zdjks;
//
//		int[] b = new int[3];
//		b[0] = max12Dk;
//		b[1] = max12Djk;
//		b[2] = max12Zdjks;
//
//		int max12z = 0;
//		for (int i = 0; i < b.length; i++) {
//			if (b[i] > max12z) {
//				max12z = b[i];
//			}
//		}
//		return max12z;
//	}
//	
//	/**
//	 * 近24个月内逾期金额大于300元的贷记卡、准贷记卡和贷款账户的连续逾期期数
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int maxZL24(PbocSummary pboc){
//		String month24 = DateUtil.getMonths(-24);
//		Set<PbocLoanSummary> pps = pboc.getPbocLoanSummaries();
//		Iterator pplsd = (Iterator) pps.iterator();
//		int max24Dk = 0;
//		while (pplsd.hasNext()) {
//			PbocLoanSummary ls = (PbocLoanSummary) pplsd.next();
//			Set<PbocLoanDetail> slp = ls.getPbocLoanDetail();
//			Iterator listpls = (Iterator) slp.iterator();
//			while (listpls.hasNext()) {
//				PbocLoanDetail sdl = (PbocLoanDetail) listpls.next();
//				if (StringUtil.isNotEmpty(sdl.getOverdueMth())) {
//					if (Integer.parseInt(sdl.getOverdueMth().replace(".", "")) >= Integer.parseInt(month24)) {
//						if (sdl.getOverdueAmt() != null) {
//							if (sdl.getOverdueAmt().intValue() > 300 && ls.getCurOdTerm() != null) {
//								max24Dk = ls.getCurOdTerm().intValue() > max24Dk ? ls.getCurOdTerm().intValue()
//										: max24Dk;
//							}
//						}
//					}
//				}
//			}
//		}
//		// 贷记卡
//		String month24djk = DateUtil.getMonths(-24);
//		Set<PbocLoancardSummary> ppt = pboc.getPbocLoancardSummaries();
//		Iterator ptlss = (Iterator) ppt.iterator();
//		int max24Djk = 0;
//		while (ptlss.hasNext()) {
//			PbocLoancardSummary lcsz = (PbocLoancardSummary) ptlss.next();
//			Set<PbocLoancardDetail> lcdn = lcsz.getPbocLoancardDetail();
//			Iterator listpl = (Iterator) lcdn.iterator();
//			while (listpl.hasNext()) {
//				PbocLoancardDetail sf = (PbocLoancardDetail) listpl.next();
//				if (StringUtil.isNotEmpty(sf.getOverdueMth())) {
//					if (Integer.parseInt(sf.getOverdueMth().replace(".", "")) >= Integer.parseInt(month24djk)) {
//						if (sf.getOverdueAmt() != null) {
//							if (sf.getOverdueAmt().intValue() > 300 && lcsz.getCurOdTerm() != null) {
//								max24Djk = lcsz.getCurOdTerm().intValue() > max24Djk ? lcsz.getCurOdTerm().intValue()
//										: max24Djk;
//							}
//						}
//					}
//				}
//			}
//		}
//		// 准贷记卡的 逾期期数要-1
//		String month24zdjk = DateUtil.getMonths(-24);// 获取过去24月时间的日期
//		Set<PbocSldSummary> pssd = pboc.getPbocSldSummaries();
//		Iterator zdjkl = (Iterator) pssd.iterator();
//		int max24Zdjk = 0;
//		int max24Zdjks = 0;
//		while (zdjkl.hasNext()) {
//			PbocSldSummary lcsy = (PbocSldSummary) zdjkl.next();
//			Set<PbocSldDetail> lcdz = lcsy.getPbocSldDetail();
//			Iterator listpl = (Iterator) lcdz.iterator();
//			while (listpl.hasNext()) {
//				PbocSldDetail psdl = (PbocSldDetail) listpl.next();
//				if (StringUtil.isNotEmpty(psdl.getOdMth())) {
//					if (Integer.parseInt(psdl.getOdMth().replace(".", "")) >= Integer.parseInt(month24zdjk)) {
//						if (psdl.getOdAmt() != null) {
//							if (psdl.getOdAmt().intValue() > 300 && lcsy.getOdMthMax() != null) {
//								max24Zdjk = lcsy.getOdMthMax().intValue() > max24Zdjk ? lcsy.getOdMthMax().intValue()
//										: max24Zdjk;
//							}
//						}
//					}
//				}
//			}
//		}
//		max24Zdjks = (max24Zdjk - 1) > max24Zdjks ? (max24Zdjk - 1) : max24Zdjks;
//
//		int[] c = new int[3];
//		c[0] = max24Dk;
//		c[1] = max24Djk;
//		c[2] = max24Zdjks;
//
//		int max24z = 0;
//		for (int i = 0; i < c.length; i++) {
//			if (c[i] > max24z) {
//				max24z = c[i];
//			}
//		}
//		return max24z;
//	}
//	
//	/**
//	 * 名下额度大于100元的贷记卡发卡机构数（额度指授信额度 ）
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public int companyNum(PbocSummary pboc) throws ParseException, Exception{
//		Set<PbocLoancardSummary> listULS1 = pboc.getPbocLoancardSummaries();
//		Iterator list22 = (Iterator) listULS1.iterator();
//		Map map = new HashMap();
//		int shareAmt = 0;
//		while (list22.hasNext()) {
//			PbocLoancardSummary pbocLoancardSummary = (PbocLoancardSummary) list22.next();
//			if (StringUtil.isNotEmpty(pbocLoancardSummary.getDescription())) {
//				// 获取授信额度
//				shareAmt = Integer.parseInt(AnalysisCreditCard.getCreditCardLimit(pbocLoancardSummary.getDescription())
//						.replace(",", ""));
//				// 不以”销户“结尾
//				if (!pbocLoancardSummary.getCcStatus().equals(CardStatus.XH.getValue())) {
//					// 获取发卡机构名
//					String comapanyType = AnalysisLoan.getComapanyType(pbocLoancardSummary.getDescription());
//					// 授信额度大于100，发卡机构名称不为空
//					if (shareAmt > 100 && StringUtil.isNotEmpty(comapanyType)) {
//						map.put(comapanyType, "");// 将获取到的发卡机构存入map，用于对相同的机构数去重，最终得到发卡机构数
//					}
//				}
//			}
//		}
//		return map.size();
//	}
//	
//	/**
//	 * 同业信用卡最高授信额度 --->取贷记卡最高授信额度 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public int cardMaxAmt(PbocSummary pboc){
//		Set<PbocLoancardSummary> listPULS = pboc.getPbocLoancardSummaries();
//		Iterator djks = (Iterator) listPULS.iterator();
//		int shareAmt1 = 0;
//		while (djks.hasNext()) {
//			PbocLoancardSummary pbocLoancardSummary = (PbocLoancardSummary) djks.next();
//			if (StringUtil.isNotEmpty(pbocLoancardSummary.getDescription())) {
//				// 获取授信额度
//				shareAmt1 = Integer.parseInt(AnalysisCreditCard
//						.getCreditCardLimit(pbocLoancardSummary.getDescription()).replace(",", "")) > shareAmt1 ? Integer
//						.parseInt(AnalysisCreditCard.getCreditCardLimit(pbocLoancardSummary.getDescription()).replace(
//							",", "")) : shareAmt1;
//			}
//		}
//		return shareAmt1;
//	}
//	
//	/**
//	 * 公积金最近连续缴纳月份 ---信用卡
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public int accFundRecord(PbocSummary pboc) throws ParseException, Exception{
//		Set<PbocAccFundRecord> listAFRS = pboc.getPbocAccFundRecords();
//		Iterator gjjs = (Iterator) listAFRS.iterator();
//		int reserveFundMonths = 0;
//		int fundMonth = 0;
//		while (gjjs.hasNext()) {
//			PbocAccFundRecord pbocAccFundRecord = (PbocAccFundRecord) gjjs.next();
//			if (StringUtil.isNotEmpty(pbocAccFundRecord.getEndMth())) {
//				// 获取缴至月份与查询日期之间的时间间隔（月数）
//				fundMonth = DateUtil.getMonths(
//					formats.parse(AnalysisLoan.getDateString(pbocAccFundRecord.getEndMth())), pboc.getReportCreateTime());
//				// 缴至月份为查询本月或查询上月
//				if (fundMonth <= 3 && StringUtil.isNotEmpty(pbocAccFundRecord.getJoinMth())) {
//					// 连续缴纳月份为初缴日期与缴至月份之间的时间间隔
//					reserveFundMonths = DateUtil.getMonths(
//						formats.parse(AnalysisLoan.getDateString(pbocAccFundRecord.getJoinMth())),
//						formats.parse(AnalysisLoan.getDateString(pbocAccFundRecord.getEndMth())));
//				}
//			}
//		}
//		return reserveFundMonths;
//	}
//	
//	/**
//	 * 社保金最近连续缴纳月份
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public int aiInRecord(PbocSummary pboc){
//		Set<PbocAiInRecord> listPAIRS = pboc.getPbocAiInRecords();
//		Iterator SBao = (Iterator) listPAIRS.iterator();
//		int socialMonth = 0;
//		int socialInsuranceMonths = 0;
//		while (SBao.hasNext()) {
//			PbocAiInRecord pbocAiInRecord = (PbocAiInRecord) SBao.next();
//			if (pbocAiInRecord.getActStatus().equals("1")) {// 缴费状态为正常
//				// 获取更新日期与查询日期之间的时间间隔（月数）
//				socialMonth = DateUtil.getMonths(pbocAiInRecord.getOccureDate(), pboc.getQueryTime());
//				if (socialMonth < 3) {
//					socialInsuranceMonths = pbocAiInRecord.getMaxMth().intValue();
//				}
//			}
//		}
//		return socialInsuranceMonths;
//	}
//	
//	/**
//	 * 主申人信用卡账龄最大值
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "rawtypes", "unchecked", "unused" })
//	public int cardMaxZL(PbocSummary pboc) throws ParseException, Exception{
//		Set<PbocCreditTip> listPL = pboc.getPbocCreditTips();
//		Iterator djkzl = (Iterator) listPL.iterator();
//		//最大账龄--贷记卡
//		int maxAgeDJK = 0;
//		//最大账龄--准贷记卡
//		int maxAgeZDJK = 0;
//		//最大账龄
//		int maxAgeZL = 0;
//		
//		while (djkzl.hasNext()) {
//			PbocCreditTip pct = (PbocCreditTip) djkzl.next();
//			if (listPL.iterator().next().getFitLcIsdMth() != null) {
//				maxAgeDJK = DateUtil.getMonths(pboc.getQueryTime(),
//					formats.parse(AnalysisLoan.getDateString(listPL.iterator().next().getFitLcIsdMth())));
//			}
//			if (listPL.iterator().next().getFitSlcIsdMth() != null) {
//				maxAgeZDJK = DateUtil.getMonths(pboc.getQueryTime(),
//					formats.parse(AnalysisLoan.getDateString(listPL.iterator().next().getFitSlcIsdMth())));
//			}
//		}
//		//取最大值最为最大账龄
//		maxAgeZL = maxAgeDJK > maxAgeZDJK ? maxAgeDJK : maxAgeZDJK;
//		
//		return maxAgeZL;
//	}
//	
//	/**
//	 * 当前逾期金额大于300元的贷记卡、准贷记卡和贷款账户总数
//	 * 贷记卡里面的和准贷记卡和贷款里面的 逾期金额大于300的,先找到贷款表,在里面在循环遍历 
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public int acctNum(PbocSummary pboc){
//		// 统计贷记卡逾期金额大于300元
//		Set<PbocLoancardSummary> listLD = pboc.getPbocLoancardSummaries();
//		Iterator list2 = (Iterator) listLD.iterator();
//		int count4 = 0;
//		while (list2.hasNext()) {
//			PbocLoancardSummary pld = (PbocLoancardSummary) list2.next();
//			if (pld.getCurOdAmt() != null && pld.getCurOdAmt().intValue() > 300) {
//				count4++;
//			}
//		}
//		// 统计准贷记卡逾期金额大于300元
//		Set<PbocSldSummary> listSD = pboc.getPbocSldSummaries();
//		Iterator list3 = (Iterator) listSD.iterator();
//		int count5 = 0;
//		while (list3.hasNext()) {
//			PbocSldSummary pls = (PbocSldSummary) list3.next();
//			if (pls.getOdAmt() != null && pls.getOdAmt().intValue() > 300) {
//				count5++;
//			}
//		}
//		// 统计贷款逾期金额大于300元
//		Set<PbocLoanSummary> listLSS = pboc.getPbocLoanSummaries();
//		Iterator list4 = (Iterator) listLSS.iterator();
//		int count6 = 0;
//		while (list4.hasNext()) {
//			PbocLoanSummary ls = (PbocLoanSummary) list4.next();
//			if (ls.getCurOdAmt() != null && ls.getCurOdAmt().intValue() > 300) {
//				count6++;
//			}
//		}
//		return count4 + count5 + count6;
//	}
//	
//	/**
//	 * 过去3个月(算本月)新开贷款账户数
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public int lcActNum(PbocSummary pboc){
//		String month3 = DateUtil.getMonths(-2);
//		Set<PbocLoanSummary> listLS = pboc.getPbocLoanSummaries();
//		Iterator list1 = (Iterator) listLS.iterator();
//		int countLoanNumb = 0;
//		while (list1.hasNext()) {
//			PbocLoanSummary pbocLoanSummary = (PbocLoanSummary) list1.next();
//			if (pbocLoanSummary.getLoanOccureDate() != null) {
//				String loanOccureDate = DateUtil.convertDateToString(pbocLoanSummary.getLoanOccureDate(), "yyyyMMdd");
//				if (Integer.parseInt(loanOccureDate) >= Integer.parseInt(month3 + "01")) {
//					countLoanNumb++;
//				}
//			}
//		}
//		return countLoanNumb;
//	}
//	
//	/**
//	 * 征信信用历史
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	public int[] cardHistory(PbocSummary pboc) throws ParseException, Exception{
//		Set<PbocCreditTip> listPC = pboc.getPbocCreditTips();
//		Iterator djkh = (Iterator) listPC.iterator();
//		DateFormat formats = new SimpleDateFormat("yyyyMMdd");
//		int djkAge = 0;
//		int dkAge = 0;
//		int zdjkAge = 0;
//		while (djkh.hasNext()) {
//			PbocCreditTip pct = (PbocCreditTip) djkh.next();
//			// 贷记卡
//			if (StringUtil.isNotEmpty(pct.getFitLcIsdMth())) {
//				djkAge = DateUtil.getMonths(new Date(), formats.parse(pct.getFitLcIsdMth().replace(".", "") + "01"));
//			}
//			// 贷款
//			if (StringUtil.isNotEmpty(pct.getFitLpMth())) {
//				dkAge = DateUtil.getMonths(new Date(), formats.parse(pct.getFitLpMth().replace(".", "") + "01"));
//			}
//			// 准贷记卡
//			if (StringUtil.isNotEmpty(pct.getFitSlcIsdMth())) {
//				zdjkAge = DateUtil.getMonths(new Date(), formats.parse(pct.getFitSlcIsdMth().replace(".", "") + "01"));
//			}
//		}
//		int[] cardsHis = new int[3];
//		cardsHis[0] = djkAge;
//		cardsHis[1] = dkAge;
//		cardsHis[2] = zdjkAge;
//		
//		return cardsHis;
//	}
//	/**
//	 * 当前状态为逾期的贷款最大逾期金额
//	 * 取值逻辑：从所有有24个月还款状态的记录中，按贷款找出“当前逾期期数”>0的记录 ,然后max（当前逾期金额）
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public BigDecimal maxOdAmtLoan(PbocSummary pboc){
//		double maxAmt=0;//逾期金额
//		if(pboc!=null){
//			Set<PbocLoanSummary> pls = pboc.getPbocLoanSummaries();
//			Iterator<PbocLoanSummary> plsIt = pls.iterator();
//			while(plsIt.hasNext()){
//				PbocLoanSummary pbocLoanSummary = plsIt.next();
//				
//				if(pbocLoanSummary!=null&&StringUtil.isNotEmpty(pbocLoanSummary.getPaymentStatusM24())){//判断近24个月还款记录是否为空
//					if(pbocLoanSummary.getCurOdTerm()!=null&&pbocLoanSummary.getCurOdTerm().intValue()>0){//“当前逾期期数”>0的记录
//						double temAmt=pbocLoanSummary.getCurOdAmt().doubleValue();
//						if(temAmt>maxAmt){//取得最大值
//							maxAmt=temAmt;
//						}
//					}
//				}
//			}
//		}
//		
//		return new BigDecimal(maxAmt);
//	}
//	/**
//	 * 当前状态为逾期的贷记卡最大逾期金额
//	 * 取值逻辑：从所有有24个月还款状态的记录中，找出“当前逾期期数”>0的记录 ,然后max（当前逾期金额）
//	 * @param pboc
//	 * @return
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public BigDecimal maxOdAmtLoanCard(PbocSummary pboc){
//		double maxAmt=0;//逾期金额
//		if(pboc!=null){
//			Set<PbocLoancardSummary> plcs = pboc.getPbocLoancardSummaries();
//			Iterator<PbocLoancardSummary> plcsIt = plcs.iterator();
//			while(plcsIt.hasNext()){
//				PbocLoancardSummary pbocLoancardSummary = plcsIt.next();
//				if(pbocLoancardSummary!=null&&StringUtil.isNotEmpty(pbocLoancardSummary.getPaymentStatusM24())){//判断近24个月还款记录是否为空
//					if(pbocLoancardSummary.getCurOdTerm()!=null&&pbocLoancardSummary.getCurOdTerm().intValue()>0){//“当前逾期期数”>0的记录
//						double temAmt=pbocLoancardSummary.getCurOdAmt().doubleValue();
//						if(temAmt>maxAmt){//取得最大值
//							maxAmt=temAmt;
//						}
//					}
//				}
//			}
//		}
//		
//		return new BigDecimal(maxAmt);
//	}
//	
//	/**
//	 * 最大逾期金额（个人经营贷）
//	 * 取值逻辑：从所有有24个月还款状态的记录中，按贷款，贷记卡 分别找出“当前逾期期数”>0的记录 ,然后max（当前逾期金额）
//	 * @param pboc 征信信息
//	 * @param businessType 业务类型(仅限贷款和贷记卡，默认贷款)
//	 * @return
//	 */
//	public BigDecimal maxOdAmt(PbocSummary pboc,BusinessType businessType){
//		if(businessType==BusinessType.DJK){//信用卡
//			return maxOdAmtLoanCard(pboc);
//			
//		}else{//贷款
//			return maxOdAmtLoan(pboc);
//		}
//	}
//	
//	/**
//	 * 求num逾期记录 （房贷-消费贷）
//	 * 
//	 * ①根据信贷交易信息明细中的贷款、贷记卡、准贷记卡账户还款记录明细统计得出。
//	 * 最高逾期期数取所有贷款、贷记卡、准贷记卡的还款明细中最近6/12/24个月取最大值，
//	 * 累计逾期次数取还款明细中最近6/12/24个月取发生的逾期月份数累加计算。
//	 * 
//	 * ②如果当前贷记卡、准贷记卡、贷款状态为销户、结清或转出的，则根据征信报告查询日向前推6/12/24个月，
//	 * 其中“累计逾期次数”取明细中“逾期记录”表中发生逾期的月份数累加，
//	 * “最高逾期期数”取明细中“逾期记录”表中的“逾期持续月数”的最大值。
//	 * 
//	 * ③如果当前贷记卡、准贷记卡、贷款状态为呆账，贷记卡、准贷记卡状态
//	 * 为“冻结”、“止付”的，最高逾期期数和累计逾期次数赋值“99”。
//	 * 
//	 * 注意：贷款、贷记卡的逾期根据每个月还款记录中出现的数字≥1判断；
//	 * 准贷记卡的逾期根据每个月还款记录中出现的数字≥2判断.
//	 * 
//	 * @return
//	 * @throws ParseException
//	 * @throws NumberFormatException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public BigDecimal[] yuQiNum(PbocSummary pboc, int num) throws NumberFormatException, ParseException, Exception {
//		
//		BigDecimal[] L6M = new BigDecimal[3];
//		int count6md = 0;// 贷款逾期次数
//		int count6mzcd = 0;// 准贷记卡
//		int count6mcd = 0;// 贷记卡.
//		
//		/**贷款部分*/
//		try {
//			Set<PbocLoanSummary> listPLsSs = pboc.getPbocLoanSummaries();
//			Iterator listPss = (Iterator) listPLsSs.iterator();
//			while (listPss.hasNext()) {
//				PbocLoanSummary pbocLoanSummaryss = (PbocLoanSummary) listPss.next();
//				if (pbocLoanSummaryss.getLoanStatus() != null && !pbocLoanSummaryss.getLoanStatus().equals("")) {
//					// 状态为“呆账”，给默认值99
//					if (pbocLoanSummaryss.getLoanStatus().equals(LoanStatus.DZ.getValue())) {
//						count6md = 99;// 逾期最高值
//						break;
//					}
//				}
//
//			}
//			// 如果当前贷记卡、准贷记卡、贷款状态为销户、结清或转出的，
//			// 则征信报告查询日向前推6/12/24个月，
//			// 其中“累计逾期次数”取明细中“逾期记录”表中发生逾期的月份数累加，
//			// “最高逾期期数”取明细中“逾期记录”表中的“逾期持续月数”的最大值。
//			if (count6md != 99) {
//				Iterator listPss2 = (Iterator) listPLsSs.iterator();
//				while (listPss2.hasNext()) {
//					PbocLoanSummary pbocLoanSummaryss = (PbocLoanSummary) listPss2.next();
//					if (StringUtil.isNotEmpty(pbocLoanSummaryss.getLoanStatus())) {
//						// 贷款状态为“结清”或“转出”
//						if (pbocLoanSummaryss.getLoanStatus().equals(LoanStatus.JQ.getValue())
//								|| pbocLoanSummaryss.getLoanStatus().equals(LoanStatus.CC.getValue())) {
//
//							Set<PbocLoanDetail> pd = pbocLoanSummaryss.getPbocLoanDetail();
//							Iterator listPd = (Iterator) pd.iterator();
//
//							while (listPd.hasNext()) {
//								PbocLoanDetail pbocLoanDetail = (PbocLoanDetail) listPd.next();
//								//报告查询日期
//								if (pboc.getReportCreateTime() != null) {
//									String date = formats.format(pboc.getReportCreateTime());
//									
//									// 获取以查询日期往前推n月的日期，yyyyMM格式
//									String months = DateUtil.getMonths(24-num, date);
//									// 逾期月份
//									if (StringUtil.isNotEmpty(pbocLoanDetail.getOverdueMth())) {
//										int odmonth = Integer.parseInt(pbocLoanDetail.getOverdueMth().replace(".", ""));
//										// 逾期月份大于“months”
//										if (odmonth >= Integer.parseInt(months)) {
//											// 逾期月份小于等于报告查询日期,算一次逾期
//											if (odmonth <= Integer.parseInt(date)) {
//												count6md = count6md + 1;
//											}
//										}
//									}
//								}
//
//							}
//						} else if (pbocLoanSummaryss.getPaymentStatusM24() != null
//								&& !pbocLoanSummaryss.getPaymentStatusM24().equals("")) {
//							// 根据近24个月还款记录查询近n个月逾期期数
//							count6md = count6md + countN(num, pbocLoanSummaryss.getPaymentStatusM24(), null);
//						}
//					}
//				}
//			}
//
//			/**准贷记卡*/
//
//			Set<PbocSldSummary> psb = pboc.getPbocSldSummaries();
//			Iterator psListb = (Iterator) psb.iterator();
//			while (psListb.hasNext()) {
//				PbocSldSummary pss = (PbocSldSummary) psListb.next();
//				if (pss.getCcStatus() != null && !pss.getCcStatus().equals("")) {
//					// 状态为“止付”、“冻结”、“呆账”，给默认值99
//					if (pss.getCcStatus().equals(CardStatus.DZ.getValue())
//							|| pss.getCcStatus().equals(CardStatus.ZF.getValue())
//							|| pss.getCcStatus().equals(CardStatus.DJ.getValue())) {
//						count6mzcd = 99;
//						break;
//					}
//				}
//			}
//			if (count6mzcd != 99) {
//				Iterator psListb2 = (Iterator) psb.iterator();
//				while (psListb2.hasNext()) {
//					PbocSldSummary pss = (PbocSldSummary) psListb2.next();
//					if (StringUtil.isNotEmpty(pss.getCcStatus())) {
//						// 卡状态为销户，则根据报告查询日期往前推
//						if (pss.getCcStatus().equals(CardStatus.XH.getValue())) {
//
//							Set<PbocSldDetail> psd = pss.getPbocSldDetail();
//							Iterator listPsd = (Iterator) psd.iterator();
//
//							while (listPsd.hasNext()) {
//								PbocSldDetail pl = (PbocSldDetail) listPsd.next();
//								// 报告查询日期
//								if (pboc.getReportCreateTime() != null) {
//									String date = formats.format(pboc.getReportCreateTime());
//									// 以查询日期往前推n个月，yyyyMM格式
//									String months = DateUtil.getMonths(24-num, date);
//									// 透支月份
//									if (StringUtil.isNotEmpty(pl.getOdMth())) {
//										int odMonth = Integer.parseInt(pl.getOdMth().replace(".", ""));
//										// 透支月份大于“months”
//										if (odMonth >= Integer.parseInt(months)) {
//											// 透支月份小于等于报告查询日期，算一起逾期
//											if (odMonth <= Integer.parseInt(date)) {
//												count6mzcd = count6mzcd + 1;
//											}
//										}
//									}
//								}
//							}
//						} else if (pss.getPaymentStatusM24() != null && !pss.getPaymentStatusM24().equals("")) {
//							// 根据近24个月还款记录查询近n个月逾期期数，逾期期数大于2算逾期
//							count6mzcd = count6mzcd + countN(num, pss.getPaymentStatusM24(), BusinessType.ZDJK);
//						}
//					}
//				}
//			}
//			
//			/** 贷记卡*/
//
//			Set<PbocLoancardSummary> plsv = pboc.getPbocLoancardSummaries();
//			Iterator listlsv = (Iterator) plsv.iterator();
//			while (listlsv.hasNext()) {
//				PbocLoancardSummary psd = (PbocLoancardSummary) listlsv.next();
//				if (psd.getCcStatus() != null && !psd.getCcStatus().equals("")) {
//					// 状态为“止付”、“冻结”、“呆账”，给默认值99
//					if (psd.getCcStatus().equals(CardStatus.DZ.getValue())
//							|| psd.getCcStatus().equals(CardStatus.ZF.getValue())
//							|| psd.getCcStatus().equals(CardStatus.DJ.getValue())) {
//						count6mcd = 99;
//						break;
//					}
//				}
//			}
//			if (count6mcd != 99) {
//				Iterator listlsv2 = (Iterator) plsv.iterator();
//				while (listlsv2.hasNext()) {
//					PbocLoancardSummary psd = (PbocLoancardSummary) listlsv2.next();
//					if (StringUtil.isNotEmpty(psd.getCcStatus())) {
//						// 贷记卡状态为销户,则根据报告查询日期往前推
//						if (psd.getCcStatus().equals(CardStatus.XH.getValue())) {
//
//							Set<PbocLoancardDetail> pld = psd.getPbocLoancardDetail();
//							Iterator listPsd = (Iterator) pld.iterator();
//
//							while (listPsd.hasNext()) {
//								PbocLoancardDetail pl = (PbocLoancardDetail) listPsd.next();
//								// 报告查询日期
//								if (pboc.getReportCreateTime() != null) {
//									String date = formats.format(pboc.getReportCreateTime());
//									// 以查询日期往前推n个月，yyyyMM格式
//									String months = DateUtil.getMonths(24-num, date);
//									// 逾期月份
//									if (StringUtil.isNotEmpty(pl.getOverdueMth())) {
//										int odMonth = Integer.parseInt((pl.getOverdueMth() + "").replace(".", ""));
//										// 逾期月份大于“months”小于报告查询日期
//										if (odMonth >= Integer.parseInt(months)) {
//											if (odMonth <= Integer.parseInt(date)) {
//												count6mcd = count6mcd + 1;
//											}
//										}
//									}
//								}
//							}
//						} else if (psd.getPaymentStatusM24() != null && !psd.getPaymentStatusM24().equals("")) {
//							// 根据近24个月还款记录查询近n个月逾期期数
//							count6mcd = count6mcd + countN(num, psd.getPaymentStatusM24(), null);
//						}
//					}
//				}
//			}
//		} catch (Exception e) {
//			L6M[0] = new BigDecimal("-1");
//			L6M[1] = new BigDecimal("-1");
//			L6M[2] = new BigDecimal("-1");
//			return L6M;
//		}
//
//		L6M[0] = new BigDecimal(count6md);
//		L6M[1] = new BigDecimal(count6mcd);
//		L6M[2] = new BigDecimal(count6mzcd);
//		
//		return L6M;
//	}
//	
//
//	/**
//	 * 最高逾期次数（房贷-消费贷）
//	 * 
//	 * ①根据信贷交易信息明细中的贷款、贷记卡、准贷记卡账户还款记录明细统计得出。
//	 * 最高逾期期数取所有贷款、贷记卡、准贷记卡的还款明细中最近6/12/24个月取最大值，
//	 * 累计逾期次数取还款明细中最近6/12/24个月取发生的逾期月份数累加计算。
//	 * 
//	 * ②如果当前贷记卡、准贷记卡、贷款状态为销户、结清或转出的，则根据征信报告查
//	 * 询日向前推6/12/24个月，其中“累计逾期次数”取明细中“逾期记录”表中发生逾期的月份数累加，
//	 * “最高逾期期数”取明细中“逾期记录”表中的“逾期持续月数”的最大值。
//	 * 
//	 * ③如果当前贷记卡、准贷记卡、贷款状态为呆账，贷记卡、准贷记卡状态为“冻结”、“止付”的，
//	 * 最高逾期期数和累计逾期次数赋值“99”。
//	 * 
//	 * 注意：贷款、贷记卡的逾期根据每个月还款记录中出现的数字≥1判断；
//	 * 准贷记卡的逾期根据每个月还款记录中出现的数字≥2判断.
//	 * 
//	 * @param pboc
//	 * @param num
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings({ "unchecked", "rawtypes" })
//	public BigDecimal[] yuQiNumH(PbocSummary pboc, int num) throws ParseException, Exception {
//		
//		/** 贷款部分 */
//		int high6md = 0;
//		int maxmonth6md = 0;
//		try {
//			Set<PbocLoanSummary> listPLsSs = pboc.getPbocLoanSummaries();
//			Iterator listPss = (Iterator) listPLsSs.iterator();
//			while (listPss.hasNext()) {
//				PbocLoanSummary pbocLoanSummaryss = (PbocLoanSummary) listPss.next();
//				if (pbocLoanSummaryss.getLoanStatus() != null && !pbocLoanSummaryss.getLoanStatus().equals("")) {
//					//贷款状态为呆账，给默认值99
//					if (pbocLoanSummaryss.getLoanStatus().equals(LoanStatus.DZ.getValue())) {
//						high6md = 99;
//						break;
//					}
//				}
//
//			}
//		} catch (Exception e) {
//			high6md = -1;
//		}
//		if (high6md != 99) {
//			Set<PbocLoanSummary> listPLsSs = pboc.getPbocLoanSummaries();
//			Iterator listPss = (Iterator) listPLsSs.iterator();
//			try {
//				while (listPss.hasNext()) {
//					PbocLoanSummary pbocLoanSummaryss = (PbocLoanSummary) listPss.next();
//					if (StringUtil.isNotEmpty(pbocLoanSummaryss.getLoanStatus())) {
//						//贷款状态为结清或转出，则按报告查询日期往前推n月，取逾期期数
//						if (pbocLoanSummaryss.getLoanStatus().equals(LoanStatus.JQ.getValue())
//								|| pbocLoanSummaryss.getLoanStatus().equals(LoanStatus.CC.getValue())) {
//							
//							Set<PbocLoanDetail> pd = pbocLoanSummaryss.getPbocLoanDetail();
//							Iterator listPd = (Iterator) pd.iterator();
//							while (listPd.hasNext()) {
//								PbocLoanDetail pbocLoanDetail = (PbocLoanDetail) listPd.next();
//								//报告查询日期
//								if (pboc.getReportCreateTime() != null) {
//									
//									String date = formats.format(pboc.getReportCreateTime());
//									// 以查询日期往前推n个月，yyyyMM格式
//									String months = DateUtil.getMonths(24-num, date);
//									
//									if (StringUtil.isNotEmpty(pbocLoanDetail.getOverdueMth())) {//逾期月份
//										int odmonth = Integer.parseInt((pbocLoanDetail.getOverdueMth()).replace(".", ""));//逾期月份
//										//逾期月份大于“months”小于报告查询日期
//										if (odmonth >= Integer.parseInt(months)) {
//											if (odmonth <= Integer.parseInt(date)) {
//												//逾期持续月数
//												if (pbocLoanDetail.getOverdueMthMax() != null) {
//													if (pbocLoanDetail.getOverdueMthMax().intValue() > maxmonth6md) {
//														//最高逾期期数取逾期持续月数
//														maxmonth6md = pbocLoanDetail.getOverdueMthMax().intValue();
//													}
//												}
//											}
//										}
//									}
//								}
//							}
//						} else if (pbocLoanSummaryss.getPaymentStatusM24() != null
//								&& !pbocLoanSummaryss.getPaymentStatusM24().equals("")) {
//							//根据近24个月还款记录，查询最高逾期期数
//							if (countNh(num, pbocLoanSummaryss.getPaymentStatusM24(), null) > high6md) {
//								high6md = countNh(num, pbocLoanSummaryss.getPaymentStatusM24(), null);
//							}
//						}
//					}
//				}
//			} catch (Exception e) {
//				high6md = -1;
//			}
//		}
//
//		/** 准贷记卡部分 */
//		int high6mzcd = 0;
//		int maxmonth6mzcd = 0;
//		try {
//			Set<PbocSldSummary> psb = pboc.getPbocSldSummaries();
//			Iterator psListb = (Iterator) psb.iterator();
//			while (psListb.hasNext()) {
//				PbocSldSummary pss = (PbocSldSummary) psListb.next();
//				if (pss.getCcStatus() != null && !pss.getCcStatus().equals("")) {
//					// 状态为“止付”、“冻结”、“呆账”，给默认值99
//					if (pss.getCcStatus().equals(CardStatus.DZ.getValue())
//							|| pss.getCcStatus().equals(CardStatus.ZF.getValue())
//							|| pss.getCcStatus().equals(CardStatus.DJ.getValue())) {// 呆账
//						high6mzcd = 99;
//						break;
//					}
//				}
//
//			}
//		} catch (Exception e) {
//			high6mzcd = -1;
//		}
//		if (high6mzcd != 99) {
//			try {
//				Set<PbocSldSummary> psb = pboc.getPbocSldSummaries();
//				Iterator psListb = (Iterator) psb.iterator();
//				while (psListb.hasNext()) {
//					PbocSldSummary pss = (PbocSldSummary) psListb.next();
//					if (StringUtil.isNotEmpty(pss.getCcStatus())) {
//						//卡状态为销户，则根据报告查询日期往前推n月计算最高逾期期数，准贷记卡逾期期数大于等于2算逾期
//						if (pss.getCcStatus().equals(CardStatus.XH.getValue())) {//销户
//							
//							Set<PbocSldDetail> psd = pss.getPbocSldDetail();
//							Iterator listPsd = (Iterator) psd.iterator();
//							
//							while (listPsd.hasNext()) {
//								PbocSldDetail pl = (PbocSldDetail) listPsd.next();
//								//报告查询日期
//								if (pboc.getReportCreateTime() != null) {
//									String date = formats.format(pboc.getReportCreateTime());
//									// 以查询日期往前推n个月，yyyyMM格式
//									String months = DateUtil.getMonths(24-num, date);
//									//透支月份
//									if (StringUtil.isNotEmpty(pl.getOdMth())) {
//										int odMonth = Integer.parseInt(pl.getOdMth().replace(".", ""));
//										////透支月份大于“months”小于报告查询日期
//										if (odMonth >= Integer.parseInt(months)) {
//											if (odMonth <= Integer.parseInt(date)) {
//												if (pl.getOdMthMax() != null) {
//													if (pl.getOdMthMax().intValue() > maxmonth6mzcd) {
//														//最高逾期期数取透支持续月数
//														maxmonth6mzcd = pl.getOdMthMax().intValue();
//													}
//												}
//											}
//										}
//									}
//								}
//							}
//						} else if (pss.getPaymentStatusM24() != null && !pss.getPaymentStatusM24().equals("")) {
//							//根据近24个月还款记录，查询最高逾期期数
//							if (countNh(num, pss.getPaymentStatusM24(), BusinessType.ZDJK) > high6mzcd) {
//								high6mzcd = countNh(num, pss.getPaymentStatusM24(), BusinessType.ZDJK) - 1;
//							}
//						}
//					}
//				}
//			} catch (Exception e) {
//				high6mzcd = -1;
//			}
//		}
//
//		/** 贷记卡部分 */
//		int high6mcd = 0;
//		int maxmonth6mcd = 0;
//		try {
//			Set<PbocLoancardSummary> plsv = pboc.getPbocLoancardSummaries();
//			Iterator listlsv = (Iterator) plsv.iterator();
//			while (listlsv.hasNext()) {
//				PbocLoancardSummary psd = (PbocLoancardSummary) listlsv.next();
//				if (psd.getCcStatus() != null && !psd.getCcStatus().equals("")) {
//					// 状态为“止付”、“冻结”、“呆账”，给默认值99
//					if (psd.getCcStatus().equals(CardStatus.DZ.getValue())
//							|| psd.getCcStatus().equals(CardStatus.ZF.getValue())
//							|| psd.getCcStatus().equals(CardStatus.DJ.getValue())) {
//						high6mcd = 99;
//						break;
//					}
//				}
//			}
//		} catch (Exception e) {
//			high6mcd = -1;
//		}
//		if (high6mcd != 99) {
//			try {
//				Set<PbocLoancardSummary> plsv = pboc.getPbocLoancardSummaries();
//				Iterator listlsv = (Iterator) plsv.iterator();
//				while (listlsv.hasNext()) {
//					PbocLoancardSummary psd = (PbocLoancardSummary) listlsv.next();
//					// String day = AnalysisLoan.getDay(psd.getDescription());
//					if (StringUtil.isNotEmpty(psd.getCcStatus())) {
//						//卡状态为销户，则根据报告查询日期往前推n月计算最高逾期期数
//						if (psd.getCcStatus().equals(CardStatus.XH.getValue())) {
//							Set<PbocLoancardDetail> pld = psd.getPbocLoancardDetail();
//							Iterator listPsd = (Iterator) pld.iterator();
//							while (listPsd.hasNext()) {
//								PbocLoancardDetail pl = (PbocLoancardDetail) listPsd.next();
//								//报告查询日期
//								if (pboc.getReportCreateTime() != null) {
//									String date = formats.format(pboc.getReportCreateTime());
//									// 以查询日期往前推n个月，yyyyMM格式
//									String months = DateUtil.getMonths(24-num, date);
//									//逾期月份
//									if (StringUtil.isNotEmpty(pl.getOverdueMth())) {
//										int odMonth = Integer.parseInt(pl.getOverdueMth().replace(".", ""));
//										//逾期月份大于“months”小于报告查询日期
//										if (odMonth >= Integer.parseInt(months)) {
//											if (odMonth <= Integer.parseInt(date)) {
//												//逾期持续月数
//												if (pl.getOverdueMthMax() != null) {
//													if (pl.getOverdueMthMax().intValue() > maxmonth6mcd) {
//														//最高逾期期数取逾期持续月数
//														maxmonth6mcd = pl.getOverdueMthMax().intValue();
//													}
//												}
//											}
//										}
//									}
//								}
//							}
//						} else if (psd.getPaymentStatusM24() != null && !psd.getPaymentStatusM24().equals("")) {
//							//根据近24个月还款记录，查询最高逾期期数
//							if (countNh(num, psd.getPaymentStatusM24(), null) > high6mcd) {
//								high6mcd = countNh(num, psd.getPaymentStatusM24(), null);
//							}
//						}
//					}
//				}
//			} catch (Exception e) {
//				high6mcd = -1;
//			}
//		}
//
//		BigDecimal[] L6M = new BigDecimal[3];
//		
//		L6M[0] = new BigDecimal(high6md > maxmonth6md ? high6md : maxmonth6md);
//		L6M[1] = new BigDecimal(high6mcd > maxmonth6mcd ? high6mcd : maxmonth6mcd);
//		L6M[2] = new BigDecimal(high6mzcd > maxmonth6mzcd ? high6mzcd : maxmonth6mzcd);
//		
//		return L6M;
//	}
//	
//	/**
//	 * 最大欠税总额 luqian 20140730
//	 * 
//	 * 获得征信查询人所有欠税记录中的最大欠税总额
//	 * @param pboc
//	 * @return
//	 */
//	public BigDecimal maxOweTaxAmt(PbocSummary pboc){
//		//欠税记录
//		Set<PbocOweTaxRecored> taxSet = null;
//		
//		//最大欠税总额
//		double maxOweTaxAmt = 0;
//		
//		if (pboc != null){
//			taxSet = pboc.getPbocOweTaxRecoreds();
//		}
//		
//		if (taxSet != null && taxSet.size() != 0){
//			
//			Iterator<PbocOweTaxRecored> taxIt = taxSet.iterator();
//			while(taxIt.hasNext()){
//				PbocOweTaxRecored pbocOweTaxRecored = taxIt.next();
//				
//				if (pbocOweTaxRecored != null && pbocOweTaxRecored.getOweTaxAmt() != null){
//					BigDecimal oweTaxAmt = pbocOweTaxRecored.getOweTaxAmt();
//					//取最大值
//					maxOweTaxAmt = maxOweTaxAmt > oweTaxAmt.doubleValue() ? maxOweTaxAmt : oweTaxAmt.doubleValue();
//				}else{
//					continue;
//				}
//				
//			}
//		}
//		
//		return new BigDecimal(maxOweTaxAmt);
//	}

}
