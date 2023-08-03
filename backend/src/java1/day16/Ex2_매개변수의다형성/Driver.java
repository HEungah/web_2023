package java1.day16.Ex2_매개변수의다형성;

public class Driver {
	// 필드, 생성자
	
	// 메소드
	public void drive(int value, Vehicle vehicle) {
		// 매개변수에 부모객체와 다양한 자식객체들이 자동타입변환해서 매개변수로 들어온 상태
		// 타입확인 : 객체명 instanceof 클래스명 ---> 해당객체가 해당 클래스타입이면 true 아니면 false
		vehicle.run();
		
		// 강제타입변환 : 1. 태생이 자식객체 2. 캐스팅
		if(vehicle instanceof Bus) {
			System.out.println("Bus운행"); Bus bus = (Bus)vehicle;
		}else if(vehicle instanceof Taxi) {
			System.out.println("Taxi운행"); Taxi taxi = (Taxi)vehicle;
		}
	}

}
