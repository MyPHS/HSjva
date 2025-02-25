package com.HS.day13.oop;

public class Student {
	private String name = "";
	private int kor = 0;
	private int eng = 0;
	private int math = 0;
	
	// 메소드 - 생성자
	public Student() {}
	public Student(String name,
			 int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	// 메소드
	// getter/setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getKor() {
		return kor;
	}
	
	public void setKor(int kor) {
		this.kor = kor;
	}
	
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	
	public int total() {
		return kor+eng+math;
	}
	
	public double avg() {
		return this.total()/3.0;
	}
}
