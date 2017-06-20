/*
 * $Id: BeanTypeAutoProxyCreator.java,v 1.1 2012/01/05 08:22:47 lawever Exp $
 */
package com.caafc.pbocAnalysis.util;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.aop.TargetSource;
import org.springframework.aop.framework.autoproxy.AbstractAutoProxyCreator;

/**
 * Auto proxy creator that identifies beans to proxy via a list of class names.
 * Checks for direct, "xxx*", "*xxx", and "xxx*xxx" matches.
 *
 * <p>For configuration details, see the javadoc of the parent class
 * AbstractAutoProxyCreator. Typically, you will specify a list of
 * interceptor names to apply to all identified beans, via the
 * "interceptorNames" property.
 * 
 * @author 李家飞
 * @version $Revision: 1.1 $
 */
public class BeanTypeAutoProxyCreator extends AbstractAutoProxyCreator {

	private static final long serialVersionUID = 1L;
	
	private List beanTypes;

	/**
	 * Set the class names of the beans that should automatically get wrapped with
	 * proxies. A name can specify a prefix to match by ending with "*", e.g.
	 * "namespace.MyBean,namespace.Your*" will match the bean class named "namespace.MyBean"
	 * and all beans whose class name start with "namespace.Your".
	 */
	public void setBeanTypes(String[] beanTypes) {
		this.beanTypes = Arrays.asList(beanTypes);
	}

	/**
	 * Identify as bean to proxy if the bean name is in the configured list of
	 * names.
	 */
	protected Object[] getAdvicesAndAdvisorsForBean(Class beanClass,
			String beanName, TargetSource targetSource) {
		String beanTypeName = beanClass.getName();
		if (this.beanTypes != null) {
			for (Iterator it = this.beanTypes.iterator(); it.hasNext();) {
				String mappedName = (String) it.next();
				if (beanTypeName.equals(mappedName)
						|| isMatch(beanTypeName, mappedName)) {
					return PROXY_WITHOUT_ADDITIONAL_INTERCEPTORS;
				}
			}
		}
		return DO_NOT_PROXY;
	}

	/**
	 * Return if the given bean class name matches the mapped name. The default
	 * implementation checks for "xxx*" and "*xxx" and "xxx*xxx" matches. Can be overridden in
	 * subclasses.
	 * @param beanTypeName the bean class name to check
	 * @param mappedName the name in the configured list of names
	 * @return if the names match
	 */
	protected boolean isMatch(String beanTypeName, String mappedName) {
		int idx = mappedName.indexOf("*");
		if (idx >= 0) {
			String pre = mappedName.substring(0, idx);
			String post = mappedName.substring(idx + 1);
			return (beanTypeName.startsWith(pre) && beanTypeName.endsWith(post));
		}
		return false;
	}

}
