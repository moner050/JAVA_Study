package hello;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servletB.do")
public class BServlet extends HttpServlet{

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 세션방식
//		HttpSession session = request.getSession();
//		String nickName = (String) session.getAttribute("nickName");
		
		// context 방식
		ServletContext context = getServletContext();
		String nickName = (String) context.getAttribute("nickName");
		
		// forward request 방식
//		String nickName = (String) request.getAttribute("nickName");
		System.out.println("별명 : " + nickName);
	}
}
