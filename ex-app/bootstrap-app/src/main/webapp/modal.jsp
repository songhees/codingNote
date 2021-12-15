<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
    <title>부트스트랩</title>
</head>
<body>
<div class="container">    
	<h1>모달창</h1>
	<!-- 페이지를 벗어나지 않은 상태에서 입력하거나 정보를 띄울때 사용
		 버튼을 눌러서 열면 바탕화면의 것을 사용할 수 없게된다.
		 
		 모달과 팝업
		 팝업 = 완전히 다른 창에 뜬다. 아예 다른 jsp. 다른 탭 <- 잘 안씀 제어하기 힘듬 <- 요즘 브라우저는 팝업을 차단함
		 모달 = 창에 존재하는 것 (감춰진 것) 같은 페이지에 있으므로 값을 전달하는게 더 편하다. 제어하기 편하다. = layered pop-up
		 ↑ 많이 사용
	 -->
	<div>
		<button class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#myModal">모달창 열기
		</button>
	</div>
	<div class="modal" id="myModal">
  		<div class="modal-dialog modal-lg">
    		<div class="modal-content">
    			<!-- 모달창의 헤더부 시작 -->
      			<div class="modal-header">
        			<h4 class="modal-title">주문 상세정보</h4>
        			<button type="button" class="btn-close" data-bs-dismiss="modal"></button>
      			</div>
    			<!-- 모달창의 헤더부 끝 -->
    			
    			<!-- 모달창의 바디부 시작 -->
      			<div class="modal-body">
        			<div class="card">
        				<div class="card-header">주문 상품 목록</div>
        				<div class="card-body">
        					<table class="table">
        						<thead>
        							<tr>
        								<th>번호</th>
        								<th>상품명</th>
        								<th>가격</th>
        								<th>구매수량</th>
        							</tr>
        						</thead>
        						<tbody>
        							<tr>
        								<td>1000</td>
        								<td>갤럭시Z 플립3 256GB</td>
        								<td>2,000,000 원</td>
        								<td>1 개</td>
        							</tr>
        							<tr>
        								<td>1000</td>
        								<td>갤럭시Z 플립3 256GB</td>
        								<td>2,000,000 원</td>
        								<td>1 개</td>
        							</tr>
        							<tr>
        								<td>1000</td>
        								<td>갤럭시Z 플립3 256GB</td>
        								<td>2,000,000 원</td>
        								<td>1 개</td>
        							</tr>
        						</tbody>
        					</table>
        				</div>
        			</div>
      			</div>
    			<!-- 모달창의 바디부 끝 -->
    			
    			<!-- 모달창의 푸터부 시작 주로 버튼이 위치 -->
      			<div class="modal-footer">
        			<button type="button" class="btn btn-danger" data-bs-dismiss="modal">닫기</button>
      			</div>
    			<!-- 모달창의 푸터부 끝 -->
			</div>
    	</div>
  	</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>