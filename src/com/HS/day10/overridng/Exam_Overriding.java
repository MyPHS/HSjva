package com.HS.day10.overridng;

public class Exam_Overriding {
	public static void main(String[] args) {
		//shape를 Shape 클래스로 정의
		Shape shape = new Shape();
		shape.draw();
		
		//shape를 Line 클래스로 재정의
		shape = new Line();
		shape.draw();
		
		Line line = new Line();
		line.draw();
		Rectangle rect = new Rectangle();
		rect.draw();
		Circle circle = new Circle();
		
	}
}
