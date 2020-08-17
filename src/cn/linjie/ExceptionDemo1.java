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
        method2();  //不需要处理
    }


    /*运行期异常的抛出*/
    private static void method2() throws ArithmeticException{
        int a = 10;
        int b = 0;
        System.out.println(a/b);
    }


    /*编译期异常的抛出*/
    //在方法声明上抛出，是为了告诉调用者，你注意了，我有问题
    public static void method() throws ParseException {
        String s = "2014-11-20--";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date d = null;
        d = sdf.parse(s);
        System.out.println(d);
    }
}
