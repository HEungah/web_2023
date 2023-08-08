package 과제.과제11.view;

import java.util.Scanner;

import 과제.과제11.controller.MemberController;
import 과제.과제11.model.dto.MemberDto;

public class LoginPage {
	
	private static LoginPage loginPage = new LoginPage();
	
	public static LoginPage getInstance() {
		return loginPage;
	}
	
	private LoginPage() {}
	
	private Scanner sc = new Scanner(System.in);
	
	public void loginMenu() {	// 로그인했을때 메뉴 페이지
		while(MemberController.getInstance().getLoginSession() != 0) {
			
			System.out.println("\n\n =====회원제 커뮤니티=====");
			System.out.println("1. 로그아웃 2. 회원정보  3. 글쓰기");
			System.out.print("선택 >>> ");
			
			try {
				int ch = sc.nextInt();	// 예외처리 필요 (InputMismatchException)
				if(ch == 1) {
					MemberController.getInstance().logOut();
					System.out.println("로그아웃 되었습니다.");
					}
				if(ch == 2) { info();}
				if(ch == 3) { boardWrite(); }
			}catch(Exception e) {
				System.out.println("경고) 잘못된 입력입니다.");
			}
		}
		
	}
	
	public void info() {	// 회원정보 페이지
		System.out.println("\n\n ===== 회원정보 =====");
		// 컨트롤에게 회원정보 요청해서 반환 받기
		MemberDto result = MemberController.getInstance().info();
		
		// 반환받은 회원정보객체[memberDto] 의 각 필드를 출력
		System.out.println(">ID : " + result.getMid());	// DTO 필드에 직접접근 불가능
		System.out.println(">NAME : " + result.getMname());
		System.out.println(">PHONE : " + result.getMpnum());
		
		// 서브메뉴
		System.out.println("\n\n ======================");
		System.out.println("1. 비밀번호 수정 2. 회원탈퇴 선택 3. 뒤로가기");
		int ch = sc.nextInt();
		
		if(ch == 1) { infoUpdate();}
		if(ch == 2) { infoDelete(); }
		if(ch == 3) {return;}	// 생략가능
		
	}
	
	public void infoUpdate() {	// 회원정보수정페이지
		System.out.println("\n\n ===== 회원정보수정 =====");
		System.out.print("새로운 비밀번호 >>> "); String newPw = sc.next();
		
		boolean result = MemberController.getInstance().infoUpdate(newPw);
		
		if(result) {
			System.out.println("안내) 비밀번호 수정완료. 로그아웃됩니다.");
			MemberController.getInstance().logOut();
		}else {
			System.out.println("안내) 비밀번호 수정실패. 관리자에게 문의하세요");
		}
		
		
	}
	
	public void infoDelete() {	 // 회원탈퇴 페이지
		System.out.println("\n\n ===== 회원탈퇴 ===== ");
		System.out.print("정말 탈퇴하시겠습니까? 회원정보는 복구 불가합니다 1. 예 2. 아니오");
		int ch = sc.nextInt();
		if(ch == 1) {
			Boolean result = MemberController.getInstance().infoDelete();
			if(result) {
				System.out.println("안내 ) 회원탈퇴완료. 로그아웃됩니다.");
				MemberController.getInstance().logOut();
			}
			else {System.out.println("안내) 회원탈퇴실패. 관라자에게 문의하세요");}
		}
		
	}
	
	public void boardWrite() {	// 게시물쓰기 페이지
		
		
	}
	
	public void boardPrint(){	// 모든 게시물 출력
	
		
	}
	
	public void boardView() {	// 개별 게시물 출력
		
		
	}
	
	public void boardUpdate() {	// 게시물 수정
		
		
	}
	
	public void boardDelete() {	// 게시물 삭제
		
	}

}
