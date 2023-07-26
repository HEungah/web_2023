package java1.day10.Ex4;

public class Member {
	
	// 필드
	
	// 생성자
	
	// 메소드	: 메소드의 동작을 정의, 서로다른 객체 간의 데이터이동[MVC2패턴]
		// 선언 : 리턴타입 메소드명 (매개변수1, 매개변수2...){실행코드 return}
		
		// 리턴x 매개변수x
	void signUp() {}
		// 리턴x 매개변수o
	void login(String id, int pw) {}
		// 리턴o 매개변수x
	String findId() {return "찾은아이디 : ";}
		// 리턴o 매개변수o
	String[] findPw(String s1, String s2) {
		String[] array = {s1, s2};
		return array;
	}
		// 매개변수가 가변길이일때 함수
		// ... : 여러 매개변수들을 하나의 힙에 저장해서 힙주소 반환
	void delete(String ...strArray) {}
		// 오버로딩 : 메소드명이 동일하지만 매개변수의 이름[x], 타입[o], 순서[o], 개수[o] 구분 식별
	void delete(int num, String ...strArray) {}

}
