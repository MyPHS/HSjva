package collection.practice;

import java.util.List;

public interface View {
	
	Member inputMember();
	
	String inputName(String category);
	
	Member modifyMember(Member member);
	
	int printMenu();
	
	void displayMembers(List<Member> memList);
	
	void displayMsg(String msg);
	
	Member searchFavorite();
}

