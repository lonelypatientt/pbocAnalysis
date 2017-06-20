package com.caafc.pbocAnalysis.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

/**
 * 异常信息处理类 (2011-4-26 上午10:24:47)
 * @author zhaoyan 
 * @version $Revision: 1.1 $
 */
public class ExcInfoUtil {
	private static final org.apache.commons.logging.Log logger = org.apache.commons.logging.LogFactory.getLog(ExcInfoUtil.class);
	private Object exception;
	private Object exceptionStack;
	private String errorCode;
	
	public void exec(Object exception,Object exceptionStack) throws IOException{
		this.exception = exception;
		this.exceptionStack = exceptionStack;
		String code = DateUtil.currDayData(new Date(), "yyyyMMddhhmmss");
		logger.error(exception + "  (已输入到错误日志文件中,日志文件号：" + code +")");
		logger.error(exceptionStack);
		errorCode = code;
		writeExceLog(code,exception.toString(), exceptionStack.toString());
	}
	
	public void writeExceLog(String code,String exception, String exceptionStack) throws IOException{
//		String mdir = ParameterUtil.getParameter(Parameters.EXECTION_LOG_PATH);
//		String fileName = mdir + "/exception_"+ code + ".txt";
//		FileOutputStream fos = null;
//		try {
//			File targetFile = new File(fileName);
//			File parentFile = targetFile.getParentFile();
//			if (!parentFile.exists()) {
//				parentFile.mkdirs();
//			}
//			if (!targetFile.exists()) {
//				targetFile.createNewFile();
//			}
//			byte bytes[]=new byte[2048];
////			String str = exception + "\r" + exceptionStack;
//			String str = exceptionStack;
//			bytes=str.getBytes();   //新加的
//			int b=str.length();   //改
//			fos=new FileOutputStream(fileName);
//			fos.write(bytes,0,b);
			
			
//		} catch (IOException e) {
//			throw e;
//		}
//		finally{
//			if(fos != null ){
//				fos.close();
//			}
//		}
	}
	
	
	/**
	 * @return the exception
	 */
	public Object getException() {
		return exception;
	}
	/**
	 * @param exception the exception to set
	 */
	public void setException(Object exception) {
		this.exception = exception;
	}
	/**
	 * @return the exceptionStack
	 */
	public Object getExceptionStack() {
		return exceptionStack;
	}
	/**
	 * @param exceptionStack the exceptionStack to set
	 */
	public void setExceptionStack(Object exceptionStack) {
		this.exceptionStack = exceptionStack;
	}
	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	
	
}
