package 과제.과제10;

import java.util.Arrays;	// 현재 클래스에서 다른 패키지에 있는 클래스를 명시 = > import
import java.util.Random;		// java.lang은 기본패키지이므로 생략 (String, System 등)
import java.util.Scanner;	// 자동완성 이용한 클래스 작성하면 자동으로 import
import java.util.*;			// 해당 패키지내 모든 클래스 호출

import 과제.과제9.Member;


public class MemberSys {
	
	static Member2[] memberList = new Member2[100];
	static Scanner sc = new Scanner(System.in);	// 모든 함수에서 사용 가능한 인스턴스 멤버
	static int login = -1;
	
	public static void main(String[] args) {	// static ---> 우선적으로 할당
		
		while(true) {
			
			System.out.println("\n\n--------- 회원 시스템 ---------"); 
			if(login < 0) {
				System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기    선택> ");
			}else {
				System.out.print("5.회원정보조회 6.로그아웃    선택> ");
			}
			int ch = sc.nextInt(); 	// 입력객체의 사용 구역 범위 설계 [ 프로그램내 전역구역 = static ] 
			
			if( ch == 1 ) { 회원가입 (); }
			else if( ch == 2 ) { 로그인 (); } 
			else if( ch == 3 ) { 아이디찾기 (); } 
			else if( ch == 4 ) { 비밀번호찾기 (); }
			else if( ch == 5 ) { 회원정보조회 (); }
			else if( ch == 6 ) { 로그아웃 ();}
			
		} // w e
		
	}	// main end
	
	static void 회원가입 () {
		// Scanner 객체를 static 으로 생성했기 때문에 다른 함수에서도 사용가능하다.
		System.out.print("아이디를 입력해주세요 >>> "); String inputId = sc.next();
		System.out.print("비밀번호를 입력해주세요 >>> "); String inputPw = sc.next();
		System.out.print("이름을 입력해주세요 >>> ");	String inputName = sc.next();
		System.out.print("전화번호를 입력해주세요 >>> "); String inputPnum = sc.next();
		System.out.print("나이를 입력해주세요 >>> ");	int inputAge = sc.nextInt();
		
		// 입력받은 변수를 하나의 묶음으로 만듬 --> 객체
		Member2 member = new Member2(inputId, inputPw, inputName, inputPnum, inputAge);
		
		// 회원의 1개의 객체를 객체배열에 저장
		for(int i = 0; i<memberList.length; i++) {
			if(memberList[i] == null) {
				memberList[i] = member;
				System.out.println("회원가입이 완료되었습니다.");
				System.out.println(memberList[i]);
				break;
			}
		}
	}	// 회원가입 function end
	
	static void 로그인 () { 
		System.out.print("아이디를 입력해주세요 >>> "); String inputId = sc.next();
		System.out.print("비밀번호를 입력해주세요 >>> "); String inputPw = sc.next();
		
		for(int i = 0; i < memberList.length; i++) {
			if(memberList[i] != null &&
					memberList[i].id.equals(inputId) && memberList[i].pw.equals(inputPw)) {
				login = i;
				break;
			}
		}	// for end
		if(login >= 0) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
	}	// 로그인 function end
	
	static void 아이디찾기 () {
		System.out.print("이름을 입력해주세요 >>> ");	String inputName = sc.next();
		System.out.print("전화번호를 입력해주세요 >>> "); String inputPnum = sc.next();
		
		for(int i = 0; i < memberList.length; i++){
			if(memberList[i] != null &&
					memberList[i].name.equals(inputName) && memberList[i].pnum.equals(inputPnum)) {
				System.out.println("회원님의 아이디는 " + memberList[i].id + "입니다.");
				return;
			}
		}	// for end
		System.out.println("등록되지 않은 정보입니다.");
		
	}	// 아이디찾기 function end
	
	static void 비밀번호찾기 () { 
		Random random = new Random();
		System.out.print("아이디를 입력해주세요 >>> "); String inputId = sc.next();
		System.out.print("전화번호를 입력해주세요 >>> "); String inputPnum = sc.next();
		
		String temPw = "";
		
		for(int i = 0; i < memberList.length; i++){
			if(memberList[i] != null &&
					memberList[i].id.equals(inputId) && memberList[i].pnum.equals(inputPnum)) {
				for(int j = 0; j < 4; j++) {
					
					char a = (char) (random.nextInt(26) + 97);
					temPw += a;
				}
				memberList[i].pw = temPw;
				System.out.println("임시비밀번호는 " + temPw + "입니다.");
				return;
			}
		}	// for end
		
		System.out.println("등록되지 않은 정보입니다.");
		
		
	}	// 비밀번호찾기 function end
	
	static void 회원정보조회() {
		System.out.println(memberList[login]);
	}	// 회원정보조회() end
	
	static void 로그아웃() {
		login = -1;
	}	// 로그아웃() end
	
}	// class end
/*
	주제 : 회원제 시스템 
		0. 회원클래스 설계 = Member
			아이디 , 비밀번호 , 이름 , 전화번호 , 나이
		0. Member 객체를 여러개 저장하는 배열 
			Member[] 객체배열 = new Member[100];
		
		1. 초기 메뉴 [ 24시간 ]
			1. 회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기
			
		2. 조건 기능 
			1. 회원가입 메소드 
				1. 아이디 , 비밀번호 , 이름 , 전화번호 , 나이  각 입력받아 저장 
				2. Member 객체화
				3. 객체를 배열 저장 
				 
			2. 로그인 메소드
				1. 아이디 , 비밀번호 입력받아 저장 
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 로그인 성공 
					- 아니면 실패
					 
			3. 아이디찾기 메소드
				1. 이름 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 찾은 아이디 출력 
					- 아니면 없다.
					 
			4. 비밀번호찾기 메소드 
				1. 아이디 , 전화번호 입력받아 저장
				2. 입력받은 값과 배열내 동일한 값 찾기
					- 만약에 동일한 값 있으면 *임시 비밀번호(문자4자리 난수생성 ) 업데이트후 출력 
					- 아니면 없다.
*/














