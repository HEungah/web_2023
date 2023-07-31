package java1.day13.Ex2.controller;

public class BoardController {
	// 싱글톤 사용(o)
	
	// private 접근제한자로 필드 접근 차단
	private static BoardController boardControoler = new BoardController();
	
	// 생성자로 객체생성 차단
	private BoardController() {}
	
	// 메소드로만 필드 사용
	public static BoardController getInstance() {
		return boardControoler;
	}
	
	// 글등록 처리 기능함수
	
	// 글출력 처리 기능함수
	
	// 글삭제 처리 기능함수
	
	// 글수정 처리 기능함수
	
	
}
