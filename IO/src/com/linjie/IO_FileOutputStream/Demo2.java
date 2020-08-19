package com.linjie.IO_FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Demo2 {
    public static void main(String[] args) throws IOException {
        //创建字节输出流对象
        FileOutputStream fos = new FileOutputStream("E:\\JAVA_study\\fos.txt",true);

        //写数据
//        byte[] bytes = {97,57,55};
        for(int x=0;x<10;x++){
            fos.write(("hello"+x).getBytes());
            fos.write("\n".getBytes());
        }
        fos.close();
    }
}
