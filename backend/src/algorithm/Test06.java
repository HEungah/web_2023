package algorithm;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		int count = 0;	// 그룹단어 갯수 초기화
		
		for(int i = 0; i < number; i++) {
			String text = sc.nextLine();
		}
		
	}

}

/*
1. 단어 갯수 받음

2. 입력한 단어 갯수만큼 단어 입력

3. 입력한 단어가 그룹단어인지 판단(boolean타입을 리턴하는 함수)

4. 알파벳 중복판단을 위해 알파벳 배열 선언(boolean타입)

5. 입력한 단어의 길이만틈 반복문 실행

6. 반복할때마다 현재의 단어 저장

7. 단어의 알파벳 인덱스를 구한다음 알파벳 배열의 해당 인덱스에 true 저장

8. 알파벳 배열의 해당 인덱스가 이미 true인 상태이면 전 반복문의(i - 1)의 알파벳과 같은지 판단

9. 같지 않으면 그룹문자가 아님 false 반환

10. 반복문을 돌릴동안 false가 반환되지 않으면 그룹문자(true반환)

11. 함수 리턴값이 true이면 그룹단수 갯수 변수를 증가 시켜준다.

12. 모든 단어를 그룹함수인지 판단했으면 그룹함수 갯수 출력
 */
