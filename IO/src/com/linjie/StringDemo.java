package com.linjie;

import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

public class StringDemo {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String s = "你好";
        byte[] bys = s.getBytes();
        byte[] bys1 = s.getBytes("GBK");
        byte[] bys2 = s.getBytes("UTF-8");
        byte[] bys3 = s.getBytes("Unicode");
        System.out.println("默认编码"+ Arrays.toString(bys));
        System.out.println("GBK编码"+ Arrays.toString(bys1));
        System.out.println("UTF-8编码"+ Arrays.toString(bys2));
        System.out.println("Unicode编码"+ Arrays.toString(bys3));
        String ss = new String(bys,"Unicode");
        System.out.println("Unicode解码："+ss);
        String ss1 = new String(bys,"GBK");
        System.out.println("GBK解码："+ss1);
        String ss2 = new String(bys);
        System.out.println("默认解码："+ss2);
        String ss3 = new String(bys,"UTF-8");
        System.out.println("UTF-8解码："+ss3);
    }
}
