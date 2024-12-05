package com.HS.day02.operator;

public class Exam_Logical {

	public static void main(String[] args) {
		/*
		 * 논리 연산자
		 * 조건 2개 이상의 경우 조건의 결과를
		 * 연결해주는 연산자
		 * 1. 남자이면서 평균평점 4.0이상인 사람
		 * 2. 컴퓨터공학과 또는 경영학과인 사람
		 */
		//boolean result, result1, result2, result3;
		//둘 다 성립해야 할 때 : &&, 둘 중 하나라도 성립하면 되는 경우 : ||
		//int num1 = 50;
		//int num2 = 30;
		//result = (num1 == num2) || (num1 > num2);
		//System.out.println(result);
		
		//문제
		int a = 70;
		int b = 55;
		boolean result1 = (a==b)||(a++ <100);
		boolean result2 = (a<b) && (--b <55);
		boolean result3 = (a != b) && (b-- < a++);
		boolean result4 = a++ != b || (b++ >= 85);
		System.out.printf("%b\n", result1);
		System.out.printf("%b\n", result2);
				System.out.printf("%b\n", result3);
						System.out.printf("%b\n", result4);
						System.out.printf("%d\n%d\n", a,b);
								
//		1 true
//		2 false
//		3 true
//		4 true
//		73 54
	}

}
