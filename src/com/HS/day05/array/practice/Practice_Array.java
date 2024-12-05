package com.HS.day05.array.practice;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Practice_Array {

	public void practice() {
		/*
		 * 길이가 10인 배열 선언
		 * 1~10까지의 값을 반복문을 이용해 순서대로 배열
		 * 
		 */
		int [] nums = new int[10];
		for(int i =0; i<10; i++) {
			nums[i]= (i+1);
			System.out.println(nums[i]);
		}
		
	}
	public void practice1() {
		/*
		 * 길이가 10인 배열 선언
		 * 10~1까지의 값을 반복문을 이용해 배열
		 */
		int [] arrs = new int[10];
		for(int i = 10; i > 1; i--) {
			int sum= i+1;
		}
		
			
	}
	
	public void practice2() {
	
	
}
	
	public void practice3() {
		Scanner sc = new Scanner(System.in);
		System.out.println("당신이 입력한 정수를 1부터 차례대로 나열합니다. 정수 입력 : ");
		int num = sc.nextInt();
		int [] nums = new int[num];
		for(int i = 0; i<num; i++) {
			nums[i]=i+1;
			System.out.println(nums[i]);
		}
	
	
}
	
	public void practice4() {
		/*
		 * 길이가 5인 String 배열 선언
		 * "사과", "귤, "포도", "복숭아", "참외" 순서대로 저장
		 * 그리고 배열 인덱스를 이용해서 귤 출력
		 */
		String fruits [];
		fruits = new String [5];
		fruits[0] = "사과";
		fruits[1] = "귤";
		fruits[2] = "포도";
		fruits[3] = "복숭아";
		fruits[4] = "참외";
			System.out.println(fruits[1]);
		for(int i = 0; i<5; i++) {
			System.out.println(fruits[i]);
		}
	
	
}
	
	public void practice5() {
	
	
}

	public void practice6() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("0~6 사이 숫자 입력");
		int num = sc.nextInt();
		
		if(num<0 || num>6) {
			System.out.println("잘못 입력하셨습니다.");
			continue;
		}
		
		String [] day = new String [7];
		day[0] = "월";
		day[1] = "화";
		day[2] = "수";
		day[3] = "목";
		day[4] = "금";
		day[5] = "토";
		day[6] = "일";
		
		System.out.println(day[num]);
		}
	}
	public void practice7(){
		Scanner sc = new Scanner(System.in);
		System.out.print
		("입력 받을 정수의 갯수를 입력해주세요 : ");
		int num = sc.nextInt();
		int [] nums;
		nums = new int[num];
		int sum = 0;
		for(int i =0; i<num; i++) {
			System.out.print(i+1 +"번째 정수를 입력해주세요 : ");
			int num1 = sc.nextInt();
			nums[i] = num1;
			sum += nums[i]; 
		}
		for(int i = 0; i<num; i++) {
			System.out.print(nums[i]+" ");
		}
		System.out.println();
		System.out.println("합 : " +sum);
		
	}
	public void practice11() {
		//배열 갯수 선언
		int [] lottos = new int[6];
		//랜덤한 숫자 선언문
		Random rand = new Random();
		//배열이 6으로 선언 됐으므로 랜덤한 숫자 1~45까지의 수를 6번 뽑아서 lottos[]에 삽입
		for(int i = 0; i < lottos.length; i++) {
			
			//배열 속에 삽입.
			lottos[i] = rand.nextInt(45)+1;
			
			//로또의 번호가 6개가 나온다는 가정. 1번과 2번이 같으면 2번을 다시 뽑음. 1번과 2번은 다르지만 1, 2번 숫자가 3번 숫자와 같으면
			//3번 번호 다시 뽑기. 4번이 1, 2, 3번 숫자와 비교해 같은 숫자가 있으면 또 다시 뽑기.
			for(int j = 0; j < i; j++) {
				if(lottos[j] == lottos[i]) {
					//중복된 숫자가 나온 곳으로 다시 돌아가기
					i--;
				}
			}
			
		}
		System.out.println();
		
		for(int i = 0; i<(lottos.length-1); i++ ) {
			for(int j = 0; j<(lottos.length-1)-i; j++) {
				if(lottos[j]>lottos[j+1]) {
					int temp = lottos[j+1];
					lottos[j+1] = lottos[j];
					lottos[j] = temp;
				}
				
			}
		}
		for(int lotto: lottos) {
			System.out.print(lotto + " ");
			
		}
		System.out.println();
	}
}
