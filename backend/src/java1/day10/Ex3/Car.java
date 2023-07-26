package java1.day10.Ex3;

public class Car {

	// 필드
	private int gas;	// 현재 객체의 gas 데이터를 저장하는 곳
	// 생성자
	
	// 메소드
		// 보통 필드에 저장하는 용도의 함수는 set필드명
		// 보통 필드의 값을 가져오는 용도의 함수는 get필드명
		// 리턴x 매개변수1개 -> 매개변수로 부터 전달받은 gas 값을 필드 gas에 저장하는 함수
	void setGas(int gas) {
		if(gas > 0) {	// 유효성검사
			this.gas = gas;	// this : 현재 객체 [ 매개변수와 필드의 데이터가 동일할때 식별용도 ]
		}
	}
		// 리턴o 매개변수x : 현재 객체의 gas필드가 0이면 false 아니면 true 리턴
		
	boolean isLeftGas() {	// 메소드명 is~ : boolean 값을 사용할때
		if(this.gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}
	
		// 리턴x 매개변수x
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달립니다.(gas잔량 : " + gas + ")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다.(gas잔량 : " + gas + ")");
				return;	//	메소드 종료
			}
		}
	}
	
	
	
	
	
	
	
	
}
