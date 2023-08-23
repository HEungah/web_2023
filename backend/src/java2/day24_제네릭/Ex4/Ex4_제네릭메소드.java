package java2.day24_제네릭.Ex4;

public class Ex4_제네릭메소드 {
	// 제네릭 메소드 선언
		// 목적 : 함수에서 매개변수 정의할때, 정해져 있지않은 타입을 받고 싶을때
			// public boolean 메소드(int value){}
			// public boolean 메소드(String value){}
			// ---> 통합 // public <T> boolean 메소드(T value){}
			// 메소드 선언부 <제네릭타입> : 함수내에서도 제네릭타입을 사용할 수 있다.
	public static <T> Box<T> boxing(T t){
								// T에 타입을 설정하지 않으면 Object가 기본으로 들어간다
		Box<T> box = new Box<T>();
		box.setT(t);	// box객체 [ Integer t = 100,String  t = "안녕하세요" ]
		return box;
	}
	
	public static void main(String[] args) {
		
		// 제네릭 메소드 호출
		Box<Integer> box1 = boxing(100);  // 타입 파라미터에 값 넣으면 (자동으로) 값의 타입으로 대체
		int intValue = box1.getT();
		System.out.println(intValue);
		
		Box<String> box2 = boxing("안녕하세요");
		String strValue = box2.getT();
		System.out.println(strValue);
	}

}
