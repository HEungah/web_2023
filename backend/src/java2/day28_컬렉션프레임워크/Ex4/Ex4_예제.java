package java2.day28_컬렉션프레임워크.Ex4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Ex4_예제 {
	
	public static void main(String[] args) {
		
		System.out.println("========= Stack =========");
		// 1. stack 객체(동전케이스) 선언
		Stack<Coin> coinBox = new Stack<>();
		
		// 2. 무작위로 동전 넣기
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		System.out.println("Stack의 상태 : " + coinBox);
		
		// 3. 동전 꺼내기
		coinBox.pop();
		System.out.println("Stack의 상태 : " + coinBox);	// 후입선출이므로 나중에 들어온값이 먼저 삭제(pop)
		
		// ---------------------------------------------------- //
		System.out.println("========= Queue =========");
		
		// 1. Queue 구현체(동전케이스) 선언
		Queue<Coin> coinBox2 = new LinkedList<>();
		
		// 2. 무작위로 동전 넣기
		coinBox2.offer(new Coin(100));
		coinBox2.offer(new Coin(50));
		coinBox2.offer(new Coin(500));
		coinBox2.offer(new Coin(10));
		System.out.println("Queue의 상태 : " + coinBox2);
		
		coinBox2.poll();
		System.out.println("Queue의 상태 : " + coinBox2);	// 선입선출이므로 먼저 들어온값이 먼저 삭제(poll)
		
		
	}

}






















