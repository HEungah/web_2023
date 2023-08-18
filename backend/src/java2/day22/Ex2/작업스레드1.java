package java2.day22.Ex2;

public class 작업스레드1 implements Runnable{
	@Override
	public void run() {
		try {
			int count = 1;
			while(true) {
				Thread.sleep(5000);	// 2초간 일시정지[ 예외처리필수 ]
				Thread.currentThread().setName("스레드1");
				System.out.println(Thread.currentThread().getName() + " output : " + count);
				count++;
			}
		} catch (Exception e) {System.out.println(e);}
	}
}
