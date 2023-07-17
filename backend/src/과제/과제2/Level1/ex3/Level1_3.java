package 과제.과제2.Level1.ex3;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_3 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_3 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		/* 문제풀이 위치 */
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("input boolean : ");
		boolean a = sc.nextBoolean();
		
		System.out.printf("input byte : ");
		byte b = sc.nextByte();
		
		System.out.printf("input char : ");
		char c = sc.next().charAt(0);
		
		System.out.printf("input short : ");
		short d = sc.nextShort();
		
		System.out.printf("input int : ");
		int f = sc.nextInt();
		
		System.out.printf("input long : ");
		long g = sc.nextLong();
		
		System.out.printf("input float : ");
		float h = sc.nextFloat();
		
		System.out.printf("input double : ");
		double i = sc.nextDouble();
		
		
		System.out.printf("output boolean : %b\n", a);
		System.out.printf("output byte : %d\n", b);
		System.out.printf("output char : %s\n", c);
		System.out.printf("output short : %d\n", d);
		System.out.printf("output int : %d\n", f);
		System.out.printf("output long : %d\n", g);
		System.out.printf("output float : %.7f\n", h);
		System.out.printf("output double : %.12f", i);

		
		
		/* ----------- */
	}
}
/* 
	[문제] 그림과 같이 기본자료형을 이용하여 변수 8개를 출력하시오.
	[조건] 
		1. 모든 기본자료형 8개 사용
		2. print() 메소드 사용
		3. scanner 객체 사용하여 입력받기
*/