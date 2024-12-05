package com.HS.day02.operator;

import java.util.Scanner;

public class Exercise_Switch2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("당신의 점수를 입력해주세요 : ");
		int score = sc.nextInt();
		char ch;
		if(score>100 || score<0) {
			System.out.println("1~100 사이의 점수를 입력해주세요.");
			return;
		}
		
		switch(score/10) {
		case 10 : 
			ch = 'A';
			break;
		case 9 : 
			ch = 'A';
			break;
		case 8 : 
			ch = 'B';
			break;
		case 7 :
			ch = 'C';
			break;
		case 6 :
			ch = 'D';
			break;
		default : 
			ch = 'F';
			break;
		}
		System.out.println("당신의 학점은 "+ch+"입니다.");
	}

}
