package 복습.part1;

import java.util.Scanner;

public class Part1 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int 콜라재고 = 10 ; int 환타재고 = 3; int 사이다재고 = 2;
		int 콜라바구니 = 0 ; int 환타바구니 = 0 ; int 사이다바구니 = 0;
		int 콜라가격 = 300 ; int 환타가격 = 200 ; int 사이다가격 = 100 ;
		
		while(true) {
			
			System.out.println("-------------------메뉴------------------");
			System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제");
			System.out.printf("선택 : ");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				if(콜라재고 > 0) {
					콜라바구니++;
					콜라재고--;
					System.out.println("구매성공");
				}else {
					System.out.println("콜라재고없음");
				}
			}
			else if(ch == 2) {
				if(환타재고 > 0) {
					환타바구니++;
					환타재고--;
					System.out.println("구매성공");
				}else {
					System.out.println("환타재고없음");
				}
			}
			else if(ch == 3) {
				if(사이다재고 > 0) {
					사이다바구니++;
					사이다재고--;
					System.out.println("구매성공");
				}else {
					System.out.println("사이다재고없음");
				}
			}
			else if(ch == 4) {
				System.out.println("------------------------------");
				System.out.println("제품명\t수량\t가격");
				if(콜라바구니 > 0) {
					System.out.println("콜라\t" + 콜라바구니 + "\t" + 콜라바구니*콜라가격);
				}
				if(환타바구니 > 0) {
					System.out.println("환타\t" + 환타바구니 + "\t" + 환타바구니*환타가격);
				}
				if(사이다바구니 > 0) {
					System.out.println("사이다\t" + 사이다바구니 + "\t" + 사이다바구니*콜라가격);
				}
				int payment = (콜라바구니*콜라가격) + (환타바구니*환타가격) + (사이다바구니*콜라가격);
				System.out.println("총가격\t  \t" + payment);
				
				System.out.println("1.결제 2.취소");
				ch = sc.nextInt();
				
				if(ch == 1) {
					System.out.println("금액입력 >>> ");
					int money = sc.nextInt();
					if(money >= payment) {
						System.out.println("잔액 >>> " + (money - payment));
						콜라바구니 = 0;
						환타바구니 = 0;
						사이다바구니 = 0;
					}else {
						System.out.println("금액이 부족합니다.");
						콜라재고 += 콜라바구니;
						환타재고 += 환타바구니;
						사이다재고 += 사이다바구니;
						콜라바구니 = 0;
						환타바구니 = 0;
						사이다바구니 = 0;
					}
				}else if(ch == 2) {
					System.out.println("결제를 취소합니다.");
					콜라재고 += 콜라바구니;
					환타재고 += 환타바구니;
					사이다재고 += 사이다바구니;
					콜라바구니 = 0;
					환타바구니 = 0;
					사이다바구니 = 0;
				}
			}
			
		}
		
	}

}
