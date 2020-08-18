package com.linjie.File_studuy;

/*
实现方式2：
判断E盘目录下是否有后缀名为.jpg的文件，如果有，就输出此文件
 */

import java.io.File;
import java.io.FilenameFilter;

public class File_test2 {
    public static void main(String[] args) {
        File file = new File("E:\\JAVA_study");
        File[] fileArr = file.listFiles();
        //获取该目录下所有文件或者文件夹的String数组
        //public String[] list(FilenameFilter filter)
        String[] strArray = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                File file = new File(dir,name);
                boolean flag = file.isFile();
                boolean flag2 = name.endsWith(".jpg");
                return flag2;
            }
        });
        for(String s:strArray){
            System.out.println(s);
        }
    }
}
