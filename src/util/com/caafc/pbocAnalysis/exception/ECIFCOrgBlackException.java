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
public class ECIFCOrgBlackException extends Exception{
	private static final long serialVersionUID = -8022593190011642452L;
	public ECIFCOrgBlackException(String msg){
		super(msg);
	}
	public ECIFCOrgBlackException(){
		super();
	}
	public ECIFCOrgBlackException(String message, Throwable cause) {
        super(message, cause);
    }
}
