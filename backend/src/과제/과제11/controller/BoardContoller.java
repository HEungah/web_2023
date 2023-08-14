package 과제.과제11.controller;

import java.util.ArrayList;

import 과제.과제11.model.dao.BoardDao;
import 과제.과제11.model.dto.BoardDto;
import 과제.과제11.model.dto.MessageDto;

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
	
	public int boardUpdate(int bno, int mno, String title, String content) {	// 게시물 수정
		// 1. 유효성 검사
		
		if(mno != MemberController.getInstance().getLoginSession()) {return 3;}
		if(title.length() < 1 || title.length() > 50) {return 4;}
		
		boolean result = BoardDao.getInstance().boardUpdate(new BoardDto(bno,title,content));
		
		if(result) {return 1;}
		else {return 2;}
		
	}
	
	// 게시물삭제 [매개변수 : bno(누구를 삭제할건지), mno(삭제요청한 회원과 게시물의 작성자가 일치한 경우에만 삭제)]
	public int boardDelete(int bno, int mno) {	// 게시물 삭제
		// 1. 유효성 검사
		if(mno != MemberController.getInstance().getLoginSession()) {return 3;}
		
		boolean result = BoardDao.getInstance().boardDelete(bno);
		
		if(result) {return 1;}
		else {return 2;}
	}
	
	// 쪽지 보내기
	public int messageSend(int mno, String message) {
		
		if(message.length() < 1 || message.length() > 100 ) {return 3;}
		if(mno == MemberController.getInstance().getLoginSession()) {return 4;}
		
		boolean result = BoardDao.getInstance().messageSend(MemberController.getInstance().getLoginSession(), mno, message);
				
		if(result) {return 1;}
		else {return 2;}
	}
	
	// 내 쪽지함 보기
	public ArrayList<MessageDto> messageView(){
		
		
		return BoardDao.getInstance().messageView(MemberController.getInstance().getLoginSession());
	}
}















