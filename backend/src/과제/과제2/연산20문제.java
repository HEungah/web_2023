package 과제.과제2;

import java.util.Scanner;

public class 연산20문제 {
	
	public static void main(String[] args) {
		
		//------ 문제1 여기에 풀이-------//
		
		System.out.println("|\\_/|");
		System.out.println("|q p|   /}");
		System.out.println("( 0 )\"\"\"\\");
		System.out.println("|\"^\"`    |");
		System.out.println("||_/=\\___|");
		
		
		//------ 문제2 여기에 풀이-------//
		
		Scanner sc = new Scanner(System.in);
		String writer = sc.nextLine();
		String content = sc.nextLine();
		String date = sc.nextLine();
		
		System.out.println("---------------방문록---------------");
		System.out.println("| 순번 | 작성자 |    내용    |  날짜  |");
		System.out.println("| 1 | " + writer + " |  " + content + "  |  " + date + "  |");
		System.out.println("----------------------------------");
		
		
		//------ 문제3 여기에 풀이-------//
		
		int baseSalary = sc.nextInt();
		int extraPay = sc.nextInt();
		int salary = baseSalary + extraPay - (baseSalary/10);
		
		System.out.println("실수령액은 " + salary + "만원 입니다.");
		
		
		
		//------ 문제4 여기에 풀이-------//
		
		int num1 = sc.nextInt();
		int result1 = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 = 0;
		
		result1 = num1/100000;
		result2 = (num1/10000)%10;
		result3 = (num1/1000)%10;
		result4 = (num1/100)%10;
		
		System.out.println("십만원 : " + result1 + "장");
		System.out.println("만원 : " + result2 + "장");
		System.out.println("천원 : " + result3 + "장");
		System.out.println("백원 : " + result4 + "개");
		
		//------ 문제5 여기에 풀이-------//
		
		int num2 = sc.nextInt();
		
		if(num2 % 7 == 0) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
		
		//------ 문제6 여기에 풀이-------//
		
		int num3 = sc.nextInt();
		
		if(num3 % 2 == 0) {
			System.out.println("X");
		}else {
			System.out.println("O");
		}
		
		//------ 문제7 여기에 풀이-------//
		
		int num4 = sc.nextInt();
		
		if(num4 % 2 == 0 && num4 % 7 == 0) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
		
		
		//------ 문제8 여기에 풀이-------//
		
		int num5 = sc.nextInt();
		
		if(num5 % 2 == 1 || num5 % 7 == 0) {
			System.out.println("O");
		}else {
			System.out.println("X");
		}
		
		//------ 문제9 여기에 풀이-------//
		
		int num6 = sc.nextInt();
		int num7 = sc.nextInt();
		
		if(num6 > num7) {
			System.out.println(num6);
		}else if(num6 < num7) {
			System.out.println(num7);
		}else {
			System.out.println("두 수의 크기가 같습니다.");
		}
		
		//------ 문제10 여기에 풀이-------//
		
		int num8 = sc.nextInt();
		double circle = num8 * num8 * 3.14;
		
		System.out.println("원의 넓이는 : " + circle + "입니다.");
		
		
		//------ 문제11 여기에 풀이-------//
		
		double num9 = sc.nextDouble();
		double num10 = sc.nextDouble();
		
		double result6 = (num9 / num10)*100.0;
		
		System.out.println(result6 + "%");
		
		
		//------ 문제12 여기에 풀이-------//
		
		int num11 = sc.nextInt();
		int num12 = sc.nextInt();
		int height = sc.nextInt();
		
		double result7 = (num11 + num12) * height / 2.0;
		
		System.out.println(result7);
		
		
		//------ 문제13 여기에 풀이-------//
		
		int height = sc.nextInt();
		
		double result = (height - 100) * 0.9;
		
		System.out.println(result);
		
		//------ 문제14 여기에 풀이-------//
		
		int height = sc.nextInt();
		int kg = sc.nextInt();
		
		double bmi = kg / ((height / 100.0) * (height / 100.0));
		
		System.out.println(bmi);
		
		
		//------ 문제15 여기에 풀이-------//
		
		int inch = sc.nextInt();
		double cm = inch * 2.54;
		
		System.out.println(cm);
		
		//------ 문제16 여기에 풀이-------//
		
		int midle = sc.nextInt();
		int fin = sc.nextInt();
		int extra = sc.nextInt();
		
		double result = (midle * 0.3) + (fin * 0.3) + (extra * 0.4);
		
		System.out.printf("%.2f점",result);
		
		//------ 문제17 여기에 풀이-------//
		
		int x = 10;
		int y = x-- + 5 + --x;	// 10 + 5 이후 x--후위 감소 x = 9, --x 선위 감소 x = 8 15+8 진행 따라서 y의 값은 23
		System.out.printf("x의 값 : %d, y의 값 : %d ", x, y);
		
		//------ 문제18 여기에 풀이-------//
		
		int age = sc.nextInt();
		
		if(age >=10 && age < 20) {
			System.out.println("학생입니다.");
		}else if(age >= 20 && age <40) {
			System.out.println("성인입니다.");
		}else if(age >= 40) {
			System.out.println("중년입니다.");
		}
		
		//------ 문제19 여기에 풀이-------//
		
		int lan = sc.nextInt();
		int eng = sc.nextInt();
		int math = sc.nextInt();
		
		double sum = lan + eng + math;
		double avg = sum / 3.0;
		
		System.out.printf("총점 : %.0f , 평균 : %.2f", sum, avg);
		
		//------ 문제20 여기에 풀이-------//
		
		String id = sc.nextLine();
		String pw = sc.nextLine();
		
		if(id.equals("admin") && pw.equals("1234")) {
			System.out.println("로그인 성공");
		}else {
			System.out.println("로그인 실패");
		}
		
		//------ 문제21 여기에 풀이-------//
		
		int[] num = new int[3];
		int max = 0;
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}
		
		for(int i = 0; i < num.length; i++) {
			if(num[i] > max) {
				max = num[i];
			}
		}
		
		System.out.println("가장 큰수는 " + max + "입니다.");
		
	}

}


/*

문제1 : 강아지 console 출력
	|\_/|
	|q p|   /}
	( 0 )"""\
	|"^"`    |
	||_/=\\__|

문제2 : 입력받은 3개 데이터를 이용한 표 만들기 
	[입력변수]
		1. 작성자[문자열] , 내용[문자열] , 날짜[문자열] 입력받아 각 변수에 저장 
	[출력 예]
		   --------------방문록--------------------
		   | 순번  | 작성자  | 	내용 	| 날짜       |
		   |  1   | 강호동  |안녕하세요  |  09-28    |
		  ----------------------------------------
	
문제3 : 급여 계산
	[입력조건]
		기본급[정수] , 수당[정수]
	[ 조건 ] 
		 실수령액 = 기본급 + 수당 - 세금[기본급10%] 
	[출력조건] 
		실수령액 출력[ 소수점 없이  ]

문제4 : 지폐 세기 
	 [입력조건 ] 
		금액 
	 [조건 ] 
		 십만원 부터 백원 까지의 개수 세기 
	[ 출력조건 ]
		예) 356789 입력시 
		 십만원 3장 
		 만원 5장
		 천원 6장 
		 백원 7개

문제5 : 하나의 정수를 입력받아 7의 배수인지 출력[ 'O' 혹은 'X' 로 출력]

문제6 : 하나의 정수를 입력받아 홀수 인지 출력 [ 'O' 혹은 'X' 로 출력]

문제7 : 하나의 정수를 입력받아 7의 배수 이면서 짝수 인지 출력 [ 'O' 혹은 'X' 로 출력 ]

문제8 : 하나의 정수를 입력받아 7의 배수 이거나 홀수 인지 출력 [ 'O' 혹은 'X' 로 출력 ]

문제9 : 두개의 정수를 입력받아 더 큰수 출력 

문제10 : 반지름을 입력받아 원 넓이 출력하기 
	계산식) 원 넓이 공식 => 반지름 * 반지름 * 원주율[3.14]

문제11 : 두 실수를 입력받아 앞실수의 값이 뒤의 값의 몇% 인지 출력하기 
	예) 54.5   84.3 실수 2개입력시 결과는   64.285714%

문제12 : 사다리꼴 넓이 구하기[윗변과 밑변 높이를 입력받아 출력하기 
	계산식) 사다리꼴 계산식 = > (윗변 + 밑변) * 높이 / 2

문제13: 키를 정수를 입력받아 표준체중 출력하기 
	계산식) 표준체중 계산식 = > (키 - 100) * 0.9

문제14: 키와 몸무게를 입력받아 BMI 출력하기 
	계산식) BMI 계산식 = > 몸무게 / ((키 / 100) * (키 / 100))

문제15: inch 를 입력받아 cm 로 변환하기 
	계산식) 1 inch -> 2.54cm

문제16:  중간고사, 기말고사, 수행평가를 입력받아 반영비율별 계산하여 소수 둘째자리까지 점수 출력하시오 
	계산식 반영비율)  중간고사 반영비율 => 30 %  / 기말고사 반영비율 => 30 %   / 수행평가 반영비율 => 40 %

문제17 :  연산 순서 나열 하고 printf() 에 출력되는 x 와 y 값을 예측하시오.
	int x = 10;
	int y = x-- + 5 + --x;
	printf(" x의 값 : %d , y의값 :  %d ", x, y)

문제18 : 나이를 입력받아 나이가 10세이상이면 학생 , 20세이상이면 성인 , 40세이상이면 중년 으로 출력하기

문제19 : 국어 , 영어 , 수학 점수를 입력받아 각 변수에 저장하고 총점(소수점 0자리) 출력 , 평균(소수점 2자리 까지) 출력

문제20 : 아이디[문자열] 와 비밀번호[문자열] 를 입력받아 아이디가 'admin' 이고 비밀번호가 '1234' 와 일치하면 로그인성공 아니면 로그인실패 출력

문제21 : 세 정수를 입력받아 가장 큰수 출력 

  
 */
