package algorithm;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		char[][] array = new char[5][15];
		char[] word = new char[15];
		int maxWord = 0;
		
		for(int i = 0; i < array.length; i++) {
			word = sc.nextLine().toCharArray();
			array[i] = word;
		}
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i].length > maxWord) {
				maxWord = array[i].length;
			}
		}
		
		for(int i = 0; i < maxWord; i++) {
			for(int j = 0; j < array.length; j++) {
				if(array[j].length < i+1) {
					continue;
				}
				System.out.print(array[j][i]);
			}
		}
	}

}
