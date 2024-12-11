package com.HS.day10.overridng;

public class Line extends Shape{

	@Override
	public void draw() {
		super.draw();
		System.out.println("Line");
	}
}
