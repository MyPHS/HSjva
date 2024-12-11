package com.HS.day10.oop.encapsulation;

class CircleVO {
	private int radius;
	
	//클래스명과 동일함 : 생성자
	public CircleVO() {
		
	}
	
	//클래스명과 동일함 : 생성자
	public CircleVO(int radius) {
		this.radius = radius;
	}
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return 3.14*radius*radius;
	}
}

	
	public class Circle{
		
	public static void main(String[] args) {
		CircleVO circle = new CircleVO();
		circle.setRadius(10);
		//CircleVO circle = new CircleVO();
		//circle.radius = 10;
		System.out.println("넓이 : "+circle.getArea());
	}
}
