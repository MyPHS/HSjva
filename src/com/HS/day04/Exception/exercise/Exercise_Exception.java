package com.HS.day04.Exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception {

	public static void main(String[] args) {	
		/*
		 * 두 개의 정수를 입력받아 나눈 후
		 * 그 결과를 출력하는 프로그램을 작성하여라.
		 */
		Scanner sc = new Scanner(System.in);
		while(true) {
			double sum = 0;
		try {
			System.out.print("첫 번째 정수 입력 : ");
			int num = sc.nextInt();
			System.out.print("두 번째 정수 입력 : ");
			int num1 = sc.nextInt();
			
			sum = num/num1;
			
			
		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
			continue;
		}
		catch (InputMismatchException e) {
			sc.next();
			System.out.println("정수를 입력해주세요.");
			continue;
		}
		System.out.println("결과 : "+sum);
		}
	}

}
