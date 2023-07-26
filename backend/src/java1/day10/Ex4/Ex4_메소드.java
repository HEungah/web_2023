package java1.day10.Ex4;

public class Ex4_메소드 {
	public static void main(String[] args) {
		// 메소드 사용/호출
		// 1. 객체 선언
		Member m = new Member();
		// 2. 객체내 .(도트연산자) 이용한 필드 및 메소드 호출
			// 매개변수x 리턴x 함수 호출
		m.signUp();
			// 매개변수o 리턴x 함수 호출
		m.login("dkrtpsxm", 1234);
			// 매개변수x 리턴o 함수 호출
//		int result = m.findId();	리턴된 값이 저장할 데이터의 타입과 맞지 않음
		String result = m.findId();
		String[] result2 = m.findPw("qwe", "qwe");
			// 가변길이 
		m.delete("안녕하세요", "반갑습니다", "다시만나요");
		m.delete("hello", "bye");
			// 오버로딩
		m.delete(15, "overoading");
		
		
		
	}	// main end

}
