package algorithm;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		/* 
		 * 알파벳 대소문자로 된 단어가 주어지면, 
		 * 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오. 
		 * 단, 대문자와 소문자를 구분하지 않는다.
		 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
		 * 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
		 * 
		 * 입력 : Mississipi			zZa
		 * 출력 : 	?				 Z
		 * 
		 */
		
		Scanner sc = new Scanner(System.in);
		
		String text = sc.nextLine();
		StringBuilder sb = new StringBuilder(text);
		
		// 입력받은 문자열을 모두 대문자로 변환
		
		for (int i = 0; i < text.length(); i++) {
			if ((int)text.charAt(i) <= 122 && (int)text.charAt(i) >= 97) {
				char chStr = (char)((int)text.charAt(i) - 32);
				sb.setCharAt(i, chStr);
				text = sb.toString();
			}
		}
		
		System.out.println(text);
	}

}























