package com.linjie.IO_FileOutputStream;

/*
往一个文本文件中输入一句话：hello，io。

分析要使用OutputStream

 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo1 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流
//
//        //FileOutputStream(File file)
//        File file = new File("E:\\JAVA_study\\file.txt");
//        FileOutputStream fos = new FileOutputStream(file);

        //FileOutputStream(String name)
        FileOutputStream fos1 = new FileOutputStream("E:\\JAVA_study\\file.txt");


        //写数据

        fos1.write("hello, IO".getBytes());

        //释放资源
        fos1.close();
    }
}
