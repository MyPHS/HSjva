package com.HS.day02.operator;

import java.util.Scanner;

public class Exercise_Switch1 {

	public static void main(String[] args) {
		/*
		 * 문제2
		 * 커피메뉴를 입력받고 가격을 알려주는 프로그램을 작성하시오
		 * 주문하시겠어요? 가격을 알려드립니다.
		 * (에스프레소, 카푸치노, 카페라떼, 아메리카노)
		 * 메뉴를 입력해주세요 : 에스프레소
		 * 2500원입니다.
		 * 메뉴를 입력해주세요 : 자바칩프라프치노
		 * 없는 메뉴입니다.
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주문하시겠습니까?");
		System.out.println("에스프레소, 카푸치노, 카페라떼, 아메리카노 중에 고르십시오.");
		String menu = sc.next();
		
		switch(menu){
		case "에스프레소" : System.out.println("2000원입니다.");
		break;
		case "카푸치노" : System.out.println("3500원입니다.");
		break;
		case "카페라떼" : System.out.println("3000원입니다.");
		break;
		case "아메리카노" : System.out.println("2500원입니다.");
		break;
		default : System.out.println("정확한 메뉴명을 입력해주세요.");
		return;
		}
	}

}
