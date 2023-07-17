package java1.day03;

import java.util.Random;

public class Ex1_조건문 {
	public static void main(String[] args) {
		
		// 1.
		int score = 93;
		if(score >= 90) {
			System.out.println("합격1");
		}
		
		// 2.
		if(score >= 90) 
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A등급입니다.");
		
		// 3.
		if(score >= 90) { 
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A등급입니다.");
		}
		
		// 4.
		if(score >= 90) {
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A등급 입니다.");
		}else if(score >= 80) {
			System.out.println("점수가 90~80 입니다.");
			System.out.println("등급은 B등급 입니다.");
		}else if(score >= 70) {
			System.out.println("점수가 80~70 입니다.");
			System.out.println("등급은 C등급 입니다.");
		}else {
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D등급 입니다.");
		}
		//------------------------------------------
		if(score >= 90) {
			System.out.println("점수가 100~90 입니다.");
			System.out.println("등급은 A등급 입니다.");
		}
		if(score >= 80) {
			System.out.println("점수가 90~80 입니다.");
			System.out.println("등급은 B등급 입니다.");
		}
		if(score >= 70) {
			System.out.println("점수가 80~70 입니다.");
			System.out.println("등급은 C등급 입니다.");
		}
		if(score < 70){
			System.out.println("점수가 70 미만입니다.");
			System.out.println("등급은 D등급 입니다.");
		}
		
		// 난수
		System.out.println(Math.random()); 		// 0 ~ 1 미만사이의 실수값 난수생성
		System.out.println(Math.random() * 6); 	// 0 ~ 6 미만사이의 실수값 난수생성
		System.out.println((int)Math.random()*6); 	// 0 ~ 6 미만사이의 정수값 난수 생성
		System.out.println((int)(Math.random()*6) + 1); 	// 1 ~ 7 미만사이의 정수값 난수 생성
		
		// 정수 난수 공식 : (int)(Math.random() * n) + s
			// s : 난수 시작번호 		// n : 난수 개수
		
		// 예시) 1~45
		System.out.println((int)((Math.random()*45) + 1));
		
		// 난수 생성 클래스 : Random 클래스
		Random random = new Random();
		System.out.println(random.nextInt(45) + 1);
		
		int dice = (int)(Math.random()*6) + 1;
		
		// switch 예제
		switch(dice) {
			case 1 :
				System.out.println("1번이 나왔습니다.");
				break;
			case 2 :
				System.out.println("2번이 나왔습니다.");
				break;
			case 3 :
				System.out.println("3번이 나왔습니다.");
				break;
			case 4 :
				System.out.println("4번이 나왔습니다.");
				break;
			case 5 :
				System.out.println("5번이 나왔습니다.");
				break;
			default :
				System.out.println("6번이 나왔습니다.");
		}
		
		
		
		
		// if 예제
		if(dice == 1) {
			System.out.println("1번이 나왔습니다.");
		}else if(dice == 2) {
			System.out.println("2번이 나왔습니다.");
		}else if(dice == 3) {
			System.out.println("3번이 나왔습니다.");
		}else if(dice == 4) {
			System.out.println("4번이 나왔습니다.");
		}else if(dice == 5) {
			System.out.println("5번이 나왔습니다.");
		}else if(dice == 6) {
			System.out.println("6번이 나왔습니다.");
		}
		
		int score2 = (int)(Math.random()*20) + 81;
		System.out.println("점수 : " + score2);
		
		String grade;
		
		if(score2 >= 90) {
			if(score2 >= 95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		}else {
			if(score2 >= 85) {
				grade = "B+";
			}else {
				grade = "B";
			}
		}
		
		System.out.println("학점 : " + grade);
		
		char grade2 = 'B';
		
		switch(grade2) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다.");
				break;
			case 'B':	
			case 'b':
				System.out.println("일반 회웝입니다.");
				break;
			default:
				System.out.println("손님입니다.");
				
		}
		
		
	}

}

/*
 * if = 조건에 따른 true/false 실행
 * switch = 변수 값에 따른 실행
 */























