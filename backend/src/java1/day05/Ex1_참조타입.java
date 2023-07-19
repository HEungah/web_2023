package java1.day05;

public class Ex1_참조타입 {
	public static void main(String[] args) {
		int[] arr1;
		int[] arr2;
		int[] arr3;
		
		
		arr1 = new int[] {1, 2, 3};
		arr2 = new int[] {1, 2, 3};
		arr3 = arr2;
		
		System.out.println(arr1 == arr2);
		System.out.println(arr2 == arr3);
		
		// arr1 == arr2		(==, !=)	--->	스택변수에 저장된 기본타입값 또는 참조 주소 비교
		
		int[] intArray = null;
		// int[] intArray 스택영역게 변수가 메모리 할당, 참조중인 객체번지x(힙영역x)
		intArray[0] = 10;	// 배열내 0번째 인덱스에 10대입 --> 오류	(아직 힙영역에 배열이 생성되지 않음)
		
		String str = null;
		System.out.println(str.length());
		
		String hobby = "여행";
			// 1. 스택영역에 hobby 지역변수 선언
			// 2. 힙영역에 "여행" 문자열객체 생성
			// 3. 생성된 힙영역에 "여행" 객체의 주소/번지 를 스택영역에 hobby 지역변수에게 대입
		hobby = null;
			// 4. 스택영역에 hobby 지역변수에 null 대입[ 대입 : 기존 데이터 사라짐 ]
			// 5. 아무도 힙영역에 있는 "여행" 문자열 객체를 참조하지 않으면 GC(쓰레기수집가)가 자동으로 객체 삭제
		String kind1 = "자동차";	// 스택영역 : kind1[32번지]
		String kind2 = kind1;	// 스택영역 : kind2[32번지]
		
		kind1 = null;			// 스택영역 : kind1[null]
								// 스택영역 : kind2[32번지] // 하나라도 참조중이라면 객체는 삭제되지 않음
		
		
	}
}
/*
 	자바 데이터 타입 : 변수 선언할대 사용되는 타입
 		- 기본타입 : boolean byte short char int long float double
 			- 변수의 값 자체 저장
 		- 참조타입 : 배열, 열거, 클래스[String, Scanner, Random, System], 인터페이스
 			- 힙메모리에서 생성된 메모리 주소/번지 참조
 			- 첫글자 대문자 시작
 		
 	JVM 메모리
 		
 		스택영역								힙영역
 		- 스레드마다 별도구역						- 객체가 생성되는 영역
 		- 함수(프레임)마다 별도구역					- 스택/메소드 영역에 참조 할 수 있다.
 			- 지역변수								
 			- 함수 호출시 프레임 생성
 			- 함수(프레임) 종료되면 제거			
 		---------------------------------------------------------------------
 		
 		int age = 10(리터럴)  => 소스 코드의 고정된 값
 		
 		String name = "신용권"  => "신용권" : String 클래스 기반으로 만들어진 객체
 		
 			
 */























