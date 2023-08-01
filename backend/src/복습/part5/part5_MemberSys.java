package 복습.part5;

import java.util.Scanner;

public class part5_MemberSys {
	public static void main(String[] args) {
		
		part5_Member[] memberList = new part5_Member[100];
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("------------회원시스템----------");
			System.out.print("1. 회원가입 2. 로그인  선택 >>> ");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				System.out.print("아이디를 입력해주세요 >>> "); String idInput = sc.next();
				System.out.print("비밀번호를 입력해주세요 >>> "); String pwInput = sc.next();
				System.out.print("이름을 입력해주세요 >>> "); String nameInput = sc.next();
				System.out.print("전화번호를 입력해주세요 >>> "); String pnumInput = sc.next();
				System.out.print("나이를 입력해주세요 >>> "); int ageInput = sc.nextInt();
				
				part5_Member member = new part5_Member(idInput, pwInput, nameInput, pnumInput, ageInput);
				
				for(int i = 0; i < memberList.length; i++) {
					if(memberList[i] == null) {
						memberList[i] = member;
						System.out.println("회원가입이 완료되었습니다.");
						break;
					}
				}	// for end
				
			}	// if end
			
			if(ch == 2) {
				int login = -1;
				System.out.print("아이디를 입력해주세요 >>> "); String idInput = sc.next();
				System.out.print("비밀번호를 입력해주세요 >>> "); String pwInput = sc.next();
				
				for(int i = 0; i < memberList.length; i++) {
					if(memberList[i] != null &&
							memberList[i].id.equals(idInput) &&
							memberList[i].pw.equals(pwInput)) {
							login = i;
					}
				}	// for end
				
				if(login >= 0) {
					System.out.println("로그인 성공");
				}else {
					System.out.println("로그인 실패");
				}
			}
			
		}	// while end
		
	}	// main end

}
