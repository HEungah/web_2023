<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h4>헤더입니다.</h4>
	<ul>	<!-- 메뉴 -->
		<li><a href="/frontendProject/index.jsp">home</a></li>	<!-- a태그를 이용한 링크(다른페이지로 이동) -->
		<li><a href="/frontendProject/kiosk/kiosk.jsp">키오스크</a></li>	<!-- a태그를 이용한 링크(다른페이지로 이동) -->
		<li><a href="/frontendProject/board/list.jsp">게시판</a></li>	<!-- a태그를 이용한 링크(다른페이지로 이동) -->
		<li><a href="/frontendProject/calendar/calendar.jsp">캘린더</a></li>	<!-- a태그를 이용한 링크(다른페이지로 이동) -->
	</ul>
	
	<!-- 
		HTTP 상태 404 - 찾을 수 없음
			- 페이지 못찾았다[1. 경로문제 2. 오타 3. 존재하지 않는 파일]
		절대경로
			서버 기준[http://localhost:8080/frontendProject/index.jsp]
			localhost -> 아이피로 변환
			- ip주소 : 컴퓨터 네트워크 식별번호
			- port번호 : 	컴퓨터내 프로그램 식별번호[8080:HTTP]
		상대경로(헤더는 모든페이지[경로 일정하지 않음] 동일하게 작동)
			./ : 현재폴더(생략가능)
			../ : 상위폴더 이동
				
			
	 -->

</body>
</html>