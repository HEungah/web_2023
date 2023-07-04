<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

	<link href="/frontendProject/css/kiosk.css" rel="stylesheet">
</head>
<body>
	<%@include file="../header.jsp" %>
	
	<div class="kioskwrap">	<!-- 키오스크 전체 구역 -->
		<div class="kioskheader">	<!-- 헤더 : 광고이미지, 카테고리 표시구역-->
			<!-- 광고이미지 -->
			<img class="himg" src="../img/burgerkingh1.png">
			<!-- 카테고리 -->
			<ul class="categorymenu">
				<!-- categoryPrint 함수가 출력할 장소 -->
			</ul>
		</div><!-- 헤더 end -->
		
		<div class="kioskcontent">	<!-- 본문 : 제품출력, 카트 출력 구역 -->
			<div class="productbox">	<!-- 제품구역 -->
			
				<!-- 제품 1개 기준 -->
				<div class="product">
					<img src="../img/헬로디아블로와퍼.png">	<!-- 제품이미지 -->
					<div class="pinfo">
						<div class="pname">헬로 디아블로 와퍼</div>	<!-- 제품이름 -->
						<div class="pprice">15,000원</div>	<!-- 제품가격 -->
					</div>
				</div>	<!-- 제품 한개 끝 -->
				
			</div>	<!-- 제품구역 end -->
			
			<div class="cartbox">	<!-- 카트구역 -->
				<div class="cartcontent">	<!-- 제품개수/가격, 제품정보 출력 -->
					<div class="carttop">	<!-- 제품개수/가격 구역 -->
						<div>카트 <span class="ccount">3</span></div>
						<div>총 주문금액 <span class="ctotal">31,000원</span></div>
					</div>
					<div class="cartbottom">	<!-- 제품정보 출력 구역 -->
						<!-- 카트내 제품 1개 -->
						<div class="citem">
							<div class="iname">더블비프불고기버거</div>	<!-- 제품명 -->
							<div class="iprice">12,000원</div>	<!-- 제품가격 -->
							<span class="icancel">x</span>	<!-- 제품 개별취소 -->
						</div>	<!-- 제품 1개 end -->
					</div>	<!-- 제품정보 출력 구역 end -->
					
				</div>	<!-- 제품개수/가격, 제품정보 출력 end-->
				
				<div class="cartbtn">	<!-- 버튼 구역 -->
					<button class="cancelbtn">취소하기</button>
					<button class="orderbtn">주문하기</button>
				</div>	<!-- 버튼 구역 end -->
			</div>	<!-- 카트구역 end -->
			
			
		</div><!-- 본문 end -->
	</div>		<!-- 키오스크 전체 구역 end -->
	
	
	
	
	
	
	
	<%@include file="../footer.jsp" %>
	
	
	<script src="/frontendProject/js/kiosk.js"></script>

</body>
</html>