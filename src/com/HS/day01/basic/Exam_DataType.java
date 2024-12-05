package com.HS.day01.basic;

public class Exam_DataType {
	public static void main(String[]args) {
		/*자료형의 분류 2가지
		 1. 기본형, 실제 값을 저장.
		 - 정수, 실수, 문자, 참/거짓
		 	정수 4가지(byte, short, int, long)
		 	실수 2가지(float, double)
		 	문자 char
		 	참/거짓 boolean
		 2. 참조형, 주소값을 저장함.
		 -문자열 String
		 1바이트는 8비트
		 */
		boolean result = true;
		char fChar = 'a';
		System.out.println(result);
		System.out.println(fChar);
		// 정수 part
		byte bNum = 127;
		short sNum = 32767;
		int iNum = 2147483647;
		long lNum = 2147473648l;
//		실수 part
		double dNum = 2147483648.1;
		float fNum = 111111111111.1f;
	}

}
