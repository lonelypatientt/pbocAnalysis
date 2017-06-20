
package com.caafc.pbocAnalysis.dao.impl;

import java.text.SimpleDateFormat;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;

import com.caafc.pbocAnalysis.dao.PbocSummaryDao;
import com.caafc.pbocAnalysis.dao.base.GenericDaoHibernate;
import com.caafc.pbocAnalysis.entity.FReFicopredata;

/**
 * TODO 请填写注释.
 * 
 * @author MyUser
 * @version $Revision:$
 */
public class PbocSummaryDaoImpl extends GenericDaoHibernate<FReFicopredata, Long> implements PbocSummaryDao {

	/**
	 * @param persistentClass
	 */
	public PbocSummaryDaoImpl(Class<FReFicopredata> persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}

	

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.skyon.sagittarius.dao.PbocSummaryDao#getId(java.lang.String, java.lang.String)
	 */
	@Override
//	public PbocSummary getPbocSummary(String IdNum, String IdType,String Name) {
//		//String sql = "select ID from  PBOC_SUMMARY where QUERIER_CERT_TYPE=:idtype and QUERIER_CERT_NO=:id ";
//		PbocSummary py = new PbocSummary(); 
//		py.setQuerierCertNo(IdNum);
//		py.setQuerierCertType(IdType);
//		py.setQuerierName(Name);
////		py.setQuerierCertNo("320683198510117167");
////		py.setQuerierCertType("0");
//		HibernateTemplate hibernateTemplate = getHibernateTemplate();
////		SessionFactory sessionFactory = hibernateTemplate.getSessionFactory();
////		Session session = sessionFactory.getCurrentSession();
////		Query query = null;
////		query = session.createSQLQuery(sql).setParameter("idtype", IdType).setParameter("id", IdNum);
//		@SuppressWarnings("unchecked")
//		List<PbocSummary> list = hibernateTemplate.findByExample(py);
//		// Object[] objects = null;
//		if (list.size() > 0) {
//			PbocSummary ps = (PbocSummary) list.get(0);
//			return ps;
//		}
//		return null;
//	}
	
	/**
	 * 通过webservice获取人行征信信息入库
	 */
//	public void savePbocSummary(HtmlParseRequest htmlParseRequest){
//		
//		HtmlParseHandlerService_Client hpc=new HtmlParseHandlerService_Client();
//		HtmlParseResponse htmlParseResponse=hpc.getHtmlParseXml(htmlParseRequest);
//		if(htmlParseResponse!=null&&htmlParseResponse.getResultCode().equals("1")){
//			if(htmlParseResponse.getResultLineList()!=null&&htmlParseResponse.getResultLineList().size()>0){
//				String xmlString=list2String(htmlParseResponse.getResultLineList());
//				System.out.println(xmlString);
//				PbocSummary pbocSummary;
//				try {
//					HibernateTemplate hibernateTemplate = getHibernateTemplate();
//					pbocSummary = BuildPbocSummary.bulidPbocSummary(xmlString,
//						"20131010");
//					hibernateTemplate.merge(pbocSummary);
//				} catch (Exception e) {
//					logger.error("人行征信信息入库失败！");
//					logger.error(e.getMessage());
//					e.printStackTrace();
//				}
//				
//				
//				}
//			}
//	}
//	public String list2String(List list){
//		StringBuffer sb=new StringBuffer();
//		if(list!=null){
//			for (int i = 0; i < list.size(); i++) {
//				sb.append(list.get(i));
//				sb.append("\n");
//			}
//		}
//		return sb.toString();
//	}

	/* (non-Javadoc)
	 * @see com.skyon.jseds.dao.PbocSummaryDao#queryPbocSummary(com.skyon.jseds.entity.PbocSummary)
	 */
//	@Override
//	public PbocSummary queryPbocSummary(PbocSummary pbocSummary) {
//		HibernateTemplate hibernateTemplate = getHibernateTemplate();
//		List<PbocSummary> list = hibernateTemplate.findByExample(pbocSummary);
//		if (list.size() > 0) {
//			PbocSummary ps = (PbocSummary) list.get(0);
//			return ps;
//		}
//		return null;
//	}
	
	
	
//	public void savePbocSummary(PbocSummary transientInstance) {
//		log.debug("saving PbocSummary instance");
//		try {
//			getHibernateTemplate().merge(transientInstance);
//			log.debug("save successful");
//		} catch (RuntimeException re) {
//			log.error("save failed", re);
//			throw re;
//		}
//	}
//
//	public List<PbocSummary> queryByExample(PbocSummary transientInstance) {
//		try {
//			@SuppressWarnings("unchecked")
//			List<PbocSummary> list = getHibernateTemplate().findByExample(transientInstance);
//			return list;
//		} catch (RuntimeException re) {
//			throw re;
//		}
//	}
//	
//	public void delete(PbocSummary transientInstance) {
//		log.debug("delete PbocSummary instance");
//		try {
//			getHibernateTemplate().delete(transientInstance);	
//			log.debug("delete successful");
//		} catch (RuntimeException re) {
//			log.error("delete failed", re);
//			throw re;
//		}
//					
//	}
	
	/* (non-Javadoc)
	 * @see com.skyon.jseds.dao.PbocSummaryDao#findPbocAiInRecord(long)
	 */
	public String[] findPbocAiInRecord(long id) {
		String[] s = new String[2];
        String sql = "select act_status ,OCCURE_DATE from PBOC_AI_IN_RECORD where OCCURE_DATE =(select max(OCCURE_DATE) from PBOC_AI_IN_RECORD where PBOC_ID ="+id+")";
		Session session = getSessionFactory().getCurrentSession();
		Query query = session.createSQLQuery(sql);
		List list = query.list();
		if(list.size()>0){
			Object[] ob = (Object[]) list.get(0);
			String actStatus = ob[0]+"";
			String cDate= ob[1]+"";
			s[0]=actStatus;
			s[1]=cDate;
		}
		return s;
		
	}

	/* (non-Javadoc)
	 * @see com.skyon.jseds.dao.PbocSummaryDao#findLastPbocAccFundRecord()
	 */
	@Override
	public String findLastPbocAccFundRecord(long id) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
	    String sql = "select max(END_MTH) from PBOC_ACC_FUND_RECORD where  PBOC_ID = "+id;
		Session session = getSessionFactory().getCurrentSession();
		Query query = session
				.createSQLQuery(sql);
		List list = query.list();
		String s =  list.get(0)+"";
		return s;
	}

	/* (non-Javadoc)
	 * @see com.skyon.jseds.dao.PbocSummaryDao#findByIDnum(java.lang.String)
	 */
	@Override
	public boolean findByIDnum(String iDnum) {
		String sql = "SELECT t.PAPERID FROM I_AAS_CUST_TOTAL_ASSETS  t where t.PAPERID= " + "'"+iDnum+"'";
		Session session = getSessionFactory().getCurrentSession();
		Query query = session.createSQLQuery(sql);
		List list = query.list();
		if (list.size() != 0) {
			return true ;
		}
		return false;
	}

}
