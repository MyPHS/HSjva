package com.HS.day12.oop.exercise;

public class Person {
	//필드
	private String name;
	private int age;
	
	//생성자 - 클래스 이름과 같은 메소드, 반환형X
	//기본생성자
	public Person() {}
	//매개변수가 있는 생성자
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//메소드
	//getter/setter (getter : 값을 받아서 반환) (setter : 값을 받음)
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//일반메소드
	public String inform() {
		return name + "님(" + age + "세)";
	}
	@Override
	public String toString() {
		return "이름 : "+ name + ", 나이 : " + age;
	}
	public static void main(String[] args) {
		Person [] pArr = new Person[3];
		pArr[0].getAge();
		System.out.println(pArr[0].getAge());
	}
}
