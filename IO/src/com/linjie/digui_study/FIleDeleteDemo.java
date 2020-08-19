package com.linjie.digui_study;

import java.io.File;

/*
递归删除带内容目录
 */
public class FIleDeleteDemo {
    public static void main(String[] args) {
        File SrcFolder = new File("E:\\Demo");
        DeleteAllFile(SrcFolder);
    }

    private static void DeleteAllFile(File SrcFolder){
        File[] fileArr = SrcFolder.listFiles();
        if(fileArr!=null){
        for (File f:fileArr){
            if(f.isDirectory()){
                DeleteAllFile(f);
            }else{
                System.out.println(f.getName()+"----"+f.delete());
            }
        }
        System.out.println(SrcFolder.getName()+"-----"+SrcFolder.delete()); //删除文件夹
    }
}
}
