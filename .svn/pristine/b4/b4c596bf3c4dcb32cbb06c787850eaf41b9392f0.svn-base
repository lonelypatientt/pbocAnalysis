package com.caafc.pbocAnalysis.dao.base;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projections;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.caafc.pbocAnalysis.util.QueryResult;

/**
 * dao实现的基类.
 * <p/>
 * 实现了增删改查的方法。
 * 如果需要自定义方法时可以继承自子类.
 * <p>
 * 在配置文件 applicationContext-dao.xml 中按如下配置 .
 * 
 * <pre>
 *      &lt;bean id=&quot;fooDao&quot; class=&quot;com.skyon.sagittarius.dao.base.GenericDaoHibernate&quot;&gt;
 *          &lt;constructor-arg value=&quot;com.skyon.sagittarius.entity.Foo&quot;/&gt;
 *      &lt;/bean&gt;
 * </pre>
 * 
 * @author <a href="mailto:bwnoll@gmail.com">Bryan Noll</a>
 * @param <T> a type variable
 * @param <PK> the primary key for that type
 */
public class GenericDaoHibernate<T, PK extends Serializable> extends HibernateDaoSupport implements GenericDao<T, PK> {
	protected final Log log = LogFactory.getLog(getClass());

	private Class<T> entityClass;

	public GenericDaoHibernate(final Class<T> persistentClass) {
		this.entityClass = persistentClass;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skyon.sagittarius.dao.base.GenericDao#exists(java.io.Serializable)
	 */
	@SuppressWarnings("unchecked")
	public boolean exists(PK id) {
		T entity = (T) getHibernateTemplate().get(this.entityClass, id);
		return entity != null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skyon.sagittarius.dao.base.GenericDao#findByNamedQuery(java.lang.String, java.util.Map)
	 */
	@SuppressWarnings("unchecked")
	public List<T> findByNamedQuery(String queryName, Map<String, Object> queryParams) {
		String[] params = new String[queryParams.size()];
		Object[] values = new Object[queryParams.size()];
		int index = 0;
		Iterator<String> i = queryParams.keySet().iterator();
		
		Iterator<Entry<String, Object>> it = queryParams.entrySet().iterator();
		while (it.hasNext()) {
			Entry<String, Object> entry = it.next();
			params[index] = entry.getKey();
			values[index++] = entry.getValue();
			
		}
		return getHibernateTemplate().findByNamedQueryAndNamedParam(queryName,params, values);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skyon.sagittarius.dao.base.GenericDao#get(java.io.Serializable)
	 */
	@SuppressWarnings("unchecked")
	public T get(PK id) {
		T entity = (T) super.getHibernateTemplate().get(entityClass,id); 
	if (entity == null) {
		log.warn("Uh oh, '" + entityClass + "' object with id '"+ id + "' not found...");
	}

	return entity;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skyon.sagittarius.dao.base.GenericDao#get(org.hibernate.criterion.DetachedCriteria)
	 */
	public T get(DetachedCriteria detachedCriteria) {
        List<T> list = getAllData(detachedCriteria);
        if (list.size() > 0)
            return list.get(0);
        else
            return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skyon.sagittarius.dao.base.GenericDao#getAll()
	 */
	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		return getHibernateTemplate().loadAll(this.entityClass);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skyon.sagittarius.dao.base.GenericDao#getAllData(org.hibernate.criterion.DetachedCriteria)
	 */
	@SuppressWarnings("unchecked")
	public List<T> getAllData(DetachedCriteria detachedCriteria) {
        getHibernateTemplate().flush();
        return getHibernateTemplate().findByCriteria(detachedCriteria);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skyon.sagittarius.dao.base.GenericDao#getAllDistinct()
	 */
	@SuppressWarnings("unchecked")
	public List<T> getAllDistinct() {
		Collection result = new LinkedHashSet(getAll());
		return new ArrayList(result);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skyon.sagittarius.dao.base.GenericDao#getScrollData(org.hibernate.criterion.DetachedCriteria, int, int)
	 */
	public QueryResult<T> getScrollData(DetachedCriteria detachedCriteria, int firstResult, int maxResults) {
		return getScrollData(detachedCriteria, firstResult, maxResults, null);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skyon.sagittarius.dao.base.GenericDao#getScrollData(org.hibernate.criterion.DetachedCriteria, int, int,
	 * org.hibernate.criterion.Order[])
	 */
	@SuppressWarnings("unchecked")
	public QueryResult<T> getScrollData(DetachedCriteria detachedCriteria, int firstResult, int maxResults, Order[] orders) {
        QueryResult queryResult = new QueryResult<T>();
        // 获取符合查询条件的总记录数
        Criteria criteria = detachedCriteria.getExecutableCriteria(getSession());
        criteria.setFirstResult(0);
        int totalCount = ((Integer) criteria.setProjection(Projections.rowCount()).uniqueResult()).intValue();
        queryResult.setTotalRecord(totalCount);

        // 获取符合查询条件的结果集
        if (orders != null && orders.length > 0) {
            for (int i = 0; i < orders.length; i++) {
                detachedCriteria.addOrder(orders[i]);
            }
        }
        detachedCriteria.setProjection(null);
        detachedCriteria.setResultTransformer(Criteria.ROOT_ENTITY);
        List<T> resultList = getHibernateTemplate().findByCriteria(detachedCriteria, firstResult, maxResults);
        queryResult.setResultList(resultList);
        return queryResult;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skyon.sagittarius.dao.base.GenericDao#remove(java.io.Serializable)
	 */
	public void remove(PK id) {
		getHibernateTemplate().delete(this.get(id));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skyon.sagittarius.dao.base.GenericDao#save(java.lang.Object)
	 */
	@SuppressWarnings("unchecked")
	public T save(T object) {
		return (T)  getHibernateTemplate().merge(object);
	}
}
