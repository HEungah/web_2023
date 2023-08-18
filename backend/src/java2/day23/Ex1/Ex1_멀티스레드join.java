package java2.day23.Ex1;

public class Ex1_멀티스레드join {
	public static void main(String[] args) {
		// main 스레드가 main함수 호출
		
		System.out.println("현재스레드 :" + Thread.currentThread().getName());	// main
		
		// 1. 스레드객체 생성 [ main  외 추가적으로 직업스레드 생성 ]
		SumThread sumThread = new SumThread();
		// 2. 스레드 실행
		sumThread.start();
		
		// 3. [main스레드] 작업 스레드 객체의 필드 확인
		// *작업스레드가 1~100까지 계산 끝나기전에 main스레드가 결과를 먼저 출력한다.
		System.out.println("1~100 합 : " + sumThread.getSum());
		
		try {
			// main 스레드가 sumThread스레드의 join 메소드를 호출했기 때문에 main스레드 일시정지
			sumThread.join();		// 합침
		} catch (Exception e) {System.out.println(e);}
		System.out.println("1~100 합 : " + sumThread.getSum());
	}
}









