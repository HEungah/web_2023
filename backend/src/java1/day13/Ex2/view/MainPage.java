package java1.day13.Ex2.view;

import java.util.Scanner;

import java1.day13.Ex2.controller.BoardController;
import java1.day13.Ex2.model.dao.BoardDao;
import java1.day13.Ex2.model.dto.BoardDto;

public class MainPage {
	// 싱글톤 사용(o)
	
	// 본인 클래스안에 본인 객체 생성(private)
	private static MainPage mainPage = new MainPage();
	private Scanner sc = new Scanner(System.in);
	
	// 외부에서 객체 생성을 차단하는 private 생성자
	private MainPage() {}
	
	// 외부에서 간접적으로 객체가 호출할수있도록 함
	public static MainPage getInstance() {
		return mainPage;
	}
	
	public void mainView() {
		while(true) {
			System.out.println("\n\n >>>>> 방문록 프로그램 >>>>>");
			System.out.println("1. 글등록 2. 글보기 3. 글수정 4. 글삭제");
			System.out.print("입력 >>>> "); int ch = sc.nextInt();
			
			if(ch == 1) { writeView(); }
			if(ch == 2) { printView(); }
			if(ch == 3) { updateView(); }
			if(ch == 4) { deleteView(); }
			
		}	// while end
	}
	// 글등록 페이지 입출력 함수
	public void writeView() {
		sc.nextLine(); // scanner 버퍼 비우기
		System.out.print("작성자 >>> ");	String writer = sc.nextLine();	// nextLine() 앞뒤로 다른 next()가 있을때 하나의 입력으로 인식함
		System.out.print("글내용 >>> ");	String content = sc.nextLine();
		
		
		// V -> C
		// 입력받은 변수를 컨트롤에게 전달
		boolean result = BoardController.getInstance().writeLogic(writer, content);
		
		
		// 컨트롤에게 전달받은 내용 제어하기
		if(result) {
			System.out.println("안내) 등록에 성공하였습니다.");
			System.out.println(BoardDao.getInstance().boardList);
		}else {
			System.out.println("안내) 등록에 실패하였습니다.");
		}
	}
	
	// 글출력 페이지 입출력 함수
	public void printView() {
		System.out.print("출력할 게시물 번호 >>> "); int index = sc.nextInt();
		System.out.println("작성자\t\t내용\t\t조회수");
		BoardDto boardDto = BoardController.getInstance().printLogic(index);
		// 전달받은 결과를 출력
		System.out.println(boardDto.getWriter() + "\t\t"
				+ boardDto.getContent() + "\t\t" + boardDto.getView());
	}
	// 글수정 페이지 입출력 함수
	public void updateView() {
		System.out.print("수정할 게시물 번호 >>> "); int index = sc.nextInt();
		System.out.print("수정할 게시물 작성자 >>> "); String writer = sc.next();
		System.out.print("수정할 게시물 내용 >>> "); String content = sc.next();
		
		// 입력받은 변수를 전달(int, String, String)하고 결과를 반환(boolean)받음
		boolean result = BoardController.getInstance().updateLogic(index, writer, content);
		
		if(result) {
			System.out.println("게시물이 수정되었습니다.");
		}else {
			System.out.println("게시물 수정에 실패되었습니다.");
		}
	}
	
	
	// 글삭제 페이지 입출력 함수
	public void deleteView() {
		System.out.print("삭제할 게시물 번호 >>> "); int index = sc.nextInt();	
		boolean result = BoardController.getInstance().deleteLogic(index);
		
		if(result) {
			System.out.println("게시물이 삭제되었습니다.");
		}else {
			System.out.println("게시물 삭제에 실패했습니다.");
		}
	}
	
}
















