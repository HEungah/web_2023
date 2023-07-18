package 과제.과제4.Level3.ex2;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Level3_2 {
	
	public static void main(String[] args) {
		System.out.println(" >> Level3_2 answer >> ");
		System.out.println(" >> answer time : " + LocalDateTime.now() +" >> \n" );
		Scanner scanner = new Scanner(System.in);
		
		
		/* 문제풀이 위치 */
		int count = 1; // 몇회 실행하였는지 카운트해주는 변수
		while(true) {
			System.out.printf(count + "회 입력 : ");
			String word = scanner.nextLine();
			if(word.equals("end")) {
				break;
			}
			count++;
			
		}
		
		System.out.println("안내) 프로그램을 종료 하니다. [총 " + (count-1) + "회 입력]");
		/* ----------- */

	}
}
/* 
	[문제] 
		그림과 같이 무한적으로 문자열을 입력 받다가 end 입력시 
		입력받은 횟수와 문구를 출력후 종료되는 반복문을 구현하시오.
	[조건] 
		1. 문제풀이 위치 외 코드는 수정 불가 합니다.

*/
