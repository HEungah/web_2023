package java2.day22.Ex1;

import java.awt.Toolkit;	// awt 자바의 UI를 제공해주는 패키지

public class Ex1_멀티스레드 {
	public static void main(String[] args) {	// 메인스레드가 main메소드를 호출
		
		// p596 예1
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		// 5번의 비프음 발생 --> 비프음 1번밖에 안들림( 비프음보다 for문이 더 빠르기 때문 )
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
		}
		
		// ------------------------------ 싱글 스레드 ----------------------------------
		// 5번의 비프음 발생시키면서 0.5초씩 딜레임
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			// 0.5초간 딜레이[메인스레드 잠깐 멈춤] - 밀리초(1/1000)초
			try {Thread.sleep(500);	/* 예외처리 발생*/} catch (Exception e) {}
		}
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);	/* 예외처리 발생*/} catch (Exception e) {}
		}
		
		// ------------------------------ 멀티 스레드 ----------------------------------
		// 1. main스레드 외 작업스레드 객체 만들기(main스레드가 작업스레드 생성)
		System.out.println("멀티스레드 시작");
		Thread thread = new Thread(new Runnable() {
			@Override
			public void run() {	// Ruunnable인터페이스 추상메소드 구현
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i = 0; i < 5; i++) {
					toolkit.beep();
					try {Thread.sleep(500);	/* 예외처리 발생*/} catch (Exception e) {}
				}
			}
		});
		
		// 2. 작업스레드 시작
		thread.start();	// main스레드가 작업스레드 시작
		
		// 3. 메인스레드가 실행하는 코드
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);	/* 예외처리 발생*/} catch (Exception e) {}
		}
		
		// ------------------------------ 멀티 스레드(구현체)----------------------------------
		System.out.println("멀티스레드시작[구현체]");
		비프음 비프음 = new 비프음();		// 재사용 가능
		Thread thread2 = new Thread(비프음);
		thread2.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);	/* 예외처리 발생*/} catch (Exception e) {}
		}
		
		// ------------------------------ 멀티 스레드(구현체)----------------------------------
		System.out.println("멀티스레드시작[Thread 자식 클래스]");
		
		비프음2 비프음2 = new 비프음2();
		비프음2.start();
		
		for(int i = 0; i < 5; i++) {
			System.out.println("띵");
			try {Thread.sleep(500);	/* 예외처리 발생*/} catch (Exception e) {}
		}
		
		
	}	// main end
	
}

/*
  	프로그램 : 명령어의 집합
  		- 프로세스 : 실행중인 프로그램
  		- 멀티태스킹 : 두 가지 이상의 작업을 동시 처리
  		- 멀티프로세스 : 운영체제는 동시에 여러개 프로세스 생성해서 처리
  		
  		*멀티프로세스가 프로그램 단위의 멀티 태스킹이
  		*멀티스레드는 프로그램 내부에서의 멀티 태스킹
  		
  		- 멀티프로세스들은 서로 독립적이다.
  			- 한글프로그램(프로세스), 엑셀프로그램(프로세스) 사용시 --> 동시 사용시 한글에서 오류가 발생하더라도 엑셀은 정상 실행
  		- 멀티스레드에서는 하나의 스레드에서 오류가 발생하면 프로세스가 종료되므로 영향이 미친다.
  			- 카카오톡(프로세스[채팅기능(스레드), 첨부파일전송기능(스레드)]) --> 파일전송스레드에서 오류가 발생하면 카카오톡 프로세스 자체가 종료되므로 채팅도 같이 종료가 된다.
  		
  	멀티스레드 : 병렬로 데이터를 처리하는 곳
  		1. 사용처 : 앱, 웹 등등 대다수
  		2. 메인스레드 : 모든 자바 프로그램은 메인스레드가 main메소드를 실행하면서 시작된다.
  		3. 
  			싱글스레드 : main메소드만 사용하는 경우
  			멀티스레드 : main메소드에 새로운 작업스레드를 생성하는 경우
  		4. 작업스레드 생성
  			1) Thread 클래스 생성
  				- Thread 변수명 = new Thread(Runnable구현객체);
  		5. Runnnable : 스레드가 작업을 실행할때 사용하는 인터페이스
  				- run() 추상메소드 : 클래스가 구현해서 사용
  		6. 익명객체
  				- 익명객체
					클래스명 클래스변수 = new 클래스명(){ 오버라이딩메소드 }
						비프음2 비프음3 = new 비프음2(){public void run() { } };
  				- 익명구현체
  					클래스명 클래스변수 = new 클래스명( new 인터페이스명(){ 오버라이딩 메소드 })
  				
  		
 */
















