package 과제.과제10;


public class Member2 {
	//아이디 , 비밀번호 , 이름 , 전화번호 , 나이
	// 필드 : 객체의 데이터를 저장하는 곳 => 인스턴스 vs static
	String id;
	String pw;
	String name;
	String pnum;
	int age;
	// 생성자 : 객체의 초기ㅗ하를 담당하는 역할 => 인스턴스 vs static
	public Member2(String id, String pw, String name, String pnum, int age) {
		super();
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.pnum = pnum;
		this.age = age;
	}
	// 메소드 : 객체의 행동을 정의 => 인스턴스 vs static
		// 1. getter and setter
		// 2. toString : 객체호출시 객체의 주소가 아닌 필드의 값을 반환해주는 함수[*개발자가 검사용으로 사용]
	@Override
	public String toString() {
		return "[id=" + id + ", pw=" + pw + ", name=" + name + ", pnum=" + pnum + ", age=" + age + "]";
	}
	
	
	
	
}


/*
  	JVM : 자바 가상(논리적으로 만들어낸) 메모리
  		
  		Member.java -----클래스로더------> Member.class --------------> 메소드영역
  		자바 코드파일					    바이트코드파일						클래스코드, 메소드코드
  																		정적멤버
  																		
  		this	:	인스턴스멤버 new 힙생성시 할당 되고 힙 초기화 될때 GC 가 처리
  			- static 키워드 없으면 객체를 통해 사용
  		static	:	프로그램 시작시 할당되고 프로그램이 종료될때 메모리 정리[ 전역 / 공통 / 공용 / 공유 ]
  			- static 키워드 있으면 클래스를 통해 사용					
  		final : 수정불가 -> 초기화할때 대입만 가능하고 수정 불가능
  		static final : 상수 -> 프로그램내에서 1개만 저장(static) 수정불가능(final) 합친 키워드
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  		
  					


  
  		
 */
