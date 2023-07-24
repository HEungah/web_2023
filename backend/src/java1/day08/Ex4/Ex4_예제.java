package java1.day08.Ex4;

public class Ex4_예제 {
	public static void main(String[] args) {
		
		// 1. Car 객체 선언 : 클래스명 변수명 = new 생성자명();
		Car myCar = new Car();
		
		// 2. 객체를 이용한 필드  호출
		System.out.println(myCar.company);
		System.out.println(myCar.model);
		System.out.println(myCar.maxSpeed);
		System.out.println("수정전 속도 : " + myCar.speed);
		
		// 3. 필드의 값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도 : " + myCar.speed);
		
		// -- myCar와 yourCar는 다르다
		Car yourCar = new Car();
		
		myCar = yourCar;
		System.out.println(myCar.speed);
		
	}

}
