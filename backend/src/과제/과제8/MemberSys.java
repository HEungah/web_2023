package 과제.과제8;

import java.util.Scanner;

// 목적 : 실행
public class MemberSys {
	public static void main(String[] args) {	// main start
		
		// 0. 여러개 Member객체를 저장 예정인 객체 100개를 저장하는 배열 선언
		Member[] memberList = new Member[100];
		Scanner sc = new Scanner(System.in);
		
		while(true) {	// while start
			// 1.무한 출력
			System.out.println("--------------회원 시스템--------------");
			System.out.print("1.회원가입 2.로그인  선택 >>>>");
			// 2.무한 입력
			int ch = sc.nextInt();
			
			// 3.입력/선택 경우의 수
			if(ch == 1) {
				System.out.println("--------------회원가입--------------");
				// 1. 각 입력받아 저장
				System.out.print("아이디 : "); String inputId = sc.next();
				System.out.print("비밀번호 : "); String inputPw = sc.next();
				System.out.print("이름 : "); String inputName = sc.next();
				System.out.print("전화번호 : "); String inputPnum = sc.next();
				System.out.print("나이 : "); int inputAge = sc.nextInt();
				
				// 2. 5가지 데이터를 하나로 묶음 (문자열 vs 객체)
				Member member = new Member();	// 인스턴스화(객체생성)
				// 객체내 필드 수정
				// .(도트연산자) : 접근연산자(스택변수가 알고 있는 객체주소로 이동)
				member.id = inputId; member.pw = inputPw;
				member.name = inputName; member.pnum = inputPnum;
				member.age = inputAge;
				
				// 3. 여러개의 객체를 저장하기 위해 배열에 저장
					// *비어 있는 인덱스(기본값인 데이터)를 찾아서 인덱스에 객체 저장
				for(int i = 0; i < memberList.length; i++) {
					if(memberList[i] == null) {
						memberList[i] = member;
						System.out.println(memberList[i].id + " " +
											memberList[i].pw + " " +
											memberList[i].name + " " +
											memberList[i].pnum + " " +
											memberList[i].age);
						break;
					}
				}
			}
			else if(ch == 2) {
				System.out.println("--------------로그인--------------");
				// 입력받기
				System.out.print("아이디 : "); String inputId = sc.next();
				System.out.print("비밀번호 : "); String inputPw = sc.next();
				
				// 동일한 값있는지 비교하기
				int login = -1;	// 로그인 여부를 저장하는 변수 (-1 : 못찾음, 찾았으면 그 인덱스번호 저장)
				for(int i = 0; i < memberList.length; i++) {
					if(memberList[i] != null &&
							memberList[i].id.equals(inputId) && memberList[i].pw.equals(inputPw)) {
						login = i;	// 성공한 인덱스 저장 (로그인 상태 활용 가능)
						break;
					}
				}	// for end
				if(login >= 0) {
					System.out.println("로그인성공");
				}else {
					System.out.println("로그인실패");
				}
				
			}
			
			
		}	// while end
	}	// main end

}

/*
 	주제 : 회원제 시스템
 		0. 저장
 			아이디, 비밀번호, 이름, 전화번호, 나이
 			* 5가지(서로다른 타입) 필드/변수/데이터 를 하나로 묶는 방법
 			---> 문자열 이용 : "아이디,비밀번호,이름,전화번호,나이" : ,쉼표 이용한 필드 구분
 			---> 클래스(필드) 이용 : 
 					1. 클래스 설계 => 새로운 클래스.java 파일 생성
 					2. 클래스 멤버 구성 : 필드, 생성자, 메소드
 			* 하나로 묶인 여러개(같은 타입) 저장
 			---> 문자열 배열 : String[] 문자열배열 = new String[100];
 			---> 클래스 배열 : Member[] 객체배열 = new Member[100];		
 		1. 초기메뉴
 			1. 회원가입 2. 로그인
 			
 		2. 조건 기능
 			1. 회원가입
 				1. 아이디, 비밀번호, 이름, 전화번호, 나이 각 입력받아 저장
 				2. Member 객체화
 				3. 객체를 배열 저장
 				
 			2. 로그인
 				1. 아이디, 비밀번호 입력받아 저장
 				2. 배열내 입력받은 값과 동일한 값 찾기
 					- 만약에 동일한 값 있으면 로그인 성공
 					- 아니면 실패
 */




















