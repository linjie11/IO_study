package cn.linjie;
/*
java不可能对所有的情况都考虑到，所以，在实际的开发中，我们需要自己定义异常
而我们自己随意写的一个类，是不能作为异常类来看的，要想你的类是一个异常类，就必须继承自Exception或者RuntimeException
 */

//继承编译异常Exception
public class ExceptionDemo2 extends Exception{

    public ExceptionDemo2(String s) {
        super(s);
    }
}
