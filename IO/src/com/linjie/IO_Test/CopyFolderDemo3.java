package com.linjie.IO_Test;

import java.io.*;

/*
复制多级文件夹
 */
public class CopyFolderDemo3 {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("E:\\JAVA_study\\demo2");
        File destFolder = new File("E:\\test3");
        if (!destFolder.exists()){
            destFolder.mkdir();
        }
        copyFolder(srcFolder,destFolder);
    }

    private static void copyFolder(File srcFolder, File destFolder) throws IOException {
        if (srcFolder.isFile()){
            String name = srcFolder.getName();
            File newFile = new File(destFolder,name);
            copyFile(srcFolder,newFile);
        }else{
            File newFolder = new File(destFolder,srcFolder.getName());
            newFolder.mkdir();
            File[] fileArray = srcFolder.listFiles();
            for (File f:fileArray){
                copyFolder(f,newFolder);
            }
        }
    }

    private static void copyFile(File f, File newFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(f));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(newFile));
        byte[] bys = new byte[1024];
        int len = 0;
        while ((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
            bos.flush();
        }
        bos.close();
        bis.close();
    }
}
