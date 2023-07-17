package 과제.과제3;

import java.util.Scanner;

public class If문제7문제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/* -------문제1----- */
		System.out.printf("(문제1)첫번째 수 입력 => ");
		int num = sc.nextInt();
		System.out.printf("(문제1)두번째 수 입력 => ");
		int num2 = sc.nextInt();
		
		if(num > num2) {
			System.out.println("더 큰수 => " + num);
		}else if(num < num2) {
			System.out.println("더 큰수 => " + num2);			
		}else {
			System.out.println("두 수의 크기는 같다.");
		}
		
		/* -------문제2----- */
		System.out.printf("(문제2)첫번째 수 입력 => ");
		num = sc.nextInt();
		System.out.printf("(문제2)두번째 수 입력 => ");
		num2 = sc.nextInt();
		System.out.printf("(문제2)세번째 수 입력 => ");
		int num3 = sc.nextInt();
		int max = 0;
		
		if(num > num2) {
			if(num > num3) {
				max = num;
			}else {
				max = num3;
			}
		}else {
			if(num2 > num3) {
				max = num2;
			}else {
				max = num3;
			}
		}
		System.out.println("가장 큰 수 => " + max);
		
		/* -------문제3----- */
		System.out.printf("(문제3)첫번째 수 입력 => ");
		num = sc.nextInt();
		System.out.printf("(문제3)두번째 수 입력 => ");
		num2 = sc.nextInt();
		System.out.printf("(문제3)세번째 수 입력 => ");
		num3 = sc.nextInt();
		
		if(num > num2) {
			if(num > num3) {
				max = num;
			}else {
				max = num3;
			}
		}else {
			if(num2 > num3) {
				max = num2;
			}else {
				max = num3;
			}
		}
		
		int mid = 0;
		int min = 0;
		
		if(num < num2) {
			if(num < num3) {
				min = num;
			}else {
				min = num3;
			}
		}else {
			if(num2 < num3) {
				min = num2;
			}else {
				min = num3;
			}
		}
		
		mid = (num + num2 + num3) - (max + min);
		
		System.out.println("오름차순 정렬 => " + max + " " + mid + " " + min);
		System.out.println("내림차순 정렬 => " + min + " " + mid + " " + max);
		
		/* -------문제4----- */
		System.out.printf("(문제4)점수를 입력하세요 => ");
		int score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
		
		/* -------문제5----- */
		System.out.printf("(문제5)점수를 입력하세요 => ");
		score = sc.nextInt();
		
		if(score >= 90) {
			System.out.println("A등급");
		}else if(score >= 80) {
			System.out.println("B등급");
		}else if(score >= 70) {
			System.out.println("C등급");
		}else {
			System.out.println("재시험 대상자입니다.");
		}
		
		/* -------문제6----- */
		System.out.printf("(문제6)국어 점수를 입력해주세요 => ");
		int kor = sc.nextInt();
		System.out.printf("(문제6)영어 점수를 입력해주세요 => ");
		int eng = sc.nextInt();
		System.out.printf("(문제6)수학 점수를 입력해주세요 => ");
		int mat = sc.nextInt();
		int avg = (kor + eng + mat) / 3;
		
		if(avg >= 90) {
			if(kor == 100) {
				System.out.println("국어우수");
			}
			if(eng == 100) {
				System.out.println("영어우수");
			}
			if(mat == 100) {
				System.out.println("수학우수");
			}
			if(kor != 100 && eng != 100 && mat != 100) {
				if(kor >= 90) {
					System.out.println("국어장려");
				}
				if(eng >= 90) {
					System.out.println("영어장려");
				}
				if(mat >= 90) {
					System.out.println("수학장려");
				}
			}
		}else if(avg >= 80) {
			if(kor >= 90) {
				System.out.println("국어장려");
			}
			if(eng >= 90) {
				System.out.println("영어장려");
			}
			if(mat >= 90) {
				System.out.println("수학장려");
			}
		}else {
			System.out.println("재시험 대상자입니다.");
		}
		
		/* -------문제7----- */
		System.out.printf("(문제7)아이디를 입력해주세요 => ");
		String id = sc.next();
		System.out.printf("(문제7)비밀번호를 입력해주세요 => ");
		String pw = sc.next();
		
		if(id.equals("admin")) {
			if(pw.equals("1234")) {
				System.out.println("로그인성공");
			}else {
				System.out.println("로그인실패");
			}
		}else {
			System.out.println("로그인실패");			
		}
		
	}
	
}

/*
 	 문제1 : 2개의 정수를 입력받아서 더 큰수 출력 [ 경우의수 : 3개(크다,작다,같다=그외) ]
 	 문제2 : 3개의 정수를 입력받아서 가장 큰수 출력 
 	 문제3 : 3개의 정수를 입력받아서 오름차순[>] / 내림차순[<] [ 경우의수 :  3 7 5 : 3>7 , 3>5 , 7>5     총 : 3개  ] 
 	 문제4 : 점수를 입력받아 점수가 90점 이상이면 합격 아니면 불합격 출력 [ 경우의수 : 2개 ]
 	
 	 문제5 : 
			// 점수를 입력받아 점수가 90점 이상이면 A등급
			//				점수가 80점 이상이면 B등급
			//				점수가 70점 이상이면 C등급
			//				그외 재시험
	
	
 	 문제6	[ 경우의수 3개 , 첫번째 경우의수 : 3개 , 두번째 경우의수 : 3개 ] 총 9개  
			[ 입력 ] : 국어,영어,수학 입력받기
			[ 조건 ]
				평균이 90점 이상이면서 
					국어점수 100점 이면 '국어우수' 출력
					영어점수 100점 이면 '영어우수' 출력
					수학점수 100점 이면 '수학우수' 출력
				평균이 80점 이상이면서 
					국어점수 90점이상 이면 '국어장려' 출력
					영어점수 90점이상 이면 '영어정려' 출력
					수학점수 90점이상 이면 '수학장려' 출력
				그외 재시험 
		 
	문제7 로그인페이지
	 		[ 입력 ] : 아이디와 비밀번호를 입력받기
	 		[ 조건 ] : 회원아이디가 admin 이고 
	           			비밀번호가 1234 일 경우에는 
	          			로그인 성공 아니면 로그인 실패 출력
 */