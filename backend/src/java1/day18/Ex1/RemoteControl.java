package java1.day18.Ex1;

// 인터페이스 선언
public interface RemoteControl {
	// 멤버 구성
		// 1. 상수필드 : 프로그램내 수정 불가능한 데이터
	int MAX_VOLUME = 10;		// public static final 생략
	int MIN_VOLUME = 0;
		// 2. 추상메소드 : 선언만 하고 {} 구현은 하지않는 함수(각 클래스가 구현)
	/*public abstract*/ void turnOn();		// 선언만 하는 전원켜기 함수
	// 선언만 하는 전원끄기 함수
	void turnOff();
	// 선언만하는 볼륨조절 함수
	void setVolume(int volume);
}

/*
  	JVM 실행 메모리
  	
  	1. 메소드영역					2. 스택영역					3.힙영역
  		- 클래스정보					- 함수{}내 변수들			- 객체(인스턴스)
  		- 메소드																- 필드만
  		- static 정적
  		- 인터페이스정보
  		
  		
  	classs 사람{					사람 유재석 = 102번지		유재석객체(나이 = 30) 유재석.밥먹기() -> 30
  		int 나이;					사람 강호동 = 103번지		강호동객체)나이 = 40)	강호동.밥먹기() -> 40
  		void 밥먹기(){
  			print(this.나이)
  		}
  	}
  	
  	
 */