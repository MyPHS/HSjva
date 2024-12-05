package com.HS.day03.condition.loop.exercise;

public class Exercise_For2 {

	public static void main(String[] args) {
		/*
		 * 문제2 : 1부터 10까지의 덧셈을 구하는 프로그램을 작성하여라.
		 * 
		 * 문제1 : 1부터 10까지의 덧셈을 표시하고 합도 구하는 프로그램을 작성하여라.
		 */
		int num1=0; //연산은 두 개의 항이 필요하므로 num1을 선언하여 num과 더해줌.
		for(int num = 1; num<=10; num++) {
			
			if(num<10) {
				System.out.print(num+"+");
			}
			else {
				System.out.print(num +"=");
			}
			num1=num+num1;
			
		}
		System.out.print(num1);
	}

}
