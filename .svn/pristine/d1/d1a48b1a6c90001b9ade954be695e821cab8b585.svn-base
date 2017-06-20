/*
 * Copyright (c) 2012 Skyon Technology Ltd.
 * All rights reserved.
 *
 * project: sagittarius
 * create: 2012-11-29 下午04:26:11
 * cvs: $Id: $
 */
package com.caafc.pbocAnalysis.test;

import java.io.File;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.caafc.pbocAnalysis.dao.BaseDaoTestCase;
import com.caafc.pbocAnalysis.dao.PbocSummaryDao;

/**
 * TODO 人行征信XML文件装载测试类.
 * 
 * @author MyUser
 * @version $Revision:$
 */
public class LoadPbocFileTest extends BaseDaoTestCase {
	private PbocSummaryDao pbocSummaryDao;
//	private PbocSummaryManager pbocSummaryManager;
	
	public void testGetDict() throws Exception {
		/*String s1 = "上海大众汽车有限公司南京分公司";
		String s2 = "南京衣钵通电科技有限公司";
		List<String> l = new ArrayList<String>();
		l.add(s1);
		l.add(s2);
		int i = dictionaryFrequencyOperManager.analysisDictionary(l);
		System.out.println(i);*/ 
//		int i=0;
//		File f = new File("C:/Documents and Settings/MyUser/My Documents/工作周报_黄磊_20130322.docx");
//		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(f),"utf-8"));
//		String date = br.readLine();
//		while(date !=null){
//			System.out.println(date);
//			date=br.readLine();
//		}
		/*File f = new File("C:/Documents and Settings/MyUser/My Documents/d.txt");
		BufferedWriter bw = new BufferedWriter( new FileWriter(f));
		String a="甲： 你好";
		String b="乙： 你好";
		List<String> list = new ArrayList<String>();
		list.add(a);
		list.add(b);
		for(int i =0;i<list.size();i++){
			bw.write(list.get(i)+"\r\n");
		}
		
		bw.flush();
		bw.close();*/
		File f = new File("D:/wzz3.xml");
//		PbocSummary pbocSummary = BuildPbocSummary.bulidPbocSummary(f, "20131126");
//		System.out.println(pbocSummary.getQuerierName());
		try {
			//pbocSummaryDao.save(pbocSummary);
			ApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext*.xml" });
//			PbocSummaryManager pm = (PbocSummaryManager)ctx.getBean("pbocSummaryManager");
			//pm.savePbocSummary(f, "20131126");
//			HtmlParseRequest htmlParseRequest = new HtmlParseRequest();
//			htmlParseRequest.setQuerierCertype("0");
//			htmlParseRequest.setQuerierCertno("110101198801010932");
//			htmlParseRequest.setQuerierName("姚明");
//			/*htmlParseRequest.setArchiveNo("");
//			htmlParseRequest.setQueryFormat("20");*/
//			htmlParseRequest.setQueryReason("02");
//			pm.queryPbocSummary(htmlParseRequest,null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	/**
	 * @param pbocSummaryDao the pbocSummaryDao to set
	 */
	public void setPbocSummaryDao(PbocSummaryDao pbocSummaryDao) {
		this.pbocSummaryDao = pbocSummaryDao;
	}

	/**
	 * @param pbocSummaryManager the pbocSummaryManager to set
	 */
//	public void setPbocSummaryManager(PbocSummaryManager pbocSummaryManager) {
//		this.pbocSummaryManager = pbocSummaryManager;
//	}

	
}
