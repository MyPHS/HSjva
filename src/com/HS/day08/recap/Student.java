package com.HS.day08.recap;

public class Student {
	static String name = "";
	static int kor = 0;
	static int eng = 0;
	static int math = 0;
	//public int에서의 int는 return값에 들어갈 수 있도록 만든 자료형
	public static int total() {
		return kor+eng+math;
	}
	
	public static double avg() {
		return (kor+eng+math)/3.0;
	}
}

