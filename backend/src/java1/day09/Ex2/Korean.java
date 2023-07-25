package java1.day09.Ex2;

public class Korean {
	
	// 1. 필드
	String nation = "대한민국";	// 1. 객체마다 동일한 값을 갖고 있다면(객체에 필드값을 미리 초기화)
	String name;	// 2. 객체마다 다른 값을 가져야 한다면
	String ssn;
	
	// 2. 생성자
	public Korean() {}
	// 1. 매개변수2개 인 생성자(생성자 오버로딩)
	public Korean(String name, String ssn) {
		// this : 해당 함수/메소드/생성자 를 호출한 객체
		this.name = name;
		this.ssn = ssn;
	}
	// 매개변수 3개 인 생성자[1. 매개변수의 개수가 다를경우]
	public Korean(String name, String ssn, String nation) {
		this(name,ssn);
		this.nation = nation;	// 생성자안에서 생성자 호출
	}
	// 매개변수 2개 인 생성자[2. 매개변수의 타입이 다를 경우]
	public Korean(int ssn, String name) {
		this.name = name;
		this.ssn = ssn +"";
	}
	// 3. 메소드

}
