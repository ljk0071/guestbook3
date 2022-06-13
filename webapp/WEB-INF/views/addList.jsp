<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="./write" method="post">
		<table border=1>
			<tr>
				<td>이름 <input type="text" name="name" value=""></td>
				<td>비밀번호 <input type="password" name="password" value=""></td>
			</tr>
			<tr>
				<td colspan=2><textarea cols="65" rows="10" name="content"></textarea></td>
			</tr>
			<tr>
				<td colspan=2><button type="submit">확인</button></td>					
			</tr>
		</table>
	</form>
	<br>
	
	<c:forEach items="${gList}" var="gVo">
		<table border=1>
			<tr>
				<td>${gVo.guestNo}</td>
				<td>${gVo.name}</td>
				<td>${gVo.regDate}</td>
				<td><a href="./deleteform/${gVo.guestNo}" target="balnk">[삭제]</a></td>
			</tr>
			<tr>
				<td colspan=4 class="text-left">${gVo.content}</td>
			</tr>
		</table>
		<br>
		<br>
	</c:forEach>
</body>
</html>