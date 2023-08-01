package java1.day14.Ex1_상속;

public class SmartPhone extends Phone {
	// 자식클래스 : SmartPhone / 부모클래스 : Phone
	// SmartPhone 클래스에서 Phone 클래스의 구성멤버를 사용할 수 있다.
	// Phone 클래스에서 SmartPhone 클래스의 구성멤버를 사용할 수 없다.
	
	// 자바는 100% 객체지향 언어 = 상속 문법 사용
	/*
	 		- 모든 클래스는 Object 클래스로부터 암묵적으로 상속받음[ 코드적으로 작성x]
	 						Object 클래스
	 			___________	|___________
	 		  |						|					|
	 		String			Scanner			Phone(직접만든 클래스)
	 	
	 	
	 	
	 */
	
	// 클래스 구성 멤버
	
	// 1. 필드
	public boolean wifi;
	
	// 2. 생성자

	public SmartPhone(String model, String color) {
		// Phone으로부터 상속받은 필드
		this.model = model;
		this.color = color;
	}
	
	
	// 3. 메소드
	public void setWifi(boolean wifi) {
		this.wifi = wifi;
		System.out.println("와이파이 상태를 변경했습니다.");
	}
	
	public void internet() {
		System.out.println("인터넷에 연결합니다.");
	}

}
