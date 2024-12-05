package com.HS.day02.condition;

import java.util.Scanner;

public class Exam_Switch {

	public static void main(String[] args) {
		/*
		 * 제어문
		 * switch문
		 * 문법
		 * switch(변수){
		 * 		실행문1;
		 * 		break;
		 * 		실행문2;
		 * 		break;
		 * 		실행문3;
		 * 		break;
		 * 		default: 실행문0;
		 * }
		 * - if ~ else if와 대응되는 구문이다.
		 */
//		 예제. 정수를 입력받아
//		입력한 값이 1이면 빨간색, 2이면 노란색, 3이면 초록색을 출력하는 프로그램을 작성하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요 : ");
		int num = sc.nextInt();
		switch(num) {
			case 1:System.out.println("빨간색"); break;
			case 2: System.out.println("노란색"); break;
			case 3: System.out.println("초록색"); break;
			default: System.out.println("1~3사이의 숫자를 입력해주세요.");
		}
	}

}
