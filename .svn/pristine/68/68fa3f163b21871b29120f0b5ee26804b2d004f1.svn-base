/*
 * Copyright (c) 2010 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: cc
 * create: 2011-3-14
 * cvs: $Id: DBase.java,v 1.1 2012/01/05 08:22:47 lawever Exp $
 */
package com.caafc.pbocAnalysis.util;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;

import org.apache.log4j.Logger;
/**
 * @author LiuF 
 * @version $Revision: 1.1 $
 */
public class DBase {

	 protected static Logger logger = Logger.getLogger(DBase.class);
	 public Connection Conn = null;
	 public Context Ctx   = null;
	 public Statement stm = null;
	 public ResultSet rs  = null;
	 
	 public DBase(){
		 
		try {
				Conn = this.getConnectioin();
		} catch (Exception e) {
			
			logger.error("获取数据库连接失败," + e.toString());
		}
		  
	}
	 
	 public Connection getConnectioin() {
		 
		 try {
			 	Class.forName("COM.ibm.db2.jdbc.net.DB2Driver").newInstance();
		        Conn = java.sql.DriverManager.getConnection("jdbc:db2://192.168.20.251:60000/crm","xycrm","xycrm"); 	
		  }catch (Exception ex) {
			  
			  logger.error("[DBBase]连接数据库错误！");
		      ex.printStackTrace();
		  }
		  
		  return Conn;
	}
	  
}
