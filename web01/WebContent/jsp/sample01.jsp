<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
String[] list = {"谷", "大久保", "荒井"};
request.setAttribute("LIST", list);

ArrayList<String> list2 = new ArrayList<String>();
list2.add("吉野");
list2.add("渥美");
list2.add("高地");

request.setAttribute("LIST2", list2);

int age = 22;
request.setAttribute("AGE", age);

%>

<c:forEach var="data" items="${LIST}">
	${data}<br>
</c:forEach>

<c:forEach var="data" items="${LIST2}">
	${data}<br>
</c:forEach>

<c:if test="${AGE ge 20}">
成人<br>
</c:if>
<c:if test="${AGE lt 20}">
未成年<br>
</c:if>

<%
//for (データ型 変数 : 配列名) {

//}
%>

</body>
</html>