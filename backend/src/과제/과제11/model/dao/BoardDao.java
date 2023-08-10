package 과제.과제11.model.dao;

import java.util.ArrayList;

import 과제.과제11.model.dto.BoardDto;

public class BoardDao extends Dao{
	
	private static BoardDao boardDao = new BoardDao();
	
	public static BoardDao getInstance() {
			return boardDao;
	}
		
	private BoardDao() {}
	
	
	public boolean boardWrite(BoardDto boardDto) {	// 게시물쓰기
		
		try {
			// sql 작성
			String sql = "insert into board(btitle, bcontent, mno) values(?, ?, ?)";
			
			ps = conn.prepareStatement(sql);
			
			ps.setString(1, boardDto.getBtitle());
			ps.setString(2, boardDto.getBcontent());
			ps.setInt(3, boardDto.getMno());
			
			int row = ps.executeUpdate();
			
			if( row == 1) {
				return true;
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
			
		return false;
	}
	
	public ArrayList<BoardDto> boardPrint(){	// 모든 게시물 출력
		
		ArrayList<BoardDto> list = new ArrayList<>();
		try {
			// 여러개 BoardDto를 저장할 리스트객체 선언
			String sql = "select b.*, m.mid from member m, board b where m.mno = b.mno order by b.bwriteDate desc;  ";
			ps = conn.prepareStatement(sql);
			// sql에 ?(매개변수) 없으므로 set~ 생략
			rs = ps.executeQuery(); // 검색 결과의 레코드를 여러개 조작하기 위해 resultSet 객체 반환
			while(rs.next()) { // 마지막 레코드까지 하나씩 레코드 이동
				// 레코드 1개마다 1개의 DTO 변환
				// 필드 순서에 따른 필드 값 호출 : rs.get타입(필드순서번호)
				BoardDto dto = new 
						BoardDto(rs.getInt(1), rs.getString(2), rs.getString(3), 
								rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7));
				// 변환된 DTO를 list 객체에 저장
				list.add(dto);
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return list;
	}
	
	public BoardDto boardView(int bno) {	// 개별 게시물 출력
		
		try {
			
			String sql = "select b.*, m.mid from board b natural join member m where "
					+ "b.bno = ? order by b.bwriteDate desc limit 3";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, bno);
			rs = ps.executeQuery();
			
			if(rs.next()) {
				// 레코드 1개 -> dto 로 변경
				BoardDto dto = new 
						BoardDto(rs.getInt(1), rs.getString(2), rs.getString(3), 
								rs.getString(4), rs.getInt(5), rs.getInt(6), rs.getString(7));
				
				dto.setBview(boardViewCount(rs.getInt(5), bno));	// 조회수 증가 함수 호출
				return dto;
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		return null;
	}
	
	// 조회수 증가함수
	public int boardViewCount(int view, int bno) {
		try {
			
			int count = view +1;
			String sql = "update board set bview = ? where bno = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, count);
			ps.setInt(2, bno);
			int row = ps.executeUpdate();
			
			if(row == 1) {
				return count;
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		return view;
	}
	
	public void boardUpdate() {	// 게시물 수정
		
		
	}
	
	public void boardDelete() {	// 게시물 삭제
		
	}

}


/*
		테이블
			레코드/행가로 -> DTO 1개
			레코드/행가로 -> DTO 1개	여러개 DTO 하나의 객체로 담기 => 리스트 혹은 배열
			레코드/행가로 -> DTO 1개
			
		예)
			로그인한 회원정보조회 -> DTO
			관리자가 모든회원정보조회 = ArrayList<DTO>
			
			개별 게시물 1개 출력 = DTO
			모든 게시물 여러개 출력 =ArrayList<DTO>
 */










