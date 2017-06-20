/*
 * Copyright (c) 2011 Technology Ltd.
 * All rights reserved.
 * project: nxcrm
 * create: 2011-3-21
 * cvs: $Id: DateUtil.java,v 1.1 2012/01/05 08:22:47 lawever Exp $
 */
package com.caafc.pbocAnalysis.util;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.commons.lang.StringUtils;

/**
 * 日期处理 (2011-3-21 上午10:35:32)
 * 
 * @author zhaoyan
 * @version $Revision: 1.1 $
 */
public class DateUtil {

	/**
	 * 得到本月的最后一天的前一天 如当前为10月31,返回10月30
	 */

	public static Date getMonthLastDayDecreaseOneDay() {
		Date lastDayDecreaseOneDay = decreaseOneDay(getMonthLastDay());		
		return lastDayDecreaseOneDay;
	}
	
	/**
	 * 得到本月的最后一天
	 */

	public static Date getMonthLastDay() {
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.DAY_OF_MONTH,
				calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		return calendar.getTime();
	}
	/**
	 * 日期加一天
	 * 
	 * @param date
	 * @return
	 */
	public static Date addOneDay(Date date) {
		return addMoreDay(date, 1);
	}

	/**
	 * 日期增加n天
	 * 
	 * @param date
	 * @param n
	 * @return
	 */
	public static Date addMoreDay(Date date, int n) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int dateOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		calendar.set(Calendar.DAY_OF_MONTH, dateOfMonth + n);
		return calendar.getTime();
	}

	/**
	 * 日期减一天
	 * 
	 * @param date
	 * @return
	 */
	public static Date decreaseOneDay(Date date) {
		return decreaseMoreDay(date, 1);
	}

	/**
	 * 日期减少n天
	 * 
	 * @param date
	 * @param n
	 * @return
	 */
	public static Date decreaseMoreDay(Date date, int n) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		int dateOfMonth = calendar.get(Calendar.DAY_OF_MONTH);
		calendar.set(Calendar.DAY_OF_MONTH, dateOfMonth - n);
		return calendar.getTime();
	}

	/**
	 * 获取字符串日期格式
	 * 
	 * @param date
	 * @param format
	 * @return
	 */
	public static String currDayData(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	/** 得到一天的开始日期时间 */
	public static Date startTimeOfDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 0);
		calendar.set(Calendar.MINUTE, 0);
		calendar.set(Calendar.SECOND, 0);
		return calendar.getTime();
	}

	/** 得到一天的结束日期时间 */
	public static Date endTimeOfDay(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(Calendar.HOUR_OF_DAY, 23);
		calendar.set(Calendar.MINUTE, 59);
		calendar.set(Calendar.SECOND, 59);
		return calendar.getTime();
	}

	/**
	 * 字符串转换成日期类型数据
	 * 
	 * @param dateStr
	 * @param format
	 * @return
	 * @throws ParseException
	 */
	public static Date fromString(String dateStr, String format) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.parse(dateStr);
	}

	/**
	 * 把日期转换成String
	 * 
	 * @param date 要转换的日期
	 * @param format 转换的String的格式
	 * @return
	 */
	public static String convertDateToString(Date date, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		return sdf.format(date);
	}

	/**
	 * 
	 * @param dateStr
	 * @param fromFormat
	 * @param toFormat
	 * @return
	 * @throws ParseException
	 */
	public static String zhDateString(String dateStr, String fromFormat, String toFormat) throws ParseException {
		Date date = fromString(dateStr, fromFormat);
		return currDayData(date, toFormat);
	}

	/**
	 * 将月份转换成当月月初和月末日期。 如 2012-09 转换成 [2012-09-01, 2012-09-30]
	 * 
	 * @param args
	 */
	public static String[] convertMonth(String monthString) {
		if (StringUtils.isBlank(monthString)) {
			return null;
		}
		String[] temp = monthString.split("-");

		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, Integer.parseInt(temp[0]));
		c.set(Calendar.MONTH, Integer.parseInt(temp[1]) - 1);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.getTime();

		String[] result = new String[2];
		result[0] = monthString + "-" + c.getActualMinimum(Calendar.DAY_OF_MONTH);
		result[1] = monthString + "-" + c.getActualMaximum(Calendar.DAY_OF_MONTH);
		return result;
	}

	/**
	 * 将月份转换成上个月的月初和月末日期。 如 2012-09 转换成 [2012-08-01, 2012-08-31]
	 * 
	 * @param args
	 */
	public static String[] convertLastMonth(String monthString) {
		if (StringUtils.isBlank(monthString)) {
			return null;
		}
		String[] temp = monthString.split("-");

		Calendar c = Calendar.getInstance();
		c.set(Calendar.YEAR, Integer.parseInt(temp[0]));
		c.set(Calendar.MONTH, Integer.parseInt(temp[1]) - 1);
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.add(Calendar.MONTH, -1); // 上个月
		c.getTime();

		monthString = c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1);

		String[] result = new String[2];
		result[0] = monthString + "-" + c.getActualMinimum(Calendar.DAY_OF_MONTH);
		result[1] = monthString + "-" + c.getActualMaximum(Calendar.DAY_OF_MONTH);
		return result;
	}

	/**
	 * 将季度转换成季度初和季度末的日期。 如 Q1 > [01-01, 03-31]、 Q2 > [04-01, 06-30]、 Q3 > [07-01, 09-30]、 Q4 > [10-01, 12-31]
	 * 
	 * @param year
	 * @param quarter
	 * @return
	 */
	public static String[] convertQuarter(String year, String quarter) {
		if (StringUtils.isBlank(year) || StringUtils.isBlank(quarter)) {
			return null;
		}
		String[] result = new String[2];
		if ("Q1".equalsIgnoreCase(quarter)) {
			result[0] = year + "-01-01";
			result[1] = year + "-03-31";
		} else if ("Q2".equalsIgnoreCase(quarter)) {
			result[0] = year + "-04-01";
			result[1] = year + "-06-30";
		} else if ("Q3".equalsIgnoreCase(quarter)) {
			result[0] = year + "-07-01";
			result[1] = year + "-09-30";
		} else if ("Q4".equalsIgnoreCase(quarter)) {
			result[0] = year + "-10-01";
			result[1] = year + "-12-31";
		}
		return result;
	}

	/**
	 * 将季度转换成上个季度初和季度末的日期。 如 Q1 > [01-01, 03-31]、 Q2 > [04-01, 06-30]、 Q3 > [07-01, 09-30]、 Q4 > [10-01, 12-31]
	 * 
	 * @param year
	 * @param quarter
	 * @return
	 */
	public static String[] convertLastQuarter(String year, String quarter) {
		if (StringUtils.isBlank(year) || StringUtils.isBlank(quarter)) {
			return null;
		}
		String[] result = new String[2];
		if ("Q1".equalsIgnoreCase(quarter)) {
			result[0] = (Integer.parseInt(year) - 1) + "-10-01";
			result[1] = (Integer.parseInt(year) - 1) + "-12-31";

		} else if ("Q2".equalsIgnoreCase(quarter)) {
			result[0] = year + "-01-01";
			result[1] = year + "-03-31";

		} else if ("Q3".equalsIgnoreCase(quarter)) {
			result[0] = year + "-04-01";
			result[1] = year + "-06-30";

		} else if ("Q4".equalsIgnoreCase(quarter)) {
			result[0] = year + "-07-01";
			result[1] = year + "-09-30";
		}
		return result;
	}

	/**
	 * 计算两个日期之间相差的月数
	 * modified by luqian at 20140722
	 * @param date1
	 * @param date2
	 * @return
	 */
	public static int getMonths(Date date1, Date date2) {
		int iMonth = 0;
		// int flag = 0;
		try {
			// 将两个日期赋值给日历对象
			Calendar objCalendarDate1 = Calendar.getInstance();
			objCalendarDate1.setTime(date1);

			Calendar objCalendarDate2 = Calendar.getInstance();
			objCalendarDate2.setTime(date2);

			// 如果时间相等，则相差月份为0
			if (objCalendarDate2.equals(objCalendarDate1)) {
				return 0;
			}
			// 如果date1晚于date2,将较迟的日期赋给日历2
			else if (objCalendarDate1.after(objCalendarDate2)) {
				Calendar temp = objCalendarDate1;
				objCalendarDate1 = objCalendarDate2;
				objCalendarDate2 = temp;
			}

			//当日历1的年份比日历2大（大于等于）时，算上总的月份数：修改点：年份相等的情况可以合并到这里
			if (objCalendarDate2.get(Calendar.YEAR) >= objCalendarDate1.get(Calendar.YEAR)){
				iMonth = ((objCalendarDate2.get(Calendar.YEAR) - objCalendarDate1.get(Calendar.YEAR))
								* 12 + objCalendarDate2.get(Calendar.MONTH))
								- objCalendarDate1.get(Calendar.MONTH);
			}
//			else{
//				iMonth = objCalendarDate2.get(Calendar.MONTH)
//				// - objCalendarDate1.get(Calendar.MONTH) - flag;
//						- objCalendarDate1.get(Calendar.MONTH);
//			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		return iMonth;
	}
	
	
	/**
	 * 计算月份差
	 * @param dateS1
	 * @param dateS2
	 * @return
	 */
	public static int getMonths(String dateS1, String dateS2) {
		int iMonth = 0;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
			Date date1 = sdf.parse(dateS1);
			Date date2 = sdf.parse(dateS2);
			// 将两个日期赋值给日历对象
			Calendar objCalendarDate1 = Calendar.getInstance();
			objCalendarDate1.setTime(date1);
			
			Calendar objCalendarDate2 = Calendar.getInstance();
			objCalendarDate2.setTime(date2);
			
			// 如果时间相等，则相差月份为0
			if (objCalendarDate2.equals(objCalendarDate1)) {
				return 0;
			}
			// 如果date1晚于date2,将较迟的日期赋给日历2
			else if (objCalendarDate1.after(objCalendarDate2)) {
				Calendar temp = objCalendarDate1;
				objCalendarDate1 = objCalendarDate2;
				objCalendarDate2 = temp;
			}
			
			//当日历1的年份比日历2大（大于等于）时，算上总的月份数：修改点：年份相等的情况可以合并到这里
			if (objCalendarDate2.get(Calendar.YEAR) >= objCalendarDate1.get(Calendar.YEAR)){
				iMonth = ((objCalendarDate2.get(Calendar.YEAR) - objCalendarDate1.get(Calendar.YEAR))
						* 12 + objCalendarDate2.get(Calendar.MONTH))
						- objCalendarDate1.get(Calendar.MONTH);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return iMonth;
	}

	/**
	 * 求日期之间的天数 date2大于date1返回正数，date2小于date1则返回负数
	 * 
	 * @param date1
	 * @param date2
	 * @return
	 * @throws ParseException
	 */
	public static int getDay(Date date1, Date date2) throws ParseException {
		// // int d = 0;
		// // Calendar cal1 = Calendar.getInstance();
		// // cal1.setTime(date1);
		// // Calendar cal2 = Calendar.getInstance();
		// // cal2.setTime(date2);
		// // if(date1.after(date2)) {
		// // return 0;
		// // }
		//
		// while(!(cal1.get(Calendar.YEAR) == cal2.get(Calendar.YEAR) &&
		// cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH)&&
		// cal1.get(Calendar.DAY_OF_MONTH) == cal2.get(Calendar.DAY_OF_MONTH))){
		//
		// cal1.add(Calendar.DAY_OF_MONTH, 1);
		// d++;
		// }
		converDateToDate(date1, null);
		converDateToDate(date2, null);

		long dateL = date2.getTime() - date1.getTime();
		long dateI = dateL / (1000 * 60 * 60 * 24);

		return (int) dateI;

	}

	/**
	 * date格式转换方法
	 * 
	 * @param date 需要转换格式的date
	 * @param formatString 转换格式,为空时，则默认为yyyyMMdd格式
	 * @return 转换后的date
	 * @throws ParseException
	 */
	public static Date converDateToDate(Date date, String formatString) throws ParseException {
		if (StringUtil.isEmpty(formatString)) {
			formatString = "yyyyMMdd";
		}

		SimpleDateFormat sdf = new SimpleDateFormat(formatString);
		date = sdf.parse(sdf.format(date));

		return date;
	}


	/**
	 * 下个月开始日期
	 * 
	 * @return
	 */
	public static BigDecimal StringToBigDecimal(Date date) {
		String years;
		String months;
		String days;
		Calendar call = Calendar.getInstance();
		call.setTime(date);
		call.add(Calendar.MONTH, 1);
		int year = call.get(Calendar.YEAR);
		int month = call.get(Calendar.MONTH);
		int day = call.getMinimum(Calendar.DAY_OF_MONTH);

		if (month == 0) {
			month = 12;
		}

		if (month >= 10) {
			months = month + "";
		} else {
			months = "0" + month;
		}
		if (day >= 10) {
			days = day + "";
		} else {
			days = "0" + day;
		}

		years = year + "";
		String dd = years + months + days;

		return new BigDecimal(dd);

	}

	/**
	 * 下个月开始日期
	 * 
	 * @return
	 */
	public static BigDecimal StringToNext(Date date) {
		String years;
		String months;
		String days;
		Calendar call = Calendar.getInstance();
		call.setTime(date);
		call.add(Calendar.MONTH, 2);
		int year = call.get(Calendar.YEAR);
		int month = call.get(Calendar.MONTH);
		int day = call.getMinimum(Calendar.DAY_OF_MONTH);

		if (month == 0) {
			month = 12;
		}

		if (month >= 10) {
			months = month + "";
		} else {
			months = "0" + month;
		}
		if (day >= 10) {
			days = day + "";
		} else {
			days = "0" + day;
		}

		years = year + "";
		String dd = years + months + days;

		return new BigDecimal(dd);

	}

	/**
	 * 下个月的第一天
	 * 
	 * @param regular
	 * @return
	 * @throws ParseException
	 */
	public static String getNextMonth(String regular) throws ParseException {
		// String as = regular.replace(".", "");
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		Calendar c = Calendar.getInstance();
		c.setTime(df.parse(regular));
		c.set(Calendar.MONTH, c.get(Calendar.MONTH) + 1);
		c.set(Calendar.DAY_OF_MONTH, 1);
		// System.out.println("下个月的第一天: " + df.format(c.getTime()));
		return df.format(c.getTime());
	}

	/**
	 * @param n 往前推N月
	 * @param regular yyyyMM或yyyy-mm
	 * @return 返回格式yyyyMM
	 * @throws ParseException
	 */
	public static String getMonths(int n, String regular) throws ParseException {
		String as = regular.replaceAll("-", "");
		SimpleDateFormat df = new SimpleDateFormat("yyyyMM");
		Calendar c = Calendar.getInstance();
		c.setTime(df.parse(as));
		c.add(Calendar.MONTH, -n);
		// c.set(Calendar.MONTH, c.get(Calendar.MONTH)-n);
		return df.format(c.getTime());
	}

	/**
	 * 往前推N月
	 * 
	 * @param regular
	 * @return
	 * @throws ParseException
	 */
	public static String getMonthByDate(int n, Date regular) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		Calendar c = Calendar.getInstance();
		c.setTime(regular);
		c.add(Calendar.MONTH, -n);
		// c.set(Calendar.MONTH, c.get(Calendar.MONTH)-n);
		return df.format(c.getTime());
	}

	/**
	 * 往前推N月,并定位到往前n月的多少号
	 * 
	 * @param regular
	 * @return
	 * @throws ParseException
	 */
	public static String getMonthByDate(int n, Date regular, int day) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		Calendar c = Calendar.getInstance();
		c.setTime(regular);
		c.add(Calendar.MONTH, -n);
		c.set(Calendar.DAY_OF_MONTH, day);
		// c.set(Calendar.MONTH, c.get(Calendar.MONTH)-n);
		return df.format(c.getTime());
	}
	
	/**
	 * 往前推N月
	 * @param n			往前n个月
	 * @param regular	起始日期
	 * @param format	转换成字符串的格式
	 * @return
	 * @throws ParseException
	 */
	public static String getMonthByDate(int n, Date regular, String format) throws ParseException {
		SimpleDateFormat df = new SimpleDateFormat(format);
		Calendar c = Calendar.getInstance();
		c.setTime(regular);
		c.add(Calendar.MONTH, -n);
		// c.set(Calendar.MONTH, c.get(Calendar.MONTH)-n);
		return df.format(c.getTime());
	}
	
	/**
	 * 本月第一天
	 * 
	 * @param regular
	 * @return
	 * @throws ParseException
	 */
	public static String getMonth(String regular) throws ParseException {
		// String as = regular.replaceAll("-", "");
		SimpleDateFormat df = new SimpleDateFormat("yyyyMMdd");
		Calendar c = Calendar.getInstance();
		c.setTime(df.parse(regular));
		c.set(Calendar.MONTH, c.get(Calendar.MONTH));
		c.set(Calendar.DAY_OF_MONTH, 1);
		// System.out.println("本月第一天: " + df.format(c.getTime()));
		return df.format(c.getTime());
	}

	/**
	 * 
	 * @param regular
	 * @return
	 * @throws ParseException
	 */
	public static String getMonths(int n) {
		SimpleDateFormat df = new SimpleDateFormat("yyyyMM");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.MONTH, n);
		// c.set(Calendar.MONTH, c.get(Calendar.MONTH)+n);
		// System.out.println("本月第一天: " + df.format(c.getTime()));
		return df.format(c.getTime());
	}

	/**
	 * 比较日期大小
	 * 
	 * @param date1 要比较的日期
	 * @param date2 比较的对象
	 * @param dateformart 要比较的日期格式例如yyyyMM
	 * @return 如果date1>date2 返回1;date1<date2 返回2;date1=date2 返回0
	 * @throws ParseException
	 */
	public static int compareDate(String date1, String date2, String dateformart) throws ParseException {
		DateFormat df = new SimpleDateFormat(dateformart);
		Date d1 = df.parse(date1);
		Date d2 = df.parse(date2);
		if (d1.getTime() > d2.getTime()) {
			return 1;
		} else if (d1.getTime() < d2.getTime()) {
			return 2;
		}
		return 0;
	}

	/**
	 * 比较日期大小
	 * 
	 * @param date1 要比较的日期
	 * @param date2 比较的对象
	 * @param dateformart 要比较的日期格式例如yyyyMM
	 * @return 如果date1>date2 返回1;date1<date2 返回2;date1=date2 返回0
	 * @throws ParseException
	 */
	public static int compareDate(Date d1, Date d2) throws ParseException {
		if (d1.getTime() > d2.getTime()) {
			return 1;
		} else if (d1.getTime() < d2.getTime()) {
			return 2;
		}
		return 0;
	}

	public static void main(String args[]) throws ParseException {

		System.out.println(getMonthByDate(1,new Date(),"yyyyMM"));
//		Date date1 = new Date();
//		Date date2 = new Date();
//
//		String dateStr1 = "20140615 00:00:00";
//		String dateStr2 = "20140615 23:59:59";
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");
//
//		date1 = sdf.parse(dateStr1);
//		date2 = sdf.parse(dateStr2);
//
//		long dateL = date1.getTime() - date2.getTime();
//		long dateI = dateL / (1000 * 60 * 60 * 24);
//		System.out.println(DateUtil.getDay(date1, date2));
//		System.out.println("dateI: " + dateI);
//		System.out.println("dateI比较: " + (dateI <= 30));
		/*
		 * String date1="201402"; String date2="201404"; String formart="yyyyMM";
		 * System.out.println(DateUtil.compareDate(date1, date2, formart)); Date dates1=DateUtil.fromString(date1,
		 * "yyyyMM"); Date dates2=DateUtil.fromString(date2, "yyyyMM"); System.out.println(DateUtil.getMonths(dates1,
		 * dates2));
		 */

		// System.out.println(DateUtil.getMonthByDate(-2,new Date(),"yyyyMM"));
		// //@SuppressWarnings("unused")
		// //String[] s = convertLastMonth("2010-01") ;
		//
		// @SuppressWarnings("unused")
		// String[] q = convertLastQuarter("2012", "Q1") ;

		/*
		 * Calendar calendar = Calendar.getInstance(); calendar.set(Calendar.YEAR, 2011); calendar.set(Calendar.MONTH,
		 * 1);
		 * 
		 * System.out.println(calendar.getActualMinimum(Calendar.DAY_OF_MONTH));
		 * System.out.println(calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
		 */

		// System.out.println(calendar.getTime().toLocaleString());

		/*
		 * DateFormat format = new SimpleDateFormat("yyyy.MM"); String s = "2013-01-20"; String[] a = s.split("-");
		 * System.out.println(a[0]+a[1]+a[2]); System.out.println(DateUtil.getNextMonth(a[0]+a[1]+a[2]));
		 * System.out.println(DateUtil.getMonth(a[0]+a[1]+a[2])); int age =0;
		 * System.out.println("************ 开始计算年龄  *************"); age = getAgeByBirthday(format.parse("2010.12"));
		 * System.out.println("计算结果是年龄为"+age); System.out.println("************ 计算年龄结束 *************");
		 * System.out.println(DateUtil.convertDateToString(new Date(),"yyyyMMdd"));
		 */

	}

}
