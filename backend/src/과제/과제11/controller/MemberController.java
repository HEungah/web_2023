package 과제.과제11.controller;

import 과제.과제11.model.dao.MemberDao;
import 과제.과제11.model.dto.MemberDto;

public class MemberController {
	
	// 싱글톤패턴
	private static MemberController memberController = new MemberController();
	
	public static MemberController getInstance() {
		return memberController;
	}
	
	private MemberController() {}
	
	
	public int signupLogic(String id, String pw, String name, String pnum) {
		// 회원가입시 회원번호는 자동(auto_increment)이므로 필요x
		
		// 아이디 중복체크
		if(MemberDao.getInstance().infoCheck("mid", id)) return 3;
		

		// 전화번호 중복체크
		if(MemberDao.getInstance().infoCheck("mpnum", pnum)) return 4;
		
		MemberDto member = new MemberDto(0, id, pw, name, pnum);
		
		boolean result = MemberDao.getInstance().signupSQL(member);
		// 결과를 다시 view에게 전달
		if(result) return 1;
		else return 2;
		
	}
	
	// 로그아웃 처리
	public void logOut(){this.loginSession = 0;}
	
	// 로그인된 회원의 번호를 저장하는 필드 => 웹세션
	private int loginSession = 0;	// 0 : 로그인 안한상태, 1이상 : 로그인된 회원의 번호
	public int getLoginSession() {return loginSession;}
	
	public boolean loginLogic(String id, String pw) {		
		int result = MemberDao.getInstance().loginSQL(id, pw);
		// 로그인 성공했을때 기록하기[로그인이후 로그인된 정보로 활동]
		
		if(result >= 1) {this.loginSession = result; return true;}
		else {return false;}

		
	}
	
	public String findById(String name, String pnum) {
		// - 테스트, view 페이지에서 전달받은 매개변수 확인
		System.out.println("[Test] view value : " + name + pnum);
		
		// Dao에게 매개변수 전달하고 찾은 아이디 반환 받기
		String result = MemberDao.getInstance().findById(name, pnum);
		
		return result;
	}
	
	public String findByPw(String id, String pnum) {
		// - 테스트, view 페이지에서 전달받은 매개변수 확인
		System.out.println("[Test] view value : " + id + pnum);
		
		// Dao에게 매개변수 전달하고 찾은 아이디 반환 받기
		String result = MemberDao.getInstance().findByPw(id, pnum);
		
		return result;
	}
	
	public MemberDto info() {	// 회원정보 페이지
		
		// view에서 loginSession을 전달받지 않음(필드에 이미 존재함)
		return MemberDao.getInstance().info(this.loginSession);
	}
	
	public boolean infoUpdate(String newPw) {	// 회원정보수정페이지
		return  MemberDao.getInstance().infoUpdate(loginSession, newPw);		
	}
	
	public boolean infoDelete() {	 // 회원탈퇴 페이지
		
		return MemberDao.getInstance().infoDelete(loginSession);
	}
	
	
	

}
