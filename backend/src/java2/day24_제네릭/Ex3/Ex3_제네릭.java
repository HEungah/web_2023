package java2.day24_제네릭.Ex3;

public class Ex3_제네릭 {
	public static void main(String[] args) {
		
		// 1. 홈 렌탈 구현체
		HomeAgency homeAgency = new HomeAgency();
		// 유재석 집 불켜기
		Home 유재석집 = homeAgency.rent();
		유재석집.turnOnLight();
		
		// 강호동 집 불끄기
		Home 강호동집 = homeAgency.rent();
		강호동집.turnDownLight();
		
		// 2. 차 렌탈 구현체
		CarAgency carAgency = new CarAgency();
		Car car = carAgency.rent();
		car.run();
		
	}
}
