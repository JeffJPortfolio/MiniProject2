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
				<li><a href="./mannageGoods.html">제품 등록/관리</a></li>
				<li><a href="./mannageUser.html">회원관리</a></li>
				<li><a href="./mannageOrder.html">배송관리</a></li>
				<li><a href="./manageCustomer.html">1:1 고객문의</a></li>
			</ul>
		</div>

		<div id="board">
			<div id="list">
				<form action="" method="">
					<div class="form-group_text-right">
						<select class="form-control" name="status">
							<option value="" selected="selected">회원상태</option>
							<option value="active">활성</option>
							<option value="sleep">휴면</option>
							<option value="ask">요청</option>
							<option value="quit">탈퇴</option>
						</select> <input type="text" id="search_text" name="search_text" class="form-control" placeholder="검색어">
						<button type="submit" class="search-btn">검색</button>
					</div>
				</form>
				<table class="userMng">
					<thead>
						<tr>
							<th>회원번호</th>
							<th>이름</th>
							<th>아이디</th>
							<th>휴대폰번호</th>
							<th>생년월일</th>
							<th>주소</th>
							<th>비밀번호</th>
							<th>상태</th>
							<th>권한</th>
							<th>관리</th>
						</tr>
					</thead>
					<tbody>
						<tr>
							<td>123</td>
							<td class="text-left"><a href="#">정우성</a></td>
							<td>jws</td>
							<td>010-2222-3333</td>
							<td>1973-04-22</td>
							<td>서울시 관악구 사당동</td>
							<td>****</td>
							<td>정상</td>
							<td>일반회원</td>
							<td><a href="">[수정]</a></td>
						</tr>
						<tr>
							<td>123</td>
							<td class="text-left"><a href="#">정우성</a></td>
							<td>jws</td>
							<td>010-2222-3333</td>
							<td>1973-04-22</td>
							<td>서울시 관악구 사당동</td>
							<td>****</td>
							<td>정상</td>
							<td>일반회원</td>
							<td><a href="">[수정]</a></td>
						</tr>
						<tr>
							<td>123</td>
							<td class="text-left"><a href="#">정우성</a></td>
							<td>jws</td>
							<td>010-2222-3333</td>
							<td>1973-04-22</td>
							<td>서울시 관악구 사당동</td>
							<td>****</td>
							<td>정상</td>
							<td>일반회원</td>
							<td><a href="">[수정]</a></td>
						</tr>
						<tr>
							<td>123</td>
							<td class="text-left"><a href="#">정우성</a></td>
							<td>jws</td>
							<td>010-2222-3333</td>
							<td>1973-04-22</td>
							<td>서울시 관악구 사당동</td>
							<td>****</td>
							<td>정상</td>
							<td>일반회원</td>
							<td><a href="">[수정]</a></td>
						</tr>
						<tr>
							<td>123</td>
							<td class="text-left"><a href="#">정우성</a></td>
							<td>jws</td>
							<td>010-2222-3333</td>
							<td>1973-04-22</td>
							<td>서울시 관악구 사당동</td>
							<td>****</td>
							<td>정상</td>
							<td>일반회원</td>
							<td><a href="">[수정]</a></td>
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