<%@page import="java.util.List"%>
<%@page import="com.my.biz.board.BoardDAO"%>
<%@page import="com.my.biz.board.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="errors/boardError.jsp" session="true"%>

<%@include file="../layout/header.jsp" %>

<%	// Scriptlet : 정상적인 자바 코드가 작성되는 영역
	// 1. DB 연동 처리
	BoardVO vo = new BoardVO();
	
	BoardDAO dao = new BoardDAO();
	List<BoardVO> boardList = dao.getBoardList(vo);
	
	// 2. 응답 화면 구성	
%>

<center>
	<h1><font color='green'>게스트</font>님 환영합니다.</h1>


<table border="1" cellpadding="0" cellspacing="0" width="700">
<tr>
	<th bgcolor="orange" width="100">번호</th>
	<th bgcolor="orange" width="200">제목</th>
	<th bgcolor="orange" width="150">작성자</th>
	<th bgcolor="orange" width="150">등록일</th>
	<th bgcolor="orange" width="100">조회수</th>
</tr>

<% for(BoardVO board : boardList) { %>
<tr>
	<td><%= board.getSeq() %></td>
	<td align="left"><a href="getBoard.jsp"><%= board.getTitle() %></a></td>
	<td><%= board.getWriter() %></td>
	<td><%= board.getRegDate() %></td>
	<td><%= board.getCnt() %></td>
</tr>
<% } %>

</table>
</center>
<%@include file="../layout/footer.jsp" %>
