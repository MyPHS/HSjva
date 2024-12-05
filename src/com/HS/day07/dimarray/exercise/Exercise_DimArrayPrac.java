package com.HS.day07.dimarray.exercise;

public class Exercise_DimArrayPrac {
	public void practice1() {
		// 5 4 3 2 1
		// 10 9 8 7 6
		// 15 14 13 12 11
		// 20 19 18 17 16
		// 25 24 23 22 21
		int k = 1;
		int [][] arrs = new int[5][5];
		/*for(int i = 0; i<5; i++) {
			for(int j = 0; j<5; j++) {
				k = arrs[i][j];
				
			}
		}*/
		for(int i =0; i<5; i++) {
			for(int j = 4; j>=0; j--) {
				arrs[i][j]= k++;
				
			}
		}
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j<5; j++)
				System.out.printf("%2d\t", arrs[i][j]);
				System.out.println();
		}
		
	}
	public void practice2() {
		// 5 10 15 20 25
		// 4 9 14 19 24
		// 3 8 13 18 23
		// 2 7 12 17 22
		// 1 6 11 16 21	
		int arrs [][] = new int[5][5];
		int k = 1;

		for(int i = 0; i<5; i++ ) {
			for(int j = 4; j>=0; j--) {
				arrs[j][i] = k;
				k++;
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d\t", arrs[i][j]);
			}
			System.out.println();
		}
	}
	public void practice3() {
		// 1 6 11 16 21
		// 2 7 12 17 22
		// 3 8 13 18 23
		// 4 9 14 19 24
		// 5 10 15 20 25
		int arrs [][] = new int[5][5];
		int k = 1;

		for(int i = 0; i<5; i++ ) {
			for(int j = 0; j<5; j++) {
				arrs[j][i] = k;
				k++;
			}
		}
		for(int i = 0; i < arrs.length; i++) {
			for(int j = 0; j < arrs[i].length; j++) {
				System.out.printf("%2d\t", arrs[i][j]);
			}
			System.out.println();
		}
	}

	public void practice4() {
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25
		int k  = 1;
		int [][] arrs = new int [5][5];
		for(int i = 0; i<5; i++) {
			//인덱스 값이 1과 3일 때는 숫자를 거꾸로 출력
			if(i==1 || i==3) {
				for(int j=4; j>=0; j--) {
				arrs[i][j] = k;
				k++;
				}
			}
			else {		
				for(int j = 0; j<5; j++) {
						arrs[i][j] = k;
						k++;
				}
			}
		}
		
		for(int i = 0; i < 5; i++) {
			for(int j = 0; j < 5; j++) {
				System.out.printf("%2d\t", arrs[i][j]);
			}
				System.out.println();	
		}
	}
}