<%--
  Created by IntelliJ IDEA.
  User: songhee
  Date: 2022/05/01
  Time: 2:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>/sample/all page</h1>

<sec:authorize access="isAnonymous()">
    <a href="/customLogin">로그인</a>
</sec:authorize>
<sec:authorize access="isAuthenticated()">
    <a href="/customLogout">로그아웃</a>
</sec:authorize>
</body>
</html>
