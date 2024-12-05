package com.HS.day02.operator;

import java.util.Scanner;

public class Exercise_Operator3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("알파벳을 입력해주세요 : ");
		char ch = sc.next().charAt(0);
		boolean var = 65<=ch && 90>=ch;
		System.out.println(var);
	}

}
