package algorithm;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num2 = sc.nextInt();
		String result = "";
		
		result =  num2 % 7 == 0 ? "O" : "X";
		System.out.println(result);
		
	}
}
