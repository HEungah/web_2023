package java1.day16.Ex2_매개변수의다형성;

public class Ex2_실행 {
	public static void main(String[] args) {
		
		Driver driver = new Driver();
		// 부모객체
		Vehicle vehicle = new Vehicle();
		// 자식객체
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		
		// 객체의 타입과 매개변수 ---> 타입 일치
		System.out.println("----------Vehicle대입---------");
		driver.drive(3, vehicle);
		// 객체의 타입[Bus] 매개변수의 타입[Vehicle] ---> 타입 불일치 하지만 Bus가 Vehicle로 자동형변환됨
		System.out.println("----------Bus대입---------");
		driver.drive(5, bus);
		System.out.println("----------Taxi대입---------");
		driver.drive(0, taxi);
		
		
	}

}
