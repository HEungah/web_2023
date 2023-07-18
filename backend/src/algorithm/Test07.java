package algorithm;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[][] array = new char[5][];
		char[] word = new char[15];
		
		for(int i = 0; i < array.length; i++) {
			word = sc.nextLine().toCharArray();
			array[i] = word;
		}
		
		for(int i = 0; i < array[i].length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.print(array[j][i]);
			}
		}
	}

}
