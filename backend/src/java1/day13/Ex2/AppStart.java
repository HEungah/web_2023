package java1.day13.Ex2;

import java1.day13.Ex2.view.MainPage;

public class AppStart {
	public static void main(String[] args) {	// main start
		
		// 다른 클래스/객체 호출
		MainPage.getInstance().mainView();
			// MainPage ---> 클래스
			// getInstance() ---> 클래스 객체를 반환하는 메소드
			// mainView() ---> MainPage 객체의 메소드
				// mainView() 메소드는 static이 아니기때문에 객체가 필요하다!!!
		
	}	// main end
	
	
}
