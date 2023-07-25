package 복습.part2;

import java.util.Scanner;

public class Part2 {
	public static void main(String[] args) {
		
		String 재고관리 = "10,0,300\n3,0,200\n2,0,100\n";
		Scanner sc = new Scanner(System.in);
		
		String 콜라 = 재고관리.split("\n")[0];
		String 환타 = 재고관리.split("\n")[1];
		String 사이다 = 재고관리.split("\n")[2];
		
		int 콜라재고 = Integer.parseInt(콜라.split(",")[0]);
		int 환타재고 = Integer.parseInt(환타.split(",")[0]);
		int 사이다재고 = Integer.parseInt(사이다.split(",")[0]);
		
		int 콜라바구니 = Integer.parseInt(콜라.split(",")[1]);
		int 환타바구니 = Integer.parseInt(환타.split(",")[1]);
		int 사이다바구니 = Integer.parseInt(사이다.split(",")[1]);
		
		int 콜라가격 = Integer.parseInt(콜라.split(",")[2]);
		int 환타가격 = Integer.parseInt(환타.split(",")[2]);
		int 사이다가격 = Integer.parseInt(사이다.split(",")[2]);
		
		while(true) {
			System.out.println("------------------메뉴-----------------");
			System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제");
			System.out.print("선택 >>>>>> ");
			int ch =  sc.nextInt();
			
			if(ch == 1) {
				if(콜라재고 > 0) {
					콜라재고--;
					콜라바구니++;
					System.out.println("구매완료");
				}
			}
			else if(ch == 2) {
				if(환타재고 > 0) {
					환타재고--;
					환타바구니++;
					System.out.println("구매완료");
				}
			}
			else if(ch == 3) {
				if(사이다재고 > 0) {
					사이다재고--;
					사이다바구니++;
					System.out.println("구매완료");
				}
			}
			else if(ch == 4) {
				System.out.println("제품\t수량\t가격");
				if(콜라바구니 > 0) {
					System.out.println("콜라\t" + 콜라바구니 + "\t" + 콜라바구니*콜라가격);
				}
				if(환타바구니 > 0) {
					System.out.println("환타\t" + 환타바구니 + "\t" + 환타바구니*환타가격);
				}
				if(사이다바구니 > 0) {
					System.out.println("사이다\t" + 사이다바구니 + "\t" + 사이다바구니*사이다가격);
				}
				
				int payment = (콜라바구니*콜라가격)+(환타바구니*환타가격)+(사이다바구니*사이다가격);
				System.out.println("총가격\t  \t" + payment);
				System.out.println("1.결제 2.취소");
				System.out.print("입력 >>>>");
				ch = sc.nextInt();
				if(ch == 1) {
					System.out.print("금액 입력 >>>");
					int money = sc.nextInt();
					if(money >= payment) {
						System.out.println("잔액 >>>> " + (money-payment));
						콜라바구니 = 0;
						환타바구니 = 0;
						사이다바구니 = 0;
					}else {
						System.out.println("금액이 부족합니다.");
						콜라재고 += 콜라바구니;
						환타재고 += 환타바구니;
						환타재고 += 환타바구니;
						콜라바구니 = 0;
						환타바구니 = 0;
						사이다바구니 = 0;
						
					}
				}
				else if(ch == 2) {
					System.out.println("결제를 취소합니다.");
					콜라재고 += 콜라바구니;
					환타재고 += 환타바구니;
					환타재고 += 환타바구니;
					콜라바구니 = 0;
					환타바구니 = 0;
					사이다바구니 = 0;
				}
			}
		}
		
		
		
	}

}
