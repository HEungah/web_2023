package java1.day11.Ex5디자인패턴2;

import java1.day11.Ex5디자인패턴2.view.MainPage;

public class AppStart {
	public static void main(String[] args) {
		// 다른 클래스에 있는 메소드를 호출 하는 방법
		// 1. 객체를 이용한 메소드 호출			=> 객체를 이용한 메소드 호출 (각각)
		// 2. 해당 메소드가 static 이면 바로 호출	=> 클래스를 이용한 메소드 호출 (공용)
		// 3. 싱글톤 객체이면 					=> 싱글톤 객체 호출 (프로그램내 1개 객체)
		MainPage.getInstance().mainPage();
		System.out.println();
		
	}
}
