/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016-11-16 下午05:20:20
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.webService.pbocService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * TODO 请填写注释.
 * @author ronin 
 * @version $Revision:$
 */
public class PbocAnalysisDoPost {

	public static String post(String path,String params) throws Exception{
        HttpURLConnection httpConn=null;
        BufferedReader in=null;
        PrintWriter out=null;
        try {
            URL url=new URL(path);
            httpConn=(HttpURLConnection)url.openConnection();
            httpConn.setRequestMethod("POST");
            httpConn.setDoInput(true);
            httpConn.setDoOutput(true);
            httpConn.connect();
            //发送post请求参数
            out=new PrintWriter(httpConn.getOutputStream());
            out.println(params);
            out.flush();
             
            //读取响应
            if(httpConn.getResponseCode()==HttpURLConnection.HTTP_OK){
                StringBuffer content=new StringBuffer();
                String tempStr="";
                in=new BufferedReader(new InputStreamReader(httpConn.getInputStream()));
                while((tempStr=in.readLine())!=null){
                    content.append(tempStr);
                }
                return content.toString();
            }else{
                throw new Exception("请求解析人行征信报告时出现了问题!");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            in.close();
            out.close();
            httpConn.disconnect();
        }
        return null;
    }
}
