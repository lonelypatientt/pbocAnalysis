package com.caafc.pbocAnalysis.menu;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.caafc.pbocAnalysis.util.WebServiceUrlConfig;


/**
 * 从 menufile.xml 读取菜单信息。
 * 
 * meuUrl,meuDes  默认值为 ""
 * image 默认值为  "/style/images/tools/icon/page.gif" 
 * level 默认值 为 "3"
 * @author Administrator 
 * @version $Revision: 1.1 $
 */
public class DomParseXml {
	
	private static final String IMAGE = "image";
	private static final String MEU_DES = "meuDes";
	private static final String LEVEL = "level"; 
	private static final String MEU_NAM = "meuNam";
	private static final String MEU_URL = "meuUrl";
	private static final String MEU_IDT = "meuIdt";
	public List<MenuInfo> DomParse() throws Exception {
		
		List<MenuInfo> menuList = new ArrayList<MenuInfo>();
		
		DocumentBuilderFactory domfac = DocumentBuilderFactory.newInstance();
		try {

			DocumentBuilder dombuilder = domfac.newDocumentBuilder();
			
			//ClassLoader classLoader = DomParseXml.class.getClassLoader();
			//String name  = classLoader.getResource("").getResourceAsStream().replaceAll("%20", " ") + "/menufile.xml";
			InputStream is = new DomParseXml().getClass().getResourceAsStream("/menufile.xml");
			Document doc = dombuilder.parse(is);
			Element root = doc.getDocumentElement();
			NodeList menus = root.getChildNodes();

			if (menus != null) {
				for (int i = 0; i < menus.getLength(); i++) {
					Node book = menus.item(i);
					if (book.getNodeType() == Node.ELEMENT_NODE) {
						String meuIdt = book.getAttributes().getNamedItem(MEU_IDT).getNodeValue().trim();
						Node xUrl = book.getAttributes().getNamedItem(MEU_URL);
						Node xNam = book.getAttributes().getNamedItem(MEU_NAM);
						Node xLevel = book.getAttributes().getNamedItem(LEVEL);
						Node xMenuDes = book.getAttributes().getNamedItem(MEU_DES);
						Node xImage = book.getAttributes().getNamedItem(IMAGE);
						
						String meuUrl = xUrl==null?"":xUrl.getNodeValue();
						String meuNam = xNam==null?"":xNam.getNodeValue().trim(); 
						String level = xLevel==null?"4":xLevel.getNodeValue();
						String meuDes = xMenuDes==null?"":xMenuDes.getNodeValue(); 
						
						String image = "";;  
						if(xImage==null){
							/*if("2".equals(level)){
								image="";
							}else if("3".equals(level)){
								image= "/style/images/tools/icon/0005.gif" ;
							}
							else if("4".equals(level)){
								image= "/style/images/tools/icon/n_edit.gif" ;
							}*/
							image="";
						}else{
							image = xImage.getNodeValue(); 
						}  

						MenuInfo menuInfo = new MenuInfo();
						menuInfo.setMeuIdt(meuIdt);
						menuInfo.setMeuNam(meuNam); 
						if(meuUrl.indexOf("?") == -1){
							meuUrl = meuUrl + "?tt=";
						}
						menuInfo.setMeuUrl(meuUrl);
						menuInfo.setLevel(level);
						menuInfo.setMeuDes(meuDes);
						menuInfo.setImage(image);
						menuList.add(menuInfo);
					} 
				} 
			} 
		} catch (ParserConfigurationException pcfe) {
			throw pcfe;

		} catch (FileNotFoundException fnfe) {
			throw fnfe;
		} catch (SAXException saxe) {
			throw saxe;
		} catch (IOException ioe) {
			throw ioe;
		}
		return menuList;
	}
}
