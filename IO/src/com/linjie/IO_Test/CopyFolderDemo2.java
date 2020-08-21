package com.linjie.IO_Test;

import java.io.*;

/*
复制指定目录下的指定文件，并修改后缀名。
 */
public class CopyFolderDemo2 {
    public static void main(String[] args) throws IOException {
        File srcFolder = new File("E:\\JAVA_study\\demo2");
        File destFolder = new File("E:\\test2");
        if(!destFolder.exists()){
            destFolder.mkdir();
        }
        File[] fileArray = srcFolder.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return new File(dir,name).isFile()&&name.endsWith(".java");
            }
        });
        for(File file:fileArray){
            String name = file.getName();
            String newname = name.replace(".java",".jad");
            File newFile = new File(destFolder,newname);
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
