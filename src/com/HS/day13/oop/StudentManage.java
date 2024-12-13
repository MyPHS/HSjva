package com.HS.day13.oop;

// 저장하고 로드하는 기능 클래스
public class StudentManage {
	//index (배열의 순서 0~2)를 0으로 설정
	private Student [] 	students;
	private int 		index;
	
	public StudentManage() {
		students = new Student[3];
		index = 0;
	}
	
	public void insertStudent(Student student) {
		students[index] = student;
		index++;
//		Scanner sc = new Scanner(System.in);
//		String name = sc.next();
//		//set은 입력을 받아준다.
//		students[index].setName(null);
//		students[index].setKor(sc.nextInt());
//		students[index].setEng(sc.nextInt());
//		students[index].setMath(sc.nextInt());
		
//		for(int i = 0; i<students.length; i++) {
//			students[i] = new Student();
//			students[i].name = sc.next();
//			students[i].kor = sc.nextInt();
//			students[i].eng = sc.nextInt();
//			students[i].math = sc.nextInt();
//		}

		
	}
	public Student [] getStudents() {
		return students;
	}
}
