package 복습.part3;

import java.util.Scanner;

public class Part3 {
	public static void main(String[] args) {
		
		String[] 재고관리 = { "10,0,300,콜라" , "3,0,200,환타" , "2,0,100,사이다"};
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("-------------메뉴--------------");
			System.out.println("1.콜라 2.환타 3.사이다 4.결제");
			System.out.print("입력 >>> ");
			int ch = sc.nextInt();
			
			if(ch == 1 || ch == 2 || ch ==3) {
				String product = 재고관리[ch-1];
				int 재고 = Integer.parseInt(product.split(",")[0]);
				int 바구니 = Integer.parseInt(product.split(",")[1]);
				int 가격 = Integer.parseInt(product.split(",")[2]);
				String 제품명 = 재고관리[ch-1].split(",")[3];
				
				if(재고 > 0) {
					재고--;
					바구니++;
					System.out.println("구매완료");
				}else {
					System.out.println("재고부족");
				}
				재고관리[ch-1] = 재고 + "," + 바구니 + "," + 가격 + "," + 제품명;
			}
			else if(ch == 4){
				System.out.println("제품명\t수량\t가격");
				int sum = 0;
				for(int i = 0; i < 재고관리.length; i++) {					
					int 재고 = Integer.parseInt(재고관리[i].split(",")[0]);
					int 바구니 = Integer.parseInt(재고관리[i].split(",")[1]);
					int 가격 = Integer.parseInt(재고관리[i].split(",")[2]);
					String 제품명 = 재고관리[i].split(",")[3];
					sum += 바구니*가격;
					if(바구니 > 0) {
						System.out.println(제품명 + "\t" + 바구니 + "\t" + (바구니*가격));
					}
					바구니 = 0;
					재고관리[i] = 재고 + "," + 바구니 + "," + 가격 + "," + 제품명;
				}
				System.out.println("총가격\t  \t" + sum);
				
			}
			
		}
		
		
	}

}
