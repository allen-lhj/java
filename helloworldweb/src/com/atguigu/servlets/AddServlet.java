package com.atguigu.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class AddServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 获取session，获取不到就创建一个
        HttpSession session = req.getSession();
        System.out.println("session id = " + session);

    }

//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setCharacterEncoding("utf-8");
//        String name = req.getParameter("name");
//        String priceStr = req.getParameter("price");
//        Integer price = Integer.parseInt(priceStr);
//        String countStr = req.getParameter("count");
//        Integer count = Integer.parseInt(countStr);
//        String remark = req.getParameter("remark");
//
//        System.out.println("name =" + name);
//        System.out.println("price =" + price);
//        System.out.println("count =" + count);
//        System.out.println("remark =" + remark);
//    }
}
