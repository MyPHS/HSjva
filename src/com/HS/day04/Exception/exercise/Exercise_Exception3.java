package com.HS.day04.Exception.exercise;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise_Exception3 {
	public static void main(String [] args) {
		/*
		 * 3개의 정수를 입력받아서
		 * 정수들의 합을 구하는 구문.
		 * 단, 도중에 유효한 정수가 아닌 무언가가 입력 될 시,
		 * 다시 그 위치로 돌아와 정수를 입력하게 한다.
		 */
		Scanner sc = new Scanner(System.in);
		
			int sum = 0;
			
				for(int num = 0; num<3; num++) {
					try {
					int i = sc.nextInt();
					sum+= i;
				}
					
			catch(InputMismatchException e) {
				System.out.println("정수를 입력해주세요.");
				sc.next();
				num= num-1;

				
			}
				}
			System.out.println("합 : " + sum);
		}
	}


