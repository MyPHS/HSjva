package com.HS.day01.basic;

import java.util.Scanner;

public class Exam_Constant {
	public static void main(String[] args) {
//		원의 면적을 구하는 프로그램을 작성해보자.
//		원의 면적 = 반지름 * 반지름 * PI
		System.out.println("원의 면적을 구하는 프로그램입니다.");
		final double PI = 3.14;
		System.out.print("원의 반지름을 입력해주세요 : ");
		Scanner sc = new Scanner(System.in);
//		PI = 3.24; -> final로 고정해놓은 PI값은 변경할 수 없음.
		
		double radius = sc.nextDouble();
		double circleArea = radius * radius * PI;
		System.out.println("원의 면적은 " + circleArea+" 입니다");
//		반지름을 입력해주세요 : 10.2
//		원의 면적 : 326.68559999999997
	}

}
