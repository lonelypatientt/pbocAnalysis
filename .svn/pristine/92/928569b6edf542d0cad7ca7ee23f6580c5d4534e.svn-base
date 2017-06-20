/**
 * 
 */
package com.caafc.pbocAnalysis.util;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.Reference;
import javax.naming.spi.ObjectFactory;
/**
 * @author Jiesson Davie
 * 2008-1-25 
 */
public abstract class AbstractObjectFactory implements ObjectFactory
{

	
	/* 
	 * @see javax.naming.spi.ObjectFactory#getObjectInstance(java.lang.Object, javax.naming.Name, javax.naming.Context, java.util.Hashtable)
	 */
	   public Object getObjectInstance(Object obj, Name name, Context nameCtx,
			    Hashtable environment) throws Exception {
			Object instance = null;
			if (obj instanceof Reference) {
			   Reference ref = (Reference) obj;
			   
			   ConfigUtil configUtil = new ConfigUtil(ref,name,nameCtx);
			   
			   return getObjectInstance(configUtil);
			}
			return instance;
	   }
	   
	/**
	 * @param configUtil
	 * @return Object
	 * @throws Exception
	 */
	protected abstract Object getObjectInstance(ConfigUtil configUtil) throws Exception ; 
	 
	
}
