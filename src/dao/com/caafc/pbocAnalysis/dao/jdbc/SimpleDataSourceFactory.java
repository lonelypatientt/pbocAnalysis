/**
 * 
 */
package com.caafc.pbocAnalysis.dao.jdbc;

import java.util.Properties;

import javax.naming.RefAddr;
import javax.naming.Reference;
import javax.sql.DataSource;

import com.caafc.pbocAnalysis.util.AbstractObjectFactory;
import com.caafc.pbocAnalysis.util.ConfigUtil;
import com.skyon.naming.factory.SimpleDataSource;

/**
 * @author:Jiesson Davie
 * @mail:marsdave@163.com
 * 2008-3-26 
 */
public class SimpleDataSourceFactory extends AbstractObjectFactory{
	private DataSource getDataSouce(final Reference ref)
	{
		String driver = null;
		String url = null;
		Properties props = new Properties();
		for (int i = 0; i < ref.size(); i++) {
		    RefAddr refAddr = ref.get(i);
		    String key = refAddr.getType();
		    String val = String.valueOf(refAddr.getContent());
		    if (key.equalsIgnoreCase("driver") ||  key.equalsIgnoreCase("driverClassName") )
		    	driver = val;
		    else if (key.equalsIgnoreCase("url"))
		    	url = val;
		    else
		    	props.setProperty(key, val);
		}
		
		return new SimpleDataSource(driver, url, props);
	}

	/* （非 Javadoc）
	 * @see com.skyon.sibas.cal.cfg.AbstractObjectFactory#getObjectInstance(com.skyon.sibas.cal.cfg.ConfigUtil)
	 */
	protected Object getObjectInstance(ConfigUtil configUtil) throws Exception
	{
		return getDataSouce(configUtil.getReference());
	}
}
