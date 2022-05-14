package com.my.web.user;

import com.my.project.user.UserDAO;
import com.my.project.user.UserVO;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login.do")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

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
        response.setContentType("text/html; charset=UTF-8");
        // HTTP 응답 프로토콜 Message-Body 와 연결된 출력스트림을 획득한다.
        PrintWriter out = response.getWriter();
        if(user != null)
        {
            if(user.getPassword().equals(vo.getPassword()))
            {
                out.println(user.getName() + "님 로그인 환영합니다. <br>");
                out.println("<a href='/getBoardList.do>글 목록 바로가기</a>");
            }
            else	// 비밀번호 오류일 때
            {
                out.println("비밀번호 오류입니다. <br>");
                out.println("<a href='/login.html>다시 로그인</a>");
            }
        }
        else	// 아이디에 해당하는 회원이 없는 경우
        {
            out.println("입력하신 아이디에 해당하는 회원이 없습니다. <br>");
            out.println("<a href='/login.html>다시 로그인</a>");

        }

    }


}
