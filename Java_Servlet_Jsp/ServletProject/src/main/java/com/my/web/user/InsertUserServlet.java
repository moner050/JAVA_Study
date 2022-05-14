package com.my.web.user;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
//@WebServlet("/insertUser.do")
public class InsertUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String nickName;
	private String encoding;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// ServletConfig 객체를 이용하여 Local-parameter 정보를 추출하여 멤버변수를 초기화한다. 
		nickName = config.getInitParameter("nickName");
		encoding = config.getInitParameter("encoding");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 반드시 사용자 입력 정보를 추출하기 전에 인코딩 방식을 지정해줘야 한다.
		request.setCharacterEncoding("UTF-8");
		
		// 1. 사용자 입력 정보 추출
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String role = request.getParameter("role");
		
		// 2. DB 연동 처리 (추출한 회원 정보를 USERS 테이블에 등록하는 코드를 완성하시오.)
		System.out.println("회원 이름 : " + name);
		
		
		// 3. 화면 이동
		response.sendRedirect("login.html");
	} 
}
