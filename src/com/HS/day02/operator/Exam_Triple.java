package com.HS.day02.operator;

import java.util.Scanner;

public class Exam_Triple {

	public static void main(String[] args) {
		/*
		 * 삼항 연산자
		 * (조건식) ? 참일 때 : 거짓일 때
		 * String result = (num % 2) == 0 ? "짝수" : "홀수:;
		 * System.out.println(result + "입니다");
		 */
//		예제1. 정수를 입력 받아 짝수인지 홀수인지 판별하는 프로그램 작성.
		Scanner sc = new Scanner(System.in);
		System.out.print("정수의 값을 입력해주세요 : ");
		int num = sc.nextInt();		
		String var = "짝수입니다.";
		String var1 = "홀수입니다.";
		String result = (num%2==0)? var:var1;
		System.out.println(result);
	}

}
