package com.HS.day09.recap;

class Student {
	static String name = "";
	static int kor = 0;
	static int eng = 0;
	static int math = 0;
	static double avg = 0;
	
	public static int total() {
		return kor+eng+math;
	}
	
	public static double avg() {
		return total()/3.0;
	}
}

public class StudentAppGujo2 {

}
