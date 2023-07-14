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
		// 가장 많이 쓴 알파벳을 구하는 함수를 실행
		char resultChar = maxFrequency(text);
		// 가장 많이 쓴 알파벳을 대문자로 바꾸어서 출력한다.
		System.out.println(Character.toUpperCase(resultChar));
		
		sc.close();
	}
		
		
		private static char maxFrequency(String word) {
			
			// 입력된 문자열을 모두 소문자로 변환시켜준다.
			String text = word.toLowerCase();
			
			// 알파벳배열을 생성
			int[] aArray = new int[26];
			
			// 단어의 알파벳에 대응되는 알파벳배열의 인덱스의 값을 1씩증가시킴
			for(char c : text.toCharArray()) {
				int index = c - 'a';
				aArray[index]++;
			}
			
			
			int manyCharacter = 0;
			char maxCharacter = '?';
			
			for(int i = 0; i < aArray.length; i++) {
				if(aArray[i] > manyCharacter) {
					manyCharacter = aArray[i];
					maxCharacter = (char) (i + 'a');
				}else if(aArray[i] == manyCharacter) {
					maxCharacter = '?';
				}
			}
			
	
			
			return maxCharacter;
			
		}
	

}























