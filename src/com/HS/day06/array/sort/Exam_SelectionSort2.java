package com.HS.day06.array.sort;

public class Exam_SelectionSort2 {

	public static void main(String[] args) {
		/*
		 * 선택 정렬이란?
		 * 배열을 전부 검색하여 최솟값을 고르고 왼쪽부터 채워나가는 정렬
		 * 데이터의 양이 적을 때 좋은 성능을 보여주는 정렬,
		 * 데이터의 양이 많을 때 급격한 성능 저하를 보임.
		 */
		int [] arrs = {2, 5, 4, 1, 3};
		int min = 0;
		for(int i = 0; i<arrs.length; i++) {
			for(int j = i+1; j < arrs.length; j++) {
				if(arrs[min]> arrs[j]) {
					min = j;
				}
			}
			int temp = arrs[i];
			arrs[i] = arrs[min];
			arrs[min] = temp;
		}
		for(int num : arrs) {
			System.out.println(num +" ");
		}
	/*	for(int j = 2; j < arrs.length; j++) {
			if(arrs[min]> arrs[j]) {
				min = j;
			}
		}
		temp = arrs[1];
		arrs[1] = arrs[min];
		arrs[min] = temp;
		
		for(int j = 3; j < arrs.length; j++) {
			if(arrs[min]> arrs[j]) {
				min = j;
			}
		}
		temp = arrs[2];
		arrs[2] = arrs[min];
		arrs[min] = temp;
		for(int num : arrs) {
			System.out.println(num +" ");
		}*/
	}

}
