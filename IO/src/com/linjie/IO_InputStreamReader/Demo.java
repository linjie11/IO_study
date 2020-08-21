package com.linjie.IO_InputStreamReader;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        //创建对象
        InputStreamReader isr = new InputStreamReader(
                new FileInputStream("E:\\JAVA_study\\osw.txt"));
        //读数据
        int ch = 0;
        while((ch = isr.read())!=-1){
            System.out.print((char) ch);
        }
    }
}
