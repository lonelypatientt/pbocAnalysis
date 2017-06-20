package com.caafc.pbocAnalysis.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.tools.zip.ZipEntry;
import org.apache.tools.zip.ZipOutputStream;


public class ZipFile {

	/**
     * 压缩文件-由于out要在递归调用外,所以封装一个方法用来
     * 调用ZipFiles(ZipOutputStream out,String path,File... srcFiles)
     * @param zip
     * @param path 文件在zip归档文件中的路径。如果放在归档文件根下，则传 ""
     * @param srcFiles
     * @throws IOException
     */ 
    public static void ZipFiles(File zip,String path,File... srcFiles) throws IOException{ 
        ZipOutputStream out = new ZipOutputStream(new FileOutputStream(zip)); 
        ZipFiles(out,path,srcFiles); 
        out.close(); 
    } 
    
    /**
     * 压缩。
     * @param out ZipOutputStream
     * @param path 文件在zip归档文件中的路径。如果放在归档文件根下，则传 ""
     * @param srcFiles
     */
    public static void ZipFiles(ZipOutputStream out,String path,File... srcFiles){ 
        
        byte[] buf = new byte[1024]; 
        try {
            for(int i=0;i<srcFiles.length;i++){ 
                if(srcFiles[i].isDirectory()){ 
                    File[] files = srcFiles[i].listFiles(); 
                    String srcPath = srcFiles[i].getName(); 
                    srcPath = srcPath.replaceAll("\\*", "/"); 
                    if(!srcPath.endsWith("/")){ 
                        srcPath+="/"; 
                    } 
                    out.putNextEntry(new ZipEntry(path+srcPath)); 
                    ZipFiles(out,path+srcPath,files); 
                } 
                else{ 
                    FileInputStream in = new FileInputStream(srcFiles[i]); 
                    //System.out.println(path + srcFiles[i].getName()); 
                    out.putNextEntry(new ZipEntry(path + srcFiles[i].getName())); 
                    int len; 
                    while((len=in.read(buf))>0){ 
                        out.write(buf,0,len); 
                    } 
                    out.closeEntry(); 
                    in.close(); 
                } 
            } 
        } catch (Exception e) { 
            e.printStackTrace(); 
        } 
    } 
}
