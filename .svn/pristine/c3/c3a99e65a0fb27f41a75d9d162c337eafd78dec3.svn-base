
package com.caafc.pbocAnalysis.dao.jdbc;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.support.JdbcUtils;

import com.caafc.pbocAnalysis.webService.pbocService.PbocResponse;
import com.skyon.core.config.BaseJNDIEnv;
import com.skyon.core.jdbc.ConnectionProvider;

/**
 * TODO 请填写注释.
 * 
 * @author ronin
 * @version $Revision:$
 */
public class PbocQuery {
	private static Log logger = LogFactory.getLog(PbocQuery.class);

	private static ConnectionProvider connectionProvider;

	public static void init() {
		BaseJNDIEnv.init();
		connectionProvider = new JdbcConnectionOracleProvider();
	}
	
	/**
	 * 获得征信报告头信息
	 * @return 
	 * @throws Exception
	 */
	public static Map<String,String> getMessageHeader(String reportNo) throws Exception {
		init();
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		
		Map<String,String> m = new HashMap<String,String>();
		String sql = "SELECT QUERYTIME,REPORTCREATETIME FROM F_RE_PLMESSAGEHEADER where REPORTSN='"
				+ reportNo + "'";
		try {
			connection = connectionProvider.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(sql);

			while (rs.next()) {
				m.put("QUERYTIME", rs.getString(1));
				m.put("REPORTCREATETIME", rs.getString(2));
			}
			
		} catch (Exception e) {
			logger.error("ERROR QUERY SQL:" + sql, e);
			throw e;
		} finally {
			JdbcUtils.closeResultSet(rs);
			JdbcUtils.closeStatement(statement);
			JdbcUtils.closeConnection(connection);
		}
		return m;
	}
	
	/**
	 * 获得征信报告查询人信息数据
	 * 
	 * @return List
	 * @throws Exception
	 */
	public static Map<String,String> getQueryReq(String reportNo) throws Exception {
		init();
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		
		Map<String,String> m = new HashMap<String,String>();
		String sql = "SELECT NAME,CERTNO FROM F_RE_PLQUERYREQ where REPORT_NO='"
				+ reportNo + "'";
		try {
			connection = connectionProvider.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(sql);
			
			while (rs.next()) {
				m.put("custName", rs.getString(1));
				m.put("idNumber", rs.getString(2));
			}
			
		} catch (Exception e) {
			logger.error("ERROR QUERY SQL:" + sql, e);
			throw e;
		} finally {
			JdbcUtils.closeResultSet(rs);
			JdbcUtils.closeStatement(statement);
			JdbcUtils.closeConnection(connection);
		}
		return m;
	}

	/**
	 * 获得未销户准贷记卡信息数据
	 * 
	 * @return List
	 * @throws Exception
	 */
	public static Map<String,BigDecimal> getUndestoryStandardLoa(String reportNo) throws Exception {
		init();
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		
		Map<String,BigDecimal> m = new HashMap<String,BigDecimal>();
		String sql = "SELECT creditlimit,latest6monthusedavgamount FROM F_RE_PLUNDESTORYSTANDARDLOA where REPORT_NO='"
				+ reportNo + "'";
		try {
			connection = connectionProvider.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(sql);

			while (rs.next()) {
				m.put("creditlimit", rs.getBigDecimal(1));
				m.put("latest6monthusedavgamount", rs.getBigDecimal(2));
			}
			
		} catch (Exception e) {
			logger.error("ERROR QUERY SQL:" + sql, e);
			throw e;
		} finally {
			JdbcUtils.closeResultSet(rs);
			JdbcUtils.closeStatement(statement);
			JdbcUtils.closeConnection(connection);
		}
		return m;
	}
	
	/**
	 * 获得未销户贷记卡信息数据
	 * 
	 * @return List
	 * @throws Exception
	 */
	public static Map<String,BigDecimal> getUndestoryLoanCard(String reportNo) throws Exception {
		init();
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		
		Map<String,BigDecimal> m = new HashMap<String,BigDecimal>();
		String sql = "SELECT creditlimit,latest6monthusedavgamount FROM F_RE_PLUNDESTORYLOANCARD where REPORT_NO='"
				+ reportNo + "'";
		try {
			connection = connectionProvider.getConnection();
			statement = connection.createStatement();
			rs = statement.executeQuery(sql);

			while (rs.next()) {
				m.put("creditlimit", rs.getBigDecimal(1));
				m.put("latest6monthusedavgamount", rs.getBigDecimal(2));
			}
			
		} catch (Exception e) {
			logger.error("ERROR QUERY SQL:" + sql, e);
			throw e;
		} finally {
			JdbcUtils.closeResultSet(rs);
			JdbcUtils.closeStatement(statement);
			JdbcUtils.closeConnection(connection);
		}
		return m;
	}
	
	/**
	 * 统计衍生变量结果集数据
	 * @param reportNo
	 * @return
	 * @throws Exception
	 */
	public static int countPbocResponse(String reportNo) throws Exception{
		init();
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		
		int count = -1;
		
		String sql = "SELECT COUNT(0) FROM F_RE_PBOCANALYSIS WHERE REPORTNO='"
				+ reportNo + "'";
		try {
			connection = connectionProvider.getConnection();
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
		init();
		Connection conn = null;
		PreparedStatement ps = null;
		int b;
		String sql = "insert into F_RE_PBOCANALYSIS values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		try{
			conn = connectionProvider.getConnection();
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

	
	public static int updatePbocResponse(PbocResponse pr) throws Exception{
		init();
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
				"loanMonthLiabilities=? where reportNo =?";
		try{
			conn = connectionProvider.getConnection();
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
			ps.setString(33, pr.getReportNo());
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
		init();
		Connection connection = null;
		Statement statement = null;
		ResultSet rs = null;
		
		List<String> pathList = new ArrayList<String>();
		String sql = "SELECT filepath FROM F_RE_PLMAPPING";
		
		if(nums>0){
			sql = sql+" where rownum < "+nums;
		}
		
		try {
			connection = connectionProvider.getConnection();
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
