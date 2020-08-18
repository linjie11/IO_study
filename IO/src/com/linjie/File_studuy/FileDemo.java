package com.linjie.File_studuy;

import java.io.File;
import java.io.IOException;

/*
    File类：文件和目录（文件夹）路径名的抽象表示形式
    构造方法：
 */
public class FileDemo {
    public static void main(String[] args) throws IOException {

        /*
        //File(String pathname):根据一个路径得到File对象
        File file = new File("E:\\JAVA_study\\IO_test.txt");
        //File(String parent,String child):根据一个目录和一个子文件/目录得到File对象
        File file2 = new File("E:\\JAVA_study","IO_test");
        //File(File parent,String child):根据一个父File对象和一个子文件/目录得到File对象
        File file3 = new File("E:\\JAVA_study");
        File file4 = new File(file3,"IO_test.txt");
        */

        //以上三种方式一样
        //创建功能:在E盘下创建一个文件夹
        File file= new File("E:\\JAVA_study\\IO_Filedemo");
        System.out.println("mkdir:"+file.mkdir());
        //创建文件
        File file2 = new File("E:\\JAVA_study\\IO_Filedemo\\a.txt");
        System.out.println("CreatNewFile:"+file2.createNewFile());

//        //在test目录下创建文件b.txt
//        //报错：要想在某个目录下创建内容，该目录首先必须存在
//        File file3 = new File(("E:\\test\\b.txt"));
//        System.out.println("CreatNewFile:"+file3.createNewFile());
//
//        //在E盘目录Test下创建aaa目录,报错
//        File file4 = new File("E://Test//aaa");
//        System.out.println("mkdir:"+file4.mkdir());

        //mkdirs:创建多级文件夹
        File file5 = new File("E:\\Test\\demo1\\a");
        System.out.println("mkdir:"+file5.mkdirs());
        System.out.println("delete:"+file5.delete());

        //修改文件名:剪切
        File file6 = new File("E:\\JAVA_study\\IO_Filedemo\\b.txt");
        System.out.println("renameTo:"+file2.renameTo(file6));

        File file7 = new File("E:\\JAVA_study");
        String[] strArr = file7.list();
        for(String s:strArr){
            System.out.print(s+" ");
        }
        System.out.println();
        System.out.println("-------------");
        File[] fileArr = file7.listFiles();  //获取指定目录下的所有文件或文件夹的File数组
        for(File f:fileArr){
            System.out.print(f.getName()+" ");
        }
    }
}
