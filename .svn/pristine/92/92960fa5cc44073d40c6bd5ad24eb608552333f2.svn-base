package com.caafc.pbocAnalysis.dao.base;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Order;

import com.caafc.pbocAnalysis.util.QueryResult;


/**
 * 泛型的dao接口.
 * @author lawever
 * @version $Revision:$
 */
public interface GenericDao <T, PK extends Serializable> {

    /**
     * Generic method used to get all objects of a particular type. This
     * is the same as lookup up all rows in a table.
     * @return List of populated objects
     */
    List<T> getAll();

    /**
     * Generic method to get an object based on class and identifier. An
     * ObjectRetrievalFailureException Runtime Exception is thrown if
     * nothing is found.
     *
     * @param id the identifier (primary key) of the object to get
     * @return a populated object
     * @see org.springframework.orm.ObjectRetrievalFailureException
     */
    T get(PK id);

    /**
     * Checks for existence of an object of type T using the id arg.
     * @param id the id of the entity
     * @return - true if it exists, false if it doesn't
     */
    boolean exists(PK id);

    /**
     * Generic method to save an object - handles both update and insert.
     * @param object the object to save
     * @return the persisted object
     */
    T save(T object);

    /**
     * Generic method to delete an object based on class and id
     * @param id the identifier (primary key) of the object to remove
     */
    void remove(PK id);
    
    /**
     * Gets all records without duplicates.
     * <p>Note that if you use this method, it is imperative that your model
     * classes correctly implement the hashcode/equals methods</p>
     * @return List of populated objects
     */
    List<T> getAllDistinct();
    

    /**
     * Find a list of records by using a named query
     * @param queryName query name of the named query
     * @param queryParams a map of the query names and the values
     * @return a list of the records found
     */
    List<T> findByNamedQuery(String queryName, Map<String, Object> queryParams);
    
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    // 新增方法
    
    /**
     * 根据条件获取单个实体.
	 * @param detachedCriteria 离线查询参数
     * @return
     */
    public T get(DetachedCriteria detachedCriteria);
    
	/**
	 * 查询数据（将符合条件的数据全部查询出来）.
	 * @param criteria
	 * @return
	 */
	public List<T> getAllData(DetachedCriteria detachedCriteria);
	
	/**
	 * 查询数据(分页).
	 * @param criteria 离线查询参数
	 * @param firstResult 第一条记录位置
	 * @param maxResults 最大记录数
	 * @return
	 */
	public QueryResult<T> getScrollData(DetachedCriteria detachedCriteria, int firstResult, int maxResults);

	/**
	 * 查询数据(分页)-可排序.
	 * @param criteria 离线查询参数
	 * @param firstResult 第一条记录位置
	 * @param maxResults 最大记录数
	 * @param orders 排序条件集合
	 * @return
	 */
	public QueryResult<T> getScrollData(DetachedCriteria criteria, int firstResult, int maxResults, Order[] orders);
}
