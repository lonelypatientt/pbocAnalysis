package com.caafc.pbocAnalysis.menu;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单缓存管理
 * @author zhaoyan 
 * @version $Revision: 1.1 $
 */
public class MenuCacheManage {

    private static List<MenuInfo> allMenusList = new ArrayList<MenuInfo>(); 
    
    /**
     * 获取 allMenusList 属性值。
     * @return allMenusList 属性值
     * @throws Exception 
     */
    public static List<MenuInfo> getAllMenusList() throws Exception {
    	if(allMenusList.size() == 0){
    		DomParseXml dpx = new DomParseXml();
  
    		allMenusList = dpx.DomParse();
    	}
        return allMenusList;
    }
}
