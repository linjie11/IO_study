package com.linjie.IO_Test;

import java.io.*;

/*
复制图片
 */
public class CopyImageDemo {
    public static void main(String[] args) throws IOException {
        File srcFile = new File("E:\\\\JAVA_study\\\\a.jpg");
        File destFile = new File("E:\\\\JAVA_study\\\\b.jpg");
//        String srcString = "E:\\JAVA_study\\a.jpg";
//        String destString = "E:\\JAVA_study\\b.jpg";
        method1(srcFile,destFile);
//        method2(srcFile,destFile);
//        method3(srcFile,destFile);
//        method4(srcFile,destFile);
    }
    private static void method1(File srcFile,File destFile) throws IOException {
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);
        int by = 0;
        while((by=fis.read())!=-1){
            fos.write(by);
        }
        fos.close();
        fis.close();
    }

    private static void method2(File srcFile,File destFile) throws IOException {
        FileInputStream fis = new FileInputStream(srcFile);
        FileOutputStream fos = new FileOutputStream(destFile);
        byte[] bys = new byte[1024];
        int len = 0;
        while((len=fis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fis.close();
        fos.close();
    }

    private static void method3(File srcFile,File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        int by = 0;
        while((by=bis.read())!=-1){
            bos.write(by);
        }
        bis.close();
        bos.close();
    }

    private static void method4(File srcFile,File destFile) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(srcFile));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(destFile));
        byte[] bys = new byte[1024];
        int len = 0;
        while((len=bis.read(bys))!=-1){
            bos.write(bys,0,len);
        }
        bis.close();
        bos.close();
    }
}
