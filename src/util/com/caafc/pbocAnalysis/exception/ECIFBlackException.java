/*
 * Copyright (c) 2014 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: jseds
 * create: 2014-3-14 下午03:13:26
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.exception;

/**
 * 获取ecif端黑名单异常
 * @author zl
 * @version $Revision:$
 */
public class ECIFBlackException extends Exception{
	private static final long serialVersionUID = -8022593190011642452L;
	public ECIFBlackException(String msg){
		super(msg);
	}
	public ECIFBlackException(){
		super();
	}
	public ECIFBlackException(String message, Throwable cause) {
        super(message, cause);
    }
}
