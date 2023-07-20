package java1.day06;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Ex1_배열 {	// class s
	public static void main(String[] args) {	// main s
		
		String[] season = {"spring", "summer", "fall", "winter"};
			// String[] : String 클래스(타입)으로 배열 선언 -> String데이터만 저장 가능
			// {값1, 값2, 값3} : 배열에 저장할 데이터 순서대로 작성
		
		System.out.println(season);	// season은 힙의 주소값을 가지고 있는 변수
		System.out.println(Arrays.toString(season));
		// Arrays.toString(배열변수명) -> 주소를 찾아서 배열의 정보 출력
		
		System.out.println(season[0]);	// season의 인덱스 0 값 호출
		System.out.println(season[1]);	// season의 인덱스 1 값 호출
		System.out.println(season[2]);	// season의 인덱스 2 값 호출
		System.out.println(season[3]);	// season의 인덱스 3 값 호출
		
		// 변경 -> 새로운값 대입
		
		season[1] = "여름";
		System.out.println(season[1]);	// "summer" 값을 "여름"으로 변경
		
		// 삭제 -> 불가능 ( 배열은 선언될때 길이 고정)
		season[1] = null;	// 삭제 x, 해당 위치를 null로 만듬
		System.out.println(season[1]);
		// 추가 -> 불가능 ( 배열은 선언될때 길이 고정) -> 인덱스중에 null 있으면 해당위치에 데이터 추가
		if(season[1] == null) {
			season[1] = "초여름";
			System.out.println(season[1]);
		}else {
			System.out.println("빈공간이 없습니다.");
		}
		
		int[] scores = {84, 90, 96};
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
			// i = 0, scores[0]
		}
		
		System.out.println("총합 : " + sum);
		
		double avg = sum / scores.length;
		
		System.out.println("평균 : " + avg);
		
		int[] arr1 = new int[3];	// int 3개를 저장할수 있는 배열 선언[0, 0, 0]
		System.out.println(Arrays.toString(arr1));	// int 배열의 초기값 0 저장

		// 배열내 모든 데이터 호출
		for(int i=0; i<3; i++) {
			System.out.println(arr1[i]);
		} // for end
		
		// 배열내 값 변경
		arr1[0] = 10; arr1[1] = 20; arr1[2] = 30;
		for(int i=0; i<3; i++) {
			System.out.println(arr1[i]);
		} // for end
		
		// double형 배열
			// 1. new 연산자를 이요한 배열 선언
			double[] arr2 = new double[3];	// double 3개를 저장할수 있는 배열 선언[0.0, 0.0, 0.0]
			System.out.println(Arrays.toString(arr2));
			// 2. 배열내 모든 데이터 호출
			for(int i=0; i<arr2.length; i++) {
				System.out.println(arr2[i]);
			}
			// 3. 배열내 값 변경
			arr2[0] = 0.1; arr2[1] = 0.2; arr2[2] = 0.3;
			// arr2[3] = 0.4; ---> 오류발생 (없는 인덱스는 호출이 불가능하다)
			System.out.println(Arrays.toString(arr2));
		
		// String 클래스 배열
		String[] arr3 = new String[3];	// String객체를 3개 저장할수 잇는 배열 선언(초기값 null)
		System.out.println(Arrays.toString(arr3));		
		// 값 변경
		arr3[0] = "1월"; arr3[1] = "2월"; arr3[2] = "3월";
		System.out.println(Arrays.toString(arr3));
		
		// 값 삭제(불가능), 대신 null값을 넣어준다.
		arr3[1] = null;
		
		// 삭제된 인덱스 뒤로 한칸 당기기
		for(int i=1; i<arr3.length; i++) {// for s
			if(i == arr3.length-1) {arr3[i] = null; break;}
			arr3[i] = arr3[i+1];
		}	// for e
		
		for(int i = 0; i<arr3.length; i++) {	// for s
			if(arr3[i] == null) {
				arr3[i] = "5월";
				break;
			}
		}	// for e
		
		System.out.println(Arrays.toString(arr3));
		
		
		
		
	}	// main end

}	// class end


/*
 	변수 : 하나의 데이터를 저장
 	배열 : 여러개의 데이터를 저장
 		1. 연속적인 공간에 데이터를 저장하고 나열
 		2. 각 데이터 공간에 인덱스를 부여[인덱스 : 0~]
 		3. 특징
 			1) 배열은 선언된 타입의 값만 저장할 수 있다.
 				int[] intArray = {1, "dd"} --> [x]
 				* int로 선언된 배열은 int형 데이터만 저장가능하다.
 			2) 배열의 길이는 선언될 때 고정되므로 늘리거나 줄일수 없다.
 				int[] intArray = new int[3];
 				intArray[0]
 				intArray[1]
 				intArray[2]
 					----> 추가하거나 줄일수 없다. [고정길이]
 		4. 배열의 선언
 			1) 타입[] 변수명;	-> int[] intArray
 			2) 선언과 동시에 값 대입
 				타입[] 변수명 = {값1, 값2, 값3, 값4}
 			3) new 연산으로 배열 생성(기본값)
 				타입[] 변수명 = new 타입[];
 				
 */























