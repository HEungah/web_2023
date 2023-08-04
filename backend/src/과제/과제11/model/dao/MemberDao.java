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
	
	public boolean loginSQL(String id, String pw) {
		try {
			// SQL 작성 [ mysql 워크벤치에서 임의의값으로 테스트 권장 ]
			String sql = "select mid, mpw from member where mid = ? and mpw = ?";
			
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
				return true;	// 로그인 성공
			}
		}catch(Exception e) {
			System.out.println(e);
		}
		
		return false;
		
		
	}

}
