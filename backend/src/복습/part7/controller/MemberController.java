package 복습.part7.controller;

import 복습.part7.model.DAO.MemberDao;
import 복습.part7.model.DTO.MemberDto;

public class MemberController {
	
	private static MemberController membercontroller = new MemberController();
	
	private MemberController() {}
	
	public static MemberController getInstance() {
		return membercontroller;
	}
	
	public boolean singUpLogic(String id, String pw, String name, String pnum, int age) {
		
		MemberDto member = new MemberDto(id, pw, name, pnum, age);
		
		for(int i = 0; i < MemberDao.memberList.length; i++) {
			if(MemberDao.memberList[i] == null) {
				MemberDao.memberList[i] = member;
				return true;
			}
		}
		
		return false;
	}
	
	public boolean loginLogic(String id, String pw) {
		
		for(int i = 0; i < MemberDao.memberList.length; i++) {
			if(MemberDao.memberList[i] != null &&
					MemberDao.memberList[i].getId().equals(id) &&
					MemberDao.memberList[i].getPw().equals(pw)) {
				return true;
			}
		}
		
		return false;
	}

}
