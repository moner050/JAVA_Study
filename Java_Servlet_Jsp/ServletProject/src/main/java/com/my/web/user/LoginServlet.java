package com.my.web.user;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.my.biz.user.UserDAO;
import com.my.biz.user.UserVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 1. 사용자 입력 정보 추출
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		
		// 2. DB 연동 처리
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		
		UserDAO userDAO = new UserDAO();
		UserVO user = userDAO.getUser(vo);
		
		// 3. 응답화면 구성
		// 출력 스트림을 얻기 전에 인코딩을 처리한다.
//		response.setContentType("text/html; charset=UTF-8");
		// HTTP 응답 프로토콜 Message-Body 와 연결된 출력스트림을 획득한다.
//		PrintWriter out = response.getWriter();
		if(user != null)
		{
			if(user.getPassword().equals(vo.getPassword()))
			{
				response.sendRedirect("getBoardList.do");
			}
			else	// 비밀번호 오류일 때
			{
				response.sendRedirect("login.html");
			}
		}
		else	// 아이디에 해당하는 회원이 없는 경우
		{
			response.sendRedirect("login.html");
		}
		
	} 


}
