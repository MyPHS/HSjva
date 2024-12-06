package com.HS.day08.method;

public class Run_Method {
	
	/*
	 * 리턴형 O, X
	 * 매개변수 O, X
	 * 
	 * 리턴형 X, 매개변수 X
	 * 리턴형 X, 매개변수 O
	 * 리턴형 O, 매개변수 X
	 * 리턴형 O, 매개변수 O
	 */
	public void noReturnNoParam() {
		System.out.println("noReturnNoParam");
		return;
	}
	//반환형X 매개변수O
	public void noReturnYesParam(int num) {
		//int num = 20250502;
		System.out.println("num : " + num);
		return;
	}
	//반환형O 매개변수X
	public int yesReturnNoParam() {
		int date = 20241118;
		return date;
	}
	//반환형 O 매개변수 O
	public int yesReturnYesParam(int num) {
		num+=10;
		return num;
	}
	//가변인자
	public int sum(int ...numbers) {
		int sum = 0;
		for(int num: numbers) {
			sum += num;
		}
		return sum;
	}
}
