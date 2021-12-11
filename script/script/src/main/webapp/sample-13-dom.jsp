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
			<h1>텍스트 컨텐츠, HTML 컨텐츠 조회 및 변경</h1>
		</div>
	</div>
	<div class="row mb-3">
		<div class="col">
			<h3>텍스트 컨텐츠 조회 및 변경</h3>
			<p class="border p-3 mb-3" id="text-content-1">첫번째 텍스트 내용입니다.</p>
			<p class="border p-3 mb-3" id="text-content-2">두번째 텍스트 내용입니다.</p>
			<div>
				<!-- button 클릭 시 조작의 대상 element에 id를 부여하기 ↑ 
					 사용자의 행위에 대한 대응의 첫번째
					 조작할 대상인 element를 쉽게 찾을 수 있도록 id 부여하기
				-->
				<button class="btn btn-primary" onclick="getTextContent()">조회</button>
				<button class="btn btn-warning" onclick="changeTextContent()">변경</button>
			</div>
		</div>
	</div>
	<div class="row mb-3">
		<div class="col">
			<h3>HTML 컨텐츠 조회 및 변경</h3>
			<div class="border p-3 mb-3">
				<h4>첫번째 div 엘리먼트</h4>
				<div id="box-1">
					<ul>
						<li>커피</li>
						<li>사이다</li>
						<li>콜라</li>
					</ul>
				</div>
			</div>
			<div class="border p-3 mb-3">
				<h4>두번째 div 엘리먼트</h4>
				<div id="box-2">
				</div>
			</div>
			<div>
				<button class="btn btn-primary" onclick="getHtmlContent()">조회</button>
				<button class="btn btn-warning" onclick="changeHtmlContent()">변경</button>
			</div>
		</div>
	</div>
	
	<div class="row mb-3">
		<div class="col">
			<h3>엘리먼트 복사하기</h3>
			<div class="row">
				<div class="col-5">
					<div class="card">
						<div class="card-header">직원리스트</div>
						<ul class="list-group">
<%-- 	
	<%
		for (Employee emp : employeeList) {
			
		}
	%> 
--%>
							<!-- 사용자와 상호작용하는 부분에 이벤트 이벤트 핸들러함수를 만든다. -->
							<li class="list-group-item" onclick="addList(this, '홍길동')">홍길동</li>
							<li class="list-group-item" onclick="addList(this,'김유신')">김유신</li>
							<li class="list-group-item" onclick="addList(this,'강감찬')">강감찬</li>
							<li class="list-group-item" onclick="addList(this,'이순신')">이순신</li>
							<li class="list-group-item" onclick="addList(this,'류관순')">류관순</li>
						</ul>
					</div>
				</div>
				<div class="col-5 offset-2">
					<div class="card">
						<div class="card-header">참자가 리스트</div>
						<!-- 결과가 나타나는 곳 -->
						<ul class="list-group" id="emp-list">
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript">
	function getTextContent() {
		// HTML Document객체에서 id가 "text-content-1"인 엘리먼트(태그를 표현하는 객체)객체를 찾아서 변수 el에 대입한다.
		var el = document.getElementById("text-content-1")
		console.log("조회된 엘리먼트 ->",el)
		
		// el변수에 저장된 엘리먼트 객체의 textContent property가 가지고 있는 텍스트 컨텐츠를 변수content에 대입한다.
		var content = el.textContent
		console.log("조회된 엘리먼트의 텍스트 컨텐츠 ->", content);
	}
	function changeTextContent() {
		var el = document.getElementById("text-content-2")
		el.textContent = "배고픔";
		el.style.color = "red";
	}
	
	function getHtmlContent() {
		var el = document.getElementById("box-1");
		var html = el.innerHTML;
		console.log(html);
	}
	function changeHtmlContent() {
		var srcEl = document.getElementById("box-1");
		var destEl = document.querySelector("#box-2");
		var html = srcEl.innerHTML;
		destEl.innerHTML = html;
	}
	
	function addList(src, name) {
		// 한번 클릭한 element가 다시 onclick 이벤트 발생시 아무일도 일어나지 않게 한다.
		// onclick을 없애버린다.		
		src.onclick = null;
		/* html 컨텐츠를 생성 */
		var item = '<li class="list-group-item">'+name+'</li>';
		/* 생성된 html 컨텐츠를 반영할 엘리먼트를 조회 */
		var el = document.getElementById("emp-list");
		/* 엘리먼트의 html컨텐츠에 생성된 html컨텐츠를 추가한다. */
		el.innerHTML += item;
	}
</script>
</body>
</html>