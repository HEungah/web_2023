package java2.day23.Ex1;

/*
 	멀티스레드
 		1. Thread 클래스로부터 extends
 		2. Runnable 인터페이스로부터 implements(권장)
 			* run() 메소드 재정의 필요(1, 2번 둘다 필수적으로)
 		- 상태
 			1. new 이용한 스레드 객체 생성[ 스레드 생성 ]
 			2. start() 메소드 이용한 run() 작업코드 실행
 				- start() 한다고해서 바로 실행x
 				- 실행대기(Runnable) : 대기표 받고 기다리는 상태(운영체제가 하드웨어[CPU]를 사용할 수 있는 권한을 줄때까지 기다림) --> cpu스케쥴링
 				- 실행(Running) : 해당 스레드 순서가 되면 CPU 사용할 수 있는 권한 획득[ 명령어 전달 실행 ]
 				- 일시정지 : 스레드
 		- 병렬(여러단위 흐름) 처리 vs 직렬(하나단위 흐름) 처리
 				다차선				   vs				1차선
 			- 단일(직렬)스레드 : main 함수만 있는 경우
 			- 멀티(병렬)스레드 : main 에서 thread 추가 하는 경우
 			
 			- 컴퓨터의 병렬 처리 방법
 				- 소프트웨어[자바]는 직접적인 하드웨어[cpu, 메모리] 조작x
 			
 */

public class SumThread extends Thread{

	// 필드
	private long sum;

	public long getSum() {
		return sum;
	}

	public void setSum(long sum) {
		this.sum = sum;
	}
	
	// !! 작업스레드가 실행할 작업코드를 재정의함
	@Override
	public void run() {	// 1부터 100이하까지 1씩 증가 누적합계 구하는 함수
		for(int i=0; i < 100; i++) {
			sum+=i;
		}
	}
	
}
