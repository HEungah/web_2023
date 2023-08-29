package java2.day28_컬렉션프레임워크.Ex1;

import java.util.TreeSet;

/*
 	검색 기능을 강화시킨 컬렉션
 		- 컬렉션 안에 있는 데이터를 검색할때 효율성 제공[ 필수 x ]
 		
 	- 이진트리
 		- 각 노드는 최대 2개의 노드를 연결
 		- 부모 노드 보다 작으면 왼쪽 / 크면 오른쪽
 */


public class Ex1_TreeSet {
	
	public static void main(String[] args) {
		
		// 1. TressSet 객체 생성
		TreeSet<Integer> scores = new TreeSet<>();
		
		// 2. 무작위로 숫자 저장
		scores.add(95);
		scores.add(87);
		scores.add(75);
		scores.add(99);
		scores.add(80);
		scores.add(77);
		
		System.out.println(scores);	// 자동으로 정렬됨
		
		// 3. 
		System.out.println("가장 왼쪽 노드 : " + scores.first());
		System.out.println("가장 오른쪽 노드 : " + scores.last());
		System.out.println("95점 아래 노드 : " + scores.lower(95));
		System.out.println("95점 위의 노드 : " + scores.higher(95));
		System.out.println("95점 이거나 아래 노드 : " + scores.floor(95));
		System.out.println("95점 이거나 위 노드 : " + scores.ceiling(95));
		
		// 4. 내림차순
		System.out.println("이진트리 내림차순 : " + scores.descendingSet());
		
		// 5. 범위검색
		// tailSet( 숫자, true(이상), false(이하))
		System.out.println("이진트리 80 이상 : " + scores.tailSet(80 , true));
		System.out.println("이진트리 80 이상  90 미만 : " + scores.subSet(80 , true, 90 , false));
		
		
		
		
	}

}



















