<%@page import="com.my.biz.user.UserVO"%>
<%@ page contentType="text/html; charset=UTF-8" 
         errorPage="errors/boardError.jsp"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
         
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>게시판 프로그램</title>
</head>
<body>
<hr>
<a href="index.jsp">Home</a>&nbsp;&nbsp;&nbsp;
<%
	UserVO user = (UserVO) session.getAttribute("user");
%>
<%	if(user == null) { %>
	<a href="insertUser.jsp">회원가입</a>&nbsp;&nbsp;&nbsp;
	<a href="login.jsp">로그인</a>&nbsp;&nbsp;&nbsp;
<%	} else { %>
	<a href="getBoardList.do">글목록</a>&nbsp;&nbsp;&nbsp;
	<a href="insertBoard.jsp">글등록</a>&nbsp;&nbsp;&nbsp;
	<a href="logout_proc.jsp">로그아웃</a>&nbsp;&nbsp;&nbsp;
<%	} %>

<hr>
<br>
