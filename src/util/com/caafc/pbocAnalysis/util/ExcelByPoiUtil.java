package com.caafc.pbocAnalysis.util;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jxl.Cell;
import jxl.CellType;
import jxl.DateCell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.apache.poi.hssf.usermodel.HSSFCell;

/**
 * EXCEL 工具。
 */
public class ExcelByPoiUtil {
	/**
	 * 读取excel
	 * 
	 * @param filename
	 * @return
	 * @throws Exception
	 */
	public static List readExcel(String filename){
		File file=new File(filename);
		List sheetData = new ArrayList();
		  
        Workbook wb = null;   
        try  
        {   
            //构造Workbook（工作薄）对象      
            wb = Workbook.getWorkbook(file);   
        }   
        catch (final BiffException e)   
        {   
            e.printStackTrace();
            System.out.println("解析excel异常！");
        }   
        catch (final IOException e)   
        {   
            e.printStackTrace();   
        }   
  
        if (wb == null) return null;   
  
        //获得了Workbook对象之后，就可以通过它得到Sheet（工作表）对象了      
        final Sheet[] sheet = wb.getSheets();   
  
        if (sheet != null && sheet.length > 0)   
        {   
            //对每个工作表进行循环      
            for (int i = 0; i < sheet.length; i++)   
            {   
                //得到当前工作表的行数      
                final int rowNum = sheet[i].getRows();   
                for (int j = 1; j < rowNum; j++)   
                {   
                	List ls=new ArrayList();
                    //得到当前行的所有单元格      
                    final Cell[] cells = sheet[i].getRow(j);   
                    if (cells != null && cells.length > 0)   
                    {   
                        //对每个单元格进行循环      
                        for (int k = 0; k < cells.length; k++)  
                        	
                        {    
                        	
                        	String cellValue=cells[k].getContents().equals("null")||cells[k].getContents()==null?"":cells[k].getContents().trim();
                        	java.text.DateFormat sdf = new java.text.SimpleDateFormat("yyyy-MM-dd");

                        	  if(cells[k].getType()==CellType.DATE){ 
                        	         DateCell dateCell = (DateCell) cells[k];
                                     Date date = dateCell.getDate();
                                     cellValue = new SimpleDateFormat("yyyy-MM-dd").format(date);
                        	  }
                        	  
                            //读取当前单元格的值      
                           // final String cellValue = cells[k].getContents();   
                            ls.add(cellValue.trim());
                        }   
                    }   
                    sheetData.add(ls);
                    
                }   
            }   
        }   
        //最后关闭资源，释放内存      
        wb.close();   
       return sheetData;
	}

	/**
	 * 用于显示EXCEL数据
	 * 
	 * @param sheetData
	 */
	private static void showExelData(List sheetData) {
		// 遍历输出
		for (int i = 0; i < sheetData.size(); i++) {
			List list = (List) sheetData.get(i);
			for (int j = 0; j < list.size(); j++) {
				System.out.print(list.get(j) + "|");
			}
			System.out.println("");
		}
	}

	public static String chengeType(HSSFCell cell) {
		String value = "";
		switch (cell.getCellType()) {
		case HSSFCell.CELL_TYPE_BOOLEAN:
			value = cell.getBooleanCellValue() + "";
			break;
		case HSSFCell.CELL_TYPE_NUMERIC:
			value = cell.getNumericCellValue() + "";
			break;
		case HSSFCell.CELL_TYPE_FORMULA:
		case HSSFCell.CELL_TYPE_BLANK:
		case HSSFCell.CELL_TYPE_STRING:
			value = cell.getStringCellValue();
			break;

		}
		return value;
	}

	/**
	 * 测试
	 * 
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		// 20120316-工作计划.xls
		ExcelByPoiUtil e = new ExcelByPoiUtil();
		e.showExelData(e.readExcel("d:\\upload\\持有至到期投资.xls"));

	}
}
