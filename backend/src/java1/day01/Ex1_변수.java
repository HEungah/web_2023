package java1.day01;	// 현재 클래스가 위치한 패키지명(폴더 경로)

public class Ex1_변수 {	// class start
	public static void main(String[] args) {	// main start
		
//		int value;		// 초기화 되지 않은 변수 value
		int value = 10;
		
		int result = value +10;
		
		System.out.println(result);
		
		int hour = 3;
		int minute = 5;
		
		System.out.println(hour + "시간 " + minute + "분");
		
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");
		
	}	// main end
	
}	// class end


/*
 * 	변수 : 하나의 값을 저장할 수 있는 메모리 번지에 붙여진 이름
 * 
 * 	형태 : 
 * 		타입 변수명 ;
 * 		타입 변수명 = 초기값;
 * 	타입 : 미리 정해진 변수의 크기
 * 	변수명 : 메모리 번지 대신에 식별용으로 사용되는 메모리 이름 [카멜 표기법]
 * 	= : 오른쪽에 데이트를 왼쪽 변수에 대입
 * 	초기값 : 변수 선언시 저장할 데이터
 */













