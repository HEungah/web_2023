package java1.day07;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ex1_파일처리 {
	public static void main(String[] args) throws IOException {
		
		// 스택영역 : 함수는 호출시 메모리할당 종료시 메모리 초기화 * 지역변수
		// 힙영역 : 객체/배열은 참조하는 스택이 없으면 자동으로 초기화/삭제
			// ---> RAM 주기억장치
		// 영구저장
			// ---> 보조기억장치 : 명령어를 영구 저장 ---> 컴퓨터가 꺼져있어도 저장(비휘발성)
				 //(c:, usb, cd)
		
		// Ex1_파일처리.java
			// 저장위치 : 내가 작성한 코드/문법 c:~~~~ 보조기억장치
			// 실행[ctrl+f11] : 실행중에 필요한 메모리(변수,객체,배열 등) -> 주기억장치
			// 실행중인 메모리를 다음에 또 사용할려면 주기억장치 메모리를 보조기억장치 저장/불러오기
			
			// String a = scanner.next(); --------------> c: 저장
			// 컴퓨터 종료후 다음날
			// String b =		<-------------- c: 불러오기 [파일처리, 데이터베이스]
			
		// 파일처리 라이브러리(미리 만들어진 클래스/메소드)
			// * 스트림 : 자바 외부와 통신할때 사용할때 통로 [*바이트단위]
				// *통신하다가 갑자기 오류 발생할수도 있음[*필수적으로 예외처리/오류처리 를해야한다]
			// 1. FileOutputStream("파일경로") : 해당파일과 연동/연결(없으면 생성)
			// 	  FileOutputStream("파일경로", true ) : 해당파일이 존재하면 이어쓰기
		
			// 파일경로 :
				// 상대경로 : 프로젝트명생략 -> ./src/패키지명/파일명
				// 절대경로 : C:\Users\504\git\web_2023\backend\src\java1\day07\Ex1_파일처리.java
			// 2. 제공하는 함수
				//1. write(바이트배열) : 1바이트=한글자(영문)	바이트배열=여러글자
				//2. 해당 문자열을 바이트배열로 변환( 문자열.getBytes() )
		Scanner scanner = new Scanner(System.in);	// 입력객체 = 입력한 값이 바이트로 들어옴
		String instr = scanner.nextLine() + "\n";	// 객체 입력받은 값 바이트열을 문자열로 반환
		
		
		
		// 1. 파일처리[ 저장 ]
		FileOutputStream fileOutputStream = new FileOutputStream("./src/java1/day07/Ex1_테스트.txt",true);
		
		fileOutputStream.write(instr.getBytes());	// 문자열 ---> 바이트배열로 변환
		
		// 2. 파일처리 [ 불러오기 ]
			// 1. 파일입력스트림 객체 선언[ 파일경로 ]
		FileInputStream fileInputStream = new FileInputStream("./src/java1/day07/Ex1_테스트.txt");
			// 2. 파일입력스트림 객체를 이용한 파일내용 읽어오기 [ 바이트 단위 ]
		byte[] intstrArray = new byte[1000];	// 파일의 바이트만큼 배열 선언[*정확한 파일의 용량 알수 없어서 임의로 결정]
		fileInputStream.read(intstrArray);
			// 3. 읽어온 바이트배열을 문자열로 변환
		String str = new String(intstrArray);	// *빈 바이트는 공백으로 채운다
		System.out.println(str);
		
		// FileInputStream : 파일 불러오기 관련된 메소드 제공하는 클래스
		// new FileInputStream("파일경로") : 해당파일과 연동/연결
		// .read(바이트배열) : 해당 객체와 연결된 파일의 바이트 읽어오기
		
		
		
		// 3. 외부파일 불러오기[ CSV 불러오기 ]
			// 1. 역대 로또 번호 (csv 파일)
		FileInputStream 복권파일 = new FileInputStream("./src/java1/day07/로또.csv");
		
		// File : 파일에 관한 메소드 제공
		//	메소드
		//		1. 존재여부	file.exists()
		//		2. 삭제		file.getPath()
		//		3. 경로		file.length()
		File file = new File("./src/java1/day07/로또.csv");
			System.out.println("해당 경로에 파일존재여부 : " + file.exists());
			System.out.println("해당 파일의 경로 : " + file.getPath());
			System.out.println("해당 파일의 용량(바이트) : " + file.length());
		
		byte[] 복권파일바이트배열 = new byte[(int)file.length()];
			// 3. 읽어오기
		복권파일.read(복권파일바이트배열);
		String 복권파일정보 = new String(복권파일바이트배열);
		
		System.out.println(복권파일정보);
		
		// 4. 외부파일 불러오기[ CSV 불러오기 ]
		String path = "./src/java1/day07/전국관광지정보표준데이터.csv";
		FileInputStream 관광지파일 = new FileInputStream(path);
		File  file2 = new File(path);	// 파일 정보 객체 생성
		byte[] 관광지파일바이트배열 = new byte[(int)file2.length()];	// 파일 용량만큼의 바이트배열을 선언
		관광지파일.read(관광지파일바이트배열);
		String 관광지파일정보 = new String(관광지파일바이트배열, "EUC-KR");
//		String 관광지파일정보 = new String(관광지파일바이트배열, "UTF-8");
		
		System.out.println(관광지파일정보.split("\n")[7]);
		// 한글 인코딩(번역) 방법 대표적으로 2가지 : UTF-8, EUC-KR

		
		
			
	}

}


















