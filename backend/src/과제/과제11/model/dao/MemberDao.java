package 과제.과제11.model.dao;

import 과제.과제11.model.dto.MemberDto;

public class MemberDao extends Dao{
	
	private static MemberDao memberDao = new MemberDao();
	
	public static MemberDao getInstance() {
			return memberDao;
	}
		
	private MemberDao() {}
	
	
	
	public boolean signupSQL(MemberDto member) {
		// 회원가입 필요한 SQL 작성
		String sql = "insert into member(mid, mpw, mname, mpnum) values(?, ?, ?, ?)";
		
		try {
		// 위에서 작성한 SQL을 DB연동객체에 대입
		ps = conn.prepareStatement(sql);
		// conn, ps 필드는 Dao 에게 상속받음
		// db연동객체.prepareStatement(조작할 SQL 문자열)
		
		// 대입된 SQL을 조작하기 위해 반환된 prepareStatement를 ps에 대입
		
		// SQL에서 작성한 매개변수(?) 에 대해 값 대입
		ps.setString(1, member.getMid());
		ps.setString(2, member.getMpw());
		ps.setString(3, member.getMname());
		ps.setString(4, member.getMpnum());
		
		// SQL 실행		[ ps.executeUpdate(); ---> SQL실행 ]
		ps.executeUpdate();	// 정상실행되면 1을 리턴
		// 리턴 (회원가입 성공 -> true , 회원가입 실패 -> false)
		return true;
		}catch(Exception e) {
			return false;
		}
	}
	
	public int loginSQL(String id, String pw) {
		try {
			// SQL 작성 [ mysql 워크벤치에서 임의의값으로 테스트 권장 ]
			String sql = "select*from member where mid = ? and mpw = ?";
			
			// SQL 조작할수 있는 객체 PreparedStatement 반환 받기
			ps = conn.prepareStatement(sql);
			
			
			// SQL 조작[ SQL 안에 있는 매개변수[?] 에 값 대입 ]
			ps.setString(1, id);
			ps.setString(2, pw);
			
			// SQL 실행해서 그 결과객체를 rs객체에 대입 (ps객체는 결과를 조작할 수 없음)
			// [insert/update/delete : ps.executeUpdate();  / select : ps.executeQuery(); ]
			rs = ps.executeQuery();		// 반환값이 ResultSet
			
			// SQL 실행 결과 조작 [ rs.next() : 결과중에서 다음 레코드객체 호출 ]
				// 만약 결과의 레코드가 3개이면 [ rs = null -> 레코드1 -> 레코드2 -> 레코드3 ]
			if(rs.next() ) {	// 로그인SQL 레코드가 1개또는 0개이므로 if 사용해서 .next() 한번만 사용
				return rs.getInt(1);	// 검색된 회원번호를 반환
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return 0;
		
		
	}
	
	public String findById(String name, String pnum) {
		
		try {
				// try{} 안에 예외가 발생할것 같은, 일반예외 : JDBC, 파일처리 필수
			// sql 작성
			String sql = "select mid from member where mname = ? and mpnum = ?";
			
			// 작성한 sql을 조작할 preparedStatement 객체를 연동객체로부터 반환
			ps = conn.prepareStatement(sql);
			
			// sql조작 [매개변수대입]
			ps.setString(1, name);		// sql문에 있는 첫번째 ? 에 name 변수 대입
			ps.setString(2, pnum);		// sql문에 있는 두번째 ? 에 pnum 변수 대입
			
			// sql조작[ sql 실행 ]
			rs = ps.executeQuery(); // executeQuery() ---> ResultSet 객체 반환
			
			// sql 결과 조작
				// rs.next() : 검색된 여러 레코드중 다음레코드로 이동 
				// rs.get타입(검색필드순서번호)
				// rs.getString(검색필드순서번호) : 현재 위치한 레코드의 필드값 호출 
			if(rs.next()) {return rs.getString(1);}
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return null;
	}
	
	public String findByPw(String id, String pnum) {
		
		try {
			// try{} 안에 예외가 발생할것 같은, 일반예외 : JDBC, 파일처리 필수
		String sql = "select mpw from member where mid = ? and mpnum = ?";
		
		ps = conn.prepareStatement(sql);
		
		ps.setString(1, id);
		ps.setString(2, pnum);
		
		rs = ps.executeQuery(); 
		
		if(rs.next()) {return rs.getString(1);}
		
		
		
	}catch(Exception e) {
		System.out.println(e);
	}
		
		
		return null;
	}	// findByPw end
	
	// 회원정보 체크 sql : type = 1이면 아이디중복체크, type = 2이면 전화번호중복체크
	public boolean infoCheck(String type, String values) {
		
		try {
			String sql = "select*from member where "+type+" =  ?";
			ps = conn.prepareStatement(sql);
			ps.setString(1, values);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				return true;
			}else {
				return false;
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return false;
		
	}
	
	// 회원번호를 가지고 회원정보 찾기 - 회원번호가 존재하는 레코드 찾기
	public MemberDto info(int mno) {	// 회원정보 페이지
		
		try {
			String sql = "select*from member where mno = ? ";
			
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1, mno);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {	// 만약 해당 레코드가 존재하면
				// 현재 레코드를 DTO로 만들기
				MemberDto dto = new MemberDto(rs.getInt(1), rs.getString(2)
						, rs.getString(3), rs.getString(4), rs.getString(5));
				return dto;
			}	// if end
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return null;
	}
	
	public boolean infoUpdate(int mno, String newPw) {	// 회원정보수정페이지
		
		try {
			String sql ="update member set mpw = ? where mno = ? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, newPw);	ps.setInt(2, mno);
			// sql 실행
			int row = ps.executeUpdate();
			if(row == 1) return true;
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return false;
	}
	
	public boolean infoDelete(int mno) {	 // 회원탈퇴 페이지
		
		try {
			String sql = "delete from member where mno = ?";
			ps = conn.prepareStatement(sql);
			ps.setInt(1, mno);
			int row = ps.executeUpdate();
			if(row == 1) return true;
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return false;
	}

}
