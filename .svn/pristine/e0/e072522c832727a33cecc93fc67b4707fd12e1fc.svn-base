/*
 * Copyright (c) 2010 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: cc
 * create: 2011-3-14
 * cvs: $Id: DBControl.java,v 1.1 2012/01/05 08:22:48 lawever Exp $
 */
package com.caafc.pbocAnalysis.util;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

/**
 * @author LiuF 
 * @version $Revision: 1.1 $
 */
public class DBControl extends DBase {

	protected static Logger logger = Logger.getLogger(DBControl.class);

	public DBControl(){
		
		super();
	}
	
	public int dataInsert(String sql) throws Exception{
		
	    if(Conn==null){
	    	
	    	this.getConnectioin();
	    }

	    stm = Conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	    return  stm.executeUpdate(sql);
	}

	public int dataUpdate(String sql){
		
		int s=-1;
	    if(Conn==null){
	    	
	    	this.getConnectioin();
	    }
	    try {
	    	
			stm = Conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			s = stm.executeUpdate(sql);
		}
	    catch (SQLException e) {
	    	logger.error("DBControl更新错误！");
			e.printStackTrace();
		}
	    return s;
	  }

	  @SuppressWarnings("unchecked")
	public List dataSelect(String sql) throws Exception{
		  
		  List all = new ArrayList();
		  StringBuffer sb = new StringBuffer();
	      if(Conn == null){
	      
	    	  this.getConnectioin();
	      }
	      
	      try{
	    	  
	    	  stm = Conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
	    	  rs = stm.executeQuery(sql);
	    	  int columnCount = 0;
	    	  // 获得rs列数
	    	  ResultSetMetaData rsmd = rs.getMetaData();
	    	  columnCount = rsmd.getColumnCount();

	    	  // 获得行数
	    	  rs.last();
			  @SuppressWarnings("unused")
			  int rownum = rs.getRow();

	    	  // 获得列名
	    	  String[] columnNames = new String[columnCount];
	    	  for (int i = 0; i < columnCount; i++) {
			
	    		  columnNames[i] = rsmd.getColumnLabel(i + 1);
	    	  }
	    	  all.add(columnNames);
	    	  sb = new StringBuffer();
	    	  rs.beforeFirst();
	    	  while (rs.next()) {
				
	    		  for (int num = 0; num < columnCount; num++) {
				
	    			  sb.append(rs.getString(columnNames[num])).append(" ").append(";");
	    		  }
	    		  sb.append(";;");
	    	  }

	      } catch (SQLException e) {
	    	  // TODO Auto-generated catch block
	    	  e.printStackTrace();
	      } finally {
		   
	    	  this.close();
	      }
	    all.add(sb.toString());
		return all;
	  }
	  
	  public void dataQuery(String sql) throws Exception{
		     
		  if(Conn==null){
			  
		      this.getConnectioin();
		  }
		  stm = Conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		  stm.execute(sql);	     
	   }
	  
	  
	  public void close(){
		  
	      try{
	    	
	    	  if (rs != null) {
	    		  rs.close();
	    	  }
	    	  if (stm != null) {
	    		  stm.close();
	    	  }
	    	  if (Conn != null) {
	    		  Conn.close();
	    	  }
	      }catch(Exception ex){
	    	  logger.error("关闭数据库连接错误！");
	    	  ex.printStackTrace();
	      }
	  }
}
