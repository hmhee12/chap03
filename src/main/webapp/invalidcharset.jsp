<%-- <%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%> --%>
<%@page contentType="text/html; charset=UTF-8" %>
<%@ page import="java.util.Date" %>
<%
	Date now = new Date();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>현재시간</title>
</head>
<body>
현재 시간 : <%= now %>

</body>
</html>