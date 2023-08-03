package 복습.part6;

import java.util.Scanner;

public class MemberSys {
	
	static Member[] memberList = new Member[100];
	static Scanner sc = new Scanner(System.in);
	static int login = -1;
	
	public static void main(String[] args) {
		
		while(true) {
			System.out.println("-------------------------메뉴-----------------------");
			System.out.print("1. 회원가입 2. 로그인 3. 아이디찾기 4. 비밀번호찾기 >>> 입력 ");
			int ch = sc.nextInt();
			
			if(ch == 1) {회원가입();}
			if(ch == 2) {로그인();}
			if(ch == 3) {아이디찾기();}
			if(ch == 4) {비밀번호찾기();}
			
		}
		

		
	} // main end
	
	static void 회원가입() {
		System.out.print("아이디를 입력해주세요 : "); String inputId = sc.next();
		System.out.print("비밀번호를 입력해주세요 : "); String inputPw = sc.next();
		System.out.print("이름을 입력해주세요 : "); String inputName = sc.next();
		System.out.print("전화번호를 입력해주세요 : "); String inputPnum = sc.next();
		System.out.print("나이를 입력해주세요 : "); int inputAge = sc.nextInt();
		
		Member member = new Member(inputId, inputPw, inputName, inputPnum, inputAge);
		for(int i = 0; i < memberList.length; i++) {
			if(memberList[i] == null) {
				memberList[i] = member;
				System.out.println("회원가입이 완료되었습니다.");
				return;
			}
		}
		
		System.out.println("회원가입에 실패했습니다.");


	}
	
	static void 로그인() {
		System.out.print("아이디를 입력해주세요 : "); String inputId = sc.next();
		System.out.print("비밀번호를 입력해주세요 : "); String inputPw = sc.next();
		
		for(int i = 0; i < memberList.length; i++) {
			if(memberList[i] != null &&
					memberList[i].id.equals(inputId) &&
					memberList[i].pw.equals(inputPw) ) {
				System.out.println("로그인에 성공했습니다.");
				login = i;
				return;
			}
		}	// for end
		
		System.out.println("로그인에 실패했습니다.");
		
	}
	
	static void 아이디찾기() {
		System.out.print("이름을 입력해주세요 : "); String inputName = sc.next();
		System.out.print("전화번호를 입력해주세요 : "); String inputPnum = sc.next();
		
		for(int i = 0; i < memberList.length; i++) {
			if(memberList[i] != null &&
					memberList[i].name.equals(inputName) &&
					memberList[i].pnum.equals(inputPnum) ) {
				System.out.println("회원님의 아이디는 " + memberList[i].id + "입니다.");
				return;
			}
		}	// for end
		
		System.out.println("정보와 일치하는 아이디가 존재하지 않습니다.");
	}
	
	static void 비밀번호찾기() {
		System.out.print("아이디를 입력해주세요 : "); String inputId = sc.next();
		System.out.print("전화번호를 입력해주세요 : "); String inputPnum = sc.next();
		
		for(int i = 0; i < memberList.length; i++) {
			if(memberList[i] != null &&
					memberList[i].id.equals(inputId) &&
					memberList[i].pnum.equals(inputPnum) ) {
				System.out.println("회원님의 비밀번호는 " + memberList[i].pw + "입니다.");
				return;
			}
		}	// for end
		System.out.println("정보와 일치하는 비밀번호가 존재하지 않습니다.");
	}
}
