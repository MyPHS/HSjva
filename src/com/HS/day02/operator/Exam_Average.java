package com.HS.day02.operator;

import java.util.Scanner;

public class Exam_Average {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("====시험 점수의 평균을 구하겠습니다.====");
		System.out.print("국어 점수 : ");
		int num1 = sc.nextInt();
		System.out.print("수학 점수 : ");
		int num2 = sc.nextInt();
		System.out.print("영어 점수 : ");
		int num3 = sc.nextInt();
		
		int result = (num1+num2+num3)/3;
		System.out.println("평균 : "+ result+"점");
	}

}
