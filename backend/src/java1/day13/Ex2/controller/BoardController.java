package java1.day13.Ex2.controller;

import java1.day13.Ex2.model.dao.BoardDao;
import java1.day13.Ex2.model.dto.BoardDto;

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
	public boolean writeLogic(String writer, String content) {
		
		// 1. 매개변수로 부터 전달 받은 writer, content 를 하나의 객체로 선언
		BoardDto boardDto = new BoardDto(writer, content);
		
		// 2. 객체를 리스트에 저장
		int size = BoardDao.getInstance().boardList.size();
		BoardDao.getInstance().boardList.add(boardDto);
		if(BoardDao.getInstance().boardList.size() == (size + 1)) {
			return true;
		}
		

		return false;
	}
	
	
	// 글출력 처리 기능함수
	public BoardDto printLogic(int index) {
			int viewCount = BoardDao.getInstance().boardList.get(index-1).getView();
			BoardDao.getInstance().boardList.get(index-1).setView(viewCount+1);
			return BoardDao.getInstance().boardList.get(index-1);
	}
	
	
	// 글수정 처리 기능함수
	public boolean updateLogic(int index, String writer, String content) {	// 매개변수 받아옴
		
		BoardDto updateDto = new BoardDto(writer, content);
		
		if(BoardDao.getInstance().boardList.size() > 0 && (index - 1) < BoardDao.getInstance().boardList.size()) {
			if((index-1) >= 0 && (index-1) < BoardDao.getInstance().boardList.size()) {
				BoardDao.getInstance().boardList.set(index-1, updateDto);
				return true;
			}	
		}
		
		
		return false;
	}
	
	
	
	// 글삭제 처리 기능함수
	public boolean deleteLogic(int index) {
		
		int size = BoardDao.getInstance().boardList.size();
		if(size > 0 && size > index -1) {
			BoardDao.getInstance().boardList.remove(index-1);
			if(BoardDao.getInstance().boardList.size() == (size - 1)) {
				return true;
			}
		}
		
		return false;
	}
	
	
}











