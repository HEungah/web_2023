package 과제.과제11.view;

import java.util.ArrayList;
import java.util.Scanner;

import 과제.과제11.controller.BoardContoller;
import 과제.과제11.controller.MemberController;
import 과제.과제11.model.dto.BoardDto;
import 과제.과제11.model.dto.MemberDto;
import 과제.과제11.model.dto.MessageDto;

public class LoginPage {
	
	private static LoginPage loginPage = new LoginPage();
	
	public static LoginPage getInstance() {
		return loginPage;
	}
	
	private LoginPage() {}
	
	private Scanner sc = new Scanner(System.in);
	
	public void loginMenu() {	// 로그인했을때 메뉴 페이지
		while(MemberController.getInstance().getLoginSession() != 0) {
			
			boardPrint();
			
			System.out.println("\n\n =====회원제 커뮤니티=====");
			System.out.println("1. 로그아웃 2. 회원정보  3. 글쓰기 4. 글조회 선택");
			System.out.print("선택 >>> ");
			
			try {
				int ch = sc.nextInt();	// 예외처리 필요 (InputMismatchException)
				if(ch == 1) {
					MemberController.getInstance().logOut();
					System.out.println("로그아웃 되었습니다.");
					}
				if(ch == 2) { info();}
				if(ch == 3) { boardWrite(); }
				if(ch == 4) { boardView(); }
				
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
		System.out.println("1. 비밀번호 수정 2. 회원탈퇴 선택 3. 뒤로가기 4. 쪽지확인");
		int ch = sc.nextInt();
		
		if(ch == 1) { infoUpdate(); }
		if(ch == 2) { infoDelete(); }
		if(ch == 3) { return; }	// 생략가능
		if(ch == 4) { messageView(); }
		
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
		System.out.println("\n\n ===== post write ===== ");
		sc.nextLine();
		System.out.print("제목 >>> "); String title  = sc.nextLine();
		System.out.print("내용 >>> "); String content  = sc.nextLine();
		
		boolean result = 
				BoardContoller.getInstance().boardWrite(title, content);
		
		if(result) {System.out.println("안내) 글쓰기 등록 성공");}
		else {System.out.println("안내) 글쓰기 실패 : 제목 필수 입력");}
		
	}
	
	public void boardPrint(){	// 모든 게시물 출력
		System.out.println(" ----- post LIST ----- ");
		// 여러개의 게시물을 요청해서 반환된 결과 저장
		ArrayList<BoardDto> result =
				BoardContoller.getInstance().boardPrint();
		
		// 출력
		System.out.printf("%-4s %-12s %-25s %-30s %s\n", "no", "view", "date", " mid", "title");
		for(int i = 0; i < result.size(); i++) {
			BoardDto dto = result.get(i);
			
			System.out.printf("%-4d %-12d %-25s %-30s %s\n", dto.getBno(), dto.getBview(), dto.getBwriteDate(), dto.getMid(), dto.getBtitle());
		}
		
	}
	
	public void boardView() {	// 개별 게시물 출력
		System.out.println(" ----- post VIEW ----- ");
		// 보고자하는 게시물의 번호를 입력받음
		System.out.println("게시물 번호 : "); int bno = sc.nextInt();
		
		BoardDto result = 
				BoardContoller.getInstance().boardView(bno);
		// 출력
		System.out.printf("bno : %-3s view : %-3s mid : %-10s date : %-19s \n",
				result.getBno(), result.getBview(),
				result.getMid(), result.getBwriteDate());
		System.out.printf("title : %s \n" , result.getBtitle());
		System.out.printf("content : %s \n\n\n" , result.getBcontent());
		
		// 추가메뉴
		System.out.println("1.뒤로가기 2.수정 3.삭제 4.쪽지보내기 선택 > "); int ch = sc.nextInt();
		if(ch == 1) {}
		if(ch == 2) { boardUpdate(bno, result.getMno());}
		if(ch == 3) { boardDelete(bno, result.getMno());}
		if(ch == 4) { messageSend(result.getMno());}
	}
	
	public void boardUpdate(int bno, int mno) {	// 게시물 수정
		
		System.out.println("----- post update -----");
		sc.nextLine();
		System.out.println("수정할 제목 : "); String title = sc.nextLine();
		System.out.println("수정할 내용 : "); String content = sc.nextLine();
		
		int result =
				BoardContoller.getInstance().boardUpdate(bno, mno, title, content);
		if( result == 1) {System.out.println("안내) 글 수정 성공");}
		else if( result == 2) {System.out.println("안내) 글 수정 실패. 관리자에게 문의해주세요");}
		else if( result == 3) {System.out.println("안내) 본인 글만 수정 가능 합니다.");}
		else if( result == 4) {System.out.println("안내) 수정할 제목을 1~50글자 사이로 입력해주세요.");}
	}
	
	public void boardDelete(int bno, int mno) {	// 게시물 삭제
		
		int result =
				BoardContoller.getInstance().boardDelete(bno, mno);
		if( result == 1) {System.out.println("안내) 글 삭제 성공");}
		else if( result == 2) {System.out.println("안내) 글 삭제 실패. 관리자에게 문의해주세요");}
		else if( result == 3) {System.out.println("안내) 본인 글만 삭제 가능 합니다.");}
	}
	
	public void messageSend(int mno) {
		System.out.println("\n\n----- message send -----");
		sc.nextLine();
		System.out.print("게시물 작성자에게 보낼메세지 : ");
		String message = sc.nextLine();
		
		int result = 
				BoardContoller.getInstance().messageSend(mno, message);
		if( result == 1) {System.out.println("안내) 메세지를 보냈습니다.");}
		else if( result == 2) {System.err.println("안내) 메세지 전송 실패. 관리자에게 문의해주세요");}
		else if( result == 3) {System.err.println("안내) 메세지는 1~100글자 사이로 입력해주세요");}
		else if( result == 4) {System.err.println("안내) 메세지는 자신에게 보낼 수 없습니다.");}
		
	}	// messageSend end
	
	// 쪽지 확인
	public void messageView() {
		System.out.println("\n\n----- My message -----");
		
		ArrayList<MessageDto> mDto = 
				BoardContoller.getInstance().messageView();
		for(int i = 0; i < mDto.size(); i++) {
			System.out.printf("%-4s : %s\n", "보낸사람", mDto.get(i).getMname());
			System.out.printf("%-4s : %s\n", "보낸시간", mDto.get(i).getMdate());
			System.out.printf("%-4s : %s\n\n\n", "내용", mDto.get(i).getMcontent());
			
			System.out.print("1. 답장 2. 뒤로가기");	int ch = sc.nextInt();
			System.out.println();
			
			if(ch == 1) { messageSend(mDto.get(0).getMsend());}
			if(ch == 2) {}
		}
		
	}

}

















