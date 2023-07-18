package java1.day04;

import java.util.Scanner;

public class Ex2_확인문제7 {
	public static void main(String[] args) { // main s
		
		Scanner sc = new Scanner(System.in);
		String select;
		int totalmoney = 0;		// 전체 예금액
		
			
		while(true){	// 반복문 시작
			int money = 0;		// 입력금액 저장 변수
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			
			System.out.printf("선택 => ");
			select = sc.nextLine();
			
			if(select.equals("1")) {
				System.out.printf("예금액 => ");
				money = sc.nextInt();
				totalmoney += money;
			}else if(select.equals("2")) {
				System.out.printf("출금액 => ");
				money = sc.nextInt();
				totalmoney -= money;
			}else if(select.equals("3")) {
				System.out.println("잔고 => " + totalmoney);
			}else if(select.equals("4")) {
				System.out.println();
				break;
			}
			sc.nextLine();
			System.out.println();
		}	// 반복문 끝
		
		System.out.println("프로그램 종료");
		
	} // main e

}
