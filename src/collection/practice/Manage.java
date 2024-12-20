package collection.practice;

import java.util.List;

public interface Manage {
	
	void registerMember(Member member);
	
	void modifyMember(int index, Member member);
	
	void deleteMember(int index);
	
	List<Member> searchListByName(String name);
	
	Member searchOneByName(String name);
	
	
	public int searchIndexByName(String name);
	
	List<Member> selectAllMembers();
	
	String searchFailResult(Member member);

	Member searchOneByFaceStyle(String faceStyle);
}
