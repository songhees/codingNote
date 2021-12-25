<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
   <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
    <title></title>
</head>
<body>
<div class="container">    
	<div class="row mb-3">
		<div class="col">
			<h1>이벤트 핸들러 함수의 반환값</h1>
		</div>
	</div>
	<div class="row mb-3">
		<div class="col">
			<form id="form-login" action="login.jsp" method="post">
				<div class="mb-3">
					<label class="form-label">아이디</label>
					<input type="text" class="form-control" name="id">
				</div>
				<div class="mb-3">
					<label class="form-label">비밀번호</label>
					<input type="password" class="form-control" name="password">
				</div>
				<div class="mb-3 text-end">
					<button type="submit" class="btn btn-primary">로그인</button>
				</div>
			</form>
		</div>
	</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	/*  로그인 버튼을 눌러 form이 submit되기 전에 실행되는 메소드
		반환값이 true면 제출되고 false면 제출되지 않는다.
		<form>태그에서 onsubmit이벤트가 발생하면 폼입력값이 서버로 제출된다.
		jQuery에서는 <form>태그에서 onsubmit 이벤트 발생시 실행되는 이벤트핸들러 함수가 
		false를 반환하면 폼입력값이 서버로 제출되지 않는다.
		+ 이벤트핸들러 함수가 false값을 반환하면 <form>태그에서 onsubmit이벤트가 발생했을 때 서버로 폼입력값을 제출하는 기본동작이 실행되지 않는다.
		+ 즉, 이벤트핸들러함수가 false값을 반환하면 해당 엘리먼트에서 특정이벤트 발생시 자동으로 실행되는 기본동작의 실행을 중지시킬 수 있다.
		+ 대상엘리먼트는 <a>, <form>
			+ <a>태그에서는 onclick이벤트가 발생하면 지정된 링크로 이동하는 기본동작이 실행되는데, 이 기본동작을 제어할 수 있다.
			+ <form>태그에서는 onclick이벤트가 발생하면 서버로 폼입력값을 제출하는 기본동작이 실행되는데, 이 기본동작을 제어할 수 있다.
	*/
	$("#form-login").submit(function(){
		var userId = $("input[name=id]").val()
		if (userId === "") {
			alert("아이디는 필수입력값입니다.")
			return false;
		}
		var userPwd = $("input[name=password]").val()
		if (userPwd === "") {
			alert("비밀번호는 필수입력값입니다.")
			return false;
		}
		return true;
	})
</script>
</body>
</html>