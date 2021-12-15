<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
   <meta charset="UTF-8">
   <!-- 모바일 장치에서 확대/축소 기능 적용을 위한 설정 -->
   <meta name="viewport" content="width=device-width, initial-scale=1">
   <!-- 
   		부트스트랩 CSS파일 
   		부트스트랩에서 정의한 다양한 화면 구성요소에 대한 스타일이 정의되어 있다.
   -->
   <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
    <title></title>
</head>
<body>
<div class="container">
	<h1>부트스트랩 표</h1>
	
	<h3>부트스트랩 기본 테이블</h3>
	<table class="table">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>가격</th>
				<th>구매수량</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
		</tbody>
	</table>
	
	<h3>부트스트랩 테두리가 있는 테이블</h3>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>가격</th>
				<th>구매수량</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
		</tbody>
	</table>
	
	<h3>부트스트랩 행이 강조되는 테이블</h3>
	<table class="table table-striped">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>가격</th>
				<th>구매수량</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
		</tbody>
	</table>
	
	<h3>부트스트랩 마우스가 위치한 행이 강조되는 테이블</h3>
	<table class="table table-hover">
		<thead>
			<tr>
				<th>번호</th>
				<th>이름</th>
				<th>가격</th>
				<th>구매수량</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
			<tr>
				<td>10</td>
				<td>맥북 프로 16인치</td>
				<td>2,500,000 원</td>
				<td>1개</td>
			</tr>
		</tbody>
	</table>
	
	<h3>부트스트랩 테이블의 컨텐츠가 수직정렬돈 테이블</h3>
	<table class="table">
		<colgroup>
			<col width="10%">
			<col width="30%">
			<col width="10%">
			<col width="50%">
		</colgroup>
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>내용</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td class="align-top">10</td>
				<td class="align-top">테이블 작성 연습</td>
				<td class="align-top">관리자</td>
				<td>
					This here is some placeholder text, intended to take up quite a bit of vertical space, to demonstrate how the vertical alignment works in the preceding cells.
					This here is some placeholder text, intended to take up quite a bit of vertical space, to demonstrate how the vertical alignment works in the preceding cells.
				</td>
			</tr>
			<tr>
				<td class="align-middle">10</td>
				<td class="align-middle">테이블 작성 연습</td>
				<td class="align-middle">관리자</td>
				<td>
					This here is some placeholder text, intended to take up quite a bit of vertical space, to demonstrate how the vertical alignment works in the preceding cells.
					This here is some placeholder text, intended to take up quite a bit of vertical space, to demonstrate how the vertical alignment works in the preceding cells.
				</td>
			</tr>
			<tr>
				<td class="align-bottom">10</td>
				<td class="align-bottom">테이블 작성 연습</td>
				<td class="align-bottom">관리자</td>
				<td>
					This here is some placeholder text, intended to take up quite a bit of vertical space, to demonstrate how the vertical alignment works in the preceding cells.
					This here is some placeholder text, intended to take up quite a bit of vertical space, to demonstrate how the vertical alignment works in the preceding cells.
				</td>
			</tr>
		</tbody>
	</table>
</div>
<!-- 
	부트스트랩 Javascript 파일
	부트스트랩에서 정의한 다양한 화면 구성요소중에서 사용자와 상호작용하는 구성요소들에 대한 기능이 정의되어 있다.
 -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>