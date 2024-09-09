<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="http://localhost:8888/eciga/assets/css/common.css" rel="stylesheet" type="text/css">
<link href="/eciga/assets/css/reset.css" rel="stylesheet" type="text/css">
<link href="/eciga/assets/css/admin.css" rel="stylesheet" type="text/css">
<link href="/eciga/assets/css/join.css" rel="stylesheet" type="text/css">

</head>
<body>

    <div id="wrap">
        <div id="header" class="clearfix">
            <h1 class="header-inner">
                <a href=""><img src="http://localhost:8888/eciga/assets/img/icon/logo.png" alt="Logo"></a>
            </h1>
        </div>
        
        <div id="nav">
            <h1>회원가입
            </h1>
        </div>

        <div id="content">
            <div id="joinForm">
                <form id="signup-form" action="/eciga/user/join" method="get">
                    
                    <!-- 이름 -->
                    <div class="form-group">
                        <label class="form-text" for="name">이름</label>
                        <input type="text" id="name" name="name" placeholder="이름" required>
                    </div>
    
                    <!-- 아이디 -->
                    <div class="form-group">
                        <label class="form-text" for="id">아이디</label>
                        <input type="text" id="id" name="id" placeholder="아이디" required>
                        <button type="button" id="btnIdCheck">중복체크</button>
                    </div>
                    <div id="message"></div>
                    
                    <!-- 비밀번호 -->
                    <div class="form-group">
                        <label class="form-text" for="password">비밀번호</label>
                        <input type="password" id="password" name="password" placeholder="비밀번호" required>
                    </div>
    
                    <!-- 비밀번호 확인 -->
                    <div class="form-group">
                        <label class="form-text" for="confirm-password">비밀번호 확인</label>
                        <input type="password" id="confirm-password" name="confirm-password" placeholder="비밀번호 확인" required>
                    </div>
    
                    <!-- 주민번호 -->
                    <div class="form-group">
                        <label class="form-text" for="ssn">주민번호 앞 8자리</label>
                        <input type="text" id="ssn" name="ssn" placeholder="주민번호8자리" required>
                    </div>
    
                    <!-- 전화번호 -->
                    <div class="form-group">
                        <label class="form-text" for="phone">전화번호</label>
                        <input type="text" id="phone" name="phone" placeholder="전화번호" required>
                    </div>
    
                    <!-- 주소 -->
                    <div class="form-group">
                        <label class="form-text" for="address">주소</label>
                        <input type="text" id="address" name="address" placeholder="주소" required>
                    </div>
    
                    <!-- 버튼영역 -->
                    <div class="button-area">
                        <button type="submit" id="signup-btn">회원가입</button>
                    </div>
    
                </form>
            </div>
            
            <div id="confirmation-popup" class="popup">
                <h2>회원 가입 축하 드립니다</h2>
                <div id="summary"></div>
                <button id="confirm-btn">확인</button>
            </div>

            <script>
                document.getElementById('signup-form').addEventListener('submit', function(event) {
                    event.preventDefault(); // Prevent form submission
    
                    // Gather form data
                    var formData = new FormData(event.target);
                    var summary = "<ul>";
                    formData.forEach(function(value, key) {
                        summary += "<li>" + key + ": " + value + "</li>";
                    });
                    summary += "</ul>";
    
                    // Show popup
                    document.getElementById('summary').innerHTML = summary;
                    document.getElementById('confirmation-popup').classList.add('active');
    
                    // Redirect on confirmation
                    document.getElementById('confirm-btn').addEventListener('click', function() {
                        window.location.href = "http://localhost:8888/eciga/user/loginform"; // Replace with your target URL
                    });
                });
            </script>
            
        
        </div>

            <div id="links">
                <a href="http://localhost:8888/eciga/user/loginform">이미 계정이 있으신가요? 로그인</a>
            </div>
        </div>

        <!-- footer -->
        <div id="footer">
            <div id="footer_l">
                <p>서울시 서초구 강남대로 405 통영빌딩 8층</p>
                <p>상호명:(주)ElecCigaMarket 대표자 : 황일영</p>
                <p>사업자 등록번호 : 506 - 79 - 45687</p>
                <p>Copyright ⓒ 2024 하이미디어 All right reserved</p>
            </div>
            <div id="footer_r">
                <p>본 페이지는 만 19세 이상 성인만 이용이 가능해요</p>
                <p>홈페이지를 이용하시려면 회원가입 후 로그인을 진행해 주세요</p>
                <p>1588-7585</p>
            </div>
        </div>
        <!-- //footer -->
    </div>

</body>

</html>