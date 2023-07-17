package algorithm;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		try (/*
					알파벳 소문자로만 이루어진 단어가 주어진다. 이때,
					이 단어가 팰린드롬인지 아닌지 확인하는 프로그램을 작성하시오.
					팰린드롬이란 앞으로 읽을 때와 거꾸로 읽을 때 똑같은 단어를 말한다. 
					level, noon은 팰린드롬이고, baekjoon, online, judge는 팰린드롬이 아니다.
				
					입력 : level		baekjoon
					출력 : 	1			0
					
				 */
		Scanner sc = new Scanner(System.in)) {
			String palindrome = sc.nextLine();
			boolean result = true;
			

			for(int i = 0; i < palindrome.length()/2; i++) {
				if(palindrome.charAt(0 + i) != palindrome.charAt(palindrome.length()-i-1)){
					System.out.println('0');
					result = false;
					break;
				}
			}
			
			if(result == true) {
				System.out.println('1');
			}
		}

		
	}

}
