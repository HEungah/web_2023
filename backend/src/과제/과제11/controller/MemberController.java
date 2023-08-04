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
	
	
	public boolean signupLogic(String id, String pw, String name, String pnum) {
		// 회원가입시 회원번호는 자동(auto_increment)이므로 필요x
		MemberDto member = new MemberDto(0, id, pw, name, pnum);
		
		boolean result = MemberDao.getInstance().signupSQL(member);
		// 결과를 다시 view에게 전달
		return result;
		
	}
	
	public boolean loginLogic(String id, String pw) {
		boolean result = MemberDao.getInstance().loginSQL(id, pw);
		
		return result;
		
	}
	
	

}
