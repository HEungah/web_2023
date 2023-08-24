package java2.day25_제네릭.Ex1;

public class Ex1_제한된타입파라미터 {
		// T extends Number --> Number클래스를 포함해서 Number의 자손클래스의 객체들만 허용
	public static<T extends Number> boolean compare(T t1, T t2) {
		// 매개변수 타입 확인
		System.out.println(t1.getClass().getSimpleName());
		System.out.println(t2.getClass().getSimpleName());
		
		double v1 = t1.doubleValue();
		double v2 = t2.doubleValue();
		
		return(v1 == v2);
	}
	
	public static void main(String[] args) {
		
		// p.582
		boolean result1 = compare(10, 20);		// T를 Integer 타입으로 대체(Integer는 Number의 자식)
		System.out.println(result1);
		System.out.println();
		
		boolean result2 = compare(4.5, 4.5);		// T를 Double 타입으로 대체(Double은 Number의 자식)
		System.out.println(result2);
		
		//String result3 = compare("안녕", "안녕");  T는 String타입을 받을 수 없음(Number의 자식이 아니기 때문)
		
		
	}

}



/*
 		제네릭 : 결정되지 않은 타입을 파라미터로 처리하고 실제 사용할때 파라미터를 구체적인 타입으로 대체
 			1. < A~Z > : 파라미터 이름은 알파벳 A~Z를 사용하는것을 권장함
 			2. 사용처
 				1. 클래스 : public class 클래스명<T> {
 									T t;
 							  }
 							  -- 1. 객체 생성시
 							  클래스명<구체적인타입> 객체명 = new 생성자<>();
 							  
 								
 				2. 메소드 : public <T> 리턴타입 메소드명(){}
 				
 							 -- 1. 메소드 정의
 							 public <T> boolean 메소드명(T t){
 							 	int value = t;
 							 	return true;
 							 }
 							 
 							 -- 2. 메소드 호출
 							 메소드명(100);
 */



















