
package com.caafc.pbocAnalysis.util;

import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.caafc.pbocAnalysis.enums.CardStatus;

/**
 * @author xihn
 * 解析人行征信报告中的贷记卡信息字符，获得贷记卡(信用卡状态)
 */
public class AnalysisCreditCard {

	private static String splitPoint = "。";
	private static String splitComma = "，";
	
	/**
	 * 解析人行征信报告中的贷记卡信息字符，获得贷记卡(信用卡状态),授信额度(旧方法)
	 * @param s
	 * @return
	 * @throws ParseException 
	 */
	/*@Deprecated
	public static String getCreditCardStatus(String s){
		String cardStatus = "";
		CardStatus[] cardS = CardStatus.ALL;
		String [] sForPoint = s.split(splitPoint);
		String cardInfo = sForPoint[0];		
		for (int i = 0; i < cardS.length; i++) {
			CardStatus cs = cardS[i];
			if(cardInfo.endsWith(cs.getDisplayText())){
				cardStatus = cs.getValue();
			}
		}	
		
		if(cardStatus.equals(""))
			cardStatus = CardStatus.ZC.getValue();
		return cardStatus;
	}*/
	/**
	 * 解析人行征信报告中的贷记卡信息字符，获得贷记卡(信用卡状态),授信额度
	 * @param s
	 * @return
	 * @throws ParseException 
	 */
	public static String getNewCreditCardStatus(String s){
		String cardStatus = "";
		CardStatus[] cardS = CardStatus.ALL;
		
		for (int i = 0; i < cardS.length; i++) {
			CardStatus cs = cardS[i];
			//System.out.println(cs.getDisplayText());
			if(s.indexOf(cs.getDisplayText())>0){
				cardStatus = cs.getValue();
			}
		}	
		
		if(cardStatus.equals(""))
			cardStatus = CardStatus.ZC.getValue();
		return cardStatus;
	}
	
	/**
	 * 解析人行征信报告中的贷记卡信息字符，授信额度
	 * @param s
	 * @return
	 * @throws ParseException 
	 */
	public static String getCreditCardLimit(String s){
		String creditL = "";
		String [] sForPoint = s.split(splitPoint);
		String cardInfo = sForPoint[0];		
		String[] creditLimit = cardInfo.split(splitComma);
		if(creditLimit.length>3){
			creditL = creditLimit[2].substring(4).replace("折合人民币", "").replace("元", "");
		}
		return creditL;
	}
	
	/**
	 * 解析贷记卡，准贷记卡汇总信息，取得卡发放日期，获得发卡机构等
	 * 19.2013年06月20日机构“IO”发放的贷记卡(美元账户），业务号X，授信额度折合人民币120,000元，信用/免担保。截至2014年01月01日，
	 * 5.2008年01月12日机构“XJ”发放的贷记卡(人民币账户），业务号X，授信额度2,000元，信用/免担保。截至2013年12月11日，
	 * 1.1999年01月26日机构“AS”发放的准贷记卡（人民币账户），业务号X，授信额度0元，保证。截止2014年03月31日，
	 * @param s
	 * @return
	 * @throws ParseException 
	 */
	public static Map<String,String> getCreditCardType(String s) throws ParseException, Exception{
		
		s = enCommaToCnComma(s);
		Map<String,String> rm = new HashMap<String,String>();
		String [] sForPoint = s.split(splitPoint);
		String loanT = sForPoint[0];
		String []lt = loanT.split(splitComma); 
		
		//获得卡发放日期
		String yearL = loanT.split("\\.")[1].substring(0, 4);
		String monthL = loanT.split("\\.")[1].substring(5, 7);
		String dayL = loanT.split("\\.")[1].substring(8, 10);
		rm.put("loanOccureDate", yearL + monthL + dayL);
		
		//3.2009年03月24日机构“FD”发放的贷记卡(人民币账户），业务号X，授信额度10,000元，信用/免担保，已于2011年04月销户。
		//获得发卡机构
		String org1 = loanT.split("”")[0];
		String org = org1.split("“")[1];
		rm.put("org", org);
		
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
}
