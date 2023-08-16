package java2.day21;

public class Ex1_예외처리 {
	
	public static void printLength(String data) {
		// p.467
		try {
		int result = data.length();	// 1. ThisIsJava => String객체의 주소값 // 2. null => 객체의 주소값이 없음
		System.out.println("문자 수 : " + result);
		}catch (NullPointerException e) {	// 예외가 발생하면 이곳으로 이동하고 *예외 정보를 객체내 저장시킴
			// NullPointerException 예외가 발생했다는 경험을 했기때문에 알 수 있음
			//System.out.println(e.getMessage());
			System.out.println(e);
			// 실무 : 파일처리
		}finally { // 예외 발생 하던 안하던 무조건 실행되는 코드
			System.out.println("[마무리 실행]");
		}
	}
	
	public static void main(String[] args) {
		
		// p.466 : 실행예외[실행 후 예외 발생하기 때문에 예외처리는 경험/테스트 후 예외처리 해야한다]
		System.out.println("[프로그램 시작]\n");
		printLength("ThisIsJava");	// 정상 실행
		printLength(null);		// 예외 발생 : NullPointerException
		System.out.println("[프로그램 종료]");
		
		// p.468 : 일반예외[실행 전부터 컴파일러가 예외 검사 하기 때문에 예외처리 필수!]
		try {	// 예외가 발생할것 같은 코드(일반예외) + 예외가 무조건 발생할것같은 코드(실행예외)
			Class.forName("java.lang.String");	// Class.forName : 클래스 찾기 // java.langa.String
			System.out.println("클래스가 존재합니다.");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try {	// 예외가 발생할것 같은 코드(일반예외) + 예외가 무조건 발생할것같은 코드(실행예외)
			Class.forName("java.lang.String2");	// Class.forName : 클래스 찾기 // java.langa.String
			// String2 클래스는 존재하지 않음 => catch로 이동
			System.out.println("클래스가 존재합니다.");
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}


/*
		에러 : 컴퓨터의 하드웨어 고장으로 인해 실행 오류가 발생
		예외 : 에러 이외
			1. 일반예외 : 컴파일러가 예외 처리 코드 여부를 검사하는 예외
				- 외부 입출력 관련 : 파일처리, JDBC(DAO), 네트워크, 입출력
				
			2. 실행예외 : 컴파일러가 예외 처리 코드 여부를 검사하지 않는 예외를 말함
				- 실행 도중에 오류가 발생하는것 : 개발자의 경험에 의존
				- 타입오류, 배열인덱싀, NULL(객체없음)
		예외처리
				try{ 예외가 발생할것 같은 코드 }
				cath( 예외클래스 변수 객체 ){ 예외가 발생했을때 코드 }
				finally{ 예외와 상관없이 항상 실행하는 코드 }
 */




















