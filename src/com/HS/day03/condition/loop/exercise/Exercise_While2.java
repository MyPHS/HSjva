package com.HS.day03.condition.loop.exercise;

import java.util.Scanner;

public class Exercise_While2 {

	public static void main(String[] args) {
		/*
		 * while문을 이용하여 -1이 입력될 때까지
		 * 정수를 입력받고 -1이 입력되면
		 * 입력한 수의 합을 출력하시오.
		 * 값 : 1
		 * 값 : 2
		 * 값 : -1
		 * 합 : 3
		 */
		System.out.println("-1이 나오기 전의 합을 구하겠습니다.");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("값 : ");
		int num=sc.nextInt();
		int sum = 0;
		while(num!=-1) {
			sum+=num;
			System.out.print("값 : ");
			num=sc.nextInt();
			
		}
		System.out.println("시스템을 종료합니다. 합 : "+sum);
		
		int lastNum;
		int sum1 = 0;
		while((lastNum = sc.nextInt()) != -1) {
			sum1+=lastNum;
			System.out.print("값 : ");
		}
	}

}
