package java1.day10.Ex1;

import java.util.Scanner;

// 실행 클래스
public class Ex1_메소드선언과호출 {
	public static void main(String[] args) {
		
		// 메소드 호출 하기 위한 객체 생성
		Calculator myCalc = new Calculator();
		
		// 객체 통한 메소드 호출(매개변수x)
		myCalc.powerOn();	// 외부에서의 메소드접근이기때문에 .(도트연산자)를 사용한다.
		
		// 객체 통한 메소드 호출(매개변수o, 리턴o)
		System.out.println("result : " + myCalc.plusInt(5, 6));
		
		// 객체 통한 메소드 호출(매개변수o, 리턴o)
		int x = 10;
		int y = 4;
		
		double result2 = myCalc.divide(x, y);
		System.out.println("result2 : " + result2);
		
		myCalc.powerOff();
		
		
		
	}	// main end

}
