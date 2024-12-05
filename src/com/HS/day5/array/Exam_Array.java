package com.HS.day5.array;

public class Exam_Array {

	public static void main(String[] args) {
		/*
		 * 배열의 선언
		 * 
		 * 배열의 생성
		 * 
		 * 배열의 초기화
		 * 
		 * 배열의 데이터 저장
		 * 
		 * 배열의 데이터 출력
		 */
		int [] nums;
		nums = new int[10];
		nums[0] = 11;
		nums[1] = 18;
		
		//for문으로 데이터 저장
		for(int i =0; i <10; i++) {
			nums[i] = (i+1);
		}
		//for문으로 데이터 출력
		for(int i =0; i <10; i++) {
			System.out.println(nums[i]);
		}
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[3]);
	}

}
