package com.my.web.user.board;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.my.biz.board.BoardDAO;
import com.my.biz.board.BoardVO;
import com.my.biz.user.UserVO;

@WebServlet(urlPatterns = "/getBoardList.do")
public class getBoardListServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 0. 상태 정보 체크
		HttpSession session = request.getSession();
		UserVO user = (UserVO) session.getAttribute("user");
		ServletContext context = getServletContext();
		
		String select = "";
		String text = "";
		
		if(request.getParameter("select") != null)
		{
			context.setAttribute("select", request.getParameter("select"));
			context.setAttribute("text", request.getParameter("text"));
			
			if(context.getAttribute("select").equals("제목"))
			{
				context.setAttribute("select", "title");
				select = "title";
			}
			else if(context.getAttribute("select").equals("내용"))
			{
				context.setAttribute("select", "content");
				select = "content";
			}
			text = (String) context.getAttribute("text");
		}
		else 
		{
			select = "";
			text = "";
		}

		// 1. DB 연동 처리
		BoardVO vo = new BoardVO();
		BoardDAO boardDAO = new BoardDAO();
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
			
		// 2. 응답 화면 구성
		response.setContentType("text/html; charset=UTF-8");
			
		PrintWriter out = response.getWriter();
			
		out.println("<html>");
		out.println("<head>");
		out.println("<title>글 목록</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<center>");
		out.println("<h1>게시글 목록</h1>");
		out.println("<h3><font color='green'>" + user.getName() + "</font>님 로그인 환영합니다......");
		out.println("<a href='logout.do'>Log-out</a></h3>");
		
		out.println("<form action='getBoardList.do' method='get'>");
		out.println(
		"<table border='1' cellpadding='0' cellspacing='0' width='700'>");
		out.println("<tr align='right'>");
		out.println("<td colspan='5'>");
		out.println("<select name='select'>");
		out.println("<option>제목");
		out.println("<option>내용");
		out.println("</select>");
		out.println("<input type='text' name='text' size='20' value='" + context.getAttribute("text") + "'/>");
		out.println("<input type='submit' value='검색' />");
		out.println("</td>");
		out.println("</tr>");
		out.println("<tr>");
		out.println("<th bgcolor='orange' width='100'>번호</th>");
		out.println("<th bgcolor='orange' width='200'>제목</th>");
		out.println("<th bgcolor='orange' width='150'>작성자</th>");
		out.println("<th bgcolor='orange' width='150'>등록일</th>");
		out.println("<th bgcolor='orange' width='100'>조회수</th>");
		out.println("</tr>");
	
			
		for(BoardVO board : boardList)
		{
			if(context.getAttribute("select") != null && context.getAttribute("select").equals("title"))
			{
				if(board.getTitle().contains(text))
				{
					out.println("<tr align='center'>");
					out.println("<td>" + board.getSeq() + "</td>");
					out.println("<td><a href='getBoard.do?seq=" + board.getSeq() + "'>" + board.getTitle() + "</a></td>");
					out.println("<td>" + board.getWriter() + "</td>");
					out.println("<td>" + board.getRegDate() + "</td>");
					out.println("<td>" + board.getCnt() + "</td>");
				}
			}
			else if(context.getAttribute("select") != null && context.getAttribute("select").equals("content"))
			{
				if(board.getContent().contains(text))
				{
					out.println("<tr align='center'>");
					out.println("<td>" + board.getSeq() + "</td>");
					out.println("<td><a href='getBoard.do?seq=" + board.getSeq() + "'>" + board.getTitle() + "</a></td>");
					out.println("<td>" + board.getWriter() + "</td>");
					out.println("<td>" + board.getRegDate() + "</td>");
					out.println("<td>" + board.getCnt() + "</td>");
				}
			}
			else
			{
				if(select.equals(""))
				{
					out.println("<tr align='center'>");
					out.println("<td>" + board.getSeq() + "</td>");
					out.println("<td><a href='getBoard.do?seq=" + board.getSeq() + "'>" + board.getTitle() + "</a></td>");
					out.println("<td>" + board.getWriter() + "</td>");
					out.println("<td>" + board.getRegDate() + "</td>");
					out.println("<td>" + board.getCnt() + "</td>");
				}
			}
		}
		
		out.println("</table>");
		out.println("</form>");
		out.println("<br>");
		out.println("<a href='insertBoard.html'>새글 등록</a>");
		out.println("</center>");
		out.println("</body>");
		out.println("</html>");

		out.close();
	}
}

