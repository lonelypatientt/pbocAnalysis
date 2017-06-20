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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.support.JdbcUtils;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import com.caafc.pbocAnalysis.webService.pbocService.PbocResponse;

/**
 * TODO 请填写注释.
 * @author zdsp 
 * @version $Revision:$
 */
public class DruidQuery {
	
	private static Log logger = LogFactory.getLog(DruidQuery.class);
	private static DataSource ds = null;	
	
	static {
		try{
			InputStream in = DruidQuery.class.getClassLoader().getResourceAsStream("druid_db.properties");
            Properties props = new Properties();
			props.load(in);
			ds = DruidDataSourceFactory.createDataSource(props);
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}
	
	public static Connection openConnection() throws SQLException{
		return ds.getConnection();
	}
	
	/**
	 * 统计衍生变量结果集数据
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public static int countPbocResponse(String reportNo) throws Exception{
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		
		int count = -1;
		
		String sql = "SELECT COUNT(0) FROM F_RE_PBOCANALYSIS WHERE REPORTNO='"
				+ reportNo + "'";
		try {
			connection = openConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(sql);

			while (rs.next()) {
				count = rs.getInt(1);
			}
			
		} catch (Exception e) {
			logger.error("ERROR QUERY SQL:" + sql, e);
			throw e;
		} finally {
			JdbcUtils.closeResultSet(rs);
			JdbcUtils.closeStatement(statement);
			JdbcUtils.closeConnection(connection);
		}
		return count;
	}
	
	/**
	 * 新增数据
	 * @param reportNo
	 * @throws Exception
	 */
	public static int insertPbocResponse(PbocResponse pr) throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		int b;
		String sql = "insert into F_RE_PBOCANALYSIS values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try{
			conn = openConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, pr.getReportNo());
			ps.setString(2, pr.getCustName());
			ps.setString(3, pr.getIdNumber());
			ps.setString(4, pr.getCCardAvgLimitRate6M());
			ps.setString(5, pr.getCreditLoanMaxOverdue6M());
			ps.setString(6, pr.getCreditLoanMaxOverdue12M());
			ps.setString(7, pr.getCreditLoanMaxOverdue24M());
			ps.setString(8, pr.getCreditLoanMaxZL());
			ps.setString(9, pr.getCreditLoanOverdueNum6M());
			ps.setString(10, pr.getCreditLoanOverdueNum12M());
			ps.setString(11, pr.getCreditLoanOverdueNum24M());
			ps.setString(12, pr.getCreditLoanQueryNum3M());
			ps.setString(13, pr.getCreditLoanQueryNum6M());
			ps.setString(14, pr.getCreditLoanQueryNum12M());
			ps.setString(15, pr.getPbocReportFlag());
			ps.setString(16, pr.getLoanOverdueNum());
			ps.setString(17, pr.getLoanStatus());
			ps.setString(18, pr.getCCardOverdueNum());
			ps.setString(19, pr.getCCardStatus());
			ps.setString(20, pr.getLoanMaxOverdue24M());
			ps.setString(21, pr.getLoanSumOverdue24M());
			ps.setString(22, pr.getCCardMaxOverdue24M());
			ps.setString(23, pr.getCCardSumOverdue24M());
			ps.setString(24, pr.getCCardOut80Rate());
			ps.setString(25, pr.getBadAccountNum());
			ps.setString(26, pr.getAssetDisposals());
			ps.setString(27, pr.getCourtExecutions());
			ps.setString(28, pr.getApRecordFlag());
			ps.setString(29, pr.getSemiCreditCard());
			ps.setString(30, pr.getLoanHisOverdueRate());
			ps.setString(31, pr.getOneCcardHisOverdueRate());
			ps.setString(32, pr.getManyCcardHisOverdueRate());
			ps.setString(33, pr.getLoanMonthLiabilities());
			ps.setString(34, pr.getResultCode());
			ps.setString(35, pr.getResultMessage());
			ps.setString(36, pr.getRESERVED_1());
			ps.setString(37, pr.getRESERVED_2());
			ps.setString(38, pr.getRESERVED_3());
			ps.setString(39, pr.getRESERVED_4());
			ps.setString(40, pr.getRESERVED_5());
			ps.setString(41, pr.getRESERVED_6());
			ps.setString(42, pr.getRESERVED_7());
			ps.setString(43, pr.getRESERVED_8());
			b = ps.executeUpdate();
		} catch (Exception e) {
			logger.error("ERROR EXECUTE SQL", e);
			throw e;
		} finally{
			JdbcUtils.closeStatement(ps);
			JdbcUtils.closeConnection(conn);
		}
		return b;
	}

	/**
	 * 更新数据
	 * @param pr
	 * @return
	 * @throws Exception
	 */
	public static int updatePbocResponse(PbocResponse pr) throws Exception{
		Connection conn = null;
		PreparedStatement ps = null;
		int b;
		String sql = "update F_RE_PBOCANALYSIS set custName=?,idNumber=?,cCardAvgLimitRate6M=?," +
				"creditLoanMaxOverdue6M=?,creditLoanMaxOverdue12M=?,creditLoanMaxOverdue24M=?," +
				"creditLoanMaxZL=?,creditLoanOverdueNum6M=?,creditLoanOverdueNum12M=?," +
				"creditLoanOverdueNum24M=?,creditLoanQueryNum3M=?,creditLoanQueryNum6M=?," +
				"creditLoanQueryNum12M=?,pbocReportFlag=?,loanOverdueNum=?,loanStatus=?," +
				"cCardOverdueNum=?,cCardStatus=?,loanMaxOverdue24M=?,loanSumOverdue24M=?," +
				"cCardMaxOverdue24M=?,cCardSumOverdue24M=?,cCardOut80Rate=?,badAccountNum=?," +
				"assetDisposals=?,courtExecutions=?,apRecordFlag=?,semiCreditCard=?," +
				"loanHisOverdueRate=?,oneCcardHisOverdueRate=?,manyCcardHisOverdueRate=?," +
				"loanMonthLiabilities=?,RESERVED_1=?,RESERVED_2=?,RESERVED_3=?,RESERVED_4=?," +
				"RESERVED_5=?,RESERVED_6=?,RESERVED_7=?,RESERVED_8=?,resultCode=?,resultMessage=? " +
				"where reportNo =?";
		try{
			conn = openConnection();
			ps = conn.prepareStatement(sql);
			ps.setString(1, pr.getCustName());
			ps.setString(2, pr.getIdNumber());
			ps.setString(3, pr.getCCardAvgLimitRate6M());
			ps.setString(4, pr.getCreditLoanMaxOverdue6M());
			ps.setString(5, pr.getCreditLoanMaxOverdue12M());
			ps.setString(6, pr.getCreditLoanMaxOverdue24M());
			ps.setString(7, pr.getCreditLoanMaxZL());
			ps.setString(8, pr.getCreditLoanOverdueNum6M());
			ps.setString(9, pr.getCreditLoanOverdueNum12M());
			ps.setString(10, pr.getCreditLoanOverdueNum24M());
			ps.setString(11, pr.getCreditLoanQueryNum3M());
			ps.setString(12, pr.getCreditLoanQueryNum6M());
			ps.setString(13, pr.getCreditLoanQueryNum12M());
			ps.setString(14, pr.getPbocReportFlag());
			ps.setString(15, pr.getLoanOverdueNum());
			ps.setString(16, pr.getLoanStatus());
			ps.setString(17, pr.getCCardOverdueNum());
			ps.setString(18, pr.getCCardStatus());
			ps.setString(19, pr.getLoanMaxOverdue24M());
			ps.setString(20, pr.getLoanSumOverdue24M());
			ps.setString(21, pr.getCCardMaxOverdue24M());
			ps.setString(22, pr.getCCardSumOverdue24M());
			ps.setString(23, pr.getCCardOut80Rate());
			ps.setString(24, pr.getBadAccountNum());
			ps.setString(25, pr.getAssetDisposals());
			ps.setString(26, pr.getCourtExecutions());
			ps.setString(27, pr.getApRecordFlag());
			ps.setString(28, pr.getSemiCreditCard());
			ps.setString(29, pr.getLoanHisOverdueRate());
			ps.setString(30, pr.getOneCcardHisOverdueRate());
			ps.setString(31, pr.getManyCcardHisOverdueRate());
			ps.setString(32, pr.getLoanMonthLiabilities());
			ps.setString(33, pr.getRESERVED_1());
			ps.setString(34, pr.getRESERVED_2());
			ps.setString(35, pr.getRESERVED_3());
			ps.setString(36, pr.getRESERVED_4());
			ps.setString(37, pr.getRESERVED_5());
			ps.setString(38, pr.getRESERVED_6());
			ps.setString(39, pr.getRESERVED_7());
			ps.setString(40, pr.getRESERVED_8());
			ps.setString(41, pr.getResultCode());
			ps.setString(42, pr.getResultMessage());
			ps.setString(43, pr.getReportNo());
			b = ps.executeUpdate();
		} catch (Exception e) {
			logger.error("ERROR EXECUTE SQL", e);
			throw e;
		} finally {
			JdbcUtils.closeStatement(ps);
			JdbcUtils.closeConnection(conn);
		}
		return b;
	}
	
	
	/**
	 * 获取文件路径
	 * @return 
	 * @throws Exception
	 */
	public static List<String> getPathList(int nums) throws Exception {
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		
		List<String> pathList = new ArrayList<String>();
		String sql = "SELECT filepath FROM F_RE_PLMAPPING";
		
		if(nums>0){
			sql = sql+" where rownum < "+nums;
		}
		
		try {
			connection = openConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(sql);

			while (rs.next()) {
				pathList.add(rs.getString(1));
			}
			
		} catch (Exception e) {
			logger.error("ERROR QUERY SQL:" + sql, e);
			throw e;
		} finally {
			JdbcUtils.closeResultSet(rs);
			JdbcUtils.closeStatement(statement);
			JdbcUtils.closeConnection(connection);
		}
		return pathList;
	}
	
	/**
	 * 根据报告编号获取文件路径
	 * @param reportnos
	 * @return
	 * @throws Exception
	 */
	public static List<String> getPathList(String reportnos) throws Exception {
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		
		List<String> pathList = new ArrayList<String>();
		String sql = "select filepath from F_RE_PLMAPPING t where reportno in ("+reportnos+")";
		try {
			connection = openConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(sql);
			
			while (rs.next()) {
				pathList.add(rs.getString(1));
			}
			
		} catch (Exception e) {
			logger.error("ERROR QUERY SQL:" + sql, e);
			throw e;
		} finally {
			JdbcUtils.closeResultSet(rs);
			JdbcUtils.closeStatement(statement);
			JdbcUtils.closeConnection(connection);
		}
		return pathList;
	}
}
