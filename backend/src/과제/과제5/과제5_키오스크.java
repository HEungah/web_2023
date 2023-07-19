package 과제.과제5;

import java.util.Scanner;

public class 과제5_키오스크 {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String 재고관리 = "";
		/* 재고관리 변수 샘플  */
		재고관리 = "콜라0 300" + "환타0 200" + "사이다0 100";
		/* ----------- */
		
		while(true) {
			System.out.println("\n\n-------------------- 메뉴 ------------------- ");
			System.out.println("1.콜라[300] 2.환타[200] 3.사이다[100] 4.결제");
			System.out.print(">>>>>> 선택 : "); int ch = scanner.nextInt();
			
			/* 문제풀이 위치 */
			
			
			
			if(ch == 1) {	// 콜라 선택
				if(재고관리.substring(재고관리.indexOf("콜라")+2, 재고관리.indexOf("콜라")+4).equals("10")) {
					System.out.println("재고부족");
				}else {
					재고관리 = 재고관리.replace("콜라" + 재고관리.charAt(재고관리.indexOf("콜라")+2), "콜라" + (재고관리.charAt(재고관리.indexOf("콜라")+2)-48+1));
					System.out.println(재고관리);
				}
			}else if(ch == 2) {
				if(재고관리.substring(재고관리.indexOf("환타")+2, 재고관리.indexOf("환타")+4).equals("10")){
					System.out.println("재고부족");
				}else {
					재고관리 = 재고관리.replace("환타" + 재고관리.charAt(재고관리.indexOf("환타")+2), "환타" + (재고관리.charAt(재고관리.indexOf("환타")+2)-48+1));
					System.out.println(재고관리);
				}
			}else if(ch == 3) {
				if(재고관리.substring(재고관리.indexOf("사이다")+3, 재고관리.indexOf("사이다")+5).equals("10")){
					System.out.println("재고부족");
				}else {
					재고관리 = 재고관리.replace("사이다" + 재고관리.charAt(재고관리.indexOf("사이다")+3), "사이다" + (재고관리.charAt(재고관리.indexOf("사이다")+3)-48+1));
					System.out.println(재고관리);
				}
				
			}else if(ch == 4) {
				System.out.println("------------장바구니-------------");
				System.out.println("제품명	수량	가격");
				
				if(재고관리.substring(재고관리.indexOf("콜라")+2, 재고관리.indexOf("콜라")+4).equals("10")) {
					System.out.printf("콜라	10	");
					System.out.println(Integer.valueOf(재고관리.substring(5,8)) * 10);
				}else if(재고관리.charAt(재고관리.indexOf("콜라")+2)-48 > 0){
					System.out.printf("콜라	 %d	", 재고관리.charAt(재고관리.indexOf("콜라")+2)-48);
					System.out.println(Integer.valueOf(재고관리.substring(4,7)) * (재고관리.charAt(재고관리.indexOf("콜라")+2)-48));
				}
				
				if(재고관리.substring(재고관리.indexOf("환타")+2, 재고관리.indexOf("환타")+4).equals("10")) {
					System.out.printf("환타	10	");
					System.out.println(Integer.valueOf(재고관리.substring(12,15)) * 10);
				}else if(재고관리.charAt(재고관리.indexOf("환타")+2)-48 > 0){
					System.out.printf("환타	 %d	", 재고관리.charAt(재고관리.indexOf("환타")+2)-48);
					System.out.println(Integer.valueOf(재고관리.substring(11,14)) * (재고관리.charAt(재고관리.indexOf("환타")+2)-48));
				}
				
				if(재고관리.substring(재고관리.indexOf("사이다")+3, 재고관리.indexOf("사이다")+5).equals("10")) {
					System.out.printf("사이다	10	");
					System.out.println(Integer.valueOf(재고관리.substring(12,15)) * 10);
				}else if(재고관리.charAt(재고관리.indexOf("사이다")+2)-48 > 0){
					System.out.printf("사이다	 %d	", 재고관리.charAt(재고관리.indexOf("사이다")+2)-48);
					System.out.println(Integer.valueOf(재고관리.substring(11,14)) * (재고관리.charAt(재고관리.indexOf("환타")+2)-48));
				}
				
			}
			
			/* ----------- */
			
		} // while end 
	} // main end 
	
} // class end 

/*

	 주제 : 키오스크(변수버전)
	 	- 실행예시 사진은 없습니다.
		조건 
		1. 제품 가격/재고/바구니 상태를 하나의 문자열 변수에서 관리 
			// 샘플 : 
					이름 : 콜라 , 환타 , 사이다
					가격 : 300 , 200 , 100
					바구니 : 0 , 0 , 0
			
		2. 키오스크 메뉴 [ 무한루프 : 종료 없음(24시간) ] 
			1. 콜라 2.사이다 3.환타 4.결제
			[ 1~3 선택시 ]
				- 재고가 있을경우 장바구니 담기 / 없으면 '재고부족' 출력
				 
			[ 4 선택시 ] 
				- 현재 장바구니 현황 표시 목록 
				----------------------------------
				제품명	수량	가격
				사이다	1	400
				환타		2	1000
				총가격 : 1400
				- 결제메뉴 표시
					1. 결제 2.취소 
					[결제]
						- 금액 입력받아 총가격에 뺀 잔액 출력 -> 결제 성공시 장바구니 초기화 
						- 만약에 금액이 부족하면 결제 취소 -> 장바구니 초기화 / 재고 다시 되돌리기
					[취소]
						- [ 장바구니 초기화 / 재고 다시 되돌리기 ]
 
 */







