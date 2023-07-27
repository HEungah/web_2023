package 과제.과제5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class 과제5_키오스크_파일처리 {
	
	public static void main(String[] args) throws IOException {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		
		while(true) {	// 프로그램 무한루프
			String filePath = "./src/과제/과제5/재고파일.txt";
			FileOutputStream fileOutputStream = new FileOutputStream(filePath,true);
			FileInputStream fileInputStream = new FileInputStream(filePath);
			File file = new File(filePath);	// 파일 정보 객체
			
			/* 파일내 제품정보를 배열로 옮기기 */
			byte[] inByteArray = new byte[(int)file.length()];	// 파일의 용량만큼의 배열 선언
			fileInputStream.read(inByteArray);	// 읽어온 바이트 배열에 저장
			String fileInfo = new String(inByteArray);
				
			String[] 재고관리	= fileInfo.split("\n");
			
			System.out.println("\n\n-------------------- 메뉴 ------------------- ");
			System.out.println("-1.제품등록 0:결제 1:제품선택");
			System.out.print(">>>>>> 선택 : "); int ch = scanner.nextInt();
			
			
			/* 문제풀이 위치 */
			
			if(ch == -1) {	// 만약에 -1번을 입력했으면 제품 등록 기능
				System.out.printf("제품명 : ");	String name = scanner.next();
				System.out.printf("초기재고 : ");	int stock = scanner.nextInt();
				System.out.printf("가격 : ");		int price = scanner.nextInt();
												int basket = 0;	// 바구니 0부터 시작
				// 2. 해당 변수들을 하나의 데이터 구성 [ 제품구별 \n / 제품내정보구분 , ]
				String outStr = name+","+stock+","+price+","+basket+"\n";
				
				// 3. 파일에 내보내기
					// 1. 파일출력스트림 객체 2. 문자열->바이트배열변환 3. 바이트배열 내보내기
				fileOutputStream.write(outStr.getBytes());
				
				System.out.println("안내) 제품 등록이 되었습니다.");
				
			}
			
			if(ch == 1) {
				for(int i = 0; i<재고관리.length; i++) {
					String product = 재고관리[i];
					String name = product.split(",")[0];	// 제품명
					int stock = Integer.parseInt(product.split(",")[1]);		// 재고
					int price = Integer.parseInt(product.split(",")[2]);		// 가격
					int basket = Integer.parseInt(product.split(",")[3]);		// 바구니
					
					if(stock == 0) {
						System.out.print((i+1)+":" + name + "[재고없음]");
					}else {
						System.out.print((i+1)+":" + name + "[" + stock + "]\n");
					}
					
					
				} // for e
				System.out.print("제품을 선택해주세요 >>> ");
				ch = scanner.nextInt();
				for(int i = 0; i < 재고관리.length; i++) {
					if(ch == (i+1)) {
						String product = 재고관리[i];
						String name = product.split(",")[0];	// 제품명
						int stock = Integer.parseInt(product.split(",")[1]);		// 재고
						int price = Integer.parseInt(product.split(",")[2]);		// 가격
						int basket = Integer.parseInt(product.split(",")[3]);
						
						if(stock > 0) {
							stock--;
							basket++;
							product = name + "," + stock + "," + price + "," + basket;
							재고관리[i] = product;
							// 파일 업데이트
							String outStr = "";
							for(int j = 0; j < 재고관리.length; j++) {
								outStr += 재고관리[j].split(",")[0] + "," +
										재고관리[j].split(",")[1] + "," +
										재고관리[j].split(",")[2] + "," +
										재고관리[j].split(",")[3] + "\n";
							}
							// 재고관리 배열을 하나의 문자열로 변환후 바이트 배열로 변경후 파일로 내보내기
							FileOutputStream fileOutputStream2 = new FileOutputStream(filePath);
							fileOutputStream2.write(outStr.getBytes());
							System.out.println(name + "을 담았습니다.");
							break;
						}else {
							System.out.println(name + " 제품의 재고가 부족합니다.");
						}
					}
				}
			

			}
			else if(ch == 0) {
				System.out.printf("%s \t\t%s \t\t%s \n","제품", "수량", "가격");
				for(int i = 0; i<재고관리.length; i++) {
					int basket = Integer.parseInt(재고관리[i].split(",")[3]);
					int price = Integer.parseInt(재고관리[i].split(",")[2]);
					String name = 재고관리[i].split(",")[0];
					if(basket > 0) { // 바구니에 재품이 있는겨우만 출력
						System.out.printf("%s \t\t%s \t\t%s",name, basket, basket*price);
					}
					System.out.println();
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







