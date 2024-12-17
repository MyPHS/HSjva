package com.HS.day15.collection.student;

import java.util.List;

public interface ViewInterface {
	
	/**
	 * 학생 정보 입력
	 * @return Student
	 */
	Student inputStudent();
	
	/**
	 * 학생 이름 입력 메소드
	 * 항목 전달값으로 항목 구분
	 * @param category
	 * @return
	 */
	
	String inputName(String category);
	/**
	 * 학생 정보 수정 입력
	 * @param student
	 * @return
	 */
	Student modifyStudent(Student student);
	
	/**
	 * 메인 메뉴 출력
	 * 입력받은 값은 리턴됨
	 * @return
	 */
	int printMenu();

	/**
	 * 학생 전체 정보 출력
	 * @param stdList
	 */
	void displayStudents(List<Student> stdList);
	
	/**
	 * 전달값 메시지 출력
	 * @param msg
	 */
	void displayMsg(String msg);
}
