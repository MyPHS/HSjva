package com.HS.day03.condition.loop.exercise;

import java.util.Scanner;

public class Exercise_For1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("구구단을 출력합니다. 단을 입력해주세요 : ");
		
		int num = sc.nextInt();
		if(num<2 || num>9) { // OR연산자 -> 2~9 사이의 숫자가 아니라면 아래의 메시지 출력 후 리턴.
			System.out.println("2~9 사이의 단을 입력해주세요.");
			return;
		}
		int num1; 
			for(num1=1; num1<=9; num1++) {
				System.out.println(num + "X" + num1 + "=" + num*num1+" ");
			}
		
	}

}
