package com.HS.day11.oop.abstractpkg.exercise;

public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		// TODO Auto-generated method stub
		int result = a+b;
		return result;
	}

	@Override
	public int subtract(int a, int b) {
		int subtr = a-b;
		return subtr;
	}

	@Override
	public double average(int[] a) {
		// int [] a = new int[5];
		// 평균 = 합 / 크기
		// 합 : 배열에 있는 값을 꺼내서 더함
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		double avg = (double)sum / a.length;
		return avg;
	}
	public static void main(String[] args) {
		//Calculator calculator = new Calculator(); 추상 클래스는 직접적으로 접근 불가.
		Calculator calculator = new GoodCalc(); // GoodCalc
		int [] arrs = {21, 38, 5, 2, 4};
		System.out.println(calculator.add(11, 18));
		System.out.println(calculator.subtract(15, 11));
		System.out.println(calculator.average(arrs));
		
		GoodCalc calc = new GoodCalc();
		int [] nums = {11, 18, 5, 2, 4};
		System.out.println(calc.add(11, 18));
		System.out.println(calc.subtract(15, 11));
		System.out.println(calc.average(nums));
	}
}
