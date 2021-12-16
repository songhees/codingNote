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
			<h1>EL로 요청 파라미터값 표현하기</h1>
		</div>
	</div>
	<div class="row mb-3">
		<div class="col-6">
			<ul class="pagination justify-content-center">
				<li class="page-item"><a href="" class="page-link">이전</a></li>
				<li class="page-item ${empty param.pageNo or param.pageNo eq '1' ? 'active' : '' }"><a href="" class="page-link" onclick="moveToPage(event, 1)">1</a></li>
				<li class="page-item ${param.pageNo eq '2' ? 'active' : '' }"><a href="" class="page-link" onclick="moveToPage(event, 2)">2</a></li>
				<li class="page-item ${param.pageNo eq '3' ? 'active' : '' }"><a href="" class="page-link" onclick="moveToPage(event, 3)">3</a></li>
				<li class="page-item ${param.pageNo eq '4' ? 'active' : '' }"><a href="" class="page-link" onclick="moveToPage(event, 4)">4</a></li>
				<li class="page-item ${param.pageNo eq '5' ? 'active' : '' }"><a href="" class="page-link" onclick="moveToPage(event, 5)">5</a></li>
				<li class="page-item"><a href="" class="page-link">다음</a></li>
			</ul>
		</div>
		<div class="col-6">
			<form id="form-search" class="row row-cols-lg-auto g-3" method="get" action="el3.hta">
				<input type="hidden" id="page-field" name="pageNo" value="${not empty param.pageNo ? param.pageNo : 1 }">
				<div class="col-2 offset-3">
					<div class="input-group">
						<select class="form-select" id="search-option" name="opt">
							<option value="" ${empty param.opt ? 'selected' : '' } >선택하세요</option>
							<option value="title" ${param.opt eq 'title' ? 'selected' : '' } >제목</option>
							<option value="writer" ${param.opt eq 'writer' ? 'selected' : '' } >작성자</option>
							<option value="content" ${param.opt eq 'content' ? 'selected' : '' }>내용</option>
						</select>
					</div>
				</div>
				<div class="col-3">
					<div class="input-group">
						<input type="text" class="form-control" id="search-keyword" name="keyword" value="${param.keyword }"	placeholder="검색어를 입력하세요">
					</div>
				</div>
				<div class="col-2">
					<div class="input-group">
						<button class="btn btn-primary" type="button" id="btn-search" onclick="search()" >검색</button>
					</div>
				</div>
			</form>
		</div>
	</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript">
	// 페이지 번호를 클릭하면 폼의 히든 필드에 페이지번호를 값으로 설정하고, 폼을 제출한다.
	function moveToPage(event, pageNo) {
		event.preventDefault(); // a태그를 클릭하면 무조건 href에 지정된 링크 페이지로 이동되는 동작이 발생되지 않게 한다.
		document.getElementById("page-field").value = pageNo;
		document.getElementById("form-search").submit();
	}

	// 검색버튼을 클릭하면 폼의 히든 필드에 페이지번호를 무조건 1로 설정하고, 폼을 제출한다.
	function search() {
		if (document.getElementById("search-option").value == "") {
			alert("검색옵션을 선택하세요");
			return;
		}
		if (document.getElementById("search-keyword").value == "") {
			alert("검색옵션을 선택하세요");
			return;
		}
		document.getElementById("page-field").value = 1;
		document.getElementById("form-search").submit();
	}
</script>
</body>
</html>