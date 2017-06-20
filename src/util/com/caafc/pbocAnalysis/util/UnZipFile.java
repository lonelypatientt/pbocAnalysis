package com.caafc.pbocAnalysis.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;

import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipFile;

/**
 * @author xihn
 * 
 * 
 */
public class UnZipFile {

	/**
	 * 解压到指定目录
	 * 
	 * @param zipPath
	 * @param descDir
	 */
	public static void unZipFiles(String zipPath, String descDir)
			throws IOException {
		unZipFiles(new File(zipPath), descDir);
	}

	/**
	 * 解压文件到指定目录
	 * 
	 * @param zipFile
	 * @param descDir
	 * @author isea533
	 */
	@SuppressWarnings("rawtypes")
	public static void unZipFiles(File zipFile, String descDir)
			throws IOException {
		File pathFile = new File(descDir);
		if (!pathFile.exists()) {
			pathFile.mkdirs();
		}
		ZipFile zip = new ZipFile(zipFile);
		for (Enumeration entries = zip.getEntries(); entries.hasMoreElements();) {
			ZipEntry entry = (ZipEntry) entries.nextElement();
			String zipEntryName = entry.getName();
			InputStream in = zip.getInputStream(entry);
			String outPath = descDir + zipEntryName;

			// 判断文件全路径是否为文件夹,如果是上面已经上传,不需要解压
			if (new File(outPath).isDirectory()) {
				continue;
			}

			boolean flag = isPics(outPath);
			if (!flag)
				continue;

			OutputStream out = new FileOutputStream(outPath);
			byte[] buf1 = new byte[2048];
			int len;
			while ((len = in.read(buf1)) > 0) {
				out.write(buf1, 0, len);
			}
			in.close();
			out.close();
		}
	}

	public static boolean isPics(String filename) {
		boolean flag = false;

		if (filename.endsWith(".xml"))
			flag = true;

		return flag;
	}

}
