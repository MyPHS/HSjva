package com.HS.day02.condition;

import java.util.Scanner;

public class Exam_If {

	public static void main(String[] args) {
		/*
		 * 제어문 - 조건문
		 * 문법
		 * if(조건식){
		 * 		  실행문장
		 * 			  }
		 */
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num>0) {
			System.out.println("양의 정수입니다");
		
		}
		else {
			if(num<0) {
				System.out.println("음의 정수입니다.");
				
				}
			else {
				System.out.println("0입니다.");
			}
		}
		
	}

}
