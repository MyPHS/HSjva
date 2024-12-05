package com.HS.day03.condition.loop.exercise;

import java.util.Scanner;

public class Exercise_Loop4 {

	public static void main(String[] args) {
		/*
		 * 문제4
		 * 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		 * 만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
		 * 첫번째 입력 : 2
		 * 두번째 입력 : 10
		 * 출력 : 2 3 4 5 6 7 8 9 10
		 */
		System.out.println("당신이 입력한 첫 번째, 두 번째 숫자를 포함한 사잇값들을 출력합니다. 숫자를 입력해주세요.");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int num1 = sc.nextInt();
		int num2;
		if(num<num1) {
			for(num2=num; num2<=num1; num2++) {
				System.out.println(num2);
			}
		}
			else if(num>num1) {
				for(num2=num; num2>=num1; num2--)
					System.out.println(num2);
			}
			else if (num1==num){
				System.out.println(num1);
				return;
			}
		
	}

}
