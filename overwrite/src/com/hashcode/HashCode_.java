package com.hashcode;

public class HashCode_ {
    public static void main(String[] args) {
        AA aa = new AA();
        AA aa2 = new AA();

        System.out.println("aa.hashCode()=" + aa.hashCode());
        System.out.println("aa2.hashCode()=" + aa2.hashCode());
    }
}

class AA {}