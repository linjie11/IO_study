package com.linjie.digui_study;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Objects;

/*
把"E:\\JAVA_study目录下的所有.java结尾的文件的绝对路径输出在控制台"
 */
public class FilePathDemo {
    public static void main(String[] args) {
        File srcFolder = new File("E:\\JAVA_study");
        getAllJavaFilePaths1(srcFolder);
    }
    private static void getAllJavaFilePaths(File srcFolder){
        File[] fileArr = srcFolder.listFiles();
        for(File f: fileArr){
            if(f.isDirectory()){
                getAllJavaFilePaths(f);
            }else{
                if(f.getName().endsWith(".java")){
                    System.out.println(f.getAbsolutePath());
                }
            }
        }
    }
    private static void getAllJavaFilePaths1(File srcFolder){
        File[] fileArr = srcFolder.listFiles();
        for(File f: fileArr){
            if(f.isFile()){
                if(f.getName().endsWith(".java")){
                    System.out.println(f.getAbsolutePath());
                };
            }else{
                getAllJavaFilePaths1(f);
                }
            }
        }
    }

