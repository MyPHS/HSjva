package com.HS.day15.collection.student;

import java.util.List;
import java.util.Scanner;

public class StudentView implements ViewInterface{
	
	private Scanner sc;
	
	public StudentView() {
		sc = new Scanner(System.in);
	}

	@Override
	public Student inputStudent() {
		Student student = new Student();
		System.out.println("====== 학생 정보 입력 ======");
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("1차 점수 : ");
		int firstScore = sc.nextInt();
		System.out.println("2차 점수 : ");
		int secondScore = sc.nextInt();
		//입력받을 set 메소드 입력
		student.setname(name);
		student.setFirstScore(firstScore);
		student.setSecondScore(secondScore);
		return student;
	}

	@Override
	public String inputName(String category) {
		//검색할 이름 입력 메소드
		System.out.print(category + "할 이름 입력 : ");
		String name = sc.next();
		return name;
	}

	@Override
	public Student modifyStudent(Student student) {
		System.out.print("수정할 1차 점수 입력 : ");
		int firstScore = sc.nextInt(); 		//수정할 점수 입력하기
		student.setFirstScore(firstScore); //입력된 점수를 set으로 받아주며 재설정
		System.out.print("수정할 2차 점수 입력 : ");
		int secondScore = sc.nextInt(); //수정할 점수 입력
		student.setSecondScore(secondScore); // set으로 받아서 재설정
		return student;
	}

	@Override
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 학생관리 프로그램 =====");
		System.out.println("1. 학생 정보 입력");
		System.out.println("2. 학생 정보 검색");
		System.out.println("3. 학생 정보 전체 출력");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 학생 정보 삭제");
		System.out.println("6. 재평가 대상 여부 확인");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		return menu;
	}

	@Override
	public void displayStudents(List<Student> stdList) {
		System.out.println("====== 학생 전체 정보 출력 ======");
		for(Student std: stdList) {
			//set 메소드에서 입력을 받은 get메소드를 이 곳에서 출력하도록 한다.
			// 이름, 1차 점수, 2차 점수 순서
			System.out.printf("%s 학생의 1차 점수는 %d, 2차 점수는 %d 입니다.\n"
					, std.getName(), std.getFirstScore(), std.getSecondScore());
		}
	}

	@Override
	public void displayMsg(String msg) {
		System.out.println(msg);
	}
}
