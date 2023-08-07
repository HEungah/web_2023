package java1.day18.Ex1;

public class Ex1_실행 {
	public static void main(String[] args) {
		
		// 인터페이스 타입의 변수 선언
		// 인터페이스만으로 객체 생성 불가능[ 객체 생성하려면 추상메소드를 구현후 가능 ]
		RemoteControl rc;
		// rc.turnOn() --> 오류 (추상메소드 객체 없이 실행x)
		
		rc = new Television();		// 구현객체 : 해당 추상메소드가 존재한 인터페이스를 구현해준 클래스로 객체 생성
		// 인터페이스로 메소드 실행
		rc.turnOn();
		rc.turnOff();
		
		// rc 변수에 Audio 객체를 대입(교체시킴)
		rc = new Audio();
		rc.turnOn();
		rc.turnOff();
		
		// 리모콘의 상수필드 호출
		System.out.println("리모콘의 최대 볼륨 : " + rc.MAX_VOLUME);
		System.out.println("리모콘의 최소 볼륨 : " + rc.MIN_VOLUME);
		
		// 메소드 실행
		rc.setVolume(100);
		
		// 리모컨 교체
		rc = new Television();
		
		rc.setVolume(-10);
		
		/* 	인터페이스 							vs 	클래스
		  		implements									extends
		  		구현하다										연장하다
		  		여러개 구현									1개 상속
		  		추상메소드									메소드
		  		다양한 메소드제공(버전에 따라서)
		  		목적: 메소드 통합							빠른 개발 / 설계 모듈화[조각단위]
		  		게임패드,키보드,...							사원[직급별],...
		
		 */
		
	}

}
