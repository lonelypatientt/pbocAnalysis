
package com.caafc.pbocAnalysis.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.lang.StringUtils;

import com.caafc.pbocAnalysis.enums.LoanStatus;
import com.caafc.pbocAnalysis.enums.LoanType;

/**
 * @author xihn
 * 解析人行征信报告中的贷款信息字符
 */
public class AnalysisLoan {

	private static String splitPoint = "。";
	
	private static String splitComma = "，";
	private static String splitEng = ".";
	/**
	 * 解析贷款汇总信息，取得贷款种类、贷款状态、贷款剩余期数(月)
	 * @param s
	 * @return
	 * @throws ParseException 
	 */
	public static Map<String,String> getLoanType(String s) throws ParseException, Exception{
		s = enCommaToCnComma(s);
		Map<String,String> rm = new HashMap<String,String>();
		LoanType[] loanTypes = LoanType.ALL;
		LoanStatus[] loanStatus = LoanStatus.ALL;
		String [] sForPoint = s.split(splitPoint);
		String loanT = sForPoint[0];
		String []lt = loanT.split(splitComma); 
		
		//获得贷款发放日期
		String yearL = loanT.split("\\.")[1].substring(0, 4);
		String monthL = loanT.split("\\.")[1].substring(5, 7);
		String dayL = loanT.split("\\.")[1].substring(8, 10);
		rm.put("loanOccureDate", yearL+"-"+monthL+"-"+dayL);
		
		//3.2009年03月24日机构“FD”发放的贷记卡(人民币账户），业务号X，授信额度10,000元，信用/免担保，已于2011年04月销户。
		//获得发卡机构
		String org1 = loanT.split("”")[0];
		String org = org1.split("“")[1];
		rm.put("org", org);
		
		//获得贷款发放金额
		String t = loanT.split("发放的")[1];
		String t2 = t.split("元")[0];
		rm.put("loanMoney", t2);
		
		for (int i = 0; i < lt.length; i++) {
			String st = lt[i];
			for (int j = 0; j < loanTypes.length; j++) {
				LoanType lp = loanTypes[j];
				if(st.endsWith(lp.getDisplayText())){
					//贷款种类
					rm.put("loanType", lp.getValue());
					break;
				}
			}
			
			if(i==lt.length-1){
				rm.put("loanDueTime",lt[i]);
			}
		}
		
		String loanS = sForPoint[1];
		String []ls = loanS.split(splitComma);
		for (int i = 0; i < ls.length; i++) {
			String ss = ls[i];
			for (int j = 0; j < loanStatus.length; j++) {
				LoanStatus lss = loanStatus[j];
				if(ss.endsWith(lss.getDisplayText())){
					//贷款状态
					rm.put("loanStauts", lss.getValue());
					break;
				}
			}
		}
		
		String loanDueTime = "";
		String[] sp = rm.get("loanDueTime").toString().split(",");
		if(sp.length>1){
			loanDueTime  = sp[1];
		}else{
			loanDueTime  = sp[0];
		}
		
		String year = loanDueTime.substring(0, 4);
		String month = loanDueTime.substring(5, 7);
		String day = loanDueTime.substring(8, 10);
		//贷款到期日期
		rm.put("payOverDate", year+"-"+month+"-"+day);
		
		//如无对应贷款种类信息，将贷款种类设为[其他]
		if(rm.get("loanType")==null)
			rm.put("loanType", LoanType.QT.getValue());
		//如无对应贷款状态信息，将贷款状态设为[正常]
		if(rm.get("loanStauts")==null)
			rm.put("loanStauts", LoanStatus.ZC.getValue());
		//如贷款状态为结清或呆账，将贷款还款剩余期数设为 0
		if(rm.get("loanStauts").toString().equals(LoanStatus.JQ.getValue())){
			rm.put("loanDueNum","0");
		}else{
			//如贷款状态非结清，则解析贷款到期字符串，获得到期日期，用现日期-到期日期，获得剩余月数
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");			
			
			int months = DateUtil.getMonths(new Date(), df.parse(year+"-"+month+"-"+day));
			
			rm.put("loanDueNum",String.valueOf(months));
		}
		
		return rm;
	}
	/**
	 * 解析贷款描述信息
	 * @throws ParseException 
	 */
	public static Map<String,String> getLoanTypeOther(String s) throws ParseException, Exception{
		//转换逗号
		s = enCommaToCnComma(s);
		
		Map<String,String> rm = new HashMap<String,String>();
		String [] sForPoint = s.split(splitPoint);
		if(sForPoint.length==2){
		String loanS = sForPoint[1];
		String[] loanSs= loanS.split(splitComma);
		String[] sForPoints = sForPoint[0].split("\\.");
		if(!loanS.endsWith("结清")&&!loanSs[0].endsWith("呆账")){
			String loanT = sForPoint[0];
			String []lt = loanT.split(splitComma); 
			
			String[] typeCard = lt[0].split("）");
			rm.put("loanCard", typeCard[1]);  
			if(loanSs.length>1){
				String ts = loanSs[2].split("余额为")[1];
				String t2s = ts.split("元")[0];
				String[] moneys  = t2s.split(",");
				rm.put("balance", moneys[0]+moneys[1]);
			}
			//获得贷款发放日期
			String yearS = sForPoints[1].substring(0, 4);
			String monthS = sForPoints[1].substring(5, 7);
			String dayS= sForPoints[1].substring(8, 10);
//			if(Integer.parseInt(monthS)<10){
//				monthS = "0"+monthS;
//			}
//			if(Integer.parseInt(dayS)<10){
//				dayS = "0"+dayS;
//			}
			rm.put("loanOccureDate", yearS+"-"+monthS+"-"+dayS);
			
			//获得贷款发放金额
			String t = loanT.split("发放的")[1];
			String t2 = t.split("元")[0];
			if(StringUtils.isNotEmpty(t2)){
				//String[] money  = t2.split(",");
				//rm.put("loanMoney", money[0]+money[1]);
				rm.put("loanMoney", t2.replace(",", ""));
			}else{
				rm.put("loanMoney", "0");
			}
			
			
			//担保类型抵押/质押贷款部分
    		String loanType = lt[2].substring(0, 2);
    		rm.put("loanType", loanType);
//    		if(loanType.equals("抵押")||loanType.equals("质押")){
//    			rm.put("loanType", "抵押/质押");
//    		}else //信用/保证
//        		if(loanType.equals("信用")||loanType.equals("保证")){
//        			rm.put("loanType", "信用/保证");
//        		}else{
//        			rm.put("loanType", "");
//        		}
    		
    		
			//获得期数
			if(lt.length==6){
				String m  = getQuantity(lt[3]);
				rm.put("loanDueNum", m);
				//和分月归还
//				String[] getType= lt[4].split(",");
				rm.put("rePayType", lt[4]);
				String yearD = lt[5].substring(0, 4);
				String monthD = lt[5].substring(5, 7);
				String dayD = lt[5].substring(8, 10);
				rm.put("loanDueDate", yearD+"-"+monthD+"-"+dayD);
//				if(lt[4].equals("按月归还")){
//					rm.put("rePayType", "按月归还");
//				}else if(lt[4].equals("一次性归还")){
//					rm.put("rePayType", "一次性归还");
//				}
			}else{
//				if(lt[3].equals("按月归还")){
//					rm.put("rePayType", "按月归还");
//				}else if(lt[3].equals("一次性归还")){
//					rm.put("rePayType", "一次性归还");
//				}
//				String[] getType= lt[3].split(",");
				rm.put("rePayType", lt[3]);
				String yearD = "";
				String monthD = "";
				String dayD = "";
				yearD = lt[4].substring(0, 4);
				monthD = lt[4].substring(5, 7);
				dayD = lt[4].substring(8, 10);
				
				rm.put("loanDueDate", yearD+"-"+monthD+"-"+dayD);
			}
			if(rm.get("loanDueNum")==null){
			
			//贷款到期日期
			
//			if(Integer.parseInt(monthD)<10){
//				monthD = "0"+monthD;
//			}
//			if(Integer.parseInt(dayD)<10){
//				dayD = "0"+dayD;
//			}
			String dueDate = rm.get("loanDueDate").toString();
			
			//求得期数
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");			
			
			int months = DateUtil.getMonths(df.parse(yearS+"-"+monthS+"-"+dayS), df.parse(dueDate));
			
			rm.put("loanDueNum",String.valueOf(months));
			}
		 }
		}
		
		return rm;
	}
	
	/**
	 * 解析贷款描述信息(包含已结清)
	 * @throws ParseException 
	 */
	public static Map<String,String> getLoanTypeOtherIncludeJieQing(String s) throws ParseException, Exception{
		//转换逗号
		s = enCommaToCnComma(s);
		
		Map<String,String> rm = new HashMap<String,String>();
		String [] sForPoint = s.split(splitPoint);
		if(sForPoint.length==2){
		String loanS = sForPoint[1];
		String[] loanSs= loanS.split(splitComma);
		String[] sForPoints = sForPoint[0].split("\\.");
		if(!loanSs[0].endsWith("呆账")){
			String loanT = sForPoint[0];
			String []lt = loanT.split(splitComma); 
			String[] typeCard = lt[0].split("）");
			rm.put("loanCard", typeCard[1]);  
			if(loanSs.length>1){
				String ts = loanSs[2].split("余额为")[1];
				String t2s = ts.split("元")[0];
				String[] moneys  = t2s.split(",");
				rm.put("balance", moneys[0]+moneys[1]);
			}
			//获得贷款发放日期
			String yearS = sForPoints[1].substring(0, 4);
			String monthS = sForPoints[1].substring(5, 7);
			String dayS= sForPoints[1].substring(8, 10);
//			if(Integer.parseInt(monthS)<10){
//				monthS = "0"+monthS;
//			}
//			if(Integer.parseInt(dayS)<10){
//				dayS = "0"+dayS;
//			}
			rm.put("loanOccureDate", yearS+"-"+monthS+"-"+dayS);
			
			//获得贷款发放金额
			String t = loanT.split("发放的")[1];
			String t2 = t.split("元")[0];
			if(StringUtils.isNotEmpty(t2)){
				//String[] money  = t2.split(",");
				//rm.put("loanMoney", money[0]+money[1]);
				rm.put("loanMoney", t2.replace(",", ""));
			}else{
				rm.put("loanMoney", "0");
			}
			
			
			//担保类型抵押/质押贷款部分
    		String loanType = lt[2].substring(0, 2);
    		rm.put("loanType", loanType);
//    		if(loanType.equals("抵押")||loanType.equals("质押")){
//    			rm.put("loanType", "抵押/质押");
//    		}else //信用/保证
//        		if(loanType.equals("信用")||loanType.equals("保证")){
//        			rm.put("loanType", "信用/保证");
//        		}else{
//        			rm.put("loanType", "");
//        		}
    		
    		
			//获得期数
			if(lt.length==6){
				String m  = getQuantity(lt[3]);
				rm.put("loanDueNum", m);
				//和分月归还
//				String[] getType= lt[4].split(",");
				rm.put("rePayType", lt[4]);
				String yearD = lt[5].substring(0, 4);
				String monthD = lt[5].substring(5, 7);
				String dayD = lt[5].substring(8, 10);
				rm.put("loanDueDate", yearD+"-"+monthD+"-"+dayD);
//				if(lt[4].equals("按月归还")){
//					rm.put("rePayType", "按月归还");
//				}else if(lt[4].equals("一次性归还")){
//					rm.put("rePayType", "一次性归还");
//				}
			}else{
//				if(lt[3].equals("按月归还")){
//					rm.put("rePayType", "按月归还");
//				}else if(lt[3].equals("一次性归还")){
//					rm.put("rePayType", "一次性归还");
//				}
//				String[] getType= lt[3].split(",");
				rm.put("rePayType", lt[3]);
				String yearD = "";
				String monthD = "";
				String dayD = "";
				
				yearD = lt[4].substring(0, 4);
				monthD = lt[4].substring(5, 7);
				dayD = lt[4].substring(8, 10);
				
				rm.put("loanDueDate", yearD+"-"+monthD+"-"+dayD);
			}
			if(rm.get("loanDueNum")==null){
			
			//贷款到期日期
			
//			if(Integer.parseInt(monthD)<10){
//				monthD = "0"+monthD;
//			}
//			if(Integer.parseInt(dayD)<10){
//				dayD = "0"+dayD;
//			}
			String dueDate = rm.get("loanDueDate").toString();
			
			//求得期数
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");			
			
			int months = DateUtil.getMonths(df.parse(yearS+"-"+monthS+"-"+dayS), df.parse(dueDate));
			
			rm.put("loanDueNum",String.valueOf(months));
			}
		 }
		}
		
		return rm;
	}
	
	/**
	 * 将中文字符串中的英文逗号转换成中文逗号（100,000此种不予转换）
	 * 20140918 luqian
	 * @param s
	 * @return
	 */
	private static String enCommaToCnComma(String s){
		//将所有的英文逗号转换为中文逗号
		String newStr1 = s.replace(",", "，");
		String regex = "\\d{1,3}，\\d{3}(，\\d{3})*";
		Pattern pa = Pattern.compile(regex);
		Matcher matcher = pa.matcher(newStr1);
		
//		newStr1 = matcher.replaceAll(",");
		//将所有数据中的中文逗号转换为英文逗号
		while(matcher.find()){
			String ss = matcher.group();
			String ss1 = ss.replace("，", ",");
//			newStr1 = matcher.replaceFirst(ss1);
			newStr1 = newStr1.replace(ss, ss1);
			matcher = pa.matcher(newStr1);
			
		}
		
		return newStr1;
	}
	
	//获取结清或转出日或销户
	public static String  getDay(String s) throws ParseException{
		String day = null ;
		if (StringUtil.isNotEmpty(s)) {
			String yearD = "";
			String monthD = "";
			String[] sForPoint = s.split(splitPoint);
			if(sForPoint.length>1){
				if (sForPoint[1].endsWith("结清") || sForPoint[1].endsWith("转出")) {
					yearD = sForPoint[1].substring(2, 6);
					monthD = sForPoint[1].substring(7, 9);
					day= yearD + "-" + monthD;
				}
		     }else{
				String[] ds = sForPoint[0].split(splitComma);
				if (ds[4].endsWith("销户")) {
					yearD = ds[4].substring(2, 6);
					monthD = ds[4].substring(7, 9);
					day= yearD + "-" + monthD;
				}
		}
		
		}else{
			day = null;
		}
		return day;
		
		
     }
	
	/**
	 * 解析贷记卡和准贷记卡描述信息，是否有冻结、止付
	 * @return
	 * @throws ParseException 
	 */
	public static Boolean getTrue(String s) throws ParseException, Exception{
		if(s.indexOf("冻结")>=0||s.indexOf("呆账")>=0||s.indexOf("止付")>=0){
			return true;
		}
		/*String [] sForPoint = s.split(splitPoint);
		if(sForPoint.length==2){
		String loanS = sForPoint[1];
		if(loanS.endsWith("冻结")||loanS.endsWith("呆账")||loanS.endsWith("止付")){
			return true;
		  }
		}*/
		return false ;
	}
	/**
	 * 解析贷款描述信息:区分个人住房贷款，个人商用房贷款，个人经营性贷款
	 * @return
	 * @throws ParseException 
	 */
	public static String getLoanTypeO(String s) throws ParseException, Exception{
		s = enCommaToCnComma(s);
		String loanType = null;
		String [] sForPoint = s.split(splitPoint);
		String loanT = sForPoint[0];
		String []lt = loanT.split(splitComma); 
		if(lt[0].endsWith("个人住房贷款")){
			loanType = "个人住房贷款";
			return loanType;
		}
		if(lt[0].endsWith("个人商用房（包括商住两用）贷款")||lt[0].endsWith("个人商用房贷款")){
			loanType = "个人商用房贷款";
			return loanType;
		}
		if(lt[0].endsWith("个人公积金贷款")||lt[0].endsWith("个人住房公积金贷款")){
			loanType = "个人公积金贷款";
			return loanType;
		}
		if(lt[0].endsWith("个人经营性贷款")){
			loanType = "个人经营性贷款";
			return loanType;
		}
		return loanType;
	}
	/**
	 * 截取字符串前面的正整数，如"22天"得"22","18个人"得到"18".
	 * @return
	 */
	public static String getQuantity(String regular){
		int index = 0;
		for (int i = 0; i < regular.length(); i++) {
			char c = regular.charAt(i);
			if (Character.isDigit(c)) {
				if (i == regular.length() - 1) {
					index = i + 1;
				} else {
					index = i;
				}
				continue;
			} else {
				index = i;
				break;
			}
		}
		return regular.substring(0, index);
	}
	/**
	 * 截取银行类型
	 * @param s
	 * @return
	 * @throws ParseException
	 */
	public static String getComapanyType(String s) throws ParseException, Exception{
		
		String comType;
		//截取银行类型
		String t = s.split("”")[0];
		String t2 = t.split("“")[1];
		comType =  t2;
		return comType;
	}
	
	/**
	 * 截取时间添加日期yyyyMMdd
	 * @param s
	 * @return
	 * @throws ParseException
	 */
	public static String getDateString(String s){
		String DateString;
		String[] t = s.split("\\.");
		DateString= t[0]+t[1]+"01";
		return DateString;
	}
	
	public static void main(String[] args) throws ParseException, Exception {
//		Map<String, String> testMap = getLoanTypeOther("5.2012年05月25日机构“VN”发放的360,000元（人民币）其他贷款，业务号X，信用/免担保，36期，按月归还,2013年05月18日到期。截至2014年04月14日，");
//		int size = testMap.size();
//		System.out.println(size);
		
		String s = "1.2012年07月13日机构“PI”发放的80,000,000,000元（人民币）个人汽车贷款，业务号X，抵押担保，48期，按月归还,2016年07月13日到期。已变成74,888呆账，最近一次还款日期为2013年03月25日，余额为80,000,000,000元。";
//		String[] ss = splitLoanT(s);
		Map<String, String> map = getLoanTypeOther(s);
		
		Iterator<String> it = map.keySet().iterator();
		while(it.hasNext()){
			String key = it.next();
			String value = map.get(key);
			
			System.out.println("key: " + key);
			System.out.println("value: " + value);
			
		}
//		for (String string : ss) {
//			System.out.println(string);
//		}
//		System.out.println(ss.length);
	}
	
}
