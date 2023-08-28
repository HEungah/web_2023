package java2.day27_컬렉션프레임워크.Ex1_hashSet;

public class Member {
	
	public String name;
	public int age;
	
	// 생성자
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
	
	
	// --------------- 해당 객체의 중복 기준 만들기 ---------------------------
	
	// 오버라이드
	@Override	// Object(모든 클래스는 Object로 부터 상속을 받는다)의 메소드를 재정의
	public int hashCode() {
		
		return name.hashCode() + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Member target) {
			// 만약에 해당 객체가 이름과 나이가 일치하면 [중복] 처리
			return target.name.equals(name) && (target.age == age);
		}else {return false;}
	}

	
	
}
