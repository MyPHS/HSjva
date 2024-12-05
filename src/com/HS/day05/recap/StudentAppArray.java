package com.HS.day05.recap;

import java.util.Scanner;

public class StudentAppArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] score = new int[3];
		
		finish:
		while(true) {
			System.out.println("=====메인 메뉴=====");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 종료");
			System.out.print("선택 >> ");
			int choice = sc.nextInt();
		switch(choice) {
			case 1:
				System.out.println("=====성적 입력=====");
				System.out.print("국어 : ");
				score[0]= sc.nextInt();
				System.out.print("영어 : ");
				score[1]= sc.nextInt();
				System.out.print("수학 : ");
				score[2]= sc.nextInt();
				break;
			case 2 : 
				System.out.println("=====성적 출력 =====");
				System.out.println("국어 : " + score[0]);	
				System.out.println("영어 : " + score[1]);	
				System.out.println("수학 : " + score[2]);	
				System.out.println("총점 : "+ (score[0]+score[1]+score[2]));	
				System.out.println("평균 : "+ (score[0]+score[1]+score[2])/(double)score.length);	
				break;
		
			case 3 :
				System.out.println("=====프로그램이 종료 되었습니다.=====");
				break finish;
			default : 
				System.out.println("1~3 사이의 수를 입력해주세요."); break;
		}
		}
	}

}
