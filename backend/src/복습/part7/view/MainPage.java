package 복습.part7.view;

import java.util.Scanner;

import 복습.part7.controller.MemberController;

public class MainPage {
	
	private static MainPage mainPage = new MainPage();
	
	private MainPage() {};
	
	public static MainPage getInstance() {
		return mainPage;
	}
	
	static Scanner sc = new Scanner(System.in);
	
	public void menu() {
		while(true) {
			System.out.println("-----------------------메뉴---------------------");
			System.out.print("1. 회원가입 2. 로그인 입력 >>> "); int ch = sc.nextInt();
			
			if(ch == 1) {singUp();}
			if(ch == 2) {login();}

			
		}
	} // menu end
	
	public void singUp() {
		System.out.print("아이디를 입력해주세요 >>> "); String inputId = sc.next();
		System.out.print("비밀번호를 입력해주세요 >>> "); String inputPw = sc.next();
		System.out.print("이름을 입력해주세요 >>> "); String inputName = sc.next();
		System.out.print("전화번호를 입력해주세요 >>> "); String inputPnum = sc.next();
		System.out.print("나이를 입력해주세요 >>> "); int inputAge = sc.nextInt();
		
		boolean result = MemberController.getInstance().singUpLogic(inputId, inputPw, inputName, inputPnum, inputAge);
		
		if(result) {
			System.out.println("회원가입이 완료되었습니다.");
		}else {
			System.out.println("회원가입에 실패하였습니다.");
		}
	}
	
	public void login() {
		System.out.print("아이디를 입력해주세요 >>> "); String inputId = sc.next();
		System.out.print("비밀번호를 입력해주세요 >>> "); String inputPw = sc.next();
		
		boolean result = MemberController.getInstance().loginLogic(inputId, inputPw);
		
		if(result) {
			System.out.println("로그인에 성공하였습니다");
		}else {
			System.out.println("로그인에 실패하였습니다.");
		}
		
	}


}
