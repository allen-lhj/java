package com.debug;

public class Debug01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += i;
            System.out.println("i=" + i);
            System.out.println("sum=" + i);
        }
        //  step over 逐行执行
        //  step into 进入方法体类
        //  Force Step Into 强制进入方法体类
        //  Step Out 跳出方法
        //  Resume 进入下一个断点
    }
}
