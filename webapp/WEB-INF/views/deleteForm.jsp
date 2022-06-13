<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>DeleteForm</title>
</head>
<body>
	
	<form action="../delete/${guestNo}" method="post">
		비밀번호<input type="password" name="password" value="">
		<button type="submit">확인</button>
		<br>
		<a href="../list">메인으로 돌아가기</a>
	</form>
</body>
</html>