package java1.day14.Ex1_상속;

public class Ex1_실행 {
	public static void main(String[] args) {
		
		// Phone 부모객체 생성
		Phone phone = new Phone();
		System.out.println(phone.model);
		System.out.println(phone.color);
//		System.out.println(phone.wify);	 오류발생 : 자식클래스의 멤버를 쓰지 못함
		
		// 2. SmartPhone 자식 객체
		SmartPhone myPhone = new SmartPhone("갤럭시", "은색");
		System.out.println(myPhone.color);
		System.out.println(myPhone.model);		// 해당 객체의 부모클래스 멤버이므로 사용 가능
		System.out.println(myPhone.wifi);	// 해당 객체의 멤버이므로 사용 가능
		
		phone.bell();
		phone.sendVoice("여보세요");
		phone.receiveVoice("안녕하세요");
		phone.hangUp();
//		phone.setWifi(true);		// 오류발생 : 자식클래스의 멤버메소드이므로
//		phone.internet();				// 오류발생 위와 동일
		
		myPhone.setWifi(true);
		myPhone.internet();
		myPhone.bell(); 				// 해당객체는 부모객체를 상속받았으므로 부모클래스의 메소드를 사용할 수 있다.
		
		
		
	}

}
