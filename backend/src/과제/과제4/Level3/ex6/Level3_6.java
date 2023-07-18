package 과제.과제4.Level3.ex6;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.Scanner;

public class Level3_6 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level3_6 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		/* 문제풀이 위치 */
		boolean seat1 = true;
		boolean seat2 = true;
		boolean seat3 = true;
		boolean seat4 = true;
		boolean seat5 = true;
		boolean seat6 = true;
		
		while(true) {	// 반복문 s
			System.out.println("-------------메뉴------------------------");
			System.out.println("1.예약하기 | 2.예약취소 | 3.예약현황 | 4. 종료");
			System.out.println("----------------------------------------");
			System.out.printf("입력 >>> ");
			int select1 = scanner.nextInt();
			int select2 = 0;
			
			if(select1 == 1) {
				System.out.printf("예약할 좌석을 선택해주세요 >>> ");
				select2 = scanner.nextInt();
				if(select2 == 1) {
					if(seat1 == true) {
						seat1 = false;
						System.out.println("예약 성공");
					}else {System.out.println("이미 예약된 좌석입니다.");}
				}else if(select2 == 2) {
					if(seat2 == true) {
						seat2 = false;
						System.out.println("예약 성공");
					}else {System.out.println("이미 예약된 좌석입니다.");}
				}else if(select2 == 3) {
					if(seat3 == true) {
						seat3 = false;
						System.out.println("예약 성공");
					}else {System.out.println("이미 예약된 좌석입니다.");}
				}else if(select2 == 4) {
					if(seat4 == true) {
						seat4 = false;
						System.out.println("예약 성공");
					}else {System.out.println("이미 예약된 좌석입니다.");}
				}else if(select2 == 5) {
					if(seat5 == true) {
						seat5 = false;
						System.out.println("예약 성공");
					}else {System.out.println("이미 예약된 좌석입니다.");}
				}else if(select2 == 6) {
					if(seat6 == true) {
						seat6 = false;
						System.out.println("예약 성공");
					}else {System.out.println("이미 예약된 좌석입니다.");}
				}
			}
			
			if(select1 == 2) {
				System.out.printf("예약취소 할 좌석을 선택해주세요 >>> ");
				select2 = scanner.nextInt();
				
				if(select2 == 1) {
					if(seat1 == false) {
						seat1 = true;
						System.out.println("예약을 취소하였습니다.");
					}else {System.out.println("잘못된 좌석을 선택하였습니다.");}
				}else if(select2 == 2) {
					if(seat2 == false) {
						seat2 = true;
						System.out.println("예약을 취소하였습니다.");
					}else {System.out.println("잘못된 좌석을 선택하였습니다.");}
				}else if(select2 == 3) {
					if(seat3 == false) {
						seat3 = true;
						System.out.println("예약을 취소하였습니다.");
					}else {System.out.println("잘못된 좌석을 선택하였습니다.");}
				}else if(select2 == 4) {
					if(seat4 == false) {
						seat4 = true;
						System.out.println("예약을 취소하였습니다.");
					}else {System.out.println("잘못된 좌석을 선택하였습니다.");}
				}else if(select2 == 5) {
					if(seat5 == false) {
						seat5 = true;
						System.out.println("예약을 취소하였습니다.");
					}else {System.out.println("잘못된 좌석을 선택하였습니다.");}
				}else if(select2 == 6) {
					if(seat6 == false) {
						seat6 = true;
						System.out.println("예약을 취소하였습니다.");
					}else {System.out.println("잘못된 좌석을 선택하였습니다.");}
				}
			}
			
			if(select1 == 3) {
				System.out.printf("[ ");
				if(seat1 == false) {
					System.out.printf("예약 ");
				}
				System.out.printf("]");
				
				System.out.printf("[ ");
				if(seat2 == false) {
					System.out.printf("예약 ");
				}
				System.out.printf("]");
				
				System.out.printf("[ ");
				if(seat3 == false) {
					System.out.printf("예약 ");
				}
				System.out.printf("]");
				System.out.println();
				
				System.out.printf("[ ");
				if(seat4 == false) {
					System.out.printf("예약 ");
				}
				System.out.printf("]");
				
				System.out.printf("[ ");
				if(seat5 == false) {
					System.out.printf("예약 ");
				}
				System.out.printf("]");
				
				System.out.printf("[ ");
				if(seat6 == false) {
					System.out.printf("예약 ");
				}
				System.out.printf("]");
				System.out.println();
			}
			
			if(select1 == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}	// 반복문 e
		
		/* ----------- */

	}
}
/* 
	주제 : 예약 좌석 시스템
	실행결과는 제공하지 않습니다.
	
	- 변수 조건 
		1. 변수 : 6개의 좌석 은 변수를 이용합니다. [ 배열X ]
		2. 그외 자유롭게 사용. 배열/리스트 사용 금지 [ day1~day4 문법 이용 ]
	- 메뉴 조건
		0. 메뉴 : 1.예약하기 2.예약취소 3.예약현황 
	- 기능 조건 
	 	예약하기 출력예시 )
	 		1. 예약할 좌석을 선택한다.
	 		2. 만약에 비어 있으면 예약성공 아니면 예약 실패 
	 	예약취소 출력예시 )
	 		1. 예약할 취소할 좌석을 선택한다.
	 	예약현황 출력예시 )
	 		* 3개씩 2줄로 출력합니다.
			[ 예약 ]	[ ]	[ ]
			[ ] [예약] [ ]  
			- 예약이 되어 있는 좌석은 [예약] 예약이 없으면 [ ] 공란으로 출력합니다.
			
*/
