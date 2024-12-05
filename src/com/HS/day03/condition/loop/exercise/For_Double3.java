package com.HS.day03.condition.loop.exercise;

public class For_Double3 {

	public static void main(String[] args) {
		int num;
		int num1;
		int num2=1;
		
		for(num=1; num<=9; num++) {
			for(num1=2; num1<=9; num1++) {
				System.out.print(num1+"X"+num+"="+num1*num);
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}

}
