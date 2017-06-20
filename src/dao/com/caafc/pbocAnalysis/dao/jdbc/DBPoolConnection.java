/*
 * Copyright (c) 2016 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: pbocAnalysis
 * create: 2016年12月9日 下午4:18:38
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.dao.jdbc;

import java.io.InputStream;
import java.sql.SQLException;
import java.util.Properties;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.alibaba.druid.pool.DruidPooledConnection;

/**
 * TODO 请填写注释.
 * @author zdsp 
 * @version $Revision:$
 * 
 */
public class DBPoolConnection {
	private static DBPoolConnection druidQuery = null;
	private static DruidDataSource ds = null;	
	
	//加载配置文件
	static {
		try{
			InputStream in = DBPoolConnection.class.getClassLoader().getResourceAsStream("druid_db.properties");
            Properties props = new Properties();
			props.load(in);
			ds = (DruidDataSource) DruidDataSourceFactory.createDataSource(props);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	//构造方法私有，防止其他类调用该构造方法
	private DBPoolConnection() {}
	
	//同步该方法，使该实例全局只有一个
	public static synchronized DBPoolConnection getInstance() {
		if (null == druidQuery) {
			druidQuery = new DBPoolConnection();
		}
		return druidQuery;
	}
	
	//获取数据源连接
	public DruidPooledConnection openConnection() throws SQLException{
		return ds.getConnection();
	}

}
