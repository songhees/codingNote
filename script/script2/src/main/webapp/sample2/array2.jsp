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

</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
<script type="text/javascript">
	// 배열의 모든 값 출력하기
	var array1 = [100, 200, 300, 400, 500]
	
	for (var a=0; a<array1.length; a++) {
		console.log(array1[a]);
	}
	
	for (var b in array1) {
		console.log(array1[b]);
	}
	
	/* 
		배열.forEach(함수) : 지정된 함수를 배열의 갯수만큼 실행한다.
						   함수는 function(item, index) {...}
						   인덱스는 생량가능
						   
						   
		function forEach(fn) {
			for (var i=0; i<배열.length; i++) {
				fn(배열[i], i)	// 배열의 모든 값이 각각 함수로 실행된다.
			}					   
		}
						   
		function x(a, b) {
			console.log(a, b)
		}
		forEach(x);
	*/
	array1.forEach(function(item, index) {
		console.log(item, index);
	})
	
	array1.forEach((item, index) => console.log(item))
</script>
</body>
</html>