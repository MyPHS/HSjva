package com.HS.day03.condition.loop.exercise;

public class For_Double1 {

	public static void main(String[] args) {
		/*
		 * 0시 0분부터 23시 59분까지 출력하는 프로그램 작성.
		 */
		int num;
		int num1;
		for(num=0; num<24; num++) {
			for(num1=0; num1<60; num1++) {
				System.out.println(num+"시"+num1+"분");
			}
			System.out.println();
		}
	}

}
