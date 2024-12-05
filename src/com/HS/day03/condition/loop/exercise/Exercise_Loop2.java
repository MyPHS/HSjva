package com.HS.day03.condition.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop2 {

	public static void main(String[] args) {
		/*
		 * 문제2
		 * 사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
		 * 단, 입력한 수는 1보다 크거나 같아야 합니다.
		 * 정수 입력 : 5
		 * 출력 : 5 4 3 2 1
		 */
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<0) {
			System.out.println("1 이상의 정수를 입력해주세요.");
			return;
		}
		int num1;
		for(num1=num; num1>=1; num1--) {
			System.out.println(num1);
		}
	}

}
