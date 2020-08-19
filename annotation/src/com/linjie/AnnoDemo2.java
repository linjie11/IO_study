package com.linjie;

@SuppressWarnings("all")
public class AnnoDemo2 {

    @Override
    public String toString(){
        return super.toString();
    }

    @Deprecated
    public void show1(){
        //有缺陷
    }


    public void show2(){
        //替代show1方法
    }

    public void demo(){
        show1();
    }
}
