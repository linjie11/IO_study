package com.linjie.File_studuy;

import java.io.File;

/*
判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件
 */
public class File_test {
    public static void main(String[] args) {
        File file = new File("E://JAVA_study");
        File[] fileArr = file.listFiles();
        for(File f:fileArr){
            if(f.isFile()){
                if(f.getName().endsWith(".jpg")){
                    System.out.println(f.getName());
                }
            }
        }
    }
}
