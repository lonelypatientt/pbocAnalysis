package com.caafc.pbocAnalysis.util;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.transform.ResultTransformer;


/**
 * hibernate查询结果装换。 (2012-3-30 下午2:30:35) 请添加 AliasToEntityLinkedMapResultTransformer 类的注释。
 * @author liuyin 
 * @version $Revision: 1.1 $
 */
public class AliasToEntityLinkedMapResultTransformer implements
		ResultTransformer {

	/*
	 * <code>serialVersionUID</code> 的注释
	 */
	private static final long serialVersionUID = 1L;

	
	public List transformList(List list) {
		return list;
	}

	
	public Object transformTuple(Object[] aobj, String[] as) {
		Map<String, Object> result = new LinkedHashMap<String, Object>(aobj.length);
        for(int i = 0; i < aobj.length; i++)
        {
            String alias = as[i];
            if(alias != null)
                result.put(alias, aobj[i]);
        }

        return result;
	}

}
