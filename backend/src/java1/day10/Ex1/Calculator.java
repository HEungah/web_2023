package java1.day10.Ex1;

// 설계도 클래스
public class Calculator {
	// 필드
	
	// 생성자
	
	// 메소드 : 객체의 동작을 정의[ * 객체간의 상호작용 ]
		// 리턴타입 : 메소드 실행후 호출했던 곳으로 전달하는 값의 타입
		// 메소드명 : 소문자시작, 카멜표기법
		// 매개변수 : 메소드 호출 할때 전달한 매개값
		// { }	: 메소드 호출시 실행되는 구역
		// 1. 리턴이 없는 메소드
	void powerOn() {	// 리턴x, 매개변수x
		System.out.println("전원을 켭니다.");
	}
		// 2. 리턴값 없는 메소드
	void powerOff() {	// 리턴x, 매개변수x
		System.out.println("전원을 끕니다.");
	}
	int plusInt(int x, int y) {	// 리턴o, 매개변수o
		powerOn();
		// void를 제외한 리턴타입이 있을경우 return 키워드 필수
		int result = x + y;	// 매개변수로 부터 전달받은 2개의 변수를 더하기
		return result;	// 호출 했던 곳으로 더하기 한 결과를 전달
	}
	double divide(int x, int y) {	// 리턴o, 매개변수o
		double result = (double)x / (double)y;
		return result;
	}

}
