package com.linjie.digui_study;
/*
有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子，
假如兔子都不死，问每个月的兔子对数为多少？
 */
public class DiGuiDemo2 {
    public static void main(String[] args) {
        System.out.println("第20个月的兔子总数为："+tu_cal(20));
    }
    public static int tu_cal(int m){
        if((m == 1) | (m == 2)){
            return 1;
        }else{
            return tu_cal(m-1)+tu_cal(m-2);
        }
    }
}
