package com.caafc.pbocAnalysis.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.caafc.pbocAnalysis.util.DBControl;


public class DBConsoleServlet extends HttpServlet {
 
	private static final long serialVersionUID = 244779243898229738L; 
	
	public DBConsoleServlet() {
		super();
	}

	/**
	 * Destruction of the servlet. <br>
	 */
	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		this.doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String status = request.getParameter("status");
		String sql = request.getParameter("sql") + " FETCH FIRST 100 ROWS ONLY";
		response.setContentType("text/html");
		response.setCharacterEncoding("GBK");
		PrintWriter out = response.getWriter();
		// 根据表明和数据源名称查询表信息
		if (status.equals("select")) {
			System.out.println("select.....");
			
			DBControl dbc = new DBControl();
			List alldata;
			try {
				alldata = dbc.dataSelect(sql);
				// 调用查询表信息方法

				// 输出表信息
				String[] columnNames = (String[]) alldata.get(0);
				String data = (String) alldata.get(1);
				int columnnums = columnNames.length;
				out.println("<table border='1'>");
				out.println("<tr bgcolor='#3333FF'>");
				for (int i = 0; i < columnnums; i++) {
					out.println("<td><span class=STYLE6>");
					out.print(columnNames[i]);
					out.println("</span></td>");
				}
				out.println("</tr>");
				String str1[] = data.split(";;;");
				for (int i = 0; i < str1.length; i++) {
					String str2[] = str1[i].split(";");
					out.println("<tr>");
					for (int m = 0; m < str2.length; m++) {
						
						out.println("<td>");
						out.print(str2[m] + "&nbsp;");
						out.println("</td>");
					}
					out.println("</tr>");
				}
				out.println("</table>");
			} catch (Exception e) {
				// TODO (2011-3-14 下午04:47:20) 自动生成的 catch 块
				e.printStackTrace();
			} finally{
				
				dbc.close();
			}
		}
	}
	public void init() throws ServletException {
		// Put your code here
	}
}
