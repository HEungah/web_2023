package java1.day06;

import java.util.Scanner;

public class Ex2_확인문제9 {// class s
	public static void main(String[] args) {	// main s
		
		Scanner sc = new Scanner(System.in);
		int[] score = new int[30];
		int studentNum = 0;
		
		while(true) {	// while s
		
		System.out.println("---------------------------------------------");
		System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
		System.out.println("---------------------------------------------");
		
		System.out.printf("선택 >>> ");
		String ch = sc.nextLine();
		
		if(ch.equals("1")) {	// 학생수 선택 s
			System.out.printf("학생수 >>> ");
			studentNum = sc.nextInt();
			sc.nextLine();
			score = new int[studentNum];
		}else if(ch.equals("2")){
			if(studentNum < 1) {
				System.out.println("학생수를 입력해주세요.");
				continue;
			}
			for(int i=0; i < score.length; i++) {  
				System.out.printf("scores[" + i + "] >>> ");
				score[i] = sc.nextInt();
			}
			sc.nextLine();
		}else if(ch.equals("3")) {
			if(studentNum < 1) {
				System.out.println("점수를 입력해주세요.");
				continue;
			}
			for(int i=0; i < score.length; i++) {
				System.out.printf("scores[" + i + "] : " + score[i] + "\n");
			}
		}else if(ch.equals("4")) {
			int max = 0;	// 최고 점수를 저장하는 변수
			int sum = 0;	// 모든 학생들의 점수의 합계를 저장하는 변수
			double avg = 0;	// 학생들의 평균 점수를 저장하는 변수
			if(studentNum < 1) {
				System.out.println("점수를 입력해주세요.");
				continue;
			}
			for(int i=0; i < score.length; i++) {	// for s
				if(score[i] > max) {
					max = score[i];
				}
				sum += score[i];
			}	// for e
			avg = (double)sum / (double)score.length;
			System.out.println("최고 점수  : " + max);
			System.out.println("평균 점수  : " + avg);
		}else if(ch.equals("5")) {
			System.out.println("[ 프로그램종료 ]");
			break;
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		
		
		
		
		}	// while e
		
	}	// main e

}	// class e

