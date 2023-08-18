package java2.day22.Ex2;

public class Ex2_멀티스레드예 {
	public static void main(String[] args) {
		// -- 스레드 현황 : [main] - 싱글스레드 ---> 작업스레드1 생성후 멀티스레드
		// 0. main스레드에서 작업스레드 객체생성
		작업스레드1 작업스레드1 = new 작업스레드1();
		Thread thread = new Thread(작업스레드1);	// 구현객체를 Thread객체에 전달
		thread.start();
		// 1. main스레드가 작업스레드2 객체 생성
		작업스레드2 작업스레드2 = new 작업스레드2();
		작업스레드2.start();
		 
		// 2. main스레드가 1초 마다 한번씩 출력
		try {
			int count = 1;
			while(true) {
				Thread.sleep(1000);	// 1초간 일시정지[ 예외처리필수 ]
				// Thread.currentThread().getName() : 현재 스레드 이름
				System.out.println(Thread.currentThread().getName() + "Thread output : " + count);
				count++;
			}
		} catch (Exception e) {System.out.println(e);}
		
		
		
	}

}
