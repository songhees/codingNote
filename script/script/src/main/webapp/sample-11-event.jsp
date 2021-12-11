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
	<h1 class="mb-3">이벤트 연습</h1>
	
	<div class="row mb-3">
		<div class="col">
			<h3>onclick 이벤트</h3>
			<!-- 
				이 버튼에서 : 이벤트 소스 지정
				onclick 이벤트가 발생하면 : 이벤트 종류 지정
				등록() 함수가 시행되게 한다. : 이벤트 핸들러 함수 지정
			
				<button> = event source
				onclick = event
				등록(); = event handler
			-->
			<button class="btn btn-primary" onclick="등록();">등록버튼</button>
			<button class="btn btn-warning" onclick="수정();">수정버튼</button>
			<button class="btn btn-danger" onclick="삭제();">삭제버튼</button>
		</div>
	</div>
	<div class="row mb-3">
		<div class="col">
			<h3>onmouseenter와 onmouseleave 이벤트</h3>
			<!-- 
				둘이 쌍으로 같이 다님
			 -->
			<div class="border p-5" onmouseenter="들어가기()" onmouseleave="나가기()">박스</div>
		</div>
	</div>
	<div class="row mb-3">
		<div class="col">
			<h3>onkeydown, onkeypressed, onkeyup 이벤트</h3>
			<input type="text" class="form-control" name="username" onkeydown="down()" onkeypress="press()" onkeyup="up()">
		</div>
	</div>
	<div class="row mb-3">
		<div class="col">
			<h3>onchange 이벤트</h3>
			<select class="form-select mb-3" name="career" onchange="옵션바꾸기()">
				<option value="" selected="selected" disabled="disabled">선택하세요</option>
				<option value="1">1년 이상</option>
				<option value="3">3년 이상</option>
				<option value="5">5년 이상</option>
				<option value="7">7년 이상</option>
				<option value="10">10년 이상</option>
				<option value="12">12년 이상</option>
			</select>
			<div class="border p-3 mb-3">
				<div class="form-check-inline">
					<input class="form-check-input" type="checkbox" name="skill" value="java" onchange="선택해제();">
					<label class="form-check-label">자바</label>
				</div>
				<div class="form-check-inline">
					<input class="form-check-input" type="checkbox" name="skill" value="python" onchange="선택해제();">
					<label class="form-check-label">파이썬</label>
				</div>
				<div class="form-check-inline">
					<input class="form-check-input" type="checkbox" name="skill" value="c" onchange="선택해제();">
					<label class="form-check-label">c</label>
				</div>
				<div class="form-check-inline">
					<input class="form-check-input" type="checkbox" name="skill" value="c++" onchange="선택해제();">
					<label class="form-check-label">c++</label>
				</div>
			</div>
			<div class="row mb-3">
				<div class="col">
					<h3>onsubmit 이벤트</h3>
					<form class="borader p-3 bg-light" onsubmit="폼입력값체크하기()" method="post" action="loging.jsp">
						<div class="mb-3">
							<label class="form-label">아이디</label>
							<input type="text" class="form-control" name="id">
						</div>
						<div class="mb-3">
							<label class="form-label">비밀번호</label>
							<input type="password" class="form-control" name="password">
						</div>
						<div class="text-end">
							<button type="submit" class="btn btn-primary">로그인</button>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript">
	function 등록() {
		alert("등록버튼이 클릭되었습니다.");		
	}
	function 수정() {
		alert("수정버튼이 클릭되었습니다.");		
	}
	function 삭제() {
		alert("삭제버튼이 클릭되었습니다.");		
	}
	
	function 들어가기() {
		console.log("박스안으로 마우스가 들어왔다.")	
	}
	function 나가기() {
		console.log("박스밖으로 마우스가 나갔다.")	
	}
	
	function down() {
		console.log("keydown")	
	}
	function press() {
		console.log("keypress")	
	}
	function up() {
		console.log("keyup")	
	}
	
	function 옵션바꾸기() {
		console.log("선택옵션이 변경되었습니다.")
	}
	
	function 선택해제() {
		console.log("체크박스가 선택 혹은 해제되었습니다.")
	}
	
	function 폼입력값체크하기() {
		alert("폼 입력값을 체크합니다.")
	}
	
</script>
</body>
</html>