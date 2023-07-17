package algorithm;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		int result5 = 0;
		
		result1 = num1 * (num2 % 10);	// 385 일의 자리 숫자 구하기
		result2 = num1 * ((num2 / 10) % 10);	// 385 십의 자리 숫자 구하기
		result3 = num1 * ((num2 / 100) % 10); 	// 385 백의 자리 숫자 구하기
		result4 = num1 * (num2 / 1000);
		result5 = num1 * (num2);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		System.out.println(result4);
		System.out.println(result5);
		
	}

}
