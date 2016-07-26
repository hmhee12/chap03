<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%!

	int x = 10;
	int y = 25;
	public int multiply(int a , int b) {
		int c = a * b;
		
		return c;
	
}

%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>선언부를 사용한 두 정수값의 곲</title>
</head>
<body>
x = <%=x %>
y = <%=y %>
<br>
10 * 25 = <%=multiply(x, y) %>
</body>
</html>