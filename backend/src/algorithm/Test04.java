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
		
		if(word.contains("z=")) {
			if(word.contains("dz=")) {
				result -= 2;
			}else {
				result -= 1;
			}
		}
		
		if(word.contains("c=")) {
			result -= 1;
		}
		
		if(word.contains("c-")) {
			result -= 1;
		}
		
		if(word.contains("d-")) {
			result -= 1;
		}
		
		if(word.contains("lj")) {
			result -= 1;
		}
		
		if(word.contains("nj")) {
			result -= 1;
		}
		
		if(word.contains("z=")) {
			result -= 1;
		}
		
		System.out.println(result);
		
		
		
	}

}