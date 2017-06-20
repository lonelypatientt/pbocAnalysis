package com.caafc.pbocAnalysis.dao.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.jdbc.support.JdbcUtils;

import com.skyon.core.jdbc.ConnectionProvider;

/**
 *  Jndi 方式获得数据库连接 jdbc/oracleSource DataSource 
 * 
 * @author xihn
 * @version $Revision: 1.1 $
 */
public class JdbcConnectionOracleProvider implements ConnectionProvider{
	/**
	 * @see cn.ccb.icc.task.impl.ConnectionProvider#getConnection()
	 */
	public Connection getConnection() {
		try {
			Context ctx = new InitialContext();
			DataSource ds = (DataSource) ctx.lookup("jdbc/oracleSource");
			return ds.getConnection();
		} catch (NamingException ne) {
			throw new RuntimeException(ne);
		} catch (SQLException se) {
			throw new RuntimeException(se);
		}
	}

	/**
	 * @see cn.ccb.icc.task.impl.ConnectionProvider#ungetConnection(java.sql.Connection)
	 */
	public void ungetConnection(Connection connection) {
		JdbcUtils.closeConnection(connection);
	}
}
