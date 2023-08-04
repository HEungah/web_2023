package 과제.과제11;

import 과제.과제11.view.MainPage;

public class AppStart {
	public static void main(String[] args) {
		
		// 해당객체의 메소드를 사용하기위해 싱글톤객체 호출
			// mainPage객체 반환
			// 반환된 mainPage객체의 mainView() 메소드 실행
		MainPage.getInstance().mainView();
		
		
	}

}
