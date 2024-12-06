package com.HS.day08.recap;

import java.util.Scanner;

public class StudentApp3 {
	//필드(멤버변수)
	static Scanner sc = new Scanner(System.in);
	//Student student = new Student();
	
		public static void main(String[] args) {
			end:
			while(true) {
				int choice = printMenu();
				switch(choice) {
				case 1: 
					inputStudentData();
					break;
				case 2: 
					printStudentData();
					break;
				case 3: 
					displayMessage();
//					System.out.println("프로그램을 종료합니다.");
					break end;
				default :
					displayMessage();
//					System.out.println("1~3 사이의 수를 입력해주세요.");
					break;
				}
				
			}
		}
		// printMenu()
		static int printMenu() {
			System.out.println("==== 메인 메뉴 ====");
			System.out.println("1. 성적 입력");
			System.out.println("2. 성적 출력");
			System.out.println("3. 종료");
			System.out.print("선택 >> ");
			int choice = sc.nextInt();
			return choice;
		}
		// inputStudentData()
		static void inputStudentData() {
			System.out.println("====정보 입력====");
			System.out.print("이름 : ");
			Student.name = sc.next();
			System.out.print("국어 : ");
			Student.kor = sc.nextInt();
			System.out.print("영어 : ");
			Student.eng = sc.nextInt();
			System.out.print("수학 : ");
			Student.math = sc.nextInt();
		}
		// printStudentData()
		static void printStudentData() {
			System.out.println("====성적 출력====");
			System.out.println("이름 : "+ Student.name);
			System.out.println("국어 : " + Student.kor);
			System.out.println("영어 : " + Student.eng);
			System.out.println("수학 : " + Student.math);
			System.out.println("총점 : "+ Student.total());
			System.out.println("평균 : " + Student.avg());
		}
		// displayMessage();
		static void displayMessage() {
			System.out.println("프로그램을 종료합니다.");
			System.out.println("1~3 사이의 수를 입력해주세요.");
	}
}
