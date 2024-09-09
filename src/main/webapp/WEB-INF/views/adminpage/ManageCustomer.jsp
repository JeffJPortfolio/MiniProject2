<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>ECIGA</title>
		<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/assets/img/icon/favicon_lil.ico" >
		<link href="${pageContext.request.contextPath}/assets/css/reset.css" rel="stylesheet" type="text/css">	
		<link href="${pageContext.request.contextPath}/assets/css/common.css" rel="stylesheet" type="text/css">
		<link href="${pageContext.request.contextPath}/assets/css/admin.css" rel="stylesheet" type="text/css">
</head>
<body>
	<div id="wrap">
		
		<c:import url="/WEB-INF/views/include/header.jsp" />

		<div id="nav">
			<h1>관리자페이지</h1>
			<ul class="clearfix">
				<li><a href="./mannageGoods.html">제품 등록/관리</a></li>
				<li><a href="./mannageUser.html">회원관리</a></li>
				<li><a href="./mannageOrder.html">배송관리</a></li>
				<li><a href="./manageCustomer.html">1:1 고객문의</a></li>
			</ul>
		</div>

		<div id="board">
			<div id="list">
				<form action="" method="">
					<div class="period-filter">
						<button class="period-btn">오늘</button>
						<button class="period-btn">일주일</button>
						<button class="period-btn">1개월</button>
						<button class="period-btn active">3개월</button>
						<button class="period-btn">6개월</button>
						<span class="period-label">기간조회</span> <input type="date" class="date-input" value=""> <input type="date" class="date-input" value="">

						<button class="search-btn">조회하기</button>
						<div class="search-bar">
							<input type="text" id="search-input" placeholder="검색어">
							<button class="search-btn">검색</button>
						</div>
					</div>
				</form>
				<table class="userMng">
					<thead>
						<tr>
							<th>문의번호</th>
							<th>분류</th>
							<th>제목</th>
							<th>작성자</th>
							<th>등록일</th>
							<th>처리상태</th>
							<th>관리</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>1</td>
							<td>구매문의</td>
							<td><a href="./manageCustomerAsk.html">지난번에 구매했던 그거 어디있어요?</a></td>
							<td>조세호</td>
							<td>2024-09-05</td>
							<td>답변대기</td>
							<td>수정</td>
						</tr>
						<tr>
							<td>1</td>
							<td>구매문의</td>
							<td><a href="#">지난번에 구매했던 그거 어디있어요?</a></td>
							<td>조세호</td>
							<td>2024-09-05</td>
							<td>답변대기</td>
							<td>수정</td>
						</tr>
						<tr>
							<td>1</td>
							<td>구매문의</td>
							<td><a href="#">지난번에 구매했던 그거 어디있어요?</a></td>
							<td>조세호</td>
							<td>2024-09-05</td>
							<td>답변대기</td>
							<td>수정</td>
						</tr>
						<tr>
							<td>1</td>
							<td>구매문의</td>
							<td><a href="#">지난번에 구매했던 그거 어디있어요?</a></td>
							<td>조세호</td>
							<td>2024-09-05</td>
							<td>답변대기</td>
							<td>수정</td>
						</tr>
						<tr>
							<td>1</td>
							<td>구매문의</td>
							<td><a href="#">지난번에 구매했던 그거 어디있어요?</a></td>
							<td>조세호</td>
							<td>2024-09-05</td>
							<td>답변대기</td>
							<td>수정</td>
						</tr>
						<tr>
							<td>1</td>
							<td>구매문의</td>
							<td><a href="#">지난번에 구매했던 그거 어디있어요?</a></td>
							<td>조세호</td>
							<td>2024-09-05</td>
							<td>답변대기</td>
							<td>수정</td>
						</tr>
					</tbody>
				</table>

				<div id="paging">
					<ul>
						<li><a href="">◀</a></li>
						<li><a href="">1</a></li>
						<li><a href="">2</a></li>
						<li><a href="">3</a></li>
						<li><a href="">4</a></li>
						<li class="active"><a href="">5</a></li>
						<li><a href="">6</a></li>
						<li><a href="">7</a></li>
						<li><a href="">8</a></li>
						<li><a href="">9</a></li>
						<li><a href="">10</a></li>
						<li><a href="">▶</a></li>
					</ul>


					<div class="clear"></div>
				</div>
				<!-- <a id="btn_write" href="">글쓰기</a> -->
			</div>
			<!-- //list -->
		</div>
		<!-- //board -->
		<!-- footer -->
		<c:import url="/WEB-INF/views/include/footer.jsp"></c:import>
		<!-- //footer -->
	</div>
	<!-- //content-head -->

</body>
</html>
