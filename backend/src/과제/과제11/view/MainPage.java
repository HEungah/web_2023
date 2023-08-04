package 과제.과제11.view;

import java.util.InputMismatchException;
import java.util.Scanner;

import 과제.과제11.controller.MemberController;

public class MainPage {
	
	// 싱글톤패턴
	private static MainPage mainPage = new MainPage();
	
	public static MainPage getInstance() {
		return mainPage;
	}
	
	private MainPage() {}
	
	// 0. 입력객체
	private Scanner sc = new Scanner(System.in);
	
	// 메인메뉴
	public void mainView() {
		while(true) {
			System.out.println("\n\n =====회원제 커뮤니티=====");
			System.out.print("1. 회원가입 2. 로그인  선택 >>>");
			try {
				int ch = sc.nextInt();	// 예외처리 필요 (InputMismatchException)
				if(ch == 1) { signupView(); }
				if(ch == 2) { loginView();}
				
			} catch(InputMismatchException e) {
				System.out.println("경고) 잘못된 입력값입니다.");
				sc = new Scanner(System.in);	// 입력객체의 메모리를 새롭게 만들어주기
			} // catch end
			
		}
	}
	
	// 회원가입
	public void signupView() {
		System.out.print("아이디를 입력해주세요 >>> "); String inputId = sc.next(); 
		System.out.print("비밀번호를 입력해주세요 >>> "); String inputPw = sc.next(); 
		System.out.print("이름을 입력해주세요 >>> "); String inputName = sc.next(); 
		System.out.print("전화번호를 입력해주세요 >>> "); String inputPnum = sc.next();
		
		// 입력값을 전달하고 결과값을 반환받음
		boolean result = MemberController.getInstance().signupLogic(inputId, inputPw, inputName, inputPnum);
		
		if(result) {
			System.out.println("안내) 회원가입 성공");
		}else {
			System.out.println("경고) 회원가입 실패");
		}
		
		
	}
	
	// 로그인
	public void loginView() {
		System.out.print("아이디를 입력해주세요 >>> "); String inputId = sc.next(); 
		System.out.print("비밀번호를 입력해주세요 >>> "); String inputPw = sc.next(); 
		
		boolean result = MemberController.getInstance().loginLogic(inputId, inputPw);
		
		if(result) {
			System.out.println("안내) 로그인 성공");
		}else {
			System.out.println("경고) 로그인 실패");
		}
		
	}

}
