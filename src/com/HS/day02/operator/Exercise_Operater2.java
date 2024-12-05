package com.HS.day02.operator;

import java.util.Scanner;

public class Exercise_Operater2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(1<= num && num<=100) {
			System.out.println("1~100 사이의 숫자입니다.");
		}
		else if(num<1 || num>100) {
			System.out.println("1~100 사이의 숫자가 아닙니다.");
			
		}
		else
			System.out.println("유효한 정수 값을 입력해주세요.");
	}

}
