package com.HS.day03.condition.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop3 {

	public static void main(String[] args) {
		/*
		 * 문제3
		 * 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.    
		 * 더해지는 숫자를 표시해주세요.
		 * 정수 하나 입력 : 5
		 * 1+2+3+4+5=15
		 */
		Scanner sc = new Scanner(System.in);
		int num =sc.nextInt();
		int num1;
		int sum= 0;
		
		for(num1= 1; num1<=num; num1++) {
			sum+=num1;
			if(num1!=num) {
				System.out.print(num1+"+");
			}
			else 
				System.out.print(num1+"=");
			
		}
		System.out.println(sum);
	}

}
