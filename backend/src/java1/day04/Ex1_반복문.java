package java1.day04;

import java.util.Scanner;

public class Ex1_반복문 {
	public static void main(String[] args) {
		
		// 1부터 5까지의 누적합계 (for문 x)
		int sum = 0;
		sum = sum+1;
		sum += 2;
		sum += 3;
		sum += 4;
		sum += 5;
		
		// 1부터 5까지의 누적합계(for문 o)
		int sum2 = 0;
		for(int i = 1; i <= 5; i++) {
			sum2 += i;
		}
		
		System.out.println(sum + " " + sum2);
		
		// for문을 이용한 1~10까지 출력
		for(int i = 1; i <= 10; i++) {
			System.out.printf(i + " ");
		}
		System.out.println();
		
		// 초기값 변수는 for에서 선언시 지역변수이다
		int sum3 = 0;
		for(int x = 1; x <= 10; x++) {
			sum3 += x;
		}
		
		//System.out.println(x);		x는 for문 밖에서 사용할 수 없다.
		
		int sum4 = 0; int i;
		for(i = 1; i <=100; i++) {
			sum4 += i;
		}
		System.out.println(i);		// i는 for문 밖에서 선언되었기때문에 for문 밖에서도 사용가능
		
		
		// 실수
		for(float x = 0.1f; x <=10.f; x+=0.1f) {
			System.out.printf("%.2f\n",x);
		}
		
		// 구구단
		for(int m=2; m<=9; m++) {
			System.out.println("*** " + m + "단 ***");
			for(int n=1; n<=9; n++) {	// 단마다 곱 실행
				System.out.println(m + " X " + n + " = " + (m*n));
			}
		}
		
		int y = 1;
		while(y<=10) {
			System.out.println(y + " ");
			y++;
		}
		
		// 무한 루프
		Scanner sc = new Scanner(System.in);
		int speed = 0;
		boolean run = true;	// while문 true/false 저장하는 변수, on/off 스위치
		
		while(run) {
			System.out.println("-----------------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("-----------------------------");
			System.out.print("선택 : ");
			String strNum = sc.nextLine();
			
			if(strNum.equals("1")) {
				speed++;
				if(speed > 10) {
					run = false;
					System.out.println("한계속도를 넘어서 중지합니다.");
					speed = 0;
				}
				System.out.println("현재 속도 => " + speed);
			}else if(strNum.equals("2")) {
				speed--;
				if(speed < 0) {
					speed = 0;
				}
				System.out.println("현재 속도 => " + speed);
			}else if(strNum.equals("3")) {
				run = false;
			}
			
		}
		System.out.println("프로그램 종료");
		
		Outter:for(char upper='A'; upper<='Z'; upper++) {
			for(char lower='a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='g') {
					break Outter;
				}
			}
		}
		
		System.out.println("프로그램 실행 종료");
		
		Con:for(i = 1; i <=10; i++) {
			if(i%2 != 0) {
				continue Con;	// continue도 for문 이름 활용 가능
			}
			System.out.printf(i + " ");
		}
		
	}

}

/*
 	
 	for문
 		for( 1.초기값; 2.조건식; 4.증감식;){
 			3.실행문;
 		}
 		
 		1. 초기값이 실행된다.
 		2. 조건식 판단해서 true이면 {} 들어감, false {} 건너뜀/종료
 		3. true이면 실행문 실행
 		4. 초기값이 들어있는 변수에 증감식
 		5. 조건식 판단해서 ---> 2,3,4 반복
 		
 	while문
 		1. *초기값
 		while(2.조건식)(3.실행문 4.*증감식)
 		
 		- 초기값과 증감식은 필수가 아님
 		- 조건식 판단해서 true이면 {} 들어감(실행문 실행), false이면 {} 건너뜀/종료
 		
    
    -- 일반적으로 패턴이 있는 경우 for문 사용 권장
    -- 무한루프 사용시 while문 사용 권장
 */
















