package com.static_;

public class ChildGame {
    public static void main(String[] args) {
        Child child1 = new Child("小孩1");
        child1.join();
        child1.count++;
        Child child2 = new Child("小孩2");
        child2.join();
        child2.count++;
        Child child3 = new Child("小孩3");
        child3.join();
        child3.count++;
    }
}

class Child {
    private String name;
    // fix: 定义类变量（静态变量）
    // 该变量被Child类的所有对象实例共享
    public static int count = 0;
    public Child(String name) {
        this.name = name;
    }

    public void join() {
        System.out.println(name + "加入了游戏");
    }
}