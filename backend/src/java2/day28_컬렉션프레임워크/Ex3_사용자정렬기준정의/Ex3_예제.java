package java2.day28_컬렉션프레임워크.Ex3_사용자정렬기준정의;

import java.util.TreeSet;

public class Ex3_예제 {
	
	public static void main(String[] args) {
		
		// - Integer, String, Double 정렬 기준이 명확(숫자, 문자 이므로)
		// - 사용자정의 클래스인 MemberDto(여러개 필드)는 정렬기준이 명확하지 않다.
		
		// 1.  TreeSet 구현
		TreeSet<Person> treeSet = new TreeSet<>();
			// Comparable 로 부터 구현된 클래스의 객체만 저장 가능
		
		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("박지원", 25));
		treeSet.add(new Person("김자바", 31));
		treeSet.add(new Person("유재석", 20));
		System.out.println("이진트리 상태 : " + treeSet);
		
	}

}
