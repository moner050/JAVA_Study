package com.my.project.jsp_test_intellij;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("===> login doPost() start!!");
        String id = request.getParameter("id");
        String password = request.getParameter("password");

        System.out.println(id);
        System.out.println(password);
        System.out.println("출력완료!");
    }
}
