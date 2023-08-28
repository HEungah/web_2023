package java2.day27_컬렉션프레임워크.Ex2_hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Ex2_예제 {
	
	public static void main(String[] args) {
		
		// 1. map 컬렉션객체 내 <String, Integer > 2개 객체를 저장할 컬렉션객체 선언
		Map<String, Integer> map = new HashMap<>();
		
		// 2. 객체 저장
		map.put("신용권", 85);	// key : "신용권", value : 85
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95);	// 키가 같기 때문에 제일 마지막에 저장한 값만 저장(set 컬렉션 기반)
		
		System.out.println("map 상태 : " + map);
		System.out.println("총 Entry 수 : " + map.size());
		
		// 3. 객체 호출 .get(key)
		System.out.println("홍길동 value : " + map.get("홍길동"));
		
		// 4. map객체내 모든 key 호출
		System.out.println("map객체내 모든 key : " + map.keySet());
		System.out.println("map객체내 모든 values : " + map.values());
		
		// 5. 향상된 for문[ map.keySet() : 모든 key 호출 ]
		for(String key : map.keySet()) {System.out.printf("key : %s	value : %d \n", key, map.get(key));}
		
		System.out.println("------ forEach[ keySet() ] ------");
		map.keySet().forEach(key -> {System.out.printf("key : %s	value : %d \n", key, map.get(key));});
		
		System.out.println();
		// 엔트리 < key, value > 호출
		for(Entry<String, Integer> entry : map.entrySet()) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}
		
		System.out.println("------ forEach[ entrySet() ] ------");
		map.entrySet().forEach(key -> {System.out.printf("key : %s	value : %d \n", key.getKey(), key.getValue());});
		
		
	}

}


















