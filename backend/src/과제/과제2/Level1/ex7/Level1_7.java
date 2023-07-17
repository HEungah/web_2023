package 과제.과제2.Level1.ex7;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level1_7 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level1_7 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		String output = "";
		
		/* 문제풀이 위치 */
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("회원명 String : ");
		String name = sc.nextLine();
		
		System.out.printf("상태 boolean : ");
		boolean a = sc.nextBoolean();
		
		System.out.printf("회원번호 byte : ");
		byte b = sc.nextByte();
		
		System.out.printf("성별 char : ");
		char c = sc.next().charAt(0);
		
		System.out.printf("나이 short : ");
		short d = sc.nextShort();
		
		System.out.printf("포인트 int : ");
		int f = sc.nextInt();
		
		System.out.printf("예금액 long : ");
		long g = sc.nextLong();
		
		System.out.printf("키 float : ");
		float h = sc.nextFloat();
		
		System.out.printf("몸무게 double : ");
		double i = sc.nextDouble();
		
		System.out.println("==========회원 개인정보=============");
		System.out.println("|        회원명 : " + name);
		System.out.println("|        상태 : " + a);
		System.out.println("|        회원번호 : " + b);
		System.out.println("|        성별 : " + c);
		System.out.println("|        나이 : " + d);
		System.out.println("|        포인트 : " + f);
		System.out.println("|        예금액 : " + g);
		System.out.println("|        평균키 : " + h);
		System.out.println("|        평균 몸무게 : " + i);
		System.out.println("================================");
		
		/* ----------- */
	}
}
/* 
	[문제조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.
		2. 기본 자료형8개 + 문자열클래스 변수 1개 를 이용한 9개변수를 입력 받습니다.
		3. 입력받은 9개 변수를 그림과 같이 출력합니다.
		4. 기존에 미리 작성된 변수를 최대한 활용합니다.
		
*/