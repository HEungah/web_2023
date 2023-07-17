package java1.day01;

public class Ex3_타입변환 {	// class s
	public static void main(String[] args) {	// main s
		
		// 자동 타입 변환 : byte->short->int->long->float->double
		byte b1 = 10;
		int i1 = b1;	System.out.println(i1);
		// 강제 타입 변환 : byte<-(byte)short<-(short)int<-(int)long<-(long)float<-(float)dobule
			// *주의 : 데이터 손실이 발생할 수 있다.(double 31.5 -> int 31)
		char c1 = '가';
		i1 = c1;	// char 변수를 int 변수에 대입[자동]
		
		// 자동 타입 변환
		int i2 = 50;	long l1 = i2;
		long l2 = 100;	float f1 = l2;
		float f2 = 10.5f; double d1 = f2;
		
		/*
		 * 연산시 자동 타입 변환 - 피연산자 중 큰 타입을 결과타입으로 반환
		 * 정수
		 * 	1. int 보다 작은 byte, short 연산시 무조건 int 결과
		 * 		byte + byte -> int
		 * 		short + int -> int
		 *  2. int 보다 큰 허용범위 long 연산시
		 *  	int + long -> long
		 *  	byte + long -> long
		 */
		
		/*
		 * 문자열 --> 기본타입 - 외부에서 데이터 문자로 들어오는 경우 다수[JS -> JAVA]
		 * 
		 * 기본타입 --> 문자열
		 * 	1. String.valueOf()
		 * 		10 ----> "10"		String.valueOf(10);
		 * 	2. +""
		 * 		10 ----> "10"		10+""	정수+문자열 => 문자열
		 */
			
		
	}	// main e

}	// class e
















