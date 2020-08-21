package com.linjie.IO_Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

public class FileToArrayListDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:\\JAVA_Study\\a.txt"));
        ArrayList<String> array = new ArrayList<String>();
        String line = null;
        while ((line=br.readLine())!=null){
            array.add(line);
        }
        br.close();
        for (String s:array){
            System.out.println(s);
        }
        //随机产生一个索引
        Random r = new Random();
        int index = r.nextInt(array.size());
        System.out.println("随机选取的字符串为:"+array.get(index));
    }
}
