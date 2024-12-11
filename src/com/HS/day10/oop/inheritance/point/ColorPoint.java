package com.HS.day10.oop.inheritance.point;

public class ColorPoint extends Point{
//	private int x, y;
	private String color;
	
//	public ColorPoint() {
//		//부모의 생성자 호출
//		super();
//	}
	
	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void showColorPoint() {
		super.showPoint();
		System.out.println(this.color + "색의 점입니다.");
	}
}
