package com.HS.day09.objectarray;

import java.util.Scanner;

class Student {
	
	String name;
	int kor;
	int eng;
	int math;
	//기본 생성자(생략가능), JVM이 알아서 생성해줌.
	public Student() {
		
	}
	
	public Student(String name) {
		this.name = name;
	}
	
	public Student(int kor, int eng, int math) {
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	public Student(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int total() {
		return kor+eng+math;
	}
	public double avg() {
		return (kor+eng+math)/3.0;
	}
}
public class StudentArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student [] students = new Student[3];
		students[0] = new Student("홍길동", 99, 88, 77);
//		students[0] = new Student();
//		students[0].name = "일용자";
//		students[0].kor = 99;
//		students[0].eng = 88;
//		students[0].math = 77;
		students[1] = new Student("청길동", 99, 77, 44);
//		students[1].name = "이용자";
//		students[1].kor = 99;
//		students[1].eng = 88;
//		students[1].math = 77;
		students[2] = new Student("백길동", 55, 66, 99);
//		students[2].name = "삼용자";
//		students[2].kor = 99;
//		students[2].eng = 88;
//		students[2].math = 77;
		
		// 반복문을 이용하여 객체배열의 객체가 가지고 있는
		// 이름, 점수, 총점, 평균을 출력해보아라.
		
		for(int i = 0; i<students.length; i++) {
//			System.out.print(i+"번 학생 이름 입력 : ");
//			students[i].name = sc.next();
//			System.out.print("국어 점수 입력 : ");
//			students[i].kor = sc.nextInt();
//			System.out.print("영어 점수 입력 : ");
//			students[i].eng = sc.nextInt();
//			System.out.print("수학 점수 입력 : ");
//			students[i].math = sc.nextInt();
//			System.out.println(students[i].name+"의 "+"총 점수는 : "+students[i].total()+"입니다.");
//			System.out.println("평균 : "+ students[i].avg());
			System.out.println(students[i]);
		}
	}
}
