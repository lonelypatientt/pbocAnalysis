package com.caafc.pbocAnalysis.util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPFileFilter;
import org.apache.commons.net.ftp.FTPReply;

public class FtpUtil {

	/**
	 * 从FTP服务器 下载文件，到本地。
	 * 
	 * @param url
	 * @param port
	 * @param username
	 * @param password
	 * @param remotePath
	 * @param localPath
	 * @return
	 * @throws Exception 
	 */
	public static boolean downloadFile(String ip, int port, String username,
			String password, String remotePath, String localPath, final String transferEndFlag, final FTPFileFilter fileFilter) throws Exception {
		boolean result = false;
		FTPClient ftp = new FTPClient();
		try {
			ftp.connect(ip, port);
			ftp.login(username, password); // 登录
			int reply = ftp.getReplyCode();
			if (!FTPReply.isPositiveCompletion(reply)) {
				ftp.disconnect();
				return result;
			}
			ftp.setFileTransferMode(FTP.STREAM_TRANSFER_MODE); // 明确使用二进制传输模式
			ftp.setFileType(FTP.BINARY_FILE_TYPE);
			FTPFile[] ftpFiles = ftp.listFiles(remotePath, new FTPFileFilter() {
				
				@Override
				public boolean accept(FTPFile arg0) {
					return arg0.getName().equalsIgnoreCase(transferEndFlag);
				}
			});
			// 判断传输结束标识文件是否存在
			String ftpFileName = null;
			boolean isEnd = false;
			if (ftpFiles.length > 0) {
				isEnd = true;
			}
			
			if (isEnd) {
				ftpFiles = ftp.listFiles(remotePath, fileFilter);
				if (ftpFiles.length < 1) {
					return result;
				}
				for (FTPFile ftpFile : ftpFiles) {
					ftpFileName = ftpFile.getName();
					if (".".equals(ftpFileName) || "..".equals(ftpFileName)) {
						continue;
					}
					File localFileDir = new File(localPath);
					if (!localFileDir.exists()) {
						localFileDir.mkdirs();
					}
					
					File localFile = new File(localPath + File.separator
							+ new String(ftpFileName.getBytes("ISO-8859-1"), "GBK"));
					
					OutputStream outputStream = new FileOutputStream(localFile);
					ftp.retrieveFile(remotePath + ftpFileName, outputStream);
					outputStream.flush();
					outputStream.close();
				}
				
				result = true;
			}
			ftp.logout();
			
		} finally {
			if (ftp.isConnected()) {
				try {
					ftp.disconnect();
				} catch (IOException ioe) {
				}
			}
		}
		return result;
	}
}
