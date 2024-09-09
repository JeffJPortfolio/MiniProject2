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
				<div class="qna-container">
					<!-- 왼쪽: 문의 내용 -->
					<div class="qna-left">
						<h3>문의 내용</h3>
						<table class="qna-table">
							<tr>
								<th>제목</th>
								<td>지난번에 구매했던 그거 어디있어요?</td>
							</tr>
							<tr>
								<th>분류</th>
								<td>구매문의</td>
							</tr>
							<tr>
								<th>작성자</th>
								<td>조세호</td>
							</tr>
							<tr>
								<th>등록일</th>
								<td>2024-09-05</td>
							</tr>
							<tr>
								<th>연락처</th>
								<td>010-1234-5678</td>
							</tr>
							<tr>
								<th>내용</th>
								<td class="qna-content">지난번에 구매했던 제품에 대한 문의가 있습니다...</td>
							</tr>
						</table>
					</div>

					<!-- 오른쪽: 답변 작성 -->
					<div class="qna-right">
						<h3>관리자 답변</h3>
						<form>
							<!-- 처리 상태 -->
							<div class="status-container">
								<label for="status" class="status-label">처리 상태</label> <select id="status" name="status">
									<option value="답변대기">답변대기</option>
									<option value="답변완료">답변완료</option>
								</select>
							</div>
							<div class="response-container">
								<!-- 답변 내용 -->
								<div class="response-item">
									<label for="answer" class="response-label">답변 내용</label>
									<textarea id="answer" name="answer" rows="6" placeholder="답변을 입력하세요..."></textarea>
								</div>
							</div>

							<!-- 등록 버튼 -->
							<div class="register-btn-container">
								<button type="submit" class="register-btn">등록</button>
							</div>
						</form>
					</div>

				</div>
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