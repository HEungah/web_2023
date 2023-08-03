package java1.day16.Ex1_필드의다형성;

public class Ex1_실행 {

		public static void main(String[] args) {
			
			Car myCar = new Car();	// tire 필드에 객체가 없는 상태
			// 필드에 초기화가 없으면 기본값 [참조타입 = null]
			System.out.println(myCar.tire);
			
			myCar.tire = new Tire();		// 기본 타이어
			myCar.run();	// 기본타이어 객체가 roll 메소드를 실행
			
			// 타이어 교체 - 1
			myCar.tire = new HankookTire();
			myCar.run();	// HankookTire 객체가 roll 메소드를 실행
			
			// 타이어 교체 - 2
			myCar.tire = new KumhoTire();
			myCar.run();
			
		}	// main end
}
