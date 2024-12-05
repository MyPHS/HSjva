package com.HS.day06.array.sort;

public class Exam_SelectionSort {

	public static void main(String[] args) {
		int [] arrs = {2, 5, 4, 1, 3};
		int min = 0; //인덱스 값을 기억하는 코드
		for(int j = 0; j<5; j++) {
			for(int i = 1; i<5; i++) {
				if(arrs[min]>arrs[i]) {
					int temp = arrs[min];
					arrs[min] = arrs[i];
					arrs[i] = temp;
			
				}
			}
		}
		for(int num : arrs) {
			System.out.println(num + " ");
		}
		
	}

}
