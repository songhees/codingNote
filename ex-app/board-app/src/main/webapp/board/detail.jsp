<%@page import="com.sample.board.vo.BoardLiker"%>
<%@page import="java.util.List"%>
<%@page import="com.sample.board.vo.Pagination"%>
<%@page import="com.sample.board.vo.Board"%>
<%@page import="com.sample.board.dao.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" >
    <title>커뮤니티 게시판::상세</title>
</head>
<body>
<%
	// include 시킨 navbar의 nav-item 중에서 페이지에 해당하는 nav-item를 active 시키기위해서 "menu"라는 이름으로 페이지이름을 속성으로 저장한다.
	// pageContext에 menu라는 이름으로 설정한 속성값은 navbar.jsp의 6번째 라인에서 조회해서 navbar의 메뉴들 중 하나를 active 시키기 위해서 읽어간다.
	pageContext.setAttribute("menu", "board");
%>
<%@ include file="../common/navbar.jsp" %>
<div class="container">    
	<div class="row mb-3">
		<div class="col">
			<h1 class="fs-3">게시글 상세</h1>
		</div>
	</div>
<%
	// 클라이언트는 게시글 상세 페이지를 조회할 때 "detail.jsp?no=글번호&pageNo=페이지번호" 로 요청한다.(list.jsp의 78번 라인 참조)
	// 요청파라미터에서 글번호와 페이지 번호를 조회한다.
	int no = Integer.parseInt(request.getParameter("no"));
	String pageNo = request.getParameter("pageNo");
	String error = request.getParameter("error");
	
	// 게시글 정보를 제공하는 BoardDao객체를 획득한다.
	BoardDao boardDao = BoardDao.getInstance();	
	
	// 게시글 번호에 해당하는 글 정보를 조회한다.
	Board board = boardDao.getBoardDetail(no);
	
	// 게시글의 조회수를 1 증가시킨다.
	board.setViewCount(board.getViewCount() + 1);
	// 조회수가 1증가된 글정보를 테이블에 반영시킨다.
	boardDao.updateBoard(board);
%>
	<div class="row mb-3">
		<div class="col">
<%
	if ("deny-delete".equals(error)) {
%>
			<div class="alert alert-danger">
				<strong>삭제 실패!!</strong> 자신이 작성한 글이 아닌 경우 삭제할 수 없습니다.
			</div>
<%		
	} else if ("deny-update".equals(error)) {
%>
			<div class="alert alert-danger">
				<strong>수정 실패!!</strong> 자신이 작성한 글이 아닌 경우 수정할 수 없습니다.
			</div>
<%		
	} else if ("deny-like".equals(error)) {
%>
			<div class="alert alert-danger">
				<strong>추천 실패!!</strong> 이미 추천한 글이거나 자신의 글은 추천할 수 없습니다.
			</div>
<%	
	}
%>
			<table class="table">
				<tbody>
					<tr class="d-flex">
						<th class="col-2">번호</th>
						<td class="col-4"><%=board.getNo() %></td>
						<th class="col-2">등록일</th>
						<td class="col-4"><%=board.getCreatedDate() %></td>
					</tr>
					<tr class="d-flex">
						<th class="col-2">제목</th>
						<td class="col-4"><%=board.getTitle() %></td>
						<th class="col-2">작성자</th>
						<td class="col-4"><%=board.getWriter().getName() %></td>
					</tr>
					<tr class="d-flex">
						<th class="col-2">조회수</th>
						<td class="col-4"><%=board.getViewCount() %></td>
						<th class="col-2">추천수</th>
						<td class="col-4">
							<%=board.getLikeCount() %>
<%
	// 이 게시글에 대한 추천이 있는 경우에 버튼을 출력한다.
	if (board.getLikeCount() > 0) {
%> 
							<button type="button" class="btn btn-outline-primary btn-sm" data-bs-toggle="modal" data-bs-target="#board-liker-modal">보기</button>
<%
	}
%>
						</td>
					</tr>
					<tr class="d-flex">
						<th class="col-2">내용</th>
						<td class="col-10"><%=board.getContent() %></td>
					</tr>
				</tbody>				
			</table>
		</div>
	</div>
	<div class="row mb-3">
		<div class="col">
			<div class="d-flex justify-content-between">
				<div>
<%
	if (loginUserInfo != null && loginUserInfo.getNo() == board.getWriter().getNo()) {		// 로그인한 사용자의 사용자번호와 게시글작성자의 사용자번호가 일치하는 경우 버튼이 출력된다.
%>
					<a href="delete.jsp?no=<%=board.getNo() %>&pageNo=<%=pageNo %>" class="btn btn-danger">삭제</a>
<%
	}
%>
<%
	if (loginUserInfo != null && loginUserInfo.getNo() != board.getWriter().getNo()) {		// 로그인한 사용자의 사용자번호와 게시글작성자의 사용자번호가 서로 다른 경우 버튼이 출력된다.
		BoardLiker boardLiker = boardDao.getBoardLiker(board.getNo(), loginUserInfo.getNo());	// 게시글번호와 로그인한 사용자번호로 추천정보를 조회한다.
%>					
					<!-- 
						추천정보가 존재하면 추천버튼을 비활성화한다.	
					 -->
					<a href="like.jsp?no=<%=board.getNo() %>&pageNo=<%=pageNo %>" class="btn btn-success <%=boardLiker != null ? "disabled" : ""  %>">추천</a>
<%
	}
%>
				</div>
				<a href="list.jsp?pageNo=<%=pageNo %>" class="btn btn-primary">목록</a>
			</div>
		</div>
	</div>
</div>
<!-- 
	이 글을 추천한 추천인 정보를 표시하는 모달창
 -->
<%
	List<User> boardLikeUserList = boardDao.getLikeUsers(no);
%>
<div class="modal" tabindex="-1" id="board-liker-modal">
	<div class="modal-dialog">
		<div class="modal-content">
			<!-- <div class="modal-header">
				<h5 class="modal-title">추천 리스트</h5>
				<button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
			</div> -->
			<div class="modal-body">
				<div class="card bg-primary">
					<div class="card-header fs-bold text-white">추천인</div>
					<ul class="list-group">
<%
	for (User user : boardLikeUserList) {
%>
						<li class="list-group-item"><%=user.getName() %></li>
<%
	}
%>
					</ul>
				</div>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-secondary" data-bs-dismiss="modal">닫기</button>
			</div>
		</div>
	</div>
</div> 

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>