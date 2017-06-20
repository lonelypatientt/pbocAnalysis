/*
 * Copyright (c) 2014 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: jseds
 * create: 2014-3-11 上午10:09:57
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.exception;

/**
 * 征信异常
 * @author zl 
 * @version $Revision:$
 */
public class PbocSummaryException extends Exception{
	
	private static final long serialVersionUID = -8022593190011642452L;
	
	public PbocSummaryException(String msg){
		super(msg);
	}
	public PbocSummaryException(String message, Throwable cause) {
		super(message, cause);
	}
	public PbocSummaryException(){
		super();
	}
}
