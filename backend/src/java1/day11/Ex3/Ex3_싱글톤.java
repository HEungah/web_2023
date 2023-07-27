package java1.day11.Ex3;

public class Ex3_싱글톤 {
	public static void main(String[] args) {
		
		
		// Member 객체 생성
//		Member member = new Member();	오류 생성자를 private로 선언하여 외부에서 객체생성 불가능
		// [ 두 객체는 다르다 ]
		// Member member1 = new Member()
		// Member member2 = new Member()
		
		// Member 객체 호출	[ 두 객체는 같다. ]
		Member member1 = Member.getInstance();
		Member member2 = Member.getInstance();
	}

}

