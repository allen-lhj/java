package com.static_;

public class StaticMethod_ {
    public static void main(String[] args) {
        Stu xiaoming = new Stu("xiaoming");
        Stu xiaohong = new Stu("xiaohong");
        xiaoming.payFee(200);
        xiaohong.payFee(300);
        System.out.println(Stu.getFee());
    }
}

class Stu {
    private String name;
    private static double fee = 0;
    public Stu(String name) {
        this.name = name;
    }
    public void payFee(double fees) {
        Stu.fee += fees;
    }

    public static double getFee() {
        return Stu.fee;
    }

}