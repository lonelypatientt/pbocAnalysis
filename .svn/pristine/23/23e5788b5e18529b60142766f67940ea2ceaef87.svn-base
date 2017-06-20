/**
 * 
 */
package com.caafc.pbocAnalysis.util;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.Name;
import javax.naming.NamingException;
import javax.naming.RefAddr;
import javax.naming.Reference;
import javax.naming.StringRefAddr;

import com.skyon.core.util.Assert;
import com.skyon.core.util.BeanHelpper;
import com.skyon.core.util.ClassUtil;
import com.skyon.core.util.InstanceInitialException;
import com.skyon.core.util.SetterInvokeFail;

/**
 * @author Jiesson Davie
 * 2008-1-25 
 */
public class ConfigUtil 
{
	
	private static final org.apache.commons.logging.Log logger = org.apache.commons.logging.LogFactory
			.getLog(ConfigUtil.class);
    Reference reference ;
	
	final Name name ;
	
	final Context context ;
	
	
	/**
	 * @param reference
	 * @param name
	 * @param context
	 */
	public ConfigUtil(Reference reference, Name name, Context context)
	{
		this.reference = reference;
		this.name = name;
		this.context = context;
	}


	/**
	 * @param key
	 * @return  参数值
	 */
	public final  String getBaseStringValue( final String key) 
	{
		RefAddr refAddr = reference.get(key);

		String va = refAddr == null ? null : (String) refAddr
				.getContent();

		return StringUtil.isEmpty(va) ? null : va;
	}
	
	
	/**
	 * @param key
	 * @return  参数值
	 */
	public final  Object getValueWithRequierd(final String key) {
		
		return getRefValueRequired(reference, key);
	}

	
//	/**
//	 * @param keyName 
//	 * @return  参数值
//	 */
//	public final Object getRefObject(String keyName ) 
//	{
//		String baseValue = getBaseValue(keyName);
//		
//		if (baseValue==null) 
//		{
//			return null;
//		}
//		if (baseValue.startsWith("&"));
//		return lookup(baseValue.substring(1), context);
//	}

	/**
	 * 
	 * @param namePath
	 * @param context
	 * @return 查询到的绑定的对象
	 * @throws SibasJgCalConfigException
	 */
	public static Object lookup(String namePath, Context context) throws SibasJgCalConfigException
	{
		Assert.hasLength(namePath, "无效的对象名称[" + namePath +"]");
		
		try
		{
			Object ref = context.lookup(namePath);
			
			if (ref instanceof Reference)
			{
				Reference new_name = (Reference) ref;
				throw new SibasJgCalConfigException( namePath 
						+"配置了无效的工厂名" +new_name.getFactoryClassName());
			}
			return ref ; 
		}
		catch (NamingException e)
		{
			throw new SibasJgCalConfigException("获取名称对象[" +namePath +"]失败",e);
		}
	}
	/**
	 * 
	 * @param key
	 * @param defaultValue
	 * @return String 查询到的值
	 */
	public final String getValueByDefault(
			final String key, String defaultValue) {
		String va = getBaseStringValue( key);
		if (va != null) {
			return va;
		}
		return defaultValue;
	}

	/**
	 * @param env
	 * @param key
	 * @return  参数值
	 */
	public final String getValue(Hashtable env, final String key) {
		String va = getBaseStringValue( key);

		if (va == null && env != null) {
			va = (String) env.get(key);
		}

		return va;
	}

//	/**
//	 * @param reference
//	 * @param env
//	 * @param key
//	 * @param defaultValue
//	 * @return  参数值
//	 */
//	public final static String getValueByDefault(Reference reference,
//			Hashtable env, final String key, String defaultValue) {
//
//		String p1 = getValue(reference, env, key);
//		if (p1 == null) {
//			return defaultValue;
//		}
//		return p1;
//	}


	
    
    /**
     * 按照环境变量　${xxxx} 的模式替换内容文本
     * @param envVarSetting 环境变量
     * @param sourceText 
     * @return 替换后的文本
     * @throws IllegalArgumentException　如果其中的一个变量无法替换，则抛出此异常
     */
    public static String replaceEnvVar(Hashtable envVarSetting, String sourceText)
	throws IllegalArgumentException {
    	if (sourceText==null) return null;
		StringBuffer buffer = new StringBuffer();
		int start = 0;
		int p;
		while ((p = sourceText.indexOf("${", start)) >= 0) {
		    if (start < p)
			buffer.append(sourceText.substring(start, p));
		    int p1 = sourceText.indexOf("}", p);
		    if (p1 < 0)
		    	throw new IllegalArgumentException("miss symbol '}'");
		    String key = sourceText.substring(p + 2, p1);
		    Object values = envVarSetting.get(key);
		    start = p1 + 1;
		    if (values instanceof String) {
		    	buffer.append(values);
		    } else
		    	throw new IllegalArgumentException("miss Config ${" + key
							   + "}");
		}
		buffer.append(sourceText.substring(start));
		return buffer.toString();
    }


	/**
	 * @return 返回 reference。
	 */
	public Reference getReference()
	{
		return reference;
	}


	/**
	 * @return 返回 context。
	 */
	public Context getContext()
	{
		return context;
	}


	/**
	 * @return 返回 name。
	 */
	public Name getName()
	{
		return name;
	}


	/**
	 * @param ref
	 */
	public void setRef(Reference ref)
	{
	
		this.reference = ref ;

	}

	/**
	 * @return 获取转化后的Reference值
	 */
	public Reference getCovertReference()
	{
		return getCovertReference(true);
	}

	/**
	 * 
	 * @param ignorRefAddrComment 是否需要忽略了RefAddr 注释 项#
	 * @return 获取转化后的Reference值
	 */
	public Reference getCovertReference(boolean ignorRefAddrComment)
	{
		Reference oldRef = reference;
		Reference newRef = new Reference(oldRef.getClassName(),
				oldRef.getFactoryClassName(),
				oldRef.getFactoryClassLocation()) ; 
		
		for (int i = 0; i < oldRef.size(); i++)
		{
			RefAddr r = oldRef.get(i);
			if (ignorRefAddrComment && r.getType().startsWith("#"))
			{
				// 忽略注释
				continue ;
			}
			final Object content = r.getContent();
			if (content instanceof String)
			{
				final String key = r.getType();
				final String value = (String) content ; 
				
				RefAddr ref = null ;
				if (value.matches("^\\[.+\\]$"))
				{
					final String linkAddr = value.substring(1,value.length()-1); 
					ref = new RefAddr(key){

						/**
						 * 
						 */
						private static final long serialVersionUID = -1891001651430242557L;

						public Object getContent()
						{
							return lookup(linkAddr, getContext());
						}};
				}else
				if (value.matches("^\\{.+\\}$"))
				{
					
					final Object instance;
					try
					{
						instance = ClassUtil.getInstance(
								value.substring(1,value.length()-1));
					}
					catch (InstanceInitialException e)
					{
						logger.error("fail create Instance " + value ,e);
						throw new IllegalArgumentException("fail class Name:" + value);
					} 
					ref = new RefAddr(key){

						/**
						 * 
						 */
						private static final long serialVersionUID = 8439067572342114409L;

						public Object getContent()
						{
							return instance;
						}};
				}else
				{
					 ref = new StringRefAddr(key,value);
				}
				newRef.add(ref);
			}
			else 
			{
				newRef.add(r);
			}
		}
		return newRef;
	}
	
    /**
     * @param reference
     * @param bean
     * @throws SetterInvokeFail
     */
    public final static void invokeAttribute(final Reference reference, Object bean) throws SetterInvokeFail
    {
         invokeAttribute(reference, bean, null);
    }

    /**
     * 
     * 按照 reference 注入属性到 bean 中
	 * @param reference 
	 * @param bean
	 * @param withPreix 是否使用前缀
	 * @throws SetterInvokeFail
	 */
	public final static void invokeAttribute(final Reference reference, Object bean, String withPreix) throws SetterInvokeFail
	{
		Class class1 = bean.getClass() ;
		BeanHelpper methodMap = BeanHelpper.getInstance(class1);
		for (int i = 0 ; i < reference.size(); i ++)
		{
		    
		    final RefAddr refAddr = reference.get(i);
		     String attributeName = refAddr.getType();
            if (withPreix!=null ) //如果指定前缀
            {
                if (attributeName.startsWith(withPreix))
                {
                    attributeName = attributeName.substring(withPreix.length());
                }
                else
                {
                    continue ;
                }
            }
			String propertyName = StringUtil.lowCaseFirstChar(attributeName);
	        final Object value = refAddr.getContent();
		    if (methodMap.haveBeanAttribute(propertyName))
		    {
				methodMap.invoke(bean, propertyName, value);
		    }
		    else
		    {
		        logger.warn("Unsupport property " + propertyName + " for " + class1.getName());
		    }
		}
	}


	/**
	 * @param reference
	 * @param keyName
	 * @return Object
	 */
	public static Object getRefValueRequired(Reference reference, String keyName)
	{
		RefAddr refAddr = reference.get(keyName);

		Object value = refAddr == null ? null :  refAddr.getContent();

		if (value==null) {
			throw new IllegalArgumentException("missing property " + keyName);
		}
		return value;
	}


	/**
	 * @param reference 
	 * @param keyName 
	 * @param defaultValue 
	 * @return Object
	 */
	public static Object getValue(Reference reference, String keyName, Object defaultValue)
	{
		RefAddr refAddr = reference.get(keyName);

		Object value = refAddr == null ? null :  refAddr.getContent();

		return value==null ? defaultValue : value;
	}
	
}
