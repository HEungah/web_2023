package java1.day11.Ex5디자인패턴2.controller;

import java1.day11.Ex5디자인패턴2.model.DAO.MemberDao;
import java1.day11.Ex5디자인패턴2.model.DTO.MemberDto;
import 과제.과제10.Member2;

public class MemberController { // 실질적인 기능 처리(유효성검사 포함)
	
	// 1. 싱글톤 생성
	private static MemberController memberController = new MemberController();
	// 2. 외부로부터 싱글톤 호출할 수 있도록 함수 생성
	public static MemberController getInstance() {
		return memberController;
	}
	// 3. 외부에서 객체 생성 차단
	private MemberController() {}
	
	
	public boolean singupLogic(String id, String pw, String name, String pnum, int age) {
		MemberDto member = new MemberDto(id, pw, name, pnum, age);
		for(int i = 0; i<MemberDao.memberList.length; i++) {
			if(MemberDao.memberList[i] == null) {
				MemberDao.memberList[i] = member;
				return true; // 회원가입 성공
			}
		} // for end
		return false;	// 회원가입 실패
	}
	
	public boolean loginLogic(String id, String pw) {
		for(int i = 0; i < MemberDao.memberList.length; i++) {
			if(MemberDao.memberList[i] != null &&
					MemberDao.memberList[i].getId().equals(id) &&
					MemberDao.memberList[i].getPw().equals(pw)) {
				return true;
			}
		}	// for end
		return false;
	}
	
	public String findIdLogic(String name, String pnum) {
		for(int i = 0; i < MemberDao.memberList.length; i++){
			if(MemberDao.memberList[i] != null &&
					MemberDao.memberList[i].getName().equals(name) && 
					MemberDao.memberList[i].getPnum().equals(pnum)) {
				return MemberDao.memberList[i].getId();
			}
		}	// for end
		return "-1";
	}
	
	public void findPwLogic() {
		
	}

}
