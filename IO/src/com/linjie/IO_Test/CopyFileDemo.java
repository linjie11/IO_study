package com.linjie.IO_Test;

import java.io.*;

/*
复制文本文件
 */
public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        String srcString = "E:\\JAVA_study\\a.txt";
        String destString = "E:\\JAVA_study\\b.txt";
//        method1(srcString,destString);
        method2(srcString,destString);
//        method3(srcString,destString);
//        method4(srcString,destString);
//        method5(srcString,destString);
    }
    private static void method1(String srcString,String destString) throws IOException {
        FileReader fr = new FileReader(srcString);
        FileWriter fw = new FileWriter(destString);
        int ch = 0;
        while((ch =fr.read())!=-1){
            fw.write(ch);
        }
        fw.close();
        fr.close();
    }

    private static void method2(String srcString,String destString) throws IOException {
        FileReader fr = new FileReader(srcString);
        FileWriter fw = new FileWriter(destString);
        char[] chs = new char[1024];
        int len = 0;
        while((len =fr.read(chs))!=-1){
            fw.write(chs,0,len);
        }
        fw.close();
        fr.close();
    }

    private static void method3(String srcString,String destString) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        BufferedWriter bw= new BufferedWriter(new FileWriter(destString));
        int ch = 0;
        while((ch =br.read())!=-1){
            bw.write(ch);
        }
        bw.close();
        br.close();
    }

    private static void method4(String srcString,String destString) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        BufferedWriter bw= new BufferedWriter(new FileWriter(destString));
        char[] chs = new char[1024];
        int len = 0;
        while((len =br.read(chs))!=-1){
            bw.write(chs,0,len);
        }
        bw.close();
        br.close();
    }

    private static void method5(String srcString,String destString) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(srcString));
        BufferedWriter bw= new BufferedWriter(new FileWriter(destString));
        String line = null;
        while((line =br.readLine())!=null){
            bw.write(line);
            bw.newLine();
            bw.flush();
        }
        bw.close();
        br.close();
    }
}
