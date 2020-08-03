<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>이메일 리스트에 오신것을 환영합니다~~~!!</h1>
	<hr>
	<h3><a href="${pageContext.request.contextPath }/form">>>메일 등록<<</a></h3>
	
	<c:forEach items="${list }" var="vo">
	<!-- 메일정보 리스트 -->
	<table border="1" cellpadding="5" cellspacing="2">
		
		<tr>
			<td align=right>First name:</td>
			<td>${vo.firstName}</td>
			
		</tr>
		<tr>
			<td align=right width="110">Last name:</td>
			<td width="110">${vo.lastName }</td>
		</tr>
		<tr>
			<td align=right>Email address:</td>
			<td>${vo.email }</td>
		</tr>
		<tr>
			<a href="${pageContext.request.contextPath }/deleteform/${vo.no}">삭제</a>
		</tr>
	</table>
	<br>
	</c:forEach>
	<br>
</body>
</html>