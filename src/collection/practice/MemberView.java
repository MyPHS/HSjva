package collection.practice;

import java.util.List;
import java.util.Scanner;

public class MemberView {
	
	private Scanner sc;
	
	public MemberView() {
		sc = new Scanner(System.in);
	}
	//#회원 정보 등록 1
	//@Override
	public Member inputMember() {
		Member member = new Member();
		// #회원 정보 등록 2
		System.out.println("===== 회원정보 입력 =====");
		System.out.print("본인의 이름은? : ");
		String name = sc.next();
		System.out.print("본인의 나이는? : ");
		int age = sc.nextInt();
		System.out.print("본인의 성별은? (남/여) : ");
		String gender = sc.next();
		System.out.print("본인의 얼굴 상은? 예시) 고양이 상, 강아지 상 : ");
		String faceStyle = sc.next();
		System.out.print("본인의 키는? : ");
		int height = sc.nextInt();
		member.setName(name);
		member.setAge(age);
		member.setGender(gender);
		member.setFaceStyle(faceStyle);
		member.setHeight(height);
		return member;
		
	}
	//@Override
	public int printMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("===== 회원관리 프로그램 =====");
		System.out.println("1. 회원 정보 입력");
		System.out.println("2. 회원 정보 검색");
		System.out.println("3. 회원 정보 전체 출력");
		System.out.println("4. 회원 정보 수정");
		System.out.println("5. 회원 정보 삭제");
		System.out.println("6. 회원 매칭하기");
		System.out.println("0. 프로그램 종료");
		System.out.print("선택 : ");
		int menu = sc.nextInt();
		return menu;
	}
	// # 회원 정보 검색 2
	//@Override
	public String inputName(String category) {
		//검색할 이름 입력
		System.out.print(category+"할 이름 입력 : ");
		String name = sc.next();
		// # 회원 정보 검색 3
		return name;
	}
	//@Override
	public Member modifyMember(Member member) {
		System.out.print("수정할 이름 입력 : ");
		String name = sc.next();
		member.setName(name);
		System.out.print("수정할 나이 입력 : ");
		int age = sc.nextInt();
		member.setAge(age);
		System.out.print("수정할 키 입력 : ");
		int height = sc.nextInt();
		member.setHeight(height);
		System.out.print("수정할 얼굴형 입력 : ");
		String faceStyle = sc.next();
		member.setFaceStyle(faceStyle);
		return member;
	}
	
	//@Override
	public int searchFavoriteType() {
		Scanner sc = new Scanner(System.in);
		String data = "";
		int key = sc.nextInt();
		System.out.println("검색할 키워드 입력");
		System.out.println("1. 얼굴형");
		System.out.println("2. 키");
		System.out.println("3. 나이");
		System.out.print("번호 선택 : ");
		return key;
	}
	
	public String inputSearchData() {
		System.out.print("얼굴형 : ");
		String type = sc.next();
		return type;
	}
	public int inputHeighData() {
		System.out.print("나이 : ");
		int height = sc.nextInt();
		return height;
	}

//	@Override
//	public Member modifyMember(Member member) {
//		// TODO Auto-generated method stub
//		return null;
//	}

	//@Override
	public void displayMembers(List<Member> memList) {
		System.out.println("===== 회원 정보 전체 출력 =====");
		for(Member mb : memList) {
			System.out.printf("%s 회원의 나이는 %d, 성별은 %s, 키는 %d, 얼굴형은 %s 상입니다. \n"
					, mb.getName(), mb.getAge(), mb.getGender(), mb.getHeight(), mb.getFaceStyle());
		}
	}

	//@Override
	public void displayMsg(String msg) {
		System.out.println(msg);
	}
	
	public Member inputData() {
//		System.out.println("검색할 정보 입력");
//		System.out.print("이름 : ");
//		System.out.print("나이 : ");
//		System.out.print("성별 : ");
		return null;
	}
}
