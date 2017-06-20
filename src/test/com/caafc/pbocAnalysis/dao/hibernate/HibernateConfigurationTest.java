package com.caafc.pbocAnalysis.dao.hibernate;

import java.util.Map;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.persister.entity.EntityPersister;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;

import com.caafc.pbocAnalysis.dao.BaseDaoTestCase;

/**
 * HibernateConfigurationTest.
 * 使用 testColumnMapping 测试Hibernate hbm 是否正确.
 * 使用 testSchemaExport 生成建表语句.
 * 
 * @author lawever 
 * @version $Revision: 1.1 $
 */
public class HibernateConfigurationTest extends BaseDaoTestCase {
	public static Log log = LogFactory.getLog(HibernateConfigurationTest.class);
    private SessionFactory sessionFactory;

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void testColumnMapping() throws Exception {
        Session session = sessionFactory.openSession(); 
        try {
            Map metadata = sessionFactory.getAllClassMetadata();
            for (Object o : metadata.values()) {
                EntityPersister persister = (EntityPersister) o;
                String className = persister.getEntityName();
                log.debug("Trying select * from: " + className);
                Query q = session.createQuery("from " + className + " c");
                q.iterate();
                log.debug("ok: " + className);
            }
        } finally {
            session.close();
        }
    }
    
    public void testSchemaExport() throws Exception {
    	LocalSessionFactoryBean localSessionFactoryBean  = (LocalSessionFactoryBean)getApplicationContext().getBean("&sessionFactory");
    	SchemaExport schemaExport = new SchemaExport(localSessionFactoryBean.getConfiguration());
    	schemaExport.create(true, false);
	}
}
