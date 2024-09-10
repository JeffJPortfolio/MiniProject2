<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>ECIGA</title>
<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/assets/img/icon/favicon_lil.ico">
<link href="${pageContext.request.contextPath}/assets/css/common.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/assets/css/reset.css" rel="stylesheet" type="text/css">
<link href="${pageContext.request.contextPath}/assets/css/admin.css" rel="stylesheet" type="text/css">

</head>
<body>

	<div id="wrap">

		<c:import url="/WEB-INF/views/include/header.jsp" />

		<div id="nav">
			<h1>관리자페이지</h1>
			<ul class="clearfix">
				<li><a href="${pageContext.request.contextPath}/admin/goods">제품 등록/관리</a></li>
				<li><a href="${pageContext.request.contextPath}/admin/user">회원관리</a></li>
				<li><a href="${pageContext.request.contextPath}/admin/order">배송관리</a></li>
				<li><a href="${pageContext.request.contextPath}/admin/customer">1:1 고객문의</a></li>
			</ul>
		</div>

		<div id="board">
			<div id="list">
				<form action="${pageContext.request.contextPath}/admin/order" method="get">
					<div class="form-group_text-right">
						<select class="form-control" name="status">
							<option value="" selected="selected">배송상태</option>
							<option value="0" ${param.status == '0' ? 'selected="selected"' : ''}>준비중</option>
							<option value="1" ${param.status == '1' ? 'selected="selected"' : ''}>배송중</option>
							<option value="2" ${param.status == '2' ? 'selected="selected"' : ''}>배송완료</option>
							<option value="3" ${param.status == '3' ? 'selected="selected"' : ''}>확인요망</option>
						</select> <input type="text" id="search_text" name="keyword" class="form-control" placeholder="검색어" value="${param.keyword}">
						<button type="submit" class="search-btn">검색</button>
					</div>
				</form>
				<table class="userMng">
					<thead>
						<tr>
							<th>주문번호</th>
							<th>장바구니번호</th>
							<th>결제여부</th>
							<th>결제수단</th>
							<th>구매확정날짜</th>
							<th>주문회원</th>
							<th>배송상태</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${pMap.deliveryList}" var="delivery">
							<tr>
								<td>${delivery.orderNo}</td>
								<td>${delivery.cartNo}</td>
								<td><c:choose>
										<c:when test="${delivery.paymentStatus == 0}">결제 완료</c:when>
										<c:when test="${delivery.paymentStatus == 1}">미결제</c:when>
										<c:otherwise>취소</c:otherwise>
									</c:choose></td>
								<td><c:choose>
										<c:when test="${delivery.paymentMethod == 0}">카드</c:when>
										<c:when test="${delivery.paymentMethod == 1}">계좌이체</c:when>
										<c:when test="${delivery.paymentMethod == 2}">무통장입금</c:when>
										<c:otherwise>간편결제</c:otherwise>
									</c:choose></td>
								<td>${delivery.purchaseConfirmDate}</td>
								<td>${delivery.userName}</td>
								<td><c:choose>
										<c:when test="${delivery.deliveryStatus == 0}">준비중</c:when>
										<c:when test="${delivery.deliveryStatus == 1}">배송중</c:when>
										<c:when test="${delivery.deliveryStatus == 2}">배송완료</c:when>
										<c:otherwise>확인요망</c:otherwise>
									</c:choose></td>
							</tr>
						</c:forEach>


					</tbody>
				</table>

				<div id="paging">
					<ul>
						<c:if test="${pMap.prev}">
							<li><a href="${pageContext.request.contextPath}/admin/order?crtpage=${pMap.startPageBtnNo-1}&keyword=${param.keyword}&status=${param.status}">◀</a></li>
						</c:if>

						<c:forEach begin="${pMap.startPageBtnNo}" end="${pMap.endPageBtnNo}" var="page">
							<li class="${pMap.crtPage == page ? 'active' : ''}"><a
								href="${pageContext.request.contextPath}/admin/order?crtpage=${page}&keyword=${param.keyword}&status=${param.status}">${page}</a></li>
						</c:forEach>

						<c:if test="${pMap.next}">
							<li><a href="${pageContext.request.contextPath}/admin/order?crtpage=${pMap.endPageBtnNo+1}&keyword=${param.keyword}&status=${param.status}">▶</a></li>
						</c:if>
					</ul>
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
