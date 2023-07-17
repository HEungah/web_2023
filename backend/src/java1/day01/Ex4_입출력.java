package java1.day01;

import java.util.Scanner;

public class Ex4_입출력 {
	public static void main(String[] args) {
		
		// 1. 출력
			// 1. System.out.print("출력하고 싶은말" 또는 변수명); : 출력만
		System.out.print("안녕하세요 ");
		System.out.print("안녕하세요2 ");
			// 2. System.out.println("출력하고 싶은말" 또는 변수명); : 출력하고 줄바꿈
		System.out.println("반갑습니다");
		System.out.println("반갑습니다2");
			// 3. System.out.printf("형식/포맷 문자", 값, 변수); : 형식문자열에 맞춰 출력
		int value = 123;
		System.out.printf("%6d원 \n", value);	// 6자리 출력(오른쪽정렬) 자리수가 부족하면 공백처리(3자리 공백)
		System.out.printf("%-6d원 \n", value);	// 6자리 출력(왼쪽정렬) 자리수가 부족하면 공백처리(3자리 공백)
		System.out.printf("%06d원 \n", value);	// 6자리 출력 자리수가 부족하면 0으로 처리(3자리 0)
		System.out.printf("다시만나요 %d %s \n", value, "하하하");
		
		// 2. 입력
		
			try (// 1. 입력 객체를 생성한다.
					// new : 객체 메모리 할당
					// Scanner() : 클래스 생성자(객체 생성시 초기값 대입하는 메소드) = 클래스명과 동일
		Scanner scanner = new Scanner(System.in)) {
			// 2. 입력 객체를 이용한 입력값 호출/가져오기
				// 1) 입력받은 문자열 가져오기
				// 2) 입력받은 값을 변수에 저장
		String str1 = scanner.next();		// vs scanner.nextLine(); -> 띄어쓰기도 입력가능
				// 3) 저장한 변수 출력해 입력받은 값을 확인
		System.out.println("입력받은 값 => " + str1);
		boolean state = scanner.nextBoolean();	System.out.println("입력받은 값 => " + state);
		double num1 = scanner.nextDouble(); System.out.println("입력받은 값 => " + num1);
		}
	}

}














