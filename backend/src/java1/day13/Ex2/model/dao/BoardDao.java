package java1.day13.Ex2.model.dao;

import java1.day13.Ex2.model.dto.BoardDto;

public class BoardDao {
	// 싱글톤 사용(o)
	
	private static BoardDao boardDao = new BoardDao();
	
	private BoardDao() {}
	
	public static BoardDao getInstance() {
		return boardDao;
	}
	
}
