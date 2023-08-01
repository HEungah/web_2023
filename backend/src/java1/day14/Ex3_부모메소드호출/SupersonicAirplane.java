package java1.day14.Ex3_부모메소드호출;

public class SupersonicAirplane extends Airplane{
	
	// 필드
	// 상수필드
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	// 인스턴스 필드
	public int flyMode = NORMAL;
	
	
	// 생성자
	public SupersonicAirplane() {
		super();
	}
	
	
	// 메소드
		// 부모클래스로부터 오버라이딩
	@Override
	public void fly() {
		if(flyMode == SUPERSONIC) {
			System.out.println("초음속 비행합니다.");
		}
		else {
			super.fly();
		}
	}


	@Override
	public String toString() {
		return "SupersonicAirplane [flyMode=" + flyMode + "]";
	}
	
	



}

/*
 	
 	this					vs						super
 	현재클래스									부모클래스
 	this.필드명			vs						super.필드명
 	this()											super()
 	this.메소드명()		vs						super.메소드명()
 	
 	오버로딩 : 동일한 메소드명일때 매개변수에 따른 식별 기능
 	오버라이딩 : 부모클래스로 부터 받은 메소드를 재정의할때 
 	
 	
 	
 	
 */
