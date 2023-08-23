package java2.day24_제네릭.Ex3;

// 차 렌탈 해주는 대리점
public class CarAgency implements Rentable<Car>{
	// 추상메소드 구현
	@Override
	public Car rent() {
		return new Car();
	}
}
