package algorithm;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		/*
			예를 들어, ljes=njak은 크로아티아 알파벳 6개(lj, e, š, nj, a, k)로 이루어져 있다. 
			단어가 주어졌을 때, 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력한다.
			dž는 무조건 하나의 알파벳으로 쓰이고, d와 ž가 분리된 것으로 보지 않는다. 
			lj와 nj도 마찬가지이다. 위 목록에 없는 알파벳은 한 글자씩 센다.
			c=, c-, dz=, d-, lj, nj, s=, z=
			
			입력 : ljes=njak				ddz=z=
			출력 : 	 6					  3

		 */
		
		
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int result = word.length();
		
		while(true) {
		
			if(word.contains("z=")) {
				if(word.contains("dz=")) {
					word = word.substring(0, word.indexOf("dz=")) + " " +  word.substring(word.indexOf("dz=") + 3);
					result -= 2;
				}else {
					word = word.substring(0, word.indexOf("z=")) +  " " +  word.substring(word.indexOf("z=") + 2);
					result -= 1;
				}
			}else if(word.contains("c=")) {
				word = word.substring(0, word.indexOf("c=")) +  " " +  word.substring(word.indexOf("c=") + 2);
				result -= 1;
			}else if(word.contains("c-")) {
				word = word.substring(0, word.indexOf("c-")) +  " " +  word.substring(word.indexOf("c-") + 2);
				result -= 1;
			}else if(word.contains("d-")) {
				word = word.substring(0, word.indexOf("d-")) +  " " +  word.substring(word.indexOf("d-") + 2);
				result -= 1;
			}else if(word.contains("lj")) {
				word = word.substring(0, word.indexOf("lj")) +  " " +  word.substring(word.indexOf("lj") + 2);
				result -= 1;
			}else if(word.contains("nj")) {
				word = word.substring(0, word.indexOf("nj")) + " " +  word.substring(word.indexOf("nj") + 2);
				result -= 1;
			}else if(word.contains("s=")) {
				word = word.substring(0, word.indexOf("s=")) +  " " +  word.substring(word.indexOf("s=") + 2);
				result -= 1;
			}else if(word.contains("z=")) {
				word = word.substring(0, word.indexOf("z=")) +  " " +  word.substring(word.indexOf("z=") + 2);
				result -= 1;
			}else {break;}
			
		}
		System.out.println(result);
		
	}

}