package java1.day10.Ex2;

public class Ex2_가변길이매개변수 {
	public static void main(String[] args) {
		
		// 다른 클래스의 메소드를 호출하기위한 객체를 생성
		Computer myCom = new Computer();
		
		// 인수 3개 전달
		int result1 = myCom.sum(1, 2, 3);
		System.out.println("result1 : " + result1);
		
		// 인수 5개 전달
		int result2 = myCom.sum(1, 2, 3, 4, 5);
		System.out.println("result2 : " + result2);
		
		// 배열을 전달
		int[] values = {1, 2, 3, 4, 5};
		int result3 = myCom.sum(values);
		System.out.println("result3 : " + result3);
		
		// 배열2 전달
		int result4 = myCom.sum(new int[] {1, 2, 3, 4, 5});
		System.out.println("result4 : " + result4);
		
	}

}
