package cn.linjie;

public class Teacher {
    public void check(int score) throws ExceptionDemo2 {
       if (score>100||score<0){
           throw new ExceptionDemo2("分数必须在0~100之间");
       }else{
           System.out.println("分数没有问题");
       }
    }
}
