package java1.day16.Ex1_필드의다형성;

public class HankookTire  extends Tire{
	// 상속받으면 자식클래스에서 부모클래스의 멤버(필드, 생성자, 메소드)를 사용할 수 있다.
	// 오버라이딩 : 부모클래스의 메소드를 물려받았지만 새로 정의해서 메소드를 사용함

	@Override
	public void roll() {
		System.out.println("한국타이어가 회전");
	}
	
}
