package com.HS.day03.condition.loop.exercise;

public class Exercise_While1 {
	public static void main(String[]args) {
		/* 문제1
		 * while문을 이용하여 1~10까지의 수를 더한 값을 출력하시오.
		 * 
		 * 문제2
		 * while문을 이용하여 1~100사이의 홀수의 합을 출력하시오.
		 * 
		 */
		
		int num = 1;
		int sum = 0;
		/*while(num<=10) {
			sum = num+sum;
			num++;
			
		}
		System.out.println(sum);*/
		
		while(num<=100) {
			if(num%2==1) {
				sum = num+sum;
				
				if(num<99) {
					System.out.print(num+"+");
				}
				else {
					System.out.print(num+"=");
				}
			}
			num++;
			
			
		}
		System.out.print(sum);
	}
}
