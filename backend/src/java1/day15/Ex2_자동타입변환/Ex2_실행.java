package java1.day15.Ex2_자동타입변환;

public class Ex2_실행 {
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		
		// 자식객체 생성시 부모객체도 같이 생성
		Child child = new Child();
		
		// 자식객체를 부모객체에 대입
		parent = child;
		
		
		// 메소드 호출
		
		parent.method();
		parent.method2();	// 자식클래스의 메소드가 실행된다.
//		parent.method3();		호출 불가능, 타입변환된 부모객체는 자식객체의 멤버를 사용할 수 없다
									// 단, 오버라이딩된 메소드는 사용가능!!!!
		
		// 부모객체를 자식객체에 대입
		
//		child = parent;		불가능	--> 자식객체는 부모객체가 될 수 없다.
		
		// 강제타입변환
		Parent parent2 = new Child();	// 자동 타입 변환
		Child child2 = (Child)parent2;	// 강제 타입 변환
		// 자동타입 변환후 강제 타입 변환을 사용할 수 있다.
		Parent parent3 = new Parent();
//		Child child3 = (Child)parent3;	오류발생
		child2.method();
		child2.method2();
		child2.method3();
		
	}
}
