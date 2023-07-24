package java1.day08.Ex5;

import java.util.Arrays;
import java.util.Scanner;

public class Ex5_객체배열 {
	public static void main(String[] args) {	// 실행 클래스
		
		Member[] memberList = new Member[100];	// member 객체 100개를 저장할수 있는 배열
		
		while(true) {	// 무한루프
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
				System.out.print("이름 : ");
				String name = sc.next();
				// 1. 객체화
				Member m = new Member();	// 객체 생성
				m.id = id; m.pw = pw; m.name = name;

				// 2. 배열에 저장
				for(int i = 0; i < memberList.length; i++) {
					if(memberList[i] == null) {
						memberList[i] = m;
						System.out.println(memberList[i].id);
						System.out.println(memberList[i].pw);
						System.out.println(memberList[i].name);
						break;
					}
				}

				
				
				
			} // if end
			
			
			
		}	// w end
		
		
		
	}
}
