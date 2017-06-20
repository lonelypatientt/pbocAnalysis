package com.caafc.pbocAnalysis.dao;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * 个人征信信息
 * 
 * @author zl
 * @version $Revision:$
 */
public class PbocSummaryTest extends BaseDaoTestCase {
//	PbocSummaryManager pbocSummaryManager;
	PbocSummaryDao pbocSummaryDao;
	/**
	 * @param pbocSummaryManager the pbocSummaryManager to set
	 */
//	public void setPbocSummaryManager(PbocSummaryManager pbocSummaryManager) {
//		this.pbocSummaryManager = pbocSummaryManager;
//	}
	


	/**
	 * @param pbocSummaryDao the pbocSummaryDao to set
	 */
	public void setPbocSummaryDao(PbocSummaryDao pbocSummaryDao) {
		this.pbocSummaryDao = pbocSummaryDao;
	}

	public void testSave() throws Exception {

		ApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext*.xml" });
//		PbocSummaryManager pm = (PbocSummaryManager)ctx.getBean("pbocSummaryManager");
		File filePath = new File("c:/wangqi.xml");
		//PbocSummary pbocSummary = BuildPbocSummary.bulidPbocSummary(filePath, "20140623");//解析xml封装bean
//		pm.savePbocSummary(filePath, "20141119");
		System.out.println("入库成功！！！！！！！！！");
		/*HtmlParseRequest htmlParseRequest=new HtmlParseRequest();
		htmlParseRequest.setQuerierCertype("021");
		htmlParseRequest.setQuerierCertno("110105196201030813");
		htmlParseRequest.setQuerierName("雷建华");
		PbocSummary p=pm.queryPbocSummary(htmlParseRequest, "");
		System.out.println(p.getQuerierName());*/
//		
//		pm.savePbocSummary(htmlParseRequest);
	//	System.out.println(pm.findMessgeByIdNum("420203196510113744"));
	}
//
//	
//	public void testQuery() throws Exception {
//
//		ApplicationContext ctx = new ClassPathXmlApplicationContext(
//				new String[] { "applicationContext*.xml" });
//		PbocSummary pbocSummary=new PbocSummary();
//		pbocSummary.setQuerierCertType("021");
//		pbocSummary.setQuerierCertNo("320381198708060064");
//		pbocSummary.setQuerierName("陆楠");
//		
//		PbocSummary p=pbocSummaryDao.getPbocSummary("320381198708060064", "021");
//		if(p==null){
//			System.out.println("null");
//		}else{
//			System.out.println(p.getId()+"   name:"+p.getQuerierName());
//		}
//	}
//	
//	public void testQueryPbocAiInRecord() throws Exception {
//
//		ApplicationContext ctx = new ClassPathXmlApplicationContext(
//				new String[] { "applicationContext*.xml" });
//		
//		
//			System.out.println(pbocSummaryDao.findPbocAiInRecord(5839l).length);
//	}

}
