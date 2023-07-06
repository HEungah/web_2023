<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- 뷰포트 : 반응형 동작 코드 -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<title>Insert title here</title>
	<!-- 부트스트랩에서 만든 CSS 적용 -->
	<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
	
</head>
<body>
	<%@include file="../header.jsp" %>
	<!-- CSS/JS 관련 라이브러리(미리 만들어진 CSS/JS) 제공 -->
	<!-- 
	
		부트스트랩 : 미리 만들어진 CSS/JS 빠르게 적용
			- css링크, js 적용이 필요
			
			1. .container : 반응형 구역
			2. .table :	테이블 기본 CSS
			   .table-striped : 홀/짝 행 구별 색상
			   .table-hover : 행에 마우스를 올렸을때 색상
			   .table0bordered : 테이블 테두리
			3. text-center : 하위 요소 가운데 정렬  
			4. navigation example : 페이징 처리
			5. 그리드 : 해당 구역을 12조각으로 나눔
				.row	:	하위 요소 가로배치
				.col	:	열
				.col-조각수 : 12조각중 몇조각을 쓸껀지 적용
				.g-여백수 :	열마다 자동여백[24px] 		
	 -->
	
	<div class="container">	<!-- 현재 게시물출력 페이지 전체 구역 -->
		<h3> 커뮤니티 </h3>
		<!-- 글쓰기 버튼 -->
		<a href="write.jsp"><button type="button" class="btn btn-outline-secondary"> 글쓰기</button></a>
		
		<table class="table table-striped table-hover table-bordered text-center">	<!-- 테이블 -->
			<thead class="table-light">
			<tr>	<!-- 제목행 -->
				<th width="5%">번호</th><th width="50%">제목</th><th width="10%">작성자</th>
				<th width="15%">작성일</th><th width="10%">조회수</th><th width="10%">추천수</th>
			</tr>
			</thead>
			<tbody class="tcontent">
			
			</tbody>
			<tfoot>
				<tr>
					<td colspan="6">total 3</td>
				</tr>
			</tfoot>
		</table>	<!-- 테이블 end -->
		<!-- 페이징처리 구역 -->
		<nav aria-label="Page navigation example">
	  		<ul class="pagination justify-content-center">
	    		<li class="page-item disabled">
	      			<a class="page-link">Previous</a>
			    </li>
			    <li class="page-item"><a class="page-link" href="#">1</a></li>
			    <li class="page-item"><a class="page-link" href="#">2</a></li>
			    <li class="page-item"><a class="page-link" href="#">3</a></li>
			    <li class="page-item">
			      <a class="page-link" href="#">Next</a>
			    </li>
			 </ul>
		</nav>	<!-- 페이징처리 구역 end -->
		
		<!-- 검색 창 구역 -->
		<div class="row justify-content-md-center gx-3">	<!-- 구역을 12조각으로 나눔 -->
			<div class="col-2">	<!-- 12조각중 2조각을 사용 -->
				<select class="form-select">
					<option>키워드</option><option>번호</option><option>제목</option><option>작성자</option>
				</select>
			</div>	
			<div class="col-5">	
				<input class="form-control" type="text">
			</div>
			<div class="col-1">	
				<button class="form-control">검색</button>
			</div>	
		</div>
		
	</div>
	
	
	
	<%@include file="../footer.jsp" %>
	<!-- 부트스트랩에서 만든 JS 적용 -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4" crossorigin="anonymous"></script>
	<script src="../js/list.js"></script>
</body>
</html>