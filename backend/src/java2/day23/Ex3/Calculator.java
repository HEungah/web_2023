package java2.day23.Ex3;

public class Calculator {	// 계산기
	private int memory;

	public int getMemory() {
		return memory;
	}
	
	// 1. 메소드 동기화 하는 방법 (주로 많이 쓰임) : 메소드 선언부에 synchronized 키워드
	public synchronized void setMemory1(int memory) {
		// (동기화 메소드) : 해당 메소드를 여럿 스레드가 호출시 대기상태
		this.memory = memory;	// 1. 매개변수로 들어온 값을 필드에 저장[ setter ]
		try {
			Thread.sleep(2000);	// 2. 현재 스레드를 2초간 일시정지
		} catch (InterruptedException e) {}
		//	3. 2초 후 필드 확인
		System.out.println(Thread.currentThread().getName() + " : " + this.memory);
	}
	
	// 2. 메소드내 특정 블록에서만 동기화 하는 방법 : synchronized(this)
	public synchronized void setMemory2(int memory) {
		synchronized (this) {	// 현재 객체 잠금
			this.memory = memory;
			try {
				Thread.sleep(2000);	
			} catch (InterruptedException e) {}
			
			System.out.println(Thread.currentThread().getName() + " : " + this.memory);			
		}
	}
	
	

}
