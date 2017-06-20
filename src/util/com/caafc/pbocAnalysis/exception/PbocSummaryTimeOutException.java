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
 * 个人征信信息过期异常
 * 
 * @author zl
 * @version $Revision:$
 */
public class PbocSummaryTimeOutException extends Exception {

	private static final long serialVersionUID = -8022593190011642452L;

	public PbocSummaryTimeOutException(String msg) {
		super(msg);
	}

	public PbocSummaryTimeOutException(String message, Throwable cause) {
		super(message, cause);
	}

	public PbocSummaryTimeOutException() {
		super();
	}

}
