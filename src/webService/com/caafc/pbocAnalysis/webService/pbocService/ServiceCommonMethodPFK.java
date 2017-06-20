/*
 * Copyright (c) 2014 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: jseds
 * create: 2014-4-25 上午09:31:11
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.webService.pbocService;


/**
 * 征信评分卡策略取值方法
 * 
 * @author zl
 * @version $Revision:$
 */
public class ServiceCommonMethodPFK {

	/**
	 * 主申人信贷过去6个月M1+逾期的月数 (信用卡专用) 信贷：包括贷款，贷记卡和准贷记卡 其中准贷记卡的逾期期数要-2
	 * 
	 * @param pboc
	 * @return
	 * @throws ParseException
	 */
//	@SuppressWarnings( { "unchecked", "rawtypes" })
//	public int creditCardCountYuQi6(PbocSummary pboc) throws ParseException, Exception {
//		return yqCount(pboc, 6, null, null, null);
//	}
//
//	/**
//	 * 判断逾期--月数（信用卡评分卡专用）
//	 * 
//	 * @param pboc
//	 * @param month 判断时间月份数(如果为空则判断所有时间段)
//	 * @param status1 贷记卡
//	 * @param status2 准贷记卡
//	 * @param status3 贷款状态
//	 * @return
//	 * @throws ParseException
//	 */
//	public int yqCount(PbocSummary pboc, int month, String[] status, String[] status2, String[] status3)
//			throws ParseException, Exception {
//		if ((pboc.getPbocLoanSummaries() == null || pboc.getPbocLoanSummaries().size() <= 0)
//				&& (pboc.getPbocLoancardSummaries() == null || pboc.getPbocLoancardSummaries().size() <= 0)
//				&& (pboc.getPbocSldSummaries() == null || pboc.getPbocSldSummaries().size() <= 0)) {
//			return -9998;
//		}
//		Map<String, String> mapAll = new HashMap<String, String>();
//		// 去掉同一月份日期
//		mapAll.putAll(YQSldCardMonths(pboc, month, null));
//		mapAll.putAll(YQLoanCardMonths(pboc, month, null));
//		mapAll.putAll(YQLoanMonths(pboc, month, null));
//		return mapAll.size();
//	}
//
//	/**
//	 * 判断逾期--次数（信用卡评分卡专用）
//	 * 
//	 * @param pboc
//	 * @param month 判断时间月份数(如果为空则判断所有时间段)
//	 * @param status1 贷记卡
//	 * @param status2 准贷记卡
//	 * @param status3 贷款状态
//	 * @return
//	 * @throws ParseException
//	 */
//	public int yqCounts(PbocSummary pboc, int month, String isRMB, String[] status, String[] status2, String[] status3)
//			throws ParseException, Exception {
//		if ((pboc.getPbocLoanSummaries() == null || pboc.getPbocLoanSummaries().size() <= 0)
//				&& (pboc.getPbocLoancardSummaries() == null || pboc.getPbocLoancardSummaries().size() <= 0)
//				&& (pboc.getPbocSldSummaries() == null || pboc.getPbocSldSummaries().size() <= 0)) {
//			return -9998;
//		}
//		int count = 0;
//		// 去掉同一月份日期
//		count = count + YQSldCardMonths(pboc, month, null).size();
//		count = count + YQLoanCardMonths(pboc, month, null).size();
//		count = count + YQLoanMonths(pboc, month, null).size();
//		return count;
//	}
//
//	/**
//	 * 获取贷记卡逾期月份（信用卡评分卡专用）----单张卡
//	 * 
//	 * @param psl 所有贷记卡信息
//	 * @param month 判断时间月份数(如果为0则判断所有时间段)
//	 * @param status 贷记卡，准贷记卡，贷款状态 如果有值则根据给的值判断状态 没有默认全部
//	 * @param queryTime 查询日期
//	 * @return
//	 * @throws ParseException
//	 */
//	public Map<String, String> yqLoanCardMonth(PbocLoancardSummary pls, int month, String[] status, Date queryTime)
//			throws ParseException, Exception {
//
//		Map<String, String> map = new HashMap<String, String>();// 存放逾期月份
//		int s = 0;
//		if (status != null && status.length > 0) {
//			for (int i = 0; i < status.length; i++) {
//				if (StringUtil.isNotEmpty(pls.getCcStatus()) && pls.getCcStatus().equals(status[i])) {
//					s = 1;
//				}
//			}
//
//		} else {
//			s = 1;
//		}
//		if (s == 1) {
//			if (StringUtil.isNotEmpty(pls.getCcStatus())
//					&& (pls.getCcStatus().equals(CardStatus.XH.getValue()) || pls.getCcStatus().equals(
//						CardStatus.DZ.getValue()))) {// 如果状态为销户则查
//				// 贷款逾期记录详情表
//				Set<PbocLoancardDetail> set = pls.getPbocLoancardDetail();
//				if (set != null && set.size() > 0) {// 判断是否有数据
//					Iterator pld = (Iterator) set.iterator();
//					while (pld.hasNext()) {
//						PbocLoancardDetail pbocLoancardDetail = (PbocLoancardDetail) pld.next();
//						if (pbocLoancardDetail != null && StringUtils.isNotEmpty(pbocLoancardDetail.getOverdueMth())) {
//							String overduMth = pbocLoancardDetail.getOverdueMth();
//							if (month == 0) {
//								map.put(overduMth.replace(".", ""), "");
//							} else {
//								int count = DateUtil.getMonths(DateUtil
//										.fromString(overduMth.replace(".", ""), "yyyyMM"), queryTime);// 计算2个日期相差月份数
//								if (count <= month) {
//									map.put(overduMth.replace(".", ""), "");
//								}
//							}
//
//						}
//					}
//				}
//
//			} else {
//				Set<PbocLoancardDetail> set = pls.getPbocLoancardDetail();
//				if (month > 24 || month == 0) {// 如果判断逾期月数>24个月则要取逾期表中数据判断
//					if (set != null && set.size() > 0) {// 判断是否有数据
//						Iterator pld = (Iterator) set.iterator();
//						while (pld.hasNext()) {
//							PbocLoancardDetail pbocLoancardDetail = (PbocLoancardDetail) pld.next();
//							if (pbocLoancardDetail != null
//									&& StringUtils.isNotEmpty(pbocLoancardDetail.getOverdueMth())) {
//								String overduMth = pbocLoancardDetail.getOverdueMth();
//								if (month == 0) {
//									map.put(overduMth.replace(".", ""), "");
//								} else {
//									int count = DateUtil.getMonths(DateUtil.fromString(overduMth.replace(".", ""),
//										"yyyyMM"), queryTime);// 计算2个日期相差月份数
//									if (count <= month) {
//										map.put(overduMth.replace(".", ""), "");
//									}
//								}
//							}
//
//						}
//					}
//				}
//				if (StringUtil.isNotEmpty(pls.getPaymentStatusM24()) && pls.getBillDate() != null) {
//					map.putAll(getQyMonth(pls.getPaymentStatusM24(), month, queryTime, pls.getBillDate(), "1"));// 获取24个月贷记卡逾期信息
//				}
//			}
//		}
//
//		return map;
//
//	}
//
//	/**
//	 * 获取贷记卡逾期月份（信用卡评分卡专用）--所有贷记卡
//	 * 
//	 * @param psl 所有贷记卡信息
//	 * @param month 判断时间月份数(如果为0则判断所有时间段)
//	 * @param status 贷记卡，准贷记卡，贷款状态 如果有值则根据给的值判断状态 没有默认全部
//	 * @return
//	 * @throws ParseException
//	 */
//	public Map<String, String> YQLoanCardMonths(PbocSummary pboc, int month, String[] status) throws ParseException,
//			Exception {
//		Map<String, String> map = new HashMap<String, String>();
//		Set<PbocLoancardSummary> psl = pboc.getPbocLoancardSummaries();// 获取贷记卡信息
//		if (psl != null && psl.size() > 0) {
//			// 查询日期
//			// String queryDate = DateUtil.convertDateToString(pboc.getQueryTime(), "yyyyMM");
//			Iterator pl1 = (Iterator) psl.iterator();
//			while (pl1.hasNext()) {
//				PbocLoancardSummary pls = (PbocLoancardSummary) pl1.next();
//				map.putAll(yqLoanCardMonth(pls, month, status, pboc.getQueryTime()));
//			}
//		}
//		return map;
//	}
//
//	/**
//	 * 获取准贷记卡逾期月份（信用卡专用）
//	 * 
//	 * @param psl 所有贷记卡信息
//	 * @param month 判断时间月份数(如果为0则判断所有时间段)
//	 * @param status 贷记卡，准贷记卡，贷款状态 如果有值则根据给的值判断状态 没有默认全部
//	 * @param queryTime 查询日期
//	 * @return
//	 * @throws ParseException
//	 */
//	public Map<String, String> YQSldCardMonth(PbocSldSummary pls, int month, String[] status, Date queryTime)
//			throws ParseException, Exception {
//		Map<String, String> map = new HashMap<String, String>();
//		int s = 0;
//		if (status != null && status.length > 0) {
//			for (int i = 0; i < status.length; i++) {
//				if (StringUtil.isNotEmpty(pls.getCcStatus()) && pls.getCcStatus().equals(status[i])) {
//					s = 1;
//				}
//			}
//
//		} else {
//			s = 1;
//		}
//		if (s == 1) {
//			if (StringUtil.isNotEmpty(pls.getCcStatus())
//					&& (pls.getCcStatus().equals(CardStatus.XH.getValue()) || pls.getCcStatus().equals(
//						CardStatus.DZ.getValue()))) {// 如果状态为销户则查
//				// 贷款逾期记录详情表
//				Set<PbocSldDetail> set = pls.getPbocSldDetail();
//				if (set != null && set.size() > 0) {// 判断是否有数据
//					Iterator<PbocSldDetail> pld = set.iterator();
//					while (pld.hasNext()) {
//						PbocSldDetail pbocSldDetail = pld.next();
//						if (pbocSldDetail != null && StringUtils.isNotEmpty(pbocSldDetail.getOdMth())) {
//							String overduMth = pbocSldDetail.getOdMth();
//							int count = DateUtil.getMonths(DateUtil.fromString(overduMth.replace(".", ""), "yyyyMM"),
//								queryTime);// 计算2个日期相差月份数
//							if (month == 0) {
//								if (pbocSldDetail.getOdMthMax().intValue() >= 3) {
//									map.put(overduMth.replace(".", ""), "");
//								}
//							} else {
//								if (count <= month) {
//									if (pbocSldDetail.getOdMthMax().intValue() >= 3) {
//										map.put(overduMth.replace(".", ""), "");
//									}
//								}
//							}
//						}
//					}
//				}
//			} else {
//				Set<PbocSldDetail> set = pls.getPbocSldDetail();
//				if (month > 24 || month == 0) {// 如果判断逾期月数>24个月则要取逾期表中数据判断
//					if (set != null && set.size() > 0) {// 判断是否有数据
//						Iterator pld = (Iterator) set.iterator();
//						while (pld.hasNext()) {
//							PbocSldDetail pbocSldDetail = (PbocSldDetail) pld.next();
//							if (pbocSldDetail != null && StringUtils.isNotEmpty(pbocSldDetail.getOdMth())) {
//								String overduMth = pbocSldDetail.getOdMth();
//								int count = DateUtil.getMonths(DateUtil
//										.fromString(overduMth.replace(".", ""), "yyyyMM"), queryTime);// 计算2个日期相差月份数
//								if (month == 0) {
//									if (pbocSldDetail.getOdMthMax().intValue() >= 3) {
//										map.put(overduMth.replace(".", ""), "");
//									}
//								} else {
//									if (count <= month) {
//										if (pbocSldDetail.getOdMthMax().intValue() >= 3) {
//											map.put(overduMth.replace(".", ""), "");
//										}
//									}
//								}
//							}
//						}
//					}
//				}
//				if (StringUtil.isNotEmpty(pls.getPaymentStatusM24())) {
//					map.putAll(getQyMonth(pls.getPaymentStatusM24(), month, queryTime, pls.getBillDate(), "2"));// 获取24个月准贷记卡逾期信息
//				}
//			}
//		}
//
//		return map;
//
//	}
//
//	/**
//	 * 获取准贷记卡逾期月份（信用卡专用）
//	 * 
//	 * @param psl 所有贷记卡信息
//	 * @param month 判断时间月份数(如果为0则判断所有时间段)
//	 * @param status 准贷记卡状态 如果有值则根据给的值判断状态 没有默认全部
//	 * @return
//	 * @throws ParseException
//	 */
//	public Map<String, String> YQSldCardMonths(PbocSummary pboc, int month, String[] status) throws ParseException,
//			Exception {
//		Map<String, String> map = new HashMap<String, String>();
//		Set<PbocSldSummary> psl = pboc.getPbocSldSummaries();// 获取准贷记卡信息
//		if (psl != null && psl.size() > 0) {
//			// 查询日期
//			// String queryDate = DateUtil.convertDateToString(pboc.getQueryTime(), "yyyyMM");
//			Iterator<PbocSldSummary> pl1 = psl.iterator();
//			while (pl1.hasNext()) {
//				PbocSldSummary pls = pl1.next();
//				map.putAll(YQSldCardMonth(pls, month, status, pboc.getQueryTime()));
//			}
//		}
//		return map;
//	}
//
//	/**
//	 * 获取贷款逾期月份（信用卡专用）
//	 * 
//	 * @param psl 所有贷款信息
//	 * @param month 判断时间月份数(如果为0则判断所有时间段)
//	 * @param status 贷款状态 如果有值则根据给的值判断状态 没有默认全部
//	 * @param queryTime 查询日期
//	 * @return
//	 * @throws ParseException
//	 */
//	public Map<String, String> YQLoanMonth(PbocLoanSummary pls, int month, String[] status, Date queryTime)
//			throws ParseException, Exception {
//		Map<String, String> map = new HashMap<String, String>();
//		int s = 0;
//		if (status != null && status.length > 0) {
//			for (int i = 0; i < status.length; i++) {
//				if (StringUtil.isNotEmpty(pls.getLoanStatus()) && pls.getLoanStatus().equals(status[i])) {
//					s = 1;
//				}
//			}
//
//		} else {
//			s = 1;
//		}
//		if (s == 1) {
//			if (StringUtil.isNotEmpty(pls.getLoanStatus())
//					&& (pls.getLoanStatus().equals(LoanStatus.JQ.getValue()) || pls.getLoanStatus().equals(
//						LoanStatus.DZ.getValue()))) {// 如果状态为已结清则查 贷款逾期记录详情表
//				Set<PbocLoanDetail> set = pls.getPbocLoanDetail();
//				if (set != null && set.size() > 0) {// 判断是否有数据
//					Iterator<PbocLoanDetail> pld = set.iterator();
//					while (pld.hasNext()) {
//						PbocLoanDetail pbocLoanDetail = pld.next();
//						if (pbocLoanDetail != null && StringUtils.isNotEmpty(pbocLoanDetail.getOverdueMth())) {
//							String overduMth = pbocLoanDetail.getOverdueMth();
//							if (month == 0) {
//								map.put(overduMth.replace(".", ""), "");
//							} else {
//								int count = DateUtil.getMonths(DateUtil
//										.fromString(overduMth.replace(".", ""), "yyyyMM"), queryTime);// 计算2个日期相差月份数
//								if (count <= month) {
//									map.put(overduMth.replace(".", ""), "");
//								}
//							}
//
//						}
//					}
//				}
//
//			} else {// 未结清
//				if (month > 24 || month == 0) {// 如果判断逾期月数>24个月则要取逾期表中数据判断
//					Set<PbocLoanDetail> set = pls.getPbocLoanDetail();
//					if (set != null && set.size() > 0) {// 判断是否有数据
//						Iterator<PbocLoanDetail> pld = set.iterator();
//						while (pld.hasNext()) {
//							PbocLoanDetail pbocLoanDetail = pld.next();
//							if (pbocLoanDetail != null && StringUtils.isNotEmpty(pbocLoanDetail.getOverdueMth())) {
//								String overduMth = pbocLoanDetail.getOverdueMth();
//								if (month == 0) {
//									map.put(overduMth.replace(".", ""), "");
//								} else {
//									int count = DateUtil.getMonths(DateUtil.fromString(overduMth.replace(".", ""),
//										"yyyyMM"), queryTime);// 计算2个日期相差月份数
//									if (count <= month) {
//										map.put(overduMth.replace(".", ""), "");
//									}
//								}
//							}
//						}
//					}
//				}
//				if (StringUtil.isNotEmpty(pls.getPaymentStatusM24())) {
//					map.putAll(getQyMonth(pls.getPaymentStatusM24(), month, queryTime, pls.getPayDate(), "1"));// 获取24个月贷款逾期信息
//				}
//			}
//		}
//
//		return map;
//	}
//
//	/**
//	 * 获取贷款逾期月份（信用卡专用）
//	 * 
//	 * @param psl 所有贷款信息
//	 * @param month 判断时间月份数(如果为0则判断所有时间段)
//	 * @param isWB 是否包含外币卡 1包含 2不包含
//	 * @param status 贷记卡，准贷记卡，贷款状态 如果有值则根据给的值判断状态 没有默认全部
//	 * @return
//	 * @throws ParseException
//	 */
//	public Map<String, String> YQLoanMonths(PbocSummary pboc, int month, String[] status) throws ParseException,
//			Exception {
//		Set<PbocLoanSummary> psl = pboc.getPbocLoanSummaries();// 获取贷款信息
//		Map<String, String> map = new HashMap<String, String>();
//		if (psl != null && psl.size() > 0) {
//			// 查询日期
//			// String queryDate = DateUtil.convertDateToString(pboc.getQueryTime(), "yyyyMM");
//			Iterator<PbocLoanSummary> pl1 = psl.iterator();
//			while (pl1.hasNext()) {
//				PbocLoanSummary pls = pl1.next();
//				map.putAll(YQLoanMonth(pls, month, status, pboc.getQueryTime()));
//			}
//		}
//		return map;
//
//	}
//
//	/**
//	 * 根据24个月还款记录和要判断的逾期月份数来获取逾期信息
//	 * 
//	 * @param paymentStatusM24 24个月还款记录
//	 * @param month 要判断的月份数 month=0 查全部
//	 * @param queryDates 查询日期
//	 * @param paymentDate 24个月还款记录中最大日期
//	 * @param type 类型 1贷款，贷记卡 2准贷记卡
//	 * @return
//	 * @throws ParseException
//	 */
//	public Map<String, String> getQyMonth(String paymentStatusM24, int month, Date queryDates, Date paymentDate,
//			String type) throws ParseException, Exception {
//		Map<String, String> map = new HashMap<String, String>();
//		if (StringUtil.isNotEmpty(paymentStatusM24) && paymentDate != null) {
//
//			// 查询日期
//			int tmonths = 0;// 实际要在24个月中截取的月份数
//			String queryDate = DateUtil.convertDateToString(queryDates, "yyyyMM");
//			if (month == 0) {
//				tmonths = 24;
//			} else {
//				String beginDate = DateUtil.getMonths(month, queryDate);// 得要判断的起始日期
//				String maxDate24 = DateUtil.convertDateToString(paymentDate, "yyyyMM");// 24个月中最大日期
//				// 最大日期与起始日期进行比较
//				int r = DateUtil.compareDate(maxDate24, beginDate, "yyyyMM");
//				if (r == 1) {// 大于
//					Date date1 = DateUtil.fromString(maxDate24, "yyyyMM");
//					Date date2 = DateUtil.fromString(beginDate, "yyyyMM");
//					tmonths = DateUtil.getMonths(date1, date2);
//				} else if (r == 2) {// 小于
//					return map;
//				} else {// 等于
//					tmonths = 1;
//				}
//			}
//
//			// 最大日期>起始日期则，算出相差的月份数
//			// ***NN*******NN*******NNN
//			String ss = paymentStatusM24;// 近24个月还款信息
//			String s = ss.substring((ss.length() - tmonths), ss.length());// 截取最后month个月的还款信息
//			String[] last = new String[tmonths];
//			if (StringUtil.isNotEmpty(s)) {
//				for (int i = 0; i < s.length(); i++) {
//					String s1 = s.substring(i, i + 1);
//					last[i] = s1;// 把还款信息记录到数组last中
//				}
//				int c = last.length;
//				for (int i = 0; i < last.length; i++) {
//					if (testIsNum(last[i])) {
//						if (type.equals("2")) {// 如果为准贷记卡，要判断逾期值是否要>=3
//							int l = Integer.parseInt(last[i]);
//							if (l >= 3) {
//								// 获取逾期月份(查询日期-month)
//								String yqDate = DateUtil.getMonths(c, queryDate);
//								// 把逾期月份存入list中
//								map.put(yqDate, "");
//							}
//						} else {
//							// 获取逾期月份(查询日期-month)
//							String yqDate = DateUtil.getMonths(c, queryDate);
//							// 把逾期月份存入list中
//							map.put(yqDate, "");
//						}
//					}
//					c--;
//				}
//			}
//		}
//
//		return map;
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
//	 * 主申人信贷未结清且从未逾期账户的最大账龄(包含贷款，贷记卡，借记卡) 信用卡外币账户不考虑
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings( { "unchecked", "rawtypes", "unused" })
//	public int acctAges(PbocSummary pboc) throws ParseException, Exception {
//		// 贷记卡
//		Set<PbocLoancardSummary> LCSlist = pboc.getPbocLoancardSummaries();
//		Iterator list21 = (Iterator) LCSlist.iterator();
//		DateFormat formats = new SimpleDateFormat("yyyyMMdd");
//		Set<PbocCreditTip> listPT = pboc.getPbocCreditTips();
//		// 贷记卡账龄
//		int djkAge = 0;
//		// 贷记卡最大账龄
//		int djkAgeMax = 0;
//
//		String status1[] = new String[2];// 贷记卡和准贷记卡状态
//		status1[0] = CardStatus.ZC.getValue();
//		status1[1] = CardStatus.WJH.getValue();
//		String status2[] = new String[1];// 贷款状态
//		status2[0] = LoanStatus.ZC.getValue();
//		while (list21.hasNext()) {
//			PbocLoancardSummary pld = (PbocLoancardSummary) list21.next();
//			// 判断是否逾期
//			if (StringUtil.isNotEmpty(pld.getCcStatus())
//					&& (pld.getCcStatus().equals(CardStatus.ZC.getValue()) || pld.getCcStatus().equals(
//						CardStatus.WJH.getValue())) && StringUtil.isNotEmpty(pld.getDescription())) {
//				if (StringUtils.isNotEmpty(pld.getDescription())) {//
//					if (!checkRMB(pld.getDescription())) {// 判断是否是外币，是外币则跳过
//						continue;
//					}
//				}
//				Map<String, String> map = yqLoanCardMonth(pld, 0, status1, pboc.getQueryTime());
//				if (map != null && map.size() > 0) {// 判断是否有逾期，逾期则跳过
//					continue;
//				}
//				String loanT = pld.getDescription();
//				String yearL = loanT.split("\\.")[1].substring(0, 4);
//				String monthL = loanT.split("\\.")[1].substring(5, 7);
//				String dayL = loanT.split("\\.")[1].substring(8, 10);
//				String date = yearL + "-" + monthL + "-" + dayL;
//				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//				djkAge = DateUtil.getMonths(pboc.getQueryTime(), df.parse(date));
//				if (djkAge > djkAgeMax) {
//					djkAgeMax = djkAge;
//				}
//			}
//
//		}
//		// 准贷记卡
//		Set<PbocSldSummary> sldList = pboc.getPbocSldSummaries();
//		Iterator sld = (Iterator) sldList.iterator();
//		int zdjkAge = 0;
//		// 准贷记卡最大账龄
//		int zdjkAgeMax = 0;
//
//		while (sld.hasNext()) {
//			PbocSldSummary pld = (PbocSldSummary) sld.next();
//			if (StringUtil.isNotEmpty(pld.getCcStatus())
//					&& (pld.getCcStatus().equals(CardStatus.ZC.getValue()) || pld.getCcStatus().equals(
//						CardStatus.WJH.getValue())) && StringUtil.isNotEmpty(pld.getDescription())) {
//				if (StringUtils.isNotEmpty(pld.getDescription())) {//
//					if (!checkRMB(pld.getDescription())) {// 判断是否是外币
//						continue;
//					}
//				}
//				Map<String, String> map = YQSldCardMonth(pld, 0, status1, pboc.getQueryTime());
//				if (map != null && map.size() > 0) {// 判断是否有逾期
//					continue;
//				}
//				String loanT = pld.getDescription();
//				String yearL = loanT.split("\\.")[1].substring(0, 4);
//				String monthL = loanT.split("\\.")[1].substring(5, 7);
//				String dayL = loanT.split("\\.")[1].substring(8, 10);
//				String date = yearL + "-" + monthL + "-" + dayL;
//				SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
//				zdjkAge = DateUtil.getMonths(new Date(), df.parse(date));
//				if (zdjkAge > zdjkAgeMax) {
//					zdjkAgeMax = zdjkAge;
//				}
//			}
//		}
//		// 贷款
//		Set<PbocLoanSummary> LSlist = pboc.getPbocLoanSummaries();
//		Iterator list211 = (Iterator) LSlist.iterator();
//		int dkAge = 0;
//		// 贷款最大账龄
//		int dkAgeMax = 0;
//		while (list211.hasNext()) {
//			PbocLoanSummary pld = (PbocLoanSummary) list211.next();
//			if (StringUtil.isNotEmpty(pld.getLoanStatus()) && pld.getLoanStatus().equals("0")
//					&& pld.getLoanOccureDate() != null) {
//				Map<String, String> map = YQLoanMonth(pld, 0, status2, pboc.getQueryTime());
//				if (map != null && map.size() > 0) {// 判断是否有逾期
//					continue;
//				}
//				dkAge = DateUtil.getMonths(new Date(), pld.getLoanOccureDate());
//				if (dkAge > dkAgeMax) {
//					dkAgeMax = dkAge;
//				}
//			}
//		}
//
//		// 取三者之中的最大值
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
//	 * 主申人信贷当前正常且从未逾期账户数(包含贷款，贷记卡，准贷记卡)
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 * @throws NumberFormatException
//	 */
//	@SuppressWarnings( { "unchecked", "rawtypes" })
//	public int countWeiYuQis(PbocSummary pboc) throws NumberFormatException, ParseException, Exception {
//		// 贷款
//		int countDk = 0;
//		String status1[] = new String[2];// 贷记卡和准贷记卡状态
//		status1[0] = CardStatus.ZC.getValue();
//		status1[1] = CardStatus.WJH.getValue();
//		String status2[] = new String[1];// 贷款状态
//		status2[0] = LoanStatus.ZC.getValue();
//		Set<PbocLoanSummary> dkList = pboc.getPbocLoanSummaries();
//		if (dkList != null && dkList.size() > 0) {
//			Iterator dks = (Iterator) dkList.iterator();
//			while (dks.hasNext()) {
//				PbocLoanSummary ls = (PbocLoanSummary) dks.next();
//				if (ls != null) {
//					if (StringUtil.isNotEmpty(ls.getLoanStatus()) && ls.getLoanStatus().equals("0")) {// 状态正常
//						Map<String, String> map = YQLoanMonth(ls, 0, status2, pboc.getQueryTime());
//						if (map == null || map.size() <= 0) {// 判断是否有逾期，计算未逾期账户数
//							countDk++;
//						}
//					}
//				}
//
//			}
//		}
//		int countDJK = 0;
//		// 贷记卡
//		Set<PbocLoancardSummary> LDlist = pboc.getPbocLoancardSummaries();
//		if (LDlist != null && LDlist.size() > 0) {
//			Iterator djk = (Iterator) LDlist.iterator();
//			while (djk.hasNext()) {
//				PbocLoancardSummary plds = (PbocLoancardSummary) djk.next();
//				if (StringUtil.isNotEmpty(plds.getCcStatus())) {// 状态正常
//					if (plds.getCcStatus().equals(CardStatus.ZC.getValue())
//							|| plds.getCcStatus().equals(CardStatus.WJH.getValue())) {
//						if (!checkRMB(plds.getDescription())) {// 如果是外币则不累计
//							continue;
//						}
//						Map<String, String> map = yqLoanCardMonth(plds, 0, status1, pboc.getQueryTime());
//						if (map == null || map.size() <= 0) {// 判断是否有逾期
//							countDJK++;
//						}
//					}
//				}
//			}
//		}
//		// 准贷记卡
//		int countSld = 0;
//		Set<PbocSldSummary> sldList = pboc.getPbocSldSummaries();
//		if (LDlist != null && LDlist.size() > 0) {
//			Iterator sld = (Iterator) sldList.iterator();
//
//			while (sld.hasNext()) {
//				PbocSldSummary plds = (PbocSldSummary) sld.next();
//				if (StringUtil.isNotEmpty(plds.getCcStatus())
//						&& (plds.getCcStatus().equals(CardStatus.ZC.getValue()) || plds.getCcStatus().equals(
//							CardStatus.WJH.getValue()))) {
//					if (!checkRMB(plds.getDescription())) {// 如果是外币则不累计
//						continue;
//					}
//					Map<String, String> map = YQSldCardMonth(plds, 0, status1, pboc.getQueryTime());
//					if (map == null || map.size() <= 0) {// 判断是否有逾期
//						countSld++;
//					}
//				}
//			}
//		}
//		return countDJK + countDk + countSld;
//	}
//
//	/**
//	 * 近N个月本行审批征信查询次数
//	 * 
//	 * @param pboc
//	 * @return
//	 * @throws ParseException
//	 */
//	@SuppressWarnings( { "unchecked", "rawtypes" })
//	public int countQuery(PbocSummary pboc, int n) throws ParseException, Exception {
//		Set<PbocLaQueryDetail> listPlqd = pboc.getPbocLaQueryDetails();
//		// 取查询日期前几个月的日期
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMM");
//		int countILastN = 0;
//		String lastNMonth = DateUtil.getMonthByDate(n, pboc.getQueryTime(), "yyyyMM");
//		Iterator listPd = (Iterator) listPlqd.iterator();
//		while (listPd.hasNext()) {
//			PbocLaQueryDetail pbocLaQueryDetail = (PbocLaQueryDetail) listPd.next();
//			// 我行
//			String queryDate = sdf.format(pbocLaQueryDetail.getQueryDate());// 查询日期
//			if (Integer.parseInt(queryDate) >= Integer.parseInt(lastNMonth)) {
//				// 贷款审批：02/信用卡审批：03
//				if (pbocLaQueryDetail.getQueryReason().equals("02") || pbocLaQueryDetail.getQueryReason().equals("03")) {
//					countILastN++;
//				}
//			}
//		}
//		return countILastN;
//	}
//
//	// 信用卡总额度使用率
//	@SuppressWarnings( { "unchecked", "rawtypes" })
//	public float countDJKS(PbocSummary pboc) {
//		Set<PbocLoancardSummary> plsv = pboc.getPbocLoancardSummaries();
//		Iterator listlsv = (Iterator) plsv.iterator();
//		float countAll = 0;
//		float count = 0;
//		while (listlsv.hasNext()) {
//			PbocLoancardSummary psd = (PbocLoancardSummary) listlsv.next();
//			if (psd.getCcStatus().equals("1")) {
//				if (psd.getUseAmt() != null) {
//					count = count + psd.getUseAmt().intValue();
//				}
//				if (psd.getShareAmt() != null) {
//					countAll = countAll + psd.getShareAmt().intValue();
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
//	 * 判断是否是人民币卡
//	 * 
//	 * @param discription 描述
//	 * @return true 包含 false不包含
//	 */
//	public boolean checkRMB(String discription) {
//		if (StringUtils.isNotEmpty(discription)) {
//			String m = discription.substring(0, discription.indexOf("，"));
//			if (m.indexOf("人民币") > 0) {
//				return true;
//			}
//		}
//		return false;
//
//	}
//
//	public static void main(String[] args) {
//		ServiceCommonMethodPFK s = new ServiceCommonMethodPFK();
//		String discription = "3.2007年11月04日机构“UT”发放的贷记卡(人民币账户），业务号X，授信额度折合人民币10,000元，信用/免担保，截止2010年05月25日尚未激活。";
//		System.out.println(s.checkRMB(discription));
//	}
}
