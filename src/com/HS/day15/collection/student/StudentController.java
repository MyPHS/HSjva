package com.HS.day15.collection.student;

import java.util.List;

public class StudentController {
	public static void main(String[] args) {
		StudentView view = new StudentView();
		StudentManage manage = new StudentManage();
		String name;
		int index;
		List<Student> sList;
		finish:
		while(true) {
			int menu = view.printMenu();
			switch(menu) {
				case 1: 
					Student student = view.inputStudent();
					//StudentManage에서 불러온 학생 정보 저장 메소드
					manage.registerStudent(student);
					break;
				case 2: 
					name = view.inputName("검색"); //검색할 이름 입력 받으면
					sList = manage.searchListByName(name); //Manage sList에서 검색해서 list에 담아옴
					view.displayStudents(sList); // 해당 list를 넘겨서 출력
					break;
				case 3: 
					sList = manage.selectAllStudents(); // 학생 전체 정보 가져오기
					view.displayStudents(sList); // 전체 정보 출력
					break;
				case 4: 
					name = view.inputName("수정");
					index = manage.searchIndexByName(name);
					if(index != -1 ) { // 수정할 데이터가 존재하면 수정할 데이터 입력
						student = manage.searchOneByName(name); // 이름으로 검색해서 저장된 정보 불러오기
						student = view.modifyStudent(student); // 저장된 정보를 수정해서 리턴. -> 수정할 정보가 student에 있음.
						manage.modifyStudent(index, student); // 인덱스와 수정된 정보를 저장한 student를 넘겨서 대체해줌.
					}
					break;
				
				case 5: 
					name = view.inputName("삭제"); // 삭제할 이름 입력 받기
					index = manage.searchIndexByName(name); // 이름으로 인덱스를 검색해오고 인덱스로 삭제한다.
					if(index != -1) { // 데이터가 있으면
						manage.deleteStudent(index); // 인덱스를 넘겨 remove로 삭제.
					}
					break;
				
				case 6: 
					name = view.inputName("재평가 여부 확인"); // 이름 입력 받기
					student = manage.searchOneByName(name); // 이름으로 정보 찾기
					String msg = manage.searchFailResult(student); // 재평가 결과를 반환한다.
					view.displayMsg(msg); // 결과를 문자열로 출력한다.
					break;
				
				case 0: 
					view.displayMsg("프로그램이 종료되었습니다.");
					break finish;
				default : 
					view.displayMsg("잘못 입력하셨습니다");
					break;
			}
		}
	}
}
