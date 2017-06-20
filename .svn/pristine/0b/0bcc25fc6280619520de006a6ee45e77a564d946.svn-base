/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016-11-17 上午10:34:36
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.test;

import com.caafc.pbocAnalysis.webService.pbocService.PbocAnalysisDoPost;

/**
 * TODO 请填写注释.
 * @author Administrator 
 * @version $Revision:$
 */
public class TestpbocAnalysis {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String url = "http://10.1.2.122:19821/parse/";
		String filePath="/home/dwinst/test/20140529/Card412824198711045141By200703.a";
		String outFilePath="/home/dwinst/test/save";
		//curl -d "type=single&path=/home/dwinst/test/20140602/Card530103198008121216By104254.a&savepath=/home/dwinst/test/save" "http://10.1.2.122:19821/parse"
		String params = "type=single&path="+filePath+"&savepath="+outFilePath+"";
    	try {
			String pbocAnalysis = PbocAnalysisDoPost.post(url, params);
			System.out.println(pbocAnalysis);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
