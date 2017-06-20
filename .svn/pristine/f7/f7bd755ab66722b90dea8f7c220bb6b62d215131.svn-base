/**
 * 
 */
package com.caafc.pbocAnalysis.util;


/**
 * 身份证15和18位之间的转换
 * @author xushg
 * @version $Revision: 1.4 $
 *
 */
public class IdCardConverter { 
	
	/**
	 * 从 15位转为 18位
	 * @param idCard 15位身份证号
	 * @return 18位身份证号
	 */
	public static String get18By15(String idCard){
		return idCard.substring(0,6)+ "19"+ idCard.substring(6, 15) +  getEndOf18(idCard);
	}
	
	/**
	 * 输入15位或18位身份证号，得到15位或18位身份证号的数组
	 * @param idCard 15位或18位身份证号
	 * @return
	 */
	public static  String[] getIdCardArray(String idCard){
		
		if(idCard==null){
			throw new IllegalArgumentException("证件号码不能为空值");
		}
		String idCardTrim = idCard.trim();
		if( (idCardTrim.length()!=15 && idCardTrim.length()!= 18)){
			return new String[]{idCardTrim};
		}
		if(idCardTrim.length()==15)
			return new String[]{ idCardTrim,get18By15(idCardTrim)};
		
		return new String[]{ idCardTrim,get15By18(idCardTrim)};
	}
	
	/**
	 * 检查两个身份证号是否为同一客户
	 * @param idCard1
	 * @param idCard2
	 * @return
	 */
	public static boolean isSameCustomer(String idCard1,String idCard2){
		if(idCard1==null || idCard2==null)
			return false;
		//可能有空格
		idCard1= idCard1.trim();
		idCard2= idCard2.trim(); 
		if(idCard1.equalsIgnoreCase(idCard2))
			return true;
		else if(idCard1.length() == 15 && idCard2.length()==18 && idCard1.equalsIgnoreCase(get15By18(idCard2)) ){
			return true;
		}
		else if(idCard1.length() == 18 && idCard2.length()==15 && idCard2.equalsIgnoreCase(get15By18(idCard1)) ){
			return true;
		}
		return false;
	}
	
	
	/**
	 * 从 18位转为 15位
	 * @param idCard 18位身份证号
	 * @return 15位身份证号
	 */
	public static String get15By18(String idCard){
		if(idCard==null || idCard.length()!= 18)
			throw new RuntimeException("请输入18位身份证号");
		return idCard.substring(0,6)+  idCard.substring(8, 17)  ;
	}
	 
	static final char[] idCRCMap = {'1','0','X','9','8','7','6','5','4','3','2'};
	
	final static  int  wilist[]=new int[]{ 7, 9, 10, 5, 8, 4, 6, 3, 7, 9, 10, 5, 8, 4, 2 } ;
	 
	/**
	 * 根据15位身份证得到18位身份证号的末位
	 * @param idCard
	 * @return
	 */
	private static char  getEndOf18(String idCard){
		if(idCard==null || idCard.length()!= 15)
			throw new RuntimeException("请输入15位身份证号");
		
		int N = 11; //(2 * 1 + 1 * 9)
		
		for (int i = 0; i < 15; i++) {
			N +=(idCard.charAt(i) -'0') * wilist[i];
		} 
		return idCRCMap[ N % 11];
	}
	
	/**
	 * 判别是否为正确的身份证号码
	 * @param id
	 * @return
	 */
	public static boolean isIdCard(String id){
		if(id != null && (id.length() == 15 || id.length() == 18)){
			return CheckCetiType.isIdCard(id);
		}
		else{
			return false;
		}
	}
	public static void main(String[] args) {
		System.out.println(get18By15("111111111111111"));
	}

}
