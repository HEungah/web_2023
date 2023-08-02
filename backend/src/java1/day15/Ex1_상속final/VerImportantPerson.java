package java1.day15.Ex1_상속final;

public class VerImportantPerson extends Member {	// Member에 final을 썻기때문에 상속 불가능
	// 자식클래스 extends 부모클래스
	
	/*
	 * @Override public final void stop() { // stop 메소드는 final 키워드가 있으므로 오버라이딩 불가능
	 * System.out.println("스탑"); }
	 */
	
	@Override
	public void stop2() {
		System.out.println("스탑");
	}
}


