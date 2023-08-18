package java2.day22.Ex3;

import java.time.LocalTime;
import java.util.Scanner;

public class Ex3_전자시계 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 자동으로 현재시간 실행
		현재시간 현재시간 = new 현재시간();
		Thread thread = new Thread(현재시간);
		thread.start();
		
		// 타이머 사용여부는 입력받아 실행
		타이머 타이머 = new 타이머();
		Thread thread2 = new Thread(타이머);
		
		// main스레드)
		while(true) {
			System.out.print("1.타이머시작 2. 타이머중지 >> ");
			int ch = sc.nextInt();
			if(ch == 1) {	// main스레드에서 1번을 선택하면 타이머 실행
				thread2.start(); System.out.println("타이머시작");
				}
			else if(ch == 2) { System.out.println("타이머종료");}
		}
	}
}
