package com.HS.day09.objectarray;

import java.util.Scanner;

class Book {
	String name;
	String author;
	String price;
	String publisher;
	
//	public Book() {
//		name = "";
//		author = "";
//		price = "";
//		publisher = "";
//	}
	
	void printInformation() {
		System.out.println(name +"의 작가는 "+author+"입니다. 출판사는 "
							+ publisher + "이고, 가격은 " + price+"입니다.");
	}
}

public class BookArray {
	public static void main(String[] args) {
		//클래스 내부에 있는 자료형을 가져올 때는 반드시 객체 선언을 아래와 같이 해준다.
		Book book = new Book();
		//불러올 때엔 선언을한 (객체).(변수명)으로 불러온다.
		book.name ="자바의 신";
		book.author = "박현서";
		book.price = "25000";
		book.publisher = "길벗이지록";
//		book.printInformation();
		
		Scanner sc = new Scanner(System.in);
		//객체 배열 선언
		Book [] books = new Book[5];
		for(int i = 0; i<books.length; i++) {
		books[i] = new Book();
		books[i].name = sc.next();
		books[i].author = "박현서";
		books[i].price = "25000";
		books[i].publisher = "길벗이지록";
		books[i].printInformation();
		}
		
		
	}
	
}
