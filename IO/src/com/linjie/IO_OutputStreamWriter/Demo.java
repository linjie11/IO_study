package com.linjie.IO_OutputStreamWriter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class Demo {
    public static void main(String[] args) throws IOException {
        //创建对象
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream
                ("E:\\JAVA_study\\osw.txt"));
        //写数据
        osw.write("中国");

        //释放资源
        osw.close();
    }
}
