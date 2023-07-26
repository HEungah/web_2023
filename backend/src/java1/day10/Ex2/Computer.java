package java1.day10.Ex2;

public class Computer {
	// 필드
	
	// 생성자
	
	// 메소드
		// 1. 가변(정해져잇찌 않는)길이 매개변수를 갖는 메소드 선언
		// 2. 가변 길이와 일반매개변수 있을경우 가변길이매개변수 가장 뒤에 선언
		// 3. 여러개의 리터럴과 하나의 배열을 매개변수로 전달 받을 수 있다.
	int sum(/*String str*/int ...value) {		// 타입...배열변수
		
		int sum = 0;	// 매개변수로 돌아온 여러개의 변수를 더한 변수
		
		for(int i = 0; i < value.length; i++) {
			sum += value[i];
		}	// for end
		
		return sum;	// 누적합계 반환
		
	}	// method end
}	// class end
