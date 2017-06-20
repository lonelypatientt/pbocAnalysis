package com.caafc.pbocAnalysis.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.concurrent.ConcurrentSkipListSet;

import org.apache.commons.lang.ObjectUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFPalette;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.util.CellRangeAddress;

/**
 * EXCEL 工具。基于POI API实现。
 */
public class ExcelUtilPOI {

	public static Template getTemplate(String file, Map<String, Object> reportProperty) throws FileNotFoundException,
			IOException {
		return getTemplate(file, reportProperty, new ExcelUtilPOI().new DefaultExportLogic()) ;
	}
	
	/**
	 * 获得报表模板导出的实例。
	 * @param file 报表模板文件
	 * @param reportProperty 报表属性配置
	 * @param exportLogic 导出逻辑
	 * @return 报表模板导出的实例
	 * @throws FileNotFoundException 报表模板文件不存在异常
	 * @throws IOException 文件读写异常
	 */
	public static Template getTemplate(String file, Map<String, Object> reportProperty, ExportLogic exportLogic) throws FileNotFoundException,
			IOException {
		// workbook
		POIFSFileSystem poiFileSystem = new POIFSFileSystem(new FileInputStream(file));
		HSSFWorkbook workbook = new HSSFWorkbook(poiFileSystem);
		// init report configuration
		ExcelUtilPOI excelUtilPOI = new ExcelUtilPOI();
		Configuration cfg = excelUtilPOI.new Configuration();
		cfg.setReportStartDate((String) reportProperty.get("startDate"));
		cfg.setReportEndDate((String) reportProperty.get("endDate"));
		cfg.setBankLevel((List<?>) reportProperty.get("bankLevel"));
		cfg.setBankProduct((List<?>) reportProperty.get("bankProduct"));
		cfg.setAproScoreDesc((List<?>) reportProperty.get("aproScoreDesc"));
		
		
		return excelUtilPOI.new Template(workbook, cfg, exportLogic);
	}
	
	public class Template {
		private Configuration config;

		private HSSFWorkbook workbook;
		private ExportLogic exportLogic;
		
		private HSSFCellStyle defaultStyle;
		private HSSFCellStyle colorStyle;
		private HSSFCellStyle columnHeaderStyle;
		private HSSFCellStyle totalStyle;
		private HSSFCellStyle subHeadStyle;
		
		
		/**
		 * @param workbook
		 */
		public Template(HSSFWorkbook workbook, Configuration cfg, ExportLogic exportLogic) {
			super();
			this.config = cfg;
			this.workbook = workbook;
			this.exportLogic = exportLogic;
			initCellStyle();
		}

		/**
		 * 初始化单元格样式。
		 */
		private void initCellStyle() {
			
			// 字体定义
			HSSFFont simsunFont = this.workbook.createFont();
			simsunFont.setFontName("宋体");
			simsunFont.setFontHeightInPoints((short) 9);
			
			// 颜色定义
			HSSFPalette customPalette = this.workbook.getCustomPalette();
			customPalette.setColorAtIndex((short) 9, (byte) 204, (byte) 255, (byte) 204);  // 豆沙绿 亮色
			customPalette.setColorAtIndex((short) 10, (byte) 153, (byte) 204, (byte) 255);  // 蓝色  浅色
			customPalette.setColorAtIndex((short) 11, (byte) 255, (byte) 255, (byte) 0);  // 黄色
			
			// Style 1 数据样式(默认)
			this.defaultStyle = this.workbook.createCellStyle();
			this.defaultStyle.setFont(simsunFont); // 字体
			this.defaultStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // (上下左右)居中对齐
			this.defaultStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
			this.defaultStyle.setBorderTop(HSSFCellStyle.BORDER_THIN); // 显示边框
			this.defaultStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
			this.defaultStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
			this.defaultStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);

			// Style 2 数据样式(填充色)
			this.colorStyle = this.workbook.createCellStyle();
			this.colorStyle.setFont(simsunFont); // 字体
			this.colorStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // (上下左右)居中对齐
			this.colorStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
			this.colorStyle.setBorderTop(HSSFCellStyle.BORDER_THIN); // 显示边框
			this.colorStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
			this.colorStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
			this.colorStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
			this.colorStyle.setFillForegroundColor((short) 9); // 背景色
			this.colorStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			
			// Style 3  列头样式
			this.columnHeaderStyle = this.workbook.createCellStyle();
			this.columnHeaderStyle.setFont(simsunFont); // 字体
			this.columnHeaderStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // (上下左右)居中对齐
			this.columnHeaderStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
			this.columnHeaderStyle.setBorderTop(HSSFCellStyle.BORDER_THIN); // 显示边框
			this.columnHeaderStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
			this.columnHeaderStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
			this.columnHeaderStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
			this.columnHeaderStyle.setFillForegroundColor((short) 10); // 背景色
			this.columnHeaderStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			
			// Style 4  合计样式(尾行合计)
			this.totalStyle = this.workbook.createCellStyle();
			this.totalStyle.setFont(simsunFont); // 字体
			this.totalStyle.setAlignment(HSSFCellStyle.ALIGN_CENTER); // (上下左右)居中对齐
			this.totalStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
			this.totalStyle.setBorderTop(HSSFCellStyle.BORDER_THIN); // 显示边框
			this.totalStyle.setBorderBottom(HSSFCellStyle.BORDER_THIN);
			this.totalStyle.setBorderLeft(HSSFCellStyle.BORDER_THIN);
			this.totalStyle.setBorderRight(HSSFCellStyle.BORDER_THIN);
			this.totalStyle.setFillForegroundColor((short) 11); // 背景色
			this.totalStyle.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
			
			// Style 5  报表子表头样式
			this.subHeadStyle = this.workbook.createCellStyle();
			this.subHeadStyle.setFont(simsunFont); // 字体
		}

		public void process(List<?> data, OutputStream stream) throws IOException {
			exportLogic.process(data, stream, this);
		}
	}

	private class Configuration {
		private String reportStartDate;
		private String reportEndDate;
		
		private List<?> bankLevel;
		private List<?> bankProduct;
		private List<?> aproScoreDesc;
		
		public String getReportStartDate() {
			return reportStartDate;
		}

		public void setReportStartDate(String reportStartDate) {
			this.reportStartDate = reportStartDate;
		}
		public String getReportEndDate() {
			return reportEndDate;
		}
		public void setReportEndDate(String reportEndDate) {
			this.reportEndDate = reportEndDate;
		}
		public List<?> getBankLevel() {
			return bankLevel;
		}
		public void setBankLevel(List<?> bankLevel) {
			this.bankLevel = bankLevel;
		}
		public void setBankProduct(List<?> bankProduct) {
			this.bankProduct = bankProduct;
		}
		public List<?> getBankProduct() {
			return bankProduct;
		}

		public List<?> getAproScoreDesc() {
			return aproScoreDesc;
		}

		public void setAproScoreDesc(List<?> aproScoreDesc) {
			this.aproScoreDesc = aproScoreDesc;
		}
		
	}
	
	/*public interface ExportLogic {
		public void process(List<?> data, OutputStream stream, Template template) throws IOException ;
	}*/
	
	public abstract class ExportLogic {
		
		/** 导出处理方法。 */
		public abstract void process(List<?> data, OutputStream stream, Template template) throws IOException ;
		
		protected void fillReportDate(Template template) {
			// 为第二行报告周期和第三行报告时间填充时间值
			HSSFSheet sheet = template.workbook.getSheetAt(0);
			HSSFRow row1 = sheet.getRow(1);
			HSSFCell cell1_0 = row1.getCell(0);
			cell1_0.setCellStyle(template.subHeadStyle);
			cell1_0.setCellValue(new StringBuilder()
				.append("报告周期：")
				.append(template.config.getReportStartDate())
				.append(" - ")
				.append(template.config.getReportEndDate())
				.toString());
			HSSFRow row2 = sheet.getRow(2);
			HSSFCell cell2_0 = row2.getCell(0);
			cell2_0.setCellStyle(template.subHeadStyle);
			cell2_0.setCellValue(new StringBuilder()
				.append("报告时间：")
				.append(DateUtil.currDayData(new Date(), "yyyy-MM-dd"))
				.toString());
		}
		/** 设置单元格值 */
		protected void setCellValue(HSSFCell cell, Object obj) {
			String stringValue = ObjectUtils.toString(obj);
			try {
				cell.setCellType(HSSFCell.CELL_TYPE_NUMERIC);
				cell.setCellValue(Double.valueOf(stringValue));
			} catch (NumberFormatException e) {
				cell.setCellType(HSSFCell.CELL_TYPE_STRING);
				cell.setCellValue(stringValue);
			}
		}
		
		/** 设置单元格值，以字符串格式。 */
		protected void setCellValueString(HSSFCell cell, Object obj) {
			String stringValue = ObjectUtils.toString(obj);
			cell.setCellType(HSSFCell.CELL_TYPE_STRING);
			cell.setCellValue(stringValue);
		}
		
		/** 设置单元格样式。 */
		protected void setCellStyle(HSSFCell cell, boolean even, Template template) {
			if (even) {
				cell.setCellStyle(template.defaultStyle);
			} else {
				cell.setCellStyle(template.colorStyle);
			}
		}
		/** 将 Excel 列号装换成对应的字母符号。 */
		protected String convertToLetter(int columnIndex) {
			StringBuilder sb = new StringBuilder(2);
			int iAlpha, iRemainder ;
			iAlpha = Math.round(columnIndex / 27);
			iRemainder = columnIndex - (iAlpha * 26);
			if (iAlpha > 0) {
				sb.append((char)(iAlpha + 64));
			}
			if (iRemainder > 0) {
				sb.append((char)(iRemainder + 64));
			}
			return sb.toString();
		}
	}
	
	public class DefaultExportLogic extends ExportLogic {

		public void process(List<?> data, OutputStream stream, Template template) throws IOException {
			if (data != null) {
				if (data.size() > 0) {
					// 为第二行报告期和第三行报告时间填充时间值
					fillReportDate(template);
					
					HSSFSheet sheet = template.workbook.getSheetAt(0);
					Object o = data.get(0);
					if (o.getClass().isArray()) {
						processArray(data, sheet, template);
					} else {
						processObject(data, sheet, template);
					}
				}
			}
			template.workbook.write(stream);
		}
		
		private void processObject(List<?> data, HSSFSheet sheetAt, Template template) {
			// TODO Auto-generated method stub

		}

		private void processArray(List<?> data, HSSFSheet sheet, Template template) {
			int lastRowNum = sheet.getLastRowNum();
			HSSFRow row_zj = sheet.getRow(lastRowNum);
			HSSFCell cell_zj = row_zj.getCell(0);
			String stringCellValue = cell_zj.getStringCellValue();
			if ("总计".equals(stringCellValue) || "合计".equals(stringCellValue)) {
				// 先把最后一行，向下移动n行。为了合计行而操作。
				sheet.shiftRows(lastRowNum, lastRowNum, data.size()-1, true, false);
				lastRowNum = lastRowNum - 2;
			}
			
			for (int r = 0; r < data.size(); r++) {
				Object[] o = (Object[]) data.get(r);
				HSSFRow row = sheet.createRow(++lastRowNum);
				boolean even = lastRowNum % 2 == 0;
				for (int i = 0; i < o.length; i++) {
					Object value = o[i];
					HSSFCell cell = row.createCell(i);
					setCellStyle(cell, even, template);
					setCellValue(cell, value);
				} // column for end
			} // data for end
		}
	}
	
	public class DefaultStringExportLogic extends ExportLogic {

		public void process(List<?> data, OutputStream stream, Template template) throws IOException {
			if (data != null) {
				if (data.size() > 0) {
					// 为第二行报告期和第三行报告时间填充时间值
					fillReportDate(template);
					
					HSSFSheet sheet = template.workbook.getSheetAt(0);
					Object o = data.get(0);
					if (o.getClass().isArray()) {
						processArray(data, sheet, template);
					} else {
						processObject(data, sheet, template);
					}
				}
			}
			template.workbook.write(stream);
		}
		
		private void processObject(List<?> data, HSSFSheet sheetAt, Template template) {
			// TODO Auto-generated method stub

		}

		private void processArray(List<?> data, HSSFSheet sheet, Template template) {
			int lastRowNum = sheet.getLastRowNum();
			HSSFRow row_zj = sheet.getRow(lastRowNum);
			HSSFCell cell_zj = row_zj.getCell(0);
			String stringCellValue = cell_zj.getStringCellValue();
			if ("总计".equals(stringCellValue) || "合计".equals(stringCellValue)) {
				// 先把最后一行，向下移动n行。为了合计行而操作。
				sheet.shiftRows(lastRowNum, lastRowNum, data.size()-1, true, false);
				lastRowNum = lastRowNum - 2;
			}
			
			for (int r = 0; r < data.size(); r++) {
				Object[] o = (Object[]) data.get(r);
				HSSFRow row = sheet.createRow(++lastRowNum);
				boolean even = lastRowNum % 2 == 0;
				for (int i = 0; i < o.length; i++) {
					Object value = o[i];
					HSSFCell cell = row.createCell(i);
					setCellStyle(cell, even, template);
					setCellValueString(cell, value);
				} // column for end
			} // data for end
		}
	}
	
	/** 个贷报表,  新旧模型对比分析报表导出逻辑 */
	public class ModelContrastAnalysisExportLogic extends ExportLogic {

		public void process(List<?> data, OutputStream stream, Template template) throws IOException {
			
			fillReportDate(template); // 为第二行报告期和第三行报告时间填充时间值
			HSSFSheet sheet = template.workbook.getSheetAt(0);
			int[][] xinyidai = {{6, 2}, {6, 1}, {5, 2}, {5, 1}, {5, 3}, {7, 2}, {7, 1}, {6, 3}};
			int[][] fangyidai = {{13, 2}, {13, 1}, {12, 2}, {12, 1}, {12, 3}, {14, 2}, {14, 1}, {13, 3}};
			
			for (int r = 0; r < data.size(); r++) {
				Object[] o = (Object[]) data.get(r);
				Object value = o[0];
				if ("信易贷".equalsIgnoreCase(value.toString())) {
					fillReport(o, sheet, xinyidai, template);
				} else {
					fillReport(o, sheet, fangyidai, template);
				}
			} // data for end
			
			template.workbook.write(stream); //写入数据到输出流
		}

		/**
		 * @param sheet
		 * @param xinyidai
		 */
		private void fillReport(Object[] o, HSSFSheet sheet, int[][] position, Template template) {
			Object value = "";
			for (int i = 1; i < o.length; i++) {
				value = o[i];
				HSSFRow row = sheet.getRow(position[i-1][0]) ;
				HSSFCell cell = row.createCell(position[i-1][1]);
				cell.setCellStyle(template.defaultStyle);
				setCellValue(cell, value);
			} // column for end
		}
	}
	
	
	/** 个贷报表  通过率,   导出逻辑  */ 
	public class PersonalLoanExportLogic extends ExportLogic {

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public void process(List<?> data, OutputStream stream, Template template) throws IOException {
			// 为第二行报告期和第三行报告时间填充时间值
			fillReportDate(template);
			HSSFSheet sheet = template.workbook.getSheetAt(0);
			// 获得支行机构
			List<?> bankLevel = template.config.getBankLevel();
			List<?> bankProduct = template.config.getBankProduct();
			int bankCount = bankLevel.size();
			int productCount = bankProduct.size();
			int resultSetRows = bankCount * productCount;
			int lastRowNum = sheet.getLastRowNum();
			int columnLength = sheet.getRow(lastRowNum).getLastCellNum();
			// 先把最后一行，向下移动n行。为了合计行而操作。
			sheet.shiftRows(lastRowNum, lastRowNum, resultSetRows-1, true, false);
			lastRowNum--;
			// 对数据结果排序
			Collections.sort(data, new ObjectArrayComparator());
			// 支行机构循环
			for (int i = 0; i < bankCount; i++) {
				HSSFRow row = sheet.createRow(lastRowNum);
				HSSFCell cell = row.createCell(0, HSSFCell.CELL_TYPE_STRING);
				cell.setCellStyle(template.defaultStyle);
				String value = (String) bankLevel.get(i);
				cell.setCellValue(value);
				sheet.addMergedRegion(new CellRangeAddress(lastRowNum, lastRowNum + productCount - 1, 0, 0));
				// 产品循环
				for (int j = 0; j < productCount; j++) {
					HSSFRow row_data = sheet.getRow(lastRowNum);
					if (row_data == null) {
						row_data = sheet.createRow(lastRowNum);
					}
					boolean even = lastRowNum % 2 == 0;
					HSSFCell c1 = row_data.createCell(1, HSSFCell.CELL_TYPE_STRING);
					setCellStyle(c1, even, template);
					String valuej = (String) bankProduct.get(j);
					c1.setCellValue(valuej);
					
					// 到数据结果中查找值
					int result = binarySearch(data, new Object[]{value, valuej}, new ObjectArrayComparator());
					// 数据循环
					if (result >= 0) {
						Object[] rowData = (Object[]) data.get(result);
						for (int k = 0; k < columnLength - 2; k++) {
							Object valuek = rowData[k+2];
							HSSFCell ck = row_data.createCell(k+2, HSSFCell.CELL_TYPE_NUMERIC);
							setCellStyle(ck, even, template);
							setCellValue(ck, valuek);
						}
					} else {
						for (int l = 0; l < columnLength - 2; l++) {
							HSSFCell ck = row_data.createCell(l+2, HSSFCell.CELL_TYPE_NUMERIC);
							setCellStyle(ck, even, template);
							ck.setCellValue(0d);
						}
					}
					lastRowNum++;
				} // 产品循环结束
			} // 支行机构循环结束
			sheet.createFreezePane(0, 4, 0, 4); // 冻结前4行
			// 结束
			template.workbook.write(stream); //写入数据到输出流
		}
		private int binarySearch(List<?> list, Object[] key, Comparator<Object[]> comparator) {
			int low = 0, high = list.size() - 1, middle;
			while (low <= high) {
				middle = (low + high) / 2;
				int result = comparator.compare(key, (Object[])list.get(middle));
				if (result < 0) {
					high = middle - 1;
				} else if (result > 0) {
					low = middle + 1;
				} else {
					return middle;
				}
			}
			return -1;
		}
		
		@SuppressWarnings("rawtypes")
		private class ObjectArrayComparator implements Comparator {

			public int compare(Object o1, Object o2) {
				Object[] obj1 = (Object[]) o1;
				Object[] obj2 = (Object[]) o2;
				String obj10=  String.valueOf(obj1[0]);;
				String obj20= String.valueOf(obj2[0]);
				int result = obj10.compareTo(obj20);
				if (result == 0) {
					String obj11 = String.valueOf(obj1[1]);
					String obj21 = String.valueOf(obj2[1]);
					return obj11.compareTo(obj21);
				} else {
					return result;
				}
			}
		}
	}
	
	/** 申请审批通过率分析表、申请预审批通过率分析表     导出逻辑 */ 
	public class ApprovePassRateAnalysisExportLogic extends ExportLogic {

		public void process(List<?> data, OutputStream stream, Template template) throws IOException {
			// 为第二行报告期和第三行报告时间填充时间值
			fillReportDate(template);
			
			HSSFSheet sheet = template.workbook.getSheetAt(0);
			// 保存时间维度
			SortedSet<String> times = new ConcurrentSkipListSet<String>(new Comparator<String>() {

				public int compare(String o1, String o2) {
					SimpleDateFormat sdf = new SimpleDateFormat("MM-yyyy");
					try {
						Date date1 = sdf.parse(o1);
						Date date2 = sdf.parse(o2);
						return date1.compareTo(date2);
					} catch (ParseException e) {
						throw new RuntimeException(e);
					}
				}
			});
			// 抽取第一行 时间 维度，并排序。
			for (int j = 0; j < data.size(); j++) {
				Object[] o = (Object[]) data.get(j);
				times.add(o[0].toString());
			}
			
			// 生成列头行 时间 及映射
			int startRow = 0, lastRowIndex = 0;
			startRow = lastRowIndex = sheet.getLastRowNum();
			Map<String, Integer> timeColumnIndexMap = new HashMap<String, Integer>();
			Iterator<String> iterator = times.iterator();
			
			HSSFRow rowHeader = sheet.createRow(++lastRowIndex);
			HSSFCell cell_0_0 = rowHeader.createCell(0, HSSFCell.CELL_TYPE_STRING);
			cell_0_0.setCellStyle(template.columnHeaderStyle);
			cell_0_0.setCellValue("地区");
			int columnIndex = 1;
			while (iterator.hasNext()) {
				String time = iterator.next();
				HSSFCell cell = rowHeader.createCell(columnIndex, HSSFCell.CELL_TYPE_STRING);
				cell.setCellStyle(template.columnHeaderStyle);
				cell.setCellValue(time);
				timeColumnIndexMap.put(time, columnIndex);
				columnIndex++;
			}
			
			// 生成表样 地区维度及映射
			List<?>	bankLevel = template.config.getBankLevel();
			Map<String, Integer> bankRowIndexMap = new HashMap<String, Integer>();
			
			for (int i = 0; i < bankLevel.size(); i++) {
				
				String bankName = (String) bankLevel.get(i);
				HSSFRow rowData = sheet.createRow(++lastRowIndex);
				HSSFCell cell = rowData.createCell(0, HSSFCell.CELL_TYPE_STRING);
				boolean even = lastRowIndex % 2 == 0;
				setCellStyle(cell, even, template);
				cell.setCellValue(bankName);
				for (int j = 1; j < columnIndex; j++) {
					HSSFCell cell_data = rowData.createCell(j, HSSFCell.CELL_TYPE_NUMERIC);
					setCellStyle(cell_data, even, template);
					cell_data.setCellValue(0.00d);
				}
				bankRowIndexMap.put(bankName, lastRowIndex);
			}
			
			// 总计行
			HSSFRow lastRow = sheet.createRow(++lastRowIndex);
			for (int c = 0; c < columnIndex; c++) {
				if (c == 0) {
					HSSFCell cell = lastRow.createCell(c, HSSFCell.CELL_TYPE_STRING);
					cell.setCellStyle(template.totalStyle);
					cell.setCellValue("总计");
				} else {
					HSSFCell cell = lastRow.createCell(c, HSSFCell.CELL_TYPE_FORMULA);
					cell.setCellStyle(template.totalStyle);
					String columnLabel = convertToLetter(c+1);
					cell.setCellFormula("SUM(INDIRECT(\""+ columnLabel + (startRow+1) + ":"+ columnLabel +"\"&ROW()-1))");
				}
			}
			
			// 填充数据
			for (int k = 0; k < data.size(); k++) {
				Object[] o = (Object[]) data.get(k);
				HSSFRow f_row = sheet.getRow(bankRowIndexMap.get(o[1]));
				HSSFCell f_cell = f_row.getCell(timeColumnIndexMap.get(o[0]));
				Object value = o[2];
				setCellValue(f_cell, value);
			}
			sheet.createFreezePane(1, 0, 1, 0); // 冻结第1列
			// 结束
			template.workbook.write(stream); //写入数据到输出流
		}
	}
	
	/** 批准申请的申请评分与平均贷款金额交叉分析表    导出逻辑 */ 
	public class ApproveScoreAndLoanMoneyExportLogic extends ExportLogic {

		public void process(List<?> data, OutputStream stream, Template template) throws IOException {
			// 填充时间
			fillReportDate(template);
			
			HSSFSheet sheet = template.workbook.getSheetAt(0);
			// 生成表样
			int initStartRowIndex, lastRowIndex ;
			initStartRowIndex  = lastRowIndex = sheet.getLastRowNum();
			lastRowIndex++; // 累加指向新的空行
			// 两行列头
			HSSFRow row0 = sheet.createRow(lastRowIndex);
			HSSFRow row1 = sheet.createRow(lastRowIndex+1);
			HSSFCell cell0 = row0.createCell(0, HSSFCell.CELL_TYPE_STRING);
			cell0.setCellStyle(template.columnHeaderStyle);
			cell0.setCellValue("申请评分");
			sheet.addMergedRegion(new CellRangeAddress(lastRowIndex, lastRowIndex+1, 0, 0));
			
			// 获得支行机构
			List<?> bankLevel = template.config.getBankLevel();
			// 保存支行与列索引的映射关系
			Map<String, Integer> bankColumnIndexMap = new HashMap<String, Integer>();
			int columnIndex = 1;
			int bankCount = bankLevel.size();
			for (int i = 0; i < bankCount; i++) {
				String value = (String) bankLevel.get(i);
				// 生成第一行
				HSSFCell c = row0.createCell(columnIndex, HSSFCell.CELL_TYPE_STRING);
				c.setCellStyle(template.columnHeaderStyle);
				c.setCellValue(value);
				HSSFCell c_1 = row0.createCell(columnIndex+1, HSSFCell.CELL_TYPE_STRING);
				c_1.setCellStyle(template.columnHeaderStyle);
				sheet.addMergedRegion(new CellRangeAddress(lastRowIndex, lastRowIndex, columnIndex, columnIndex+1));
				// 生成第二行
				HSSFCell c_1_1 = row1.createCell(columnIndex, HSSFCell.CELL_TYPE_STRING);
				c_1_1.setCellStyle(template.columnHeaderStyle);
				c_1_1.setCellValue("当前月份");
				HSSFCell c_1_2 = row1.createCell(columnIndex+1, HSSFCell.CELL_TYPE_STRING);
				c_1_2.setCellStyle(template.columnHeaderStyle);
				c_1_2.setCellValue("上一月份");
				
				bankColumnIndexMap.put(value, columnIndex);
				columnIndex = columnIndex + 2;
			}
			
			HSSFCell cell_zj = row0.createCell(columnIndex, HSSFCell.CELL_TYPE_STRING);
			cell_zj.setCellStyle(template.columnHeaderStyle);
			cell_zj.setCellValue("总计");
			HSSFCell cell_zj1 = row0.createCell(columnIndex+1, HSSFCell.CELL_TYPE_STRING);
			cell_zj1.setCellStyle(template.columnHeaderStyle);
			sheet.addMergedRegion(new CellRangeAddress(lastRowIndex, lastRowIndex, columnIndex, columnIndex+1));
			HSSFCell cell_zj_0 = row1.createCell(columnIndex, HSSFCell.CELL_TYPE_STRING);
			cell_zj_0.setCellStyle(template.columnHeaderStyle);
			cell_zj_0.setCellValue("当前月份");
			HSSFCell cell_zj_1 = row1.createCell(columnIndex+1, HSSFCell.CELL_TYPE_STRING);
			cell_zj_1.setCellStyle(template.columnHeaderStyle);
			cell_zj_1.setCellValue("上一月份");
			
			// 生成数据行
			lastRowIndex = lastRowIndex + 2;  // 最后一行位置向下移动2行，指向新的空行
			// 保存分数范围与行索引的映射关系
			Map<String, Integer> scoreDescRowIndexMap = new HashMap<String, Integer>();
			List<?> aproScoreDesc = template.config.getAproScoreDesc();
			for (int j = 0; j < aproScoreDesc.size(); j++) {
				String value = (String) aproScoreDesc.get(j);
				HSSFRow row = sheet.createRow(lastRowIndex);
				HSSFCell cell = row.createCell(0, HSSFCell.CELL_TYPE_STRING);
				boolean even = lastRowIndex % 2 == 0; // 设置单元格样式
				setCellStyle(cell, even, template);
				cell.setCellValue(value);
				
				for (int k = 0; k < bankCount * 2; k++) {
					HSSFCell cell_data = row.createCell(k+1, HSSFCell.CELL_TYPE_NUMERIC);
					setCellStyle(cell_data, even, template);
					cell_data.setCellValue(0.00d);
				}
				// 总计列
				// 公式范围
				String rangeString = new StringBuilder()
				.append(convertToLetter(2)).append(lastRowIndex+1)
				.append(":")
				.append(convertToLetter(columnIndex)).append(lastRowIndex+1)
				.toString();
				
				HSSFCell cell_data_zj0 = row.createCell(columnIndex, HSSFCell.CELL_TYPE_FORMULA);
				setCellStyle(cell_data_zj0, even, template);
				cell_data_zj0.setCellFormula(new StringBuilder().append("SUMPRODUCT((MOD(COLUMN(")
					.append(rangeString)
					.append("),2)=0)*1, ")
					.append(rangeString)
					.append(")")
					.toString());
				HSSFCell cell_data_zj1 = row.createCell(columnIndex+1, HSSFCell.CELL_TYPE_FORMULA);
				setCellStyle(cell_data_zj1, even, template);
				cell_data_zj1.setCellFormula(new StringBuilder().append("SUMPRODUCT((MOD(COLUMN(")
					.append(rangeString)
					.append("),2)=1)*1, ")
					.append(rangeString)
					.append(")")
					.toString());
				scoreDescRowIndexMap.put(value, lastRowIndex);
				lastRowIndex++;
			}
			
			// 总计行
			HSSFRow row_zj = sheet.createRow(lastRowIndex);
			HSSFCell cell_data_zj = row_zj.createCell(0);
			cell_data_zj.setCellStyle(template.totalStyle);
			cell_data_zj.setCellValue("总计");
			int zjStartRowIndex = initStartRowIndex + 4;  // 合计起始行 + 两行列头  + 指向空行 + 转成已1开头
			String columnLabel = "";
			for (int l = 0; l < (bankCount+1) * 2; l++) {
				columnLabel = convertToLetter(l+2);
				HSSFCell cell_data = row_zj.createCell(l+1, HSSFCell.CELL_TYPE_FORMULA);
				cell_data.setCellStyle(template.totalStyle);
				cell_data.setCellFormula(new StringBuilder()
					.append("SUM(INDIRECT(\"")
					.append(columnLabel)
					.append(zjStartRowIndex)
					.append(":")
					.append(columnLabel)
					.append("\"&ROW()-1))")
					.toString());
			}
			
			// 填充数据
			for (int m = 0; m < data.size(); m++) {
				Object[] o = (Object[]) data.get(m);
				HSSFRow row_data_fill = sheet.getRow(scoreDescRowIndexMap.get((String)o[0]));
				HSSFCell cell_data_fill = row_data_fill.getCell(bankColumnIndexMap.get((String)o[1]));
				setCellValue(cell_data_fill, o[2]);
				HSSFCell cell_data_fill1 = row_data_fill.getCell(bankColumnIndexMap.get((String)o[1]) + 1);
				setCellValue(cell_data_fill1, o[3]);
			}
			sheet.createFreezePane(1, 0, 1, 0); // 冻结第1列
			// 结束
			template.workbook.write(stream); //写入数据到输出流
		}

	}
	
}
