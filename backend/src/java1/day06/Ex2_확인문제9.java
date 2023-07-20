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
		int ch = sc.nextInt();
		
		if(ch == 1) {	// 학생수 선택 s
			System.out.printf("학생수 >>> ");
			studentNum = sc.nextInt();
		}else if(ch == 2){
			if(studentNum < 1) {
				System.out.println("학생수를 입력해주세요.");
				continue;
			}
			for(int i=0; i < studentNum; i++) {
				System.out.printf("scores[" + i + "] >>> ");
				score[i] = sc.nextInt();
			}
		}else if(ch == 3) {
			if(studentNum < 1) {
				System.out.println("점수를 입력해주세요.");
				continue;
			}
			for(int i=0; i < studentNum; i++) {
				System.out.printf("scores[" + i + "] : " + score[i] + "\n");
			}
		}else if(ch == 4) {
			int max = 0;
			int sum = 0;
			double avg = 0;
			if(studentNum < 1) {
				System.out.println("점수를 입력해주세요.");
				continue;
			}
			for(int i=0; i < studentNum; i++) {	// for s
				if(score[i] > max) {
					max = score[i];
				}
				sum += score[i];
			}	// for e
			avg = (double)sum / (double)studentNum;
			System.out.println("최고 점수  : " + max);
			System.out.println("평균 점수  : " + avg);
		}else if(ch == 5) {
			System.out.println("[ 프로그램종료 ]");
			break;
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		
		
		
		
		}	// while e
		
	}	// main e

}	// class e
