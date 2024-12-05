package com.HS.day02.operator;

import java.util.Scanner;

public class Exam_Comparison {

	public static void main(String[] args) {
		/*
		 * 비교 연산자
		 * <, > , <=, >= 대소비교
		 * == 동등 비교
		 * 
		 */
		int num1 = 50;
		int num2 = 30;
		boolean result;
		result = num1>num2;
		System.out.println(result);
		result = num1<num2;
		System.out.println(result);
		result = num1 == num2;
		System.out.println(result);
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해주세요 : ");
		int num = sc.nextInt();
		boolean result1 = 1<=num && num<=10;
		String var = (result1)? "1과 10 사이의 정수입니다.":"1과 10 사이의 정수가 아닙니다.";
		System.out.println(var);
	}

}
