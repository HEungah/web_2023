package java2.day27_컬렉션프레임워크.Ex3_hashTable.Ex1;

import java.util.Hashtable;
import java.util.Map;

public class Ex3_예제 {
	
	public static void main(String[] args) {
		
		// 1. HashTable 객체에 String, Ieteger 2개 객체를 저장하는 map 객체 선언
		Map<String, Integer> map = new Hashtable<>();
		
		// 2. 멀티스레드를 이용한 각 1000개씩 2000개를 동시 저장
		
		Thread threadA = new Thread() {
			public void run() {
				for(int i = 1; i <= 1000; i++) {
					map.put(String.valueOf(i), i);
				}
			};	
		};
		
		Thread threadB = new Thread() {
			public void run() {
				for(int i = 1001; i <= 2000; i++) {
					map.put(String.valueOf(i), i);
				}
			};	
		};
		
		threadA.start();	threadB.start();	// 두 스레드 실행
		
		// 작업 스레드들이 모두 종료될 때까지 메인 스레드를 기다리게 함
		try {
			threadA.join();
			threadB.join();
		} catch (Exception e) {}
		
		System.out.println(map);		// 두 스레드가 저장을 하기 전에 main 스레드가 출력부터함
		
		int size = map.size();
		System.out.println("총 엔트리 수 : " + size);
		
		
		
	}	// main end

}



























