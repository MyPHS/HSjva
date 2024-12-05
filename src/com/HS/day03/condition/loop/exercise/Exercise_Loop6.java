package com.HS.day03.condition.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop6 {

	public static void main(String[] args) {
		/*
		 * 문제6
		 * 사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		 * 단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		 * 단을 입력하세요 : 5
		 * 5단부터 9단까지 출력
		 * 단을 입력하세요 : 10
		 * 9 이하의 숫자만 입력해주세요.
		 */
		System.out.print("당신이 입력한 숫자부터 9단까지의 구구단을 출력합니다. 숫자 입력 : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num<1 || num>9) {
			System.out.println("1~9 사이의 정수를 입력해주세요.");
			return;
		}
		int num1;
		int num2;
		for(num1=num; num1<=9; num1++) {
			for(num2=1; num2<=9; num2++)
				System.out.println(num1+"X"+num2+"="+num1*num2);
		}
		
	}

}
