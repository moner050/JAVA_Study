package hello;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/servletA.do")
public class AServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// session 방식
//		HttpSession session = request.getSession();
//		session.setAttribute("nickName", "Gurum");
		
		// context 방식
		ServletContext context = getServletContext();
		context.setAttribute("nickName", "Gurum");
		
		// request 방식
//		request.setAttribute("nickName", "Gurum");
//		RequestDispatcher dispatcher = request.getRequestDispatcher("servletB.do");
//		dispatcher.forward(request, response);
		
		response.sendRedirect("servletB.do");
	}
}
