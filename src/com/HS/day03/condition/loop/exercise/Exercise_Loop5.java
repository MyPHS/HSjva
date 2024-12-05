package com.HS.day03.condition.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop5 {

	public static void main(String[] args) {
		/*
		 * 문제5
		 * 사용자로부터 입력 받은 숫자의 구구단을 출력하세요.
		 */
		
		System.out.print("당신이 입력한 숫자의 구구단을 출력합니다. 숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1;
		for(num1=1; num1<=9; num1++) {
			System.out.println(num+"X"+num1+"="+ num*num1);
		}
	}

}
