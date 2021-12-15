<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
	<div class="row">
		<div class="col">
			<h1>
				부트스트랩의 기본 폼
			</h1>
		</div>
	</div>
	<div class="row">
		<div class="col">
			<form class="border p-3 bg-light" method="post" action="register.jsp">
				<div class="mb-3">
					<label class="form-label" for="user-name">이름</label>
					<input type="text" name="username" class="form-control" id="user-name">
				</div>
				<div class="mb-3">
					<label class="form-label" for="user-email">이메일</label>
					<input type="email" name="email" class="form-control" id="user-email">
				</div>
				<div class="mb-3">
					<label class="form-label" for="user-password">비밀번호</label>
					<input type="text" name="password" class="form-control" id="user-password">
				</div>
				<div class="mb-3">
					<label class="form-label" for="user-career">경력사항</label>
					<select class="form-select" name="caeer" id="user-career">
						<option value="" selected disabled> 경력사항을 선택하세요</option>
						<option value="0"> 신입</option>
						<option value="1"> 1년 이상</option>
						<option value="3"> 3년 이상</option>
						<option value="4"> 4년 이상</option>
						<option value="7"> 7년 이상</option>
						<option value="10"> 10년 이상</option>
					</select>
				</div>
				<div class="mb-3">
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="jobType" id="job-type-1" value="R">
						<label class="form-check-label" for="job-type-1">정규직</label>
					</div>
					<div class="form-check form-check-inline">
						<input class="form-check-input" type="radio" name="jobType" id="job-type-2" value="T">
						<label class="form-check-label" for="job-type-2">비정규직</label>
					</div>
				</div>
				<div class="mb-3">
					<label class="form-label">보유 기술</label>
					<div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="checkbox" name="skill" id="skill-1" value="java">
							<label class="form-check-label" for="skill-1">java</label>
						</div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="checkbox" name="skill" id="skill-2" value="c">
							<label class="form-check-label" for="skill-2">c</label>
						</div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="checkbox" name="skill" id="skill-3" value="python">
							<label class="form-check-label" for="skill-3">python</label>
						</div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="checkbox" name="skill" id="skill-4" value="javascript">
							<label class="form-check-label" for="skill-4">javascript</label>
						</div>
						<div class="form-check form-check-inline">
							<input class="form-check-input" type="checkbox" name="skill" id="skill-5" value="sql">
							<label class="form-check-label" for="skill-5">sql</label>
						</div>
					</div>
				</div>
				<div class="mb-3">
					<label class="form-label" for="career-file">경력증명서</label>
					<input type="file" class="form-control" name="file" id="career-file">
					<div class="form-text">경력증명서는 압축파일로 만들어서 업로드해 주시길 바랍니다.</div>
				</div>
				<div class="mb-3">
					<label class="form-label" for="user-profile">자기소개</label>
					<textarea rows="5" class="form-control" name="profile" id="user-profile"></textarea>
				</div>
				<div class="mb-3 text-end">
					<button type="submit" class="btn btn-dark">등록</button>
				</div>
			</form>
		</div>
	</div>
</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>