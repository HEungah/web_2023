package java1.day11.Ex4디자인패턴1;

public class 고객 {

}

/*
- 역할에 따른 분업 하기 위한 구분
	
 	MVC	
 		M : model	[JAVA, DB 등]
 			C : controller	[JAVA]
 		V : view	[HTML,JS,CSS]
 		
 	고객[VIEW]	-----------> 서빙/요리사[Controller]	----DTO------> 냉장고[Dao]
 	- 요구/응답 받는 입장			 - 요구에 따른 응답해주는 입장				   - 원본의 데이터가 저장되는 곳 또는 접근하는 곳
 	- 입/출력 되는 구역			 - 가공, 유효성검사, 전달, 로직 구역			   - CRUD
 	- HTML/JS				 - JAVA								   - 실질적인 데이터관리 [ JAVA, DB]
 	
 	[Model]
 	*DTO : Data Transfer Object : 데이터 이동 객체
 	*DAO : Data Access Object : 데이터에 접근하는 객체
 */













