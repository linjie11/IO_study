package com.linjie.IO_Test;

import java.io.*;
import java.nio.channels.FileLockInterruptionException;

/*
复制单级文件夹
 */
public class CopyFolderDemo {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("E:\\JAVA_study\\demo");
        File destFolder = new File("E:\\test");
        if(!destFolder.exists()){
            destFolder.mkdir();
        }
        File[] fileArray = srcFolder.listFiles();
        for(File file:fileArray){
            String name = file.getName();
            File newFile = new File(destFolder,name);
            copyFile(file,newFile);
        }
    }

    private static void copyFile(File file, File newFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
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
