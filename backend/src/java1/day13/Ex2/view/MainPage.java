package java1.day13.Ex2.view;

import java.util.Scanner;

public class MainPage {
	// 싱글톤 사용(o)
	
	// 본인 클래스안에 본인 객체 생성(private)
	private static MainPage mainPage = new MainPage();
	private Scanner sc = new Scanner(System.in);
	
	// 외부에서 객체 생성을 차단하는 private 생성자
	private MainPage() {}
	
	// 외부에서 간접적으로 객체가 호출할수있도록 함
	public static MainPage getInstance() {
		return mainPage;
	}
	
	// 글등록 페이지 입출력 함수
	public void mainView() {
		while(true) {
			System.out.println("\n\n >>>>> 방문록 프로그램 >>>>>");
			System.out.println("1. 글등록 2. 글보기 3. 글삭제 4. 글수정");
			int ch = sc.nextInt();
			
			if(ch == 1) {}
			if(ch == 2) {}
			if(ch == 3) {}
			if(ch == 4) {}
			
		}	// while end
	}
	
	// 글출력 페이지 입출력 함수
	
	// 글삭제 페이지 입출력 함수
	
	// 글수정 페이지 입출력 함수
}
