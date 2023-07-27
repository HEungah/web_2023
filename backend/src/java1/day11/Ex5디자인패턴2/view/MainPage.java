package java1.day11.Ex5디자인패턴2.view;

import java.util.Scanner;

import java1.day11.Ex5디자인패턴2.controller.MemberController;

public class MainPage {	// view
	// 0. 싱글톤 생성 -> 디자인패턴
		// 1. 현재 클래스로 static 객체 생성
	private static MainPage mainpage = new MainPage();
		// 2. 외부 객체에서 해당 싱글톤 호출하기 위한 메소드
	public static MainPage getInstance() {
		return mainpage;
	}
		// 3. 객체 외부에서 해당 클래스로 객체 생성 잠금, 생성자를 private
	private MainPage() {}	
	
	// 필드
	private Scanner sc = new Scanner(System.in);
	// 생성자
	
	// 함수
	public void mainPage() {
		
		while(true) {
			
			System.out.println("\n\n--------- 회원 시스템 ---------"); 
			System.out.print("1.회원가입 2.로그인 3.아이디찾기 4.비밀번호찾기    선택> ");
			int ch = sc.nextInt(); 
			
			if( ch == 1 ) {singupPage(); }
			else if( ch == 2 ) {loginPage(); } 
			else if( ch == 3 ) {findIdPage(); } 
			else if( ch == 4 ) { findPwPage(); }
			
		} // while e
	} // mainPage() end
	void singupPage() {
		System.out.print("아이디를 입력해주세요 >>> "); String inputId = sc.next();
		System.out.print("비밀번호를 입력해주세요 >>> "); String inputPw = sc.next();
		System.out.print("이름을 입력해주세요 >>> ");	String inputName = sc.next();
		System.out.print("전화번호를 입력해주세요 >>> "); String inputPnum = sc.next();
		System.out.print("나이를 입력해주세요 >>> ");	int inputAge = sc.nextInt();
		// ---> controller에게 전달
		// controller 내 메소드 호출
		boolean singup = MemberController.getInstance().singupLogic(inputId, inputPw, inputName,inputPnum, inputAge);
		if(singup) {
			System.out.println("회원가입이 완료되었습니다.");
		}else {
			System.out.println("회원가입에 실패하였습니다.");
		}
	}	// singupPage() end
	
	void loginPage() {
		System.out.print("아이디를 입력해주세요 >>> "); String inputId = sc.next();
		System.out.print("비밀번호를 입력해주세요 >>> "); String inputPw = sc.next();
		boolean login = MemberController.getInstance().loginLogic(inputId, inputPw);
		if(login) {
			System.out.println("로그인되었습니다.");
		}else {
			System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
		}
	}	// loginPage() end
	
	void findIdPage() {
		System.out.print("이름을 입력해주세요 >>> ");	String inputName = sc.next();
		System.out.print("전화번호를 입력해주세요 >>> "); String inputPnum = sc.next();
		String findId = MemberController.getInstance().findIdLogic(inputName, inputPnum);
		if(findId == "-1") {
			System.out.println("일치하는 정보가 없습니다.");
		}else {
			System.out.println("회원님의 아이디는 " + findId + "입니다.");
		}
	}	// findIdPage() end
	
	void findPwPage() {
		
		
	}
}











