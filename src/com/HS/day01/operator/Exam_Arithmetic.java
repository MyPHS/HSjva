package com.HS.day01.operator;

import java.util.Scanner;

public class Exam_Arithmetic {

	public static void main(String[] args) {
		//초 단위의 정수를 입력받고, 몇 시간, 몇 분, 몇 초인지
		//출력하는 프로그램을 작성하여라.
		//초단위의 정수 입력 : 3000
		//0시간 50분 0초입니다.
		
//		System.out.println(11+18);
//		System.out.println(11-18);
//		System.out.println(11*18);
//		System.out.println(11/18);//나눈 몫 출력
//		System.out.println(11%18);//나누고 남은 나머지만 출력
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		System.out.println(num/86400+"일 "+num%86400/3600+"시간 "+ num%3600/60+"분 "+ num%60+"초");
	}

}
