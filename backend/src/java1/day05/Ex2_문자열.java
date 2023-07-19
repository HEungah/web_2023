package java1.day05;

public class Ex2_문자열 {
	public static void main(String[] args) {
		
		String name1 = "홍길동";	// 10번지
		String name2 = "홍길동";	// 10번지
		
		System.out.println(name1 == name2);
			// 두 스택영역의 지역변수가 참조하는 주소는 같다
		
		System.out.println(name1.equals(name2));
			// name1과 name2는 문자열이 같다.
		
		String name3 = new String("홍길동");	// 11번지
		String name4 = new String("홍길동");	// 12번지
		
		System.out.println(name3 == name4);
			// 문자열 리터럴이 아닌 new 연산자를 이용한 객체 생성시의 주소는 같지 않다
		
		System.out.println(name3.equals(name4));
			// name3과 name4는 문자열이 같다.
		
		String ssn = "9549813849123";	// 문자열 객체 선언 13글자 인덱스 0~12
		char c1 = ssn.charAt(6);	// 문자 '3' 추출
		System.out.println(c1);
		
		System.out.println("문자열 ssn의 길이 >>> " + ssn.length());
		
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "JAVA");
			// 특정문자열을 다른 문자열로 대체
		
		System.out.println(newStr);
		
		ssn = "880815-1234567";
		
		String firstNum = ssn.substring(0,6);	// 0번 인덱스부터 6번 인덱스 '앞'까지 추출
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7);	// 7번 인덱스부터 끝까지 추출
		System.out.println(secondNum);
		
		System.out.println(ssn.split("-"));
			// "880815-1234567" --> "-"를 기준으로 분리	{880815, 1234567} --> 분리기준인 "-"는 삭제
		
		for(int i = 0; i < ssn.split("-").length; i++) {
			System.out.println(ssn.split("-")[i]);
		}
		
		String subject = "자바 프로그래밍";
		
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		String substring = subject.substring(location);
		System.out.println(substring);
		
		location  = subject.indexOf("자바");
		if(location != -1) {
			System.out.println("자바와 관련된 책이군요.");
		}else {
			System.out.println("자바와 관련 없는 책이군요.");
		}
		
		boolean result = subject.contains("자바");
		if(result) {
			System.out.println("자바와 관련된 책이군요.");			
		}else {
			System.out.println("자바와 관련 없는 책이군요.");			
		}
		
	}

}

/*
  	자바 문자열 사용하는 방법
  		1. String 변수명 = "문자열"
  		2. String 변수명 = new String("문자열");
  		
  	자바 문자열에서 제공해주는 라이브러리=미리 만들어진 함수들
  		문자열객체.메소드명()
  		1. 문자열객체1.equals(문자열객체2)		:	두 문자열 객체내 문자열이 동일하면 true 아니면 false를 반환
  		2. 문자열객체.charAt(인덱스)			:	문자열내 해당 인덱스의 문자1개 추출[첫번째 글자 = 인덱스 0]
  		3. 문자열객체.length()				:	문자열에서 문자의 개수 반환(문자열의 길이)
  		4. 문자열객체.replace("대체될문자열", "대체할문자열")	:	특정문자열을 다른 문자열로 대체
  		5. 문자열객체.substring(인덱스)		:	특정 위치의 문자열을 잘라내어 반환	
  		6. 문자열객체.split("분리기준문자")	:	문자열내 분리기준문자로 분리해서 '배열'로 반환
  		7. 문자열객체.indexOf("특정문자열")	:	문자열내 찾을 문자열이 존재하면 찾은 인덱스 반환
  		8. 문자열객체.contains("특정문자열")	:	문자열내 찾을 문자열이 존재하면 true를 아니면 false를 반환
  		
 */










