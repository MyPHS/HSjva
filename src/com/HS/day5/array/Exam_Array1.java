package com.HS.day5.array;

import java.util.Scanner;

public class Exam_Array1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i;
		int sum = 0;
		int [] nums = new int[5];
		// 24 11 18 5 2 저장 후 평균을 구하는 프로그램 작성.
		for( i = 0; i<5; i++) {
			System.out.println(i+1 + "번째 정수를 입력해주세요.");
			int num = sc.nextInt();
			nums[i] = num;
			sum += nums[i];
		}
		double total = sum/nums.length;
		System.out.println("평균 : "+total);
		
	}

}
