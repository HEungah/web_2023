package java1.day08.Ex5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5_배열 { // class s
	public static void main(String[] args) {//main s
		
		String[] memberList = new String[100];	// 100개 문자열을 저장할수 있는 배열 선언
		
		while(true) {	// 무한루프
			System.out.println(Arrays.toString(memberList));
			// 1. 무한출력
			System.out.print("1. 회원가입 : ");
			// 2. 무한입력
				// 1. scanner 객체 : Scanner 변수명 = new Scanner(System.in);
			Scanner sc = new Scanner(System.in);
				// 2. 객체 통한 메소드 호출
			int ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.print("아이디 : ");
				String id = sc.next();
				System.out.print("비밀번호 : ");
				String pw = sc.next();
				// 하나의 문자열로 합치기
				String member = id + "," + pw;	// 쉼표(CSV)로 필드 구분
				// 배열내 비어있는(==null) 인덱스 찾아서 대입
				
				for(int i = 0; i < memberList.length; i++) {
					if(memberList[i] == null) {	// 해당 인덱스가 비어있음
						memberList[i] = member;	// i번재 인덱스에 입력받은 문자열을 저장
						break;
					}	// if end
				}	// for end
				
				
				
			} // if end
			
			
			
		}	// w end
		
		
		
	}	// main e
}	// class e

















