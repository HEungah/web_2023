package java2.day21;

public class Ex3_예외던지기 {
	public static void main(String[] args) {
		
		// p.478 : 예외 던지기( 메소드 안에서 예외가 발생ㄷ하면 해당 메소드를 호출했던곳으로 예외 이동)
		// main쓰레드에 예외를 던지면 스택에 저장된다(main 은 자동실행) -> 오류 이유를 알 수 없음
		try {
			findClass();	// 해당 클래스가 예외를 던지면 예외 발생
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을수 없음 " + e);
		}	
		
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.String2");
		// throws : 해당 메소드에 직접 처리 하지 않고 해당 메소드를 호출했던곳으로 예외 이동
			// 웹에서는 자동 예외처리 가능[서블릿 클래스]
	}

}
