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
 * 调用决策异常
 * 
 * @author zl
 * @version $Revision:$
 */
public class SdsException extends Exception {

	private static final long serialVersionUID = -8022593190011642452L;

	public SdsException(String msg) {
		super(msg);
	}

	public SdsException(String message, Throwable cause) {
		super(message, cause);
	}

	public SdsException() {
		super();
	}
}
