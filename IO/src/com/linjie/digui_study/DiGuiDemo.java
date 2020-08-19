package com.linjie.digui_study;
/*
递归：方法定义中调用方法本身的现象
注意事项：
    A:递归一定要有出口，否则就是死递归
    B：递归的次数不能太多，否则就内存溢出
    C：构造方法不能递归使用
 */
public class DiGuiDemo {
    public static void main(String[] args) {
        System.out.println("5的阶乘是："+jiecheng(5));}

    public static int jiecheng(int number) {
        if (number == 1) {
            return 1;
        }else{
        return number * jiecheng(number-1);}
    }
}
