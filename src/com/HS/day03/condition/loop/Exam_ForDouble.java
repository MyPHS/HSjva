package com.HS.day03.condition.loop;

public class Exam_ForDouble {

	public static void main(String[] args) {
		int num;
		int num1;
		for(num=2; num<=9; num++) {
			for(num1=1; num1<=9; num1++) {
				System.out.println(num+"X"+num1+"="+num1*num);
			}
			System.out.println();
		}
	}

}
