package com.linjie.File_studuy;

import java.io.File;

/*
批量修改文件名
 */
public class File_test3 {
    public static void main(String[] args) {
        File srcFloder = new File("E:\\JAVA_study");
        File[] fileArray = srcFloder.listFiles();
        if(fileArray!=null){
        for (File file:fileArray) {
            if (file.isFile()) {
                String name = file.getName();
                if (name.endsWith(".txt")) {
                    int startindex = name.indexOf("_");
                    String numberstring = name.substring(startindex + 1, startindex + 4);
                    int endindex = name.lastIndexOf("_");
                    String namestring = name.substring(endindex + 1);
                    String newName = numberstring.concat(namestring);
                    System.out.println(newName);
                    File newfile = new File(srcFloder, newName);
                    file.renameTo(newfile);
                }
            }
        }
        }
    }
}
