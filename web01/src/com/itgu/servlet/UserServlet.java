package com.itgu.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import netscape.javascript.JSObject;

import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/aaa")
public class UserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");

        String info = "Yes";
        if (username.equals(info)) {
            info = "No";
        }
        System.out.println(123);

        PrintWriter writer = resp.getWriter();
        writer.write(info);
    }
}
