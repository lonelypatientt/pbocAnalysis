package com.caafc.pbocAnalysis.dao;

import org.springframework.test.AbstractTransactionalDataSourceSpringContextTests;

public abstract class BaseDaoTestCase extends
        AbstractTransactionalDataSourceSpringContextTests {
    
    @Override
    protected String[] getConfigLocations() {
//      return super.getConfigLocations();
        setAutowireMode(AUTOWIRE_BY_NAME);//按名字匹配的方式进行自动装配-
        return new String[]{"classpath*:/applicationContext*.xml"};
        //return new String[]{"applicationContext-resources.xml","applicationContext-dao.xml"};
        
    }
}
