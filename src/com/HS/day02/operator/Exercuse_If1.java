package com.HS.day02.operator;

import java.util.Scanner;

public class Exercuse_If1 {

	public static void main(String[] args) {
		/*
		 * 문제1
		 * 점수와 학년을 정수로 입력받아 60점 이상이면 합격
		 * 60점 미만이면 불합격으로 출력한다.
		 * 단, 4학년의 경우 70점 이상이어야 합격을 출력하는 프로그램을 작성하시오.
		 */
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
//		논리 연산자 '||'는 둘 중에 하나라도 맞으면 참을 출력한다.
		if(num<1 || num>4) {
			System.out.println("1~4 사이의 숫자를 입력해주세요.");
					return;
		}
		
		int num1 = sc.nextInt();	
		if(num1<1 || num1>100) {
			System.out.println("1~100사이의 점수를 입력해주세요.");
			return;
		}
		
		if(num<4) {
			if(num1<60) {
				System.out.println("불합격입니다.");
			}
			else {
				System.out.println("합격입니다.");
			}
		}
		if(num==4) {
			if(num1<70) {
				System.out.println("불합격입니다.");
			}
			else {
				System.out.println("합격입니다.");
			}
		}
	}

}
