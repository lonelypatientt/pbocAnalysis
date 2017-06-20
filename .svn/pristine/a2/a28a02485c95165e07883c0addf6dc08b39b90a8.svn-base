
package com.caafc.pbocAnalysis.dao;

import com.caafc.pbocAnalysis.dao.base.GenericDao;
import com.caafc.pbocAnalysis.entity.FReFicopredata;

/**
 * 个人征信主表
 * @author wzm 
 * @version $Revision:$
 */
public interface PbocSummaryDao extends GenericDao<FReFicopredata, Long> {
	//根据证件号，类型查询，姓名 主键
//	public PbocSummary getPbocSummary(String IdNum,String IdType,String Name); 
//	
////	public void savePbocSummary(HtmlParseRequest htmlParseRequest);
//	//根据条件查询
//	public  PbocSummary queryPbocSummary(PbocSummary pbocSummary);
//	
//	
//	public void savePbocSummary(PbocSummary transientInstance) ;
//
//	public List<PbocSummary> queryByExample(PbocSummary transientInstance) ;
//	
//	public void delete(PbocSummary transientInstance) ;
	
	public String[] findPbocAiInRecord(long id);
	public String findLastPbocAccFundRecord(long id);
	
	/**
	 * 查找有无客户往来
	 * @param iDnum
	 * @return
	 */
	public  boolean findByIDnum(String iDnum);
	
}
