package com.HS.day15.collection.student;

public class Student {
	
	private String name;
	private int firstScore;
	private int secondScore;
	
	public Student() {}
	public Student(String name, int firstScore, int secondScore) {
		this.name = name;
		this.firstScore = firstScore;
		this.secondScore = secondScore;
	}
	public String getName() {
		return name;
		
	}
	public void setname(String name) {
		this.name = name;
	}
	public int getFirstScore() {
		return firstScore;
	}
	public void setFirstScore(int firstScore) {
		this.firstScore = firstScore;
	}
	public int getSecondScore() {
		return secondScore;
	}
	public void setSecondScore(int secondScore) {
		this.secondScore = secondScore;
	}
	
	
}
