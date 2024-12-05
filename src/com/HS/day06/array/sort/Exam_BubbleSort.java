package com.HS.day06.array.sort;

public class Exam_BubbleSort {

	public static void main(String[] args) {
		/*
		 * 버블정렬이란?
		 * 인접한 두 개의 원소를 검사하여 정렬하는 방법
		 * 구현이 쉽다는 장점과 이미 정렬된 데이터를 정렬할 때 가장 빠름.
		 * 기본적으로 다른 정렬에 비해서 속도가 느린 편이며 역순으로 정렬할 때 가장 느림.
		 */
		int [] arrs = {2, 5, 4, 1, 3};
		for(int n = 4; n>0; n--) {
			for(int i = 0; i<n; i++) {
				if(arrs[i] >arrs[i+1]) {
					int temp = arrs[i+1];
					arrs[i+1] = arrs[i];
					arrs[i] = temp;
				}
			}
		}
		for(int i =0; i<5; i++) {
			System.out.println(arrs[i]);
		}
		
		
	}

}
