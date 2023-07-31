package java1.day13.Ex2.model.dao;

import java.util.ArrayList;

import java1.day13.Ex2.model.dto.BoardDto;

public class BoardDao {
	// 싱글톤 사용(o)
	
	private static BoardDao boardDao = new BoardDao();
	
	private BoardDao() {}
	
	public static BoardDao getInstance() {
		return boardDao;
	}

	public BoardDto[] boardDtoArray = new BoardDto[100];
		// 리스트 : 배열을 쉽게 사용할 수 있도록 다양한 함수 제공
	public ArrayList<BoardDto> boardList = new ArrayList<>(); 
		// ArrayList : 배열처럼 사용가능한 클래스 객체 선언
			//<클래스> : 리스트안에 여러개 객체를 저장할 해당객체의 타입
				// boardList : 리스트 객체변수명
	
	
		
	
	
}
/*
	- 배열 : boardDtoArray
	boardDtoArray = [boardDto] [boardDto] [boardDto] [boardDto]
									0				1				2				3
	
	- 리스트 : boardList
	-------------------
	|	[boardDto]		|
	|	[boardDto]		|
	|	[boardDto]		|
	|	[boardDto]		|
	|	[boardDto]		|
	|	[boardDto]		|
	-------------------
	
	- 리스트 선언방법 : ArrayList<타입명> 리스트객체변수명 = new ArrayList<>();
	
	리스트객체변수명.add(객체명) : 해당 객체를 리스트에 저장(가변길이)
	리스트객체변수명.get(인덱스) : 해당 인덱스의 객체를 반환
	리스트객체변수명.remove(인덱스) : 해당 인덱스의 객체를 리스트에서 삭제
												(중간 객체 삭제해도 자동 채움)
	
 */




















