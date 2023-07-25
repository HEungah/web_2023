package 과제.과제9;

// 목저 : 설계도, 객체의모델
public class Member {
	// 1. 필드 : 객체의 데이터를 저장하는곳
	String id;	// 초기값이 없을때 기본값 null(문자열초기값)
	String pw;
	String name;
	String pnum;
	int age;	// 초기값 0(정수형초기값)
	// 2. 생성자
	public Member() {}	// 기본 생성자
	public Member(String id) {	// 매개변수 1개인 생성자
		this.id = id;
	}
	public Member(String id, String pw) {	// 매개변수 2개인 생성자
		this(id);	// 생성자 안에 생성자 사용
		this.pw = pw;
	}
	public Member(String id, String pw, String name) {	// 매개변수 3개인 생성자
		this(id, pw);
		this.name = name;
	}
	public Member(String id, String pw, String name, String pnum) { // 매개변수 4개인 생성자
		this(id,pw,name);
		this.pnum = pnum;
	}
	public Member(String id, String pw, String name, String pnum, int age) {
		this(id,pw,name,pnum);
		this.age = age;
	}
	// 3. 메소드
}
