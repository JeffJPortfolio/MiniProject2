<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>



<div id="header" class="clearfix">
	<h1 class="header-inner">
		<a href=""><img src="../../assets/img/icon/logo.png"></a>
	</h1>

	<!-- 로그인했을때 -->
	<c:if test="${sessionScope.authUser != null}">
		<ul>
			<li><span id="welcome">고객 님 안녕하세요^^</span></li>
			<li><a href="" class="btn_s"><img src="../../assets/img/icon/btn_cart.png"></a></li>
			<li><a href="" class="btn_s"><img src="../../assets/img/icon/btn_gnb_customer.png"></a></li>
			<li><a href="" class="btn_s"><img src="../../assets/img/icon/btn_gnb_mypage.png"></a></li>
		</ul>
	</c:if>

	<!-- 로그인 안했을때 -->
	<c:if test="${sessionScope.authUser == null}">
		<!-- <ul>
                <li><a href="" class="btn_s"><img src="../../assets/img/icon/btn_cart_c.png"></a></li>
                <li><a href="" class="btn_s"><img src="../../assets/img/icon/btn_gnb_customer_c.png"></a></li>
                <li><a href="" class="btn_s"><img src="../../assets/img/icon/btn_gnb_mypage_c.png"></a></li>
            </ul> -->
	</c:if>
</div>
<!-- //header -->
