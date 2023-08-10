package 과제.과제11.controller;

import java.util.ArrayList;

import 과제.과제11.model.dao.BoardDao;
import 과제.과제11.model.dto.BoardDto;

public class BoardContoller {
	
	private static BoardContoller boardController = new BoardContoller();
	
	public static BoardContoller getInstance() {
		return boardController;
	}
	
	private BoardContoller() {}

	
	public boolean boardWrite(String title, String content) {	// 게시물쓰기
		
		// 유효성 검사
		if(title.length() == 0 || title.length() > 50) {return false;}
		// Dto 생성
		BoardDto boardDto = new BoardDto(title, content, MemberController.getInstance().getLoginSession());
		
		return BoardDao.getInstance().boardWrite(boardDto);
	}
	
	public ArrayList<BoardDto> boardPrint(){	// 모든 게시물 출력
		return BoardDao.getInstance().boardPrint();
	}
	
	public BoardDto boardView(int bno) {	// 개별 게시물 출력
		
		return BoardDao.getInstance().boardView(bno);
	}
	
	public void boardUpdate() {	// 게시물 수정
		
		
	}
	
	public void boardDelete() {	// 게시물 삭제
		
	}
}
