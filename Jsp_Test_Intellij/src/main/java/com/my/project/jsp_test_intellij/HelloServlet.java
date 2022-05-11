package com.my.project.jsp_test_intellij;

import java.io.*;
import javax.servlet.http.*;

//@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {

        System.out.println("==> doGet() 실행!");

    }

    public void destroy() {
    }
}