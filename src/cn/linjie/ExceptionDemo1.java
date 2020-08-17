package cn.linjie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
    编译时异常和运行时异常的区别
    编译期异常：
    运行期异常
 */
public class ExceptionDemo1 {
    public static void main(String[] args) {
        System.out.println("处理异常之前");
        try {
            method();
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("处理异常之后");
    }

    public static void method() throws ParseException {
        String s = "2014-11-20--";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = null;
        d = sdf.parse(s);
        System.out.println(d);
    }
}
