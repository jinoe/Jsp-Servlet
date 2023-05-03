<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- <%=request.getAttribute("result") %> 입니다. --%>
	${result} 입니다.<br/>
	${param }<br/>
	${paramValues }<br/>
	${header.host }<br/>
	${cookie }<br/>
	${param.n == 2?"정답":"오답"}<br/>
	${empty param.n?"비어있음":"비어있지 않음"}<br/>
	${3 gt 3 }
	
</body>
</html>