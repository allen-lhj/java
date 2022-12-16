package com.finalize;

public class Finalize_ {
    public static void main(String[] args) {
        Car bmw = new Car("宝马");
        bmw = null; // 这时，car对象就是一个垃圾，垃圾回收器就会回收（销毁）对象
        // 也就是会释放掉该对象在内存中占用的空间，销毁前会调用finalize方法
        // 我们可以在finalize中，写一些自己的业务代码（比如释放资源：数据库连接，或打开文件。。）
    }
}

class Car {
    private String name;

    public Car(String name) {
        this.name = name;
    }

}
