<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
	<title></title>
  	<meta charset="utf-8">
  	<meta name="viewport" content="width=device-width, initial-scale=1">
  	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet">
  	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
  	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
</head>
<body>
<c:set var="menu" value="홈"/>
<%@ include file="common/nav.jsp" %>
<div class="container">
	<div class="p-5 mb-4 bg-light rounded-3">
		<div class="container-fluid py-5">
        	<h1 class="display-5 fw-bold">스프링 샘플 애플리케이션</h1>
        	<p class="col fs-4">부서, 직종, 직원관리 기능을 제공합니다.</p>
      	</div>
    </div>
</div>
</body>
</html>