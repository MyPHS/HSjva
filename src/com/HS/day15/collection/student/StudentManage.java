package com.HS.day15.collection.student;

import java.util.ArrayList;
import java.util.List;

public class StudentManage implements ManageInterface{
	private List<Student> sList;
	
	public StudentManage() {
		//Student 객체를 입력받는 객체 배열(리스트) 생성
		this.sList = new ArrayList<Student>();
	}
	@Override
	public void registerStudent(Student student) {
		sList.add(student);
	}

	@Override
	public void modifyStudent(int index, Student student) {
		sList.set(index, student);
	}

	@Override
	public void deleteStudent(int index) { 
		sList.remove(index);	// 인덱스로 sList에서 삭제
	}

	@Override
	public List<Student> searchListByName(String name) {
		List<Student> searchList = new ArrayList<Student>(); //이 상태로 리턴하면 비어있는 값이다.
			if(null!=name) {
				for(Student std: sList) {
					if(name.equals(std.getName())) { // 같은 값을 찾으면
						searchList.add(std); // searchList에 추가
					}
				}
				return searchList;
			}
		return null;
	}

	@Override
	public Student searchOneByName(String name) {
		if(name != null) {
			for(Student std: sList) {
				if(name.equals(std.getName())) {
					return std; //이름을 찾으면 그 때의 값 리턴.
				}
			}
		}
		return null; // 이름을 찾지 못 하면 null로 표기
	}

	@Override
	public int searchIndexByName(String name) {
		int count = 0; // forEach문은 증감식이 없기에 선언해줌.
		if(name != null) { // name을 입력했을 때 동작
			for(Student std: sList) { // forEach문으로 동작
				if(name.equals(std.getName())) { // 이름이 같은지 확인
					return count;  // 그 때의 인덱스를 리턴.
				}
				count++; // 이름이 다르면 인덱스 증가.
			}
		}
		return -1;
	}

	@Override
	public List<Student> selectAllStudents() {
		return sList;
	}
	public String searchFailResult(Student student) { //이름으로 찾은 학생 정보 넘겨받기
		if(student != null) { // 정보가 있을 때 동작.
			int firstScore, secondScore;
			firstScore = student.getFirstScore();
			secondScore = student.getSecondScore(); // 1, 2차 점수 설정
			double avg = (firstScore + secondScore)/2.0; // 평균 구하기
			StringBuffer sb = new StringBuffer();		// 결과값(String)을 담을 객체
			if(avg>= 60) {
				if(firstScore <40) {
					sb.append("1차 시험 재평가");
				}else if(secondScore<40) {
					sb.append("2차 시험 재평가");
				}else {
					sb.append("모두 통과하셨습니다.");
				}										// 이곳에는 3가지 결과 중 한 개만 담김.
			}else {
				if(firstScore<60) {
					sb.append("1차 시험 재평가\n");		// 개행해서 출력되도록 \n을 붙여준다.
				}
				if(secondScore < 60 ) {
					sb.append("2차 시험 재평가");
				}										// 이 곳에서는 2가지 결과가 담길 수 있음.
			}
			return sb.toString();
		}
		return null;
	}

}
