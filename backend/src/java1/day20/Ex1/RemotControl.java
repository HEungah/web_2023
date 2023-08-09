package java1.day20.Ex1;

public interface RemotControl {	// 인터페이스 선언
	// 인터페이스 : 두 장치(객체)를 연결하는 접속기
	// 구성멤버
		// 1. 상수 필드				[ public static final 생략 ]
		int MAX_VOLUME = 10;
		static final int MIN_VOLUME = 0;		// 수정 불가능
		// 2. 추상 메소드			[ public abstract 생략 ] : 선언부 -> 구현객체
		void turnOn();
		public abstract void turnOff();
		void setVolume(int volume);
		// 3. 디폴트 메소드	[ public default ]
		// 선언부 + 실행부 -> 구현객체 o
		default void setMute(boolean mute){
			if(mute) {
				System.out.println("무음 처리합니다."); 
				setVolume(MIN_VOLUME);}
				else {System.err.println("무음을 해제합니다.");
			}
		}
			
		public default void geMute() {
			System.out.println();
		}
		
		// 4. 정적메소드 정적(객체없이) 메소드 [public] static : 선언부 + 실행부 -> 구현객체x
		static void changeBatter() {System.out.println("리모컨 건전지를 교환합니다.");}
		public static void chackBattery() {System.out.println("건전지를 확인합니다.");}
		
		// ---> java 9이상 지원
		// 5. private 메소드 : 외부에서 구현 x, 디폴트메소드 안에서만 호출 가능
		private void defalutCommon() {System.out.println();};
		// 6. private 정적메소드 : 디폴트메소드, 정적메소드 호출 가능
		private static void staticCommon() {System.out.println("정적메소드");}
}


/*
 		인스턴스 멤버 : 객체 생성시 메모리 할당되는 필드, 메소드 [ static 없는 ]
 		정적멤버		: 객체가 없어도 메모리 우선할당된 필드, 메소드 [ static 있는 ]
 		 - 정적멤버는 인스턴스멤버에 접근할 수 있다.
 */
















