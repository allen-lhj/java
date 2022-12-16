package com.static_;

public class VisitStatic_ {
    public static void main(String[] args) {
        // 类变量是随着类的加载而创建的，所以即使没创建实例对象也可以访问
        System.out.println(A.name);
    }
}

class A {
    public static String name = "jack";
}