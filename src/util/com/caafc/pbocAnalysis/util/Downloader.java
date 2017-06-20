/*
 * Copyright (c) 2011 Technology Ltd.
 * All rights reserved.
 * project: nxcrm
 * create: 2011-4-25
 * cvs: $Id: Downloader.java,v 1.1 2012/01/05 08:22:47 lawever Exp $
 */
package com.caafc.pbocAnalysis.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URLEncoder;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.NestedNullException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * 下载文件类 (2011-4-25 上午10:15:37)
 * 
 * @author zhaohb
 * @version $Revision: 1.1 $
 */
public class Downloader {
	private static final Log logger = LogFactory.getLog(Downloader.class);

    public Downloader(HttpServletRequest request, HttpServletResponse response) {
        this.request = request;
        this.response = response;
    }
    
    public Downloader(HttpServletRequest request, HttpServletResponse response, int buffer) {
        this.request = request;
        this.response = response;
        this.buffer = buffer;
    }

    /**
     * 下载文件
     * @param filePath 文件路径（非物理路径）
     * @return
     */
    public boolean download(String filePath) {
        FileInputStream fileInputStream = null;
        String realPath = "";
        String fileFullName = "";
        String fileName = "";
        
        if (filePath.lastIndexOf("/") != -1) {
            fileFullName = filePath.substring(filePath.lastIndexOf("/") + 1);
        } else {
            fileFullName = filePath;
        }
        
        if (fileFullName.lastIndexOf(".") != -1) {
            fileName = fileFullName.substring(0, fileFullName.lastIndexOf("."));
        } else {
            return false;
        }
        
        try {
            response.setContentType("application/x-msdownload");
            response.addHeader("Content-Disposition", "attachment;filename=" + URLEncoder.encode(fileFullName, "UTF-8"));
            realPath = request.getSession().getServletContext().getRealPath(filePath);
            fileInputStream = new FileInputStream(realPath);

            ServletOutputStream outputStream = response.getOutputStream();
            byte[] _buffer = new byte[this.buffer];
            int i;
            while ((i = fileInputStream.read(_buffer)) != -1) {
                outputStream.write(_buffer, 0, i);
            }
        } catch (FileNotFoundException e) {
        	logger.error(e.getLocalizedMessage());
            return false;
        } catch (IOException e) {
        	logger.error(e.getLocalizedMessage());
            return false;
        } finally {
            if (fileInputStream != null)
                try {
                    fileInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return true;
    }
    
    /**
     * 导出Excel。
     * @param columnHeader[][] 列中文说明，列属性。
     * @param dataList 数据列表
     * @throws IOException 
     * @throws NoSuchMethodException 
     * @throws SecurityException 
     * @throws InvocationTargetException 
     * @throws IllegalAccessException 
     * @throws IllegalArgumentException 
     */
    public void exportExcel(String[][] columnHeader, List<?> dataList) throws IOException, SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
    	
    	HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("sheet1");
        HSSFRow row = null;
        HSSFCell cell = null;
        // 0 row print column header
        row = sheet.createRow(0);
        for (int ci = 0; ci < columnHeader.length; ci++)
        {
            cell = row.createCell(ci);
            cell.setCellValue(columnHeader[ci][0]);
        }
        // 1 row, begin print column value
        //Map<String, Method> m = null;
        for (int i = 0; i < dataList.size(); i++)
        {
        	Object o = dataList.get(i);
        	/*if (null == m) {
        		m = getFieldMethod(columnHeader, o);
        	}*/
        	row = sheet.createRow(i + 1);
        	for (int ci = 0; ci < columnHeader.length; ci++) {
        		cell = row.createCell(ci);
        		// Object value = m.get(columnHeader[ci][1]).invoke(o, new Object[]{});
        		String value = null;
				try {
					value = BeanUtils.getProperty(o, columnHeader[ci][1]);
				} catch (NestedNullException e) {
					e.printStackTrace();
					value = null;
				}
        		cell.setCellValue(value == null ? "" : value);
        	}
        }
        // 设置下载信息
        response.setContentType("application/x-msdownload; charset=UTF-8");
        response.setHeader("Content-Disposition", "attachment; filename=\"export-"
                + DateUtil.currDayData(new Date(), "yyyyMMddHHmmss") + ".xls\""); 
        // get output
        OutputStream ostream = response.getOutputStream();
        try
        {
            if (null == ostream) {
                throw new IllegalArgumentException("OutputStream is null");
            }
            workbook.write(ostream);
        }
        finally
        {
            if (null != ostream) {
                ostream.close();
            }
        }
    }
    
    private Map<String, Method> getFieldMethod(String[][] columnHeader, Object o) throws SecurityException, NoSuchMethodException {
    	Map<String, Method> m = new HashMap<String, Method>();
		String propertyName = "";
		for (int index = 0; index < columnHeader.length; index++) {
			propertyName = columnHeader[index][1];
			m.put(propertyName, o.getClass().getMethod("get" + propertyName.substring(0,1).toUpperCase() + propertyName.substring(1), new Class[] {}));
		}
    	return m;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public int getBuffer() {
        return buffer;
    }

    public void setBuffer(int buffer) {
        this.buffer = buffer;
    }

    public String getDefaultName() {
        return defaultName;
    }

    public void setDefaultName(String defaultName) {
        this.defaultName = defaultName;
    }

    private HttpServletRequest request;
    private HttpServletResponse response;
    private int buffer = 1024;
    private String defaultName = "";
}
