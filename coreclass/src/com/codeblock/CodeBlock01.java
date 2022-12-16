package com.codeblock;

public class CodeBlock01 {
}

class Movie {
    private String name;
    private double price;
    private String director;

    public Movie(String name) {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
        System.out.println("电影开始");
        this.name = name;
    }

    public Movie(String name, double price) {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
        System.out.println("电影开始");
        this.name = name;
        this.price = price;
    }

    public Movie(String name, double price, String director) {
        System.out.println("电影屏幕打开");
        System.out.println("广告开始");
        System.out.println("电影开始");
        this.name = name;
        this.price = price;
        this.director = director;
    }
}
