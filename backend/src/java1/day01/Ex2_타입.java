package java1.day01;

public class Ex2_타입 {
	public static void main(String[] args) {
		
		// 1. 진수를 표현하는 방법
			// 진수 : 데이터 표현하는 수의 형식 // 기계어[2진수/이진코드] 표현하는데 한계 극복
			// 0,1 : 2진수, 0~7: 8진수, 0~9: 10진수, 0~9ABCDEF: 16진수
		
		int var1 = 0b1011; // 데이터 앞에 0b를 사용하면 2진수 표현
		int var2 = 0206;	// 8진수 표현
		int var3 = 365;		// 10진수
		int var4 = 0xB3;	// 16진수
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);		
		System.out.println("var3: " + var3);		
		System.out.println("var4: " + var4);
		
		
		// byte 타입
		byte b1 = -128;	System.out.println("b1 : " + b1);
		byte b2 = 127;	System.out.println("b2 : " + b2);
//		byte b3 = 200;	System.out.println("b3 : " + b3);	// 오류 : 허용범위를 벗어남
		
		// short 타입
		short s1 = 3200; System.out.println("s1 : " + s1);
//		short s2 = -50000; System.out.println("s2 : " + s2);	// 오류 : 허용범위를 벗어남
		
		// int 타입 (정수의 기본 자료형) -> 코드로 적은 숫자들
		int i1 = 2000000000; System.out.println("i1 : " + i1);
//		int i2 = 3000000000; System.out.println("i2 : " + i2);	// 오류 : 허용범위를 벗어남
		
		// long 타입
		long l1 = 10; System.out.println("l1 : " + l1);
//		long l2 = 3000000000; System.out.println("l2 : " + l2);	// 대입할 데이터 30억은 int형이기때문에 오류발생
		long l2 = 3000000000L; System.out.println("l2 : " + l2);	// 데이터 뒤에 L을 써서 long타입으로 형변환을 시켜줘야 한다
		
		// char 타입
		char c1 = 'A'; System.out.println("c1 : " + c1);
		char c2 = 65; System.out.println("c2 : " + c2);
		char c3 = '가'; System.out.println("c3 : " + c3);
		char c4 = 44032; System.out.println("c4 : " + c4);
		int c5 = '나'; System.out.println("c5 : " + c5);
		
		// String 클래스
		String str1 = "안녕하세요"; System.out.println(str1);
		
		// float 타입 [소수 8자리 표현] - 4바이트
		float f1 = 0.12345656879f; System.out.println("f1 : " + f1);	// 기본 타입이 double이기때문에 데이터 뒤에 f를 써야한다
		// double 타입 [소수 17자리 표현] - 8바이트
		double d1 = 0.1234567894512365; System.out.println("d1: " + d1);
		
		// 제어/이스케이프(기능) 문자
		System.out.println("\" \"");
		System.out.println("\\ \\");
		System.out.println("\to \to");		// 들여쓰기
		System.out.println("o \no");		// 줄바꿈
		System.out.println("\r캐리지 리턴");	// 커서를 맨 앞으로
		
	}

}

/*
	타입/자료형: 데이터 저장할때 사용되는 메모리 크기
		자바는 다양한 타입을 저장할 수 없다.
		1. 메모리 효율성을 높일 수 있다.
		2. 가독성이 높음
		
					메모리크기			허용범위
		논리타입
		문자타입
		문자열타입
		정수형타입
		실수형타입
			
	용량단위	:
		(처리단위)0,1 -> 1bit -> 01010101 -> 8자리 -> 8bit -> 1byte
		(저장단위)1024byte -> 1mb		1024mb -> 1gb
	
	
	인코딩	:	2진수를 문자로 표기하는 방법
		아스키코드	: 7비트(확장8비트) -> 128문자 표현	(1바이트)	=> 특수문자/숫자/영문
		유니코드 	: 전세계 공용어 문자 표현	(2바이트) => 특수문자/숫자/영문/한글
*/
















