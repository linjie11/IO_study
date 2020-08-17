package cn.linjie;
/*
    异常：程序出现了不正常的情况

    程序的异常：Throwable
        严重问题：ERROR  我们不处理。这种问题一般都是含严重的，比如说内存溢出。
        问题：Exception
            编译器问题:不是RuntimeException的异常
            运行期问题:RuntimeException，这种问题我们也不处理，因为是你的问题，需要修正代码

 */

/*
注意：1.try里面的代码越少越好
     2.catch里面必须有内容
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        method1();
    }


    public static void method1() {
        int a = 10;
        int b = 0;
        int[] arr = {1,2,3};
        try {
            System.out.println(a / b);
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println("除数不能为0");
        } finally {
            System.out.println("finished");
        }
    }

}
