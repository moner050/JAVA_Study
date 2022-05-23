<%@ page contentType="text/html; charset=UTF-8" errorPage="errors/boardError.jsp"%>

<%@include file="../layout/header.jsp" %>

<center>
	<h1>회원 가입</h1>
<form action="insertUser_proc.jsp" method="post">
	<table border="1" cellpadding="0" cellspacing="0">
<tr>
	<td bgcolor="orange">아이디</td>
	<td><input type="text" name="id" size="10" /></td>
</tr>
<tr>
	<td bgcolor="orange">비밀번호</td>
	<td><input type="password" name="password" size="12" /></td>
</tr>
<tr>
	<td bgcolor="orange">이름</td>
	<td><input type="text" name="name" size="30" /></td>
</tr>
<tr>
	<td bgcolor="orange">권한</td>
	<td>
		<input type="radio" value="USER" name="role" checked="checked" />일반회원
		<input type="radio" value="ADMIN" name="role" />관리자
	</td>
</tr>
<tr>
	<td bgcolor="orange" colspan="2" align="center">
	<input type="submit" value="회원가입" />
	<input type="reset" value="가입취소" />
	</td>
</tr>
	</table>
</form>

<%@include file="../layout/footer.jsp" %>