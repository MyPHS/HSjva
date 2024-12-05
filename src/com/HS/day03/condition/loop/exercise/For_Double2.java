package com.HS.day03.condition.loop.exercise;

public class For_Double2 {

	public static void main(String[] args) {
		int num;
		int num1;
		for(num=1; num<=6; num++) {
			for(num1=1; num1<=num; num1++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
