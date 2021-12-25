<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
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
			<h1>상품 리스트<button class="btn btn-primary btn-sm float-end mt-3" id="btn-load-products">데이터 불러오기</button></h1>
		</div>
	</div>
	<div class="row mb-3">
		<div class="col">
			<table class="table" id="table-products">
				<thead>
					<tr>
						<th>번호</th>
						<th>상품명</th>
						<th>제조회사</th>
						<th>가격</th>
						<th>할인가격</th>
					</tr>
				</thead>
				<tbody>
					
				</tbody>
			</table>
		</div>
	</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
<script type="text/javascript">
	/*  
		$.get(url, data, function(responseData) { ... }, responseDataType)
			 url: 요청 UR:
			 data: 서버로 보내는 데이터(보낼데이터가 없으면 생략가능)
			 	   {page:1, no:14} -> 요청 URL?page=1&no=14
				   "page=1&no=14"  -> 요청 URL?page=1&no=14
			 function(responseData) { ... }: 서버로부터 성공적인 응답이 왔을 때 jQuery가 실행하는 메소드다.
			 	   responseData에는 서버가 응답으로 보낸 데이터가 전달된다.
			 	   jQuery는 responseData로 데이터를 전달할 때, 자바스크립트객체/배열, XML DOM객체로 변환후 전달한다.
			 responseDataType: 서버로부터 응답으로 받을 것으로 예상되는 컨텐츠 타입을 지정한다.(생략가능하다.)
					"text" - plain text
					"json" - json 형식의 데이터 -> javascript 배열, 객체 변환 후 반환
					"xml"  - xml 형식의 데이터 -> XML Document객체로 변환 후 반환
					"jsonp" - 다른 사이트의 서버로부터 데이터를 요청할 때 사용된다.
	*/
	$("#btn-load-products").click(function(){
		$.get("/script2/product/list.hta", function(data) {
			var $tbody = $("#table-products tbody").empty()
			$.each(data, function(index, product) {
				var row = "<tr>"
				row += "<td>" + product.no + "</td>"
				row += "<td>" + product.name + "</td>"
				row += "<td>" + product.company + "</td>"
				row += "<td>" + product.price.toLocaleString() + " 원</td>"
				row += "<td><strong>" + product.discountPrice.toLocaleString() + " 원</strong></td>"
				row += "</tr>"
			$tbody.append(row)
			})
		}, "json")	
	})
	
	
</script>
</body>
</html>