package java1.day04;

import java.util.Scanner;

public class Ex2_확인문제7 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int select = 0;
		int totalmoney = 0;
		int money = 0;
		
		while(true){
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			
			System.out.printf("선택 => ");
			select = sc.nextInt();
			
			if(select == 1) {
				System.out.printf("예금액 => ");
				money = sc.nextInt();
				totalmoney += money;
			}else if(select == 2) {
				System.out.printf("출금액 => ");
				money = sc.nextInt();
				totalmoney -= money;
			}else if(select == 3) {
				System.out.println("잔고 => " + totalmoney);
			}else if(select == 4) {
				break;
			}
		}
		
		System.out.println("프로그램 종료");
	}

}
