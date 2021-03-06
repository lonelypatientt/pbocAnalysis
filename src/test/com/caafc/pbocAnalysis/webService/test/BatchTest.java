/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016年12月7日 下午4:45:55
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.webService.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.apache.commons.lang.StringUtils;

import com.caafc.pbocAnalysis.webService.pbocService.PbocAnalysisDoPost;

/**
 * TODO 批量解析征信报告
 * @author zdsp 
 * @version $Revision:$
 */
public class BatchTest {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		
		String filePathBase = "/zxbg_new/caafcbg/credit_report/";
		String outFilePath = "/zxbg_new/zxbgsave";
		
		
		
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
		
		Calendar calendar = Calendar.getInstance();  
		calendar.set(2016, 0, 1, 0, 0, 0);// 月份从0开始 		
		
		int da = Integer.valueOf(dateFormat.format(calendar.getTime()));
		
		int endTime = 20170332;
		
		int count = 0;
		
		while(da<endTime)
		{
			String filePath = filePathBase+da;
			System.out.println("解析目录："+filePath);
			try {
				String params = "type=batch&path=" + filePath + "&savepath=" + outFilePath + "";
				String jjj = PbocAnalysisDoPost.post("http://10.5.2.17:19821/parse/", params);
				if(StringUtils.isBlank(jjj)){
					count++;
				}
				System.out.println(jjj);
			} catch (Exception e) {
				e.printStackTrace();
			}
			calendar.add(Calendar.DATE, 1);
			da = Integer.valueOf(dateFormat.format(calendar.getTime()));
		}
		
		System.out.println("总共解析文件夹："+count);

	}

}
