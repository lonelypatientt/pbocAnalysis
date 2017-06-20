package com.caafc.pbocAnalysis.util;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import org.apache.log4j.Logger;

import com.caafc.pbocAnalysis.enums.RelationType;
import com.skyon.core.util.StringUtil;

/**
 * 参数合法性验证
 * @author zl
 *
 */
public  class ValidityCheck  {
	
	private static final Logger logger = Logger.getLogger(ValidityCheck.class.getName());
	
	
	/**
	 * 数据校验
	 * @param fileName	校验文件名称
	 * @param dataAreaName  域名集合
	 * @param map 			校验数据
	 * @return
	 */
	public static ValidityMessage check(String fileName,String []dataAreaName,Map<String, Object> map){
		
		 Map<String,String> propertiesMap=parseProperties(fileName,dataAreaName);
		
		return validParameters(propertiesMap, map);
	}
	
	/**
	 * 调用决策参数校验
	 * @param dataAreaPropertiesMap 校验标准
	 * @param dataAreaValueMap 待校验数据
	 * @return 校验结果
	 * @throws Exception
	 */
	public static ValidityMessage validParameters(Map<String,String> dataAreaPropertiesMap,Map<String, Object> dataAreaValueMap){
		ValidityMessage v=new ValidityMessage();
		//校验域，field节点的名称作为key值的集合
		Set<String> dataAreaPropertiesKeys = dataAreaPropertiesMap.keySet();
		for(String key: dataAreaPropertiesKeys){
			String key2 = key.substring(key.lastIndexOf(".")+1);
			if(dataAreaValueMap.containsKey(key2)){
				Object value = dataAreaValueMap.get(key2);
				String propertiesValues = dataAreaPropertiesMap.get(key);
				if(! propertiesValues.equals("")){
					String[] propertiesArray = propertiesValues.split(";");
					int propertiesArrayLength = propertiesArray.length;
					if(propertiesArrayLength>0){
						if(StringUtil.isNotEmpty(value+"")){//如果判断值为空则进行空值判断
							//数据类型检查
							if(StringUtil.isNotEmpty(propertiesArray[0])){
								if(!validParameterType(value, propertiesArray[0])){
									v.setResult(false);
									v.setErrorCode(Parameters_ErrorInfo.E1001);
									v.setErrorMessage(ParameterUtil.getErrorInfoParameter(Parameters_ErrorInfo.E1001)+":"+propertiesArray[4]+"["+key2+"]");
									return v;
								}
							}
							//数据长度检查
							if(StringUtil.isNotEmpty(propertiesArray[1])){
								if(!validParameterLength(value, propertiesArray[1].toString())){
									v.setResult(false);
									v.setErrorCode(Parameters_ErrorInfo.E1007);
									v.setErrorMessage(ParameterUtil.getErrorInfoParameter(Parameters_ErrorInfo.E1007)+":"+propertiesArray[4]+"["+key2+"]");
									return v;
								}
							}
							
							//日期格式判断
							if(StringUtil.isNotEmpty(propertiesArray[3])){
								if(!validParameterDate(value,propertiesArray[3])){
									v.setResult(false);
									v.setErrorCode(Parameters_ErrorInfo.E1006);
									v.setErrorMessage(ParameterUtil.getErrorInfoParameter(Parameters_ErrorInfo.E1006)+":"+propertiesArray[4]+"["+key2+"]");
									return v;
								}
							}
						}
						
						//空值判断
						if(StringUtil.isNotEmpty(propertiesArray[2])){
							if(validParameterIsNotNull(value)){
								v.setResult(false);
								v.setErrorCode(Parameters_ErrorInfo.E1000);
								v.setErrorMessage(ParameterUtil.getErrorInfoParameter(Parameters_ErrorInfo.E1000)+":"+propertiesArray[4]+"["+key2+"]");
								return v;
							}
						}
					}
				}
			}
		}
		v.setResult(true);
		
		return v;
	}
	
	

	/**
	 * 非空验证	
	 * @param value
	 * @return 为空返回 true 反之false
	 */
	public static boolean validParameterIsNotNull(Object value){
		if (value == null ||value.equals("")){
			return true;
		}
		return false;
	}

	/**
	 * 校验数据类型(数据值和字符串)
	 * @param value 待校验数据值
	 * @param propertiesArray [java.lang.String]
	 */
	protected static boolean validParameterType(Object value, String dataType){
		if(validParameterIsNotNull(value)){
			return true;
		}
		String validType=dataType;
		//BigeDecimal类型判断
		if(validType.equals(BigDecimal.class.getName())){
			try {
				new BigDecimal(value.toString());
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
				return false;
			}
			return true;
		}
		return true;
	}
	
	
	/**
	 * 校验值长度
	 * @param value 待校验数据值
	 * @param vlength 长度
	 * @return 返回校验结果
	 * @throws Exception
	 */
	public static boolean validParameterLength(Object value,String vlength){
		if(validParameterIsNotNull(value)){
			return true;
		}
		String length=vlength.replace("，", ",");//长度带有中文“，”号装成英文“,”号
		String values =value.toString();
		if(length.toString().indexOf(",")>0){//判断是否有精度设置
			String [] lg=length.split(",");
			if(values.indexOf(".")>0){//如果是小数
				//判断长度
				if(values.substring(0,values.indexOf(".")).length()<=Integer.parseInt(lg[0])&&values.substring(values.indexOf(".")+1,values.length()).length()<=Integer.parseInt(lg[1])){
					return true;
				}else{
					return false;
				}
			}
			else{
				//判断长度
				if(values.length()<=Integer.parseInt(lg[0])){
					return true;
				}else{
					return false;
				}
			}
		}else
		{
			if(values.length()<=Integer.parseInt(length)){
				return true;
			}
		}
		
		
		return false;
	}
	
	//日期格式校验
	public static boolean validParameterDate(Object value ,String dateFormart){
		if(value==null||value.equals("")){
			return true;
		}
			SimpleDateFormat df = new SimpleDateFormat(dateFormart); 
			df.setLenient(false);
			try{
				df.parse(value.toString());
			}catch (Exception e){
				logger.error(e.getMessage(), e);
				return false;	
			}				
		return true;
	}
	

	public static String valueToString(Object value){
		String valueStr = "";
		if (value != null){
			if(java.lang.String.class.getName().equals(value.getClass().getName())){
				valueStr = "'"+ value.toString()+"',";
			}else if(java.sql.Date.class.getName().equals(value.getClass().getName())){
				valueStr = "'" + value.toString()+"',";
			}else if(java.util.Date.class.getName().equals(value.getClass().getName())){
				valueStr = "'" + value.toString()+"',";
			}else{
				valueStr = value.toString()+",";
			}
		}
		
		return valueStr;
	}
	/**
	 * 转换字符串(当字段里面含有'['和']')
	 * @param str
	 * @return
	 */
	public static String convertString(String str){
		String str1 = str;
		if(str1.contains("]")){
			str1 = str1.substring(0,str1.lastIndexOf("]"));
			if(str1.contains("[")){
				str1 = str1.replace('[', '_');
				return str1;
			}
		}
		return str1;
	}
	
	/**
	 * 封装验证规则
	 * @param fileName 文件名
	 * @param dataAreaNames 域名
	 * @return
	 */
	public static Map<String,String> parseProperties(String fileName,String [] dataAreaNames){
		Properties properties = null;
		Map<String,String> commonMap = new LinkedHashMap<String, String>();
		properties = ParameterUtil.getProperties(fileName);
		if(dataAreaNames!=null &&dataAreaNames.length>0){
			Set<Object> keySet = properties.keySet();
			String[] keys = new String[2];
			for(Object obj:keySet){
				String key = obj.toString();
				String value = properties.getProperty(key);
				if(key != null){
					keys[0] = key.substring(0,key.lastIndexOf("."));//数据域
					keys[1] = key.substring(key.lastIndexOf(".")+1);//元素节点名称
					for (int i = 0; i < dataAreaNames.length; i++) {
						if(keys[0].equals(dataAreaNames[i])){
							commonMap.put(key, value);
						} 
					}
				}
			}
		}
		return commonMap;
	}
	public static void main(String[] args) {
		String[] dataAreaName={"Common","PreparApproval","Approval","RebellionFakeInfo"};
		Map<String, Object> map=new HashMap<String, Object>();

		map.put("orgGeoCode","2ds3" );
		map.put("name", "3");
		map.put("yearIncome","123456789012111111111" );
		map.put("reserveFundInd","f" );
		map.put("tests", "20131001");
		map.put("billAddress","" );
		map.put("groupFlag", "d");
		//ValidityMessage vm=ValidityCheck.check(dataAreaName, map);
//		System.out.println(vm.getResult());
//		System.out.println(vm.getErrorCode());
//		System.out.println(vm.getErrorMessage());
		
		
	}
}
