package com.my.web.user;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.my.biz.user.UserDAO;
import com.my.biz.user.UserVO;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet(urlPatterns = "/insertUser.do",
			initParams = @WebInitParam(name = "encoding", value = "UTF-8"))
public class InsertUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String encoding;

	@Override
	public void init(ServletConfig config) throws ServletException {
		// ServletConfig 객체를 이용하여 Local-parameter 정보를 추출하여 멤버변수를 초기화한다. 
		encoding = config.getInitParameter("encoding");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("InsertUserServlet 실행");
		
		ServletContext context = getServletContext();
		encoding = context.getInitParameter("encoding");
		request.setCharacterEncoding(encoding);
		
		UserDAO userDAO = new UserDAO();
		// 반드시 사용자 입력 정보를 추출하기 전에 인코딩 방식을 지정해줘야 한다.
		
		// 1. 사용자 입력 정보 추출
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		String role = request.getParameter("role");
		
		// 2. DB 연동 처리 (추출한 회원 정보를 USERS 테이블에 등록하는 코드를 완성하시오.)
		UserVO vo = new UserVO();
		vo.setId(id);
		vo.setPassword(password);
		vo.setName(name);
		vo.setRole(role);
		
		UserVO user = userDAO.getUser(vo);
		
		if(user == null)
		{
			userDAO.insertUsers(vo);
			System.out.println("회원가입이 정상적으로 처리되었습니다.");
			// 3. 화면 이동
			response.sendRedirect("login.html");
			
		}
		else
		{
			System.out.println("중복되는 아이디 값이 있습니다.");
		}
		

		
	} 
}
