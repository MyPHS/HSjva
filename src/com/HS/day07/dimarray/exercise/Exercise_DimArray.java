//package com.HS.day07.dimarray.exercise;
//
//public class Exercise_DimArray {
//
//	public static void main(String [] args) {
//		int num = 0;
//		int []nums = new int[10];
//		int [][] dimNums = new int[5][5];
//		System.out.println("행의 길이 : " + dimNums.length);
//		System.out.println("열의 길이 : " + dimNums[0].length);
//		//k를 5행 5열짜리 배열에 들어가는 정수로 선언.
//		int k = 1;
//		for(int i = 0; i<5; i++) {
//			for(int j = 0; j<5; j++) {
//				//배열 5열 5행 속에 들어가는 정수 : k
//				dimNums[i][j] = k;
//				//배열의 길이는 5열 5행 = 25 로 정해져있으므로 k는 1부터 25를 넘어가지 않음.
//				k++;
//			}
//		}
//		//5행5열짜리 배열을 출력하기 위한 반복문. i가 0일 때 j가 0~4번까지 반복된다. 따라서 5행 5열의 배열 완성.
//		for(int i = 0; i < 5; i++) {
//			for(int j = 0; j<5; j++)
//				System.out.printf("%2d\t", dimNums[i][j]);
//				System.out.println();
//		}
//		
//	}
//
//}
