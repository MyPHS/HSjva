package com.HS.day10.oop.encapsulation;

public class Book {
	// 제목과 저자의 필드 생성
	private String title;
	private String author;
	
	// 생성자 생성
	public Book() {}
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// getter/setter 생성
	// getter은 아래 setter에서 입력을 받아 가져와서 반환한다.
	// setter에는 반환값이 없으므로 단독으로 사용이 불가능하다.
	// this.은 매개변수에 있는 변수명과 class에서 선언한 변수명을 구분짓기 위한 수식어다.
	// this.이 들어가면 class내부에 있는 변수를 가리킨다.
	public String getTitle() {
		return this.title;
	}
	public String getAuthor() {
		return this.author;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public static void main(String[] args) {
		Book book = new Book();
		book = new Book("춘향뎐", "작자미상");
		//setter의 매개변수에 입력.
		book.setTitle("어린왕자");
		book.setAuthor("생떽쥐페리");
		
		// getter에 대입하여 반환값을 출력. (반환타입이 String. 반환값 있음.)
		// setter만으로는 반환값을 출력할 수 없다. (void 타입이어서 반환값이 없음.)
		System.out.println("책 제목 : " + book.getTitle());
		System.out.println("저자 : " + book.getAuthor());
		
	}
}
