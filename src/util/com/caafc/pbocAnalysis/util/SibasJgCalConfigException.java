/**
 * 
 */
package com.caafc.pbocAnalysis.util;

/**
 * @author Jiesson Davie
 * 2008-1-25 
 */
public class SibasJgCalConfigException extends SibasJgCalException
{

	/**
	 * 
	 */
	private static final long serialVersionUID = -7487445747369792350L;

	/**
	 * @param message 错误消息
	 * @param cause 错误原因
	 */
	public SibasJgCalConfigException(String message, Throwable cause)
	{
		super(message, cause);
		
	}

	/**
	 * @param message 错误消息
	 */
	public SibasJgCalConfigException(String message)
	{
		super(message);
		
	}
	
}
