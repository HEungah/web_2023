package java1.day10.Ex3;

public class Ex3_리턴 {
	public static void main(String[] args) {
		
		// 자동차 객체 생성
		Car myCar = new Car();
		
		// 메소드 이용한 필드에 값 대입
		myCar.setGas(5);
		
		// 메소드 호출
		if(myCar.isLeftGas()) {	// if start
			// 만약에 가스가 0보다 커서 true를 반환하면
			System.out.println("출발합니다.");
			
			// 리턴값이 없는 run() 호출
			myCar.run();
		}	// if end
		
		System.out.println("gas를 주입하세요.");
	}	// main end

}
