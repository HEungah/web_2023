package java1.day09.Ex2;

public class Ex2_초기화 {
	public static void main(String[] args) {
		
		// 객체 생성
			// 1. 기본 생성자
			// 2. 정의한 생성자
		Korean k1 = new Korean("박자바", "011225-1234567");
		Korean k2 = new Korean();
		
		// 미리 필드에 값을 정해줌
		System.out.println("정의한 생성자 >>> " + k1.nation);
		System.out.println("기본 생성자 >>> " + k2.nation);
		
		// 필드에 값을 정하지 않음
		System.out.println("정의한 생성자 >>> " + k1.name);
		System.out.println("기본 생성자 >>> " + k2.name);
		
		System.out.println("정의한 생성자 >>> " + k1.ssn);
		System.out.println("기본 생성자 >>> " + k2.ssn);
		
		Korean k3 = new Korean("김자바", "930525-0654321");
		
		System.out.println("정의한 생성자 >>> " + k3.nation);
		System.out.println("정의한 생성자 >>> " + k3.name);
		
	}	// main end

}

/*
 	오버로딩 : 동일한 메소드명을 선언
 		*매개변수와 개수/타입 을 이용한 메소드 식별
 		*예시 : 생성자 오버로딩
 	
 	
 	
 */


























