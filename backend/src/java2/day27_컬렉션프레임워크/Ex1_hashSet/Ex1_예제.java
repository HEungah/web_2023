package java2.day27_컬렉션프레임워크.Ex1_hashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex1_예제 {
	
	public static void main(String[] args) {
		
		// 1. Set 컬렉션의 HashSet 객체 선언
		Set<String> set = new HashSet<>();
			// set객체(컬렉션프레임워크)에 <String> 객체를 여러개 저장 가능
		System.out.println("set 상태 : " + set);
		// 2. set 객체에 String 객체 저장
		set.add("Java");		System.out.println("set상태 : " + set);
		set.add("JDBC");		System.out.println("set상태 : " + set);
		set.add("JSP");		System.out.println("set상태 : " + set);
		set.add("Java");		// 중복 발생 (중복값 x)
		System.out.println("set상태 : " + set);
		set.add("Spring");		System.out.println("set상태 : " + set);
		
		// 3. set 객체내 String 객체 수
		System.out.println("set객체내 객체 수 : " + set.size());
		// 4. set/list 와 for문 관계
			// 1. for문	--> set은 index가 없으므로 set 불가능
			for(int i = 0; i < set.size(); i++) {}
			// 2. 향상된 for문[ list, set 가능 ]
				// for(반복변수 : 컬렉션객체){}
				// 반복변수 : 컬렉션객체에 저장된 타입
			for(String s : set) {System.out.println(s);}
			// 3. forEach() 함수를 이용한 람다식 표현(화살표함수 = java)
			set.forEach(s -> {System.out.println(s);});
		
			
			// ----------------------------------------------------------------------
			
				// 객체내 중복여부 체크
					// 객체가 String 이면 String 기준으로 중복 제거
					// 객체[String, int] 가 2개 이상의 필드를 가지고 잇으면 중복기준이 애매함
			
			Set<Member> set2 = new HashSet<Member>();
			
			// Member 객체 저장
			set2.add(new Member("홍길동", 30));
			set2.add(new Member("홍길동", 30));
			set2.add(new Member("강호동", 30));
			set2.add(new Member("홍길동", 25));
			set2.add(new Member("서강준", 29));
			
			//  저장된 객체 수 출력
			System.out.println(set2);
			System.out.println("총 객체 수 : " + set.size());
			
			
			// 4. iterator() 메소드
			Iterator<Member> iterator = set2.iterator();
			
			while(iterator.hasNext()) {	// .hasNext() : 다음 객체가 있으면 true, 없으면 false
				Member element = iterator.next();	// .next() : set객체내 객체 호출
				System.out.println(element);
				if(element.name.equals("강호동")) {
					iterator.remove();
				}
			}
			System.out.println();

			// 5. iterator 객체를 활용한 향상된 for문
			for(Member m : set2) {
				System.out.println(m);
			}
			System.out.println();
			
			// 6. forEach (iterator를 사용하는 컬렉션프레임워크의 객체이면 사용가능)
			set2.forEach(s2 -> {System.out.println(s2);});
		
	}

}















