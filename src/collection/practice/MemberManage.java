package collection.practice;

import java.util.ArrayList;
import java.util.List;

public class MemberManage implements Manage {
	private List<Member> mList;
	
	public MemberManage() {
		this.mList = new ArrayList<Member>();
	}
	//#회원 정보 등록 3
	@Override
	public void registerMember(Member member) {
		// #회원 정보 등록 4 - 끝
		mList.add(member);
	}

	@Override
	public void modifyMember(int index, Member member) {
		mList.set(index, member);
	}

	@Override
	public void deleteMember(int index) {
		mList.remove(index);
	}

	// # 회원 정보 검색 5
	@Override
	public List<Member> searchListByName(String name) {
		List<Member> searchList = new ArrayList<Member>(); 
		if(null != name) {
			for(Member mb: mList) {
				if(name.equals(mb.getName())) {
					searchList.add(mb);
				}
			}
			// # 회원 정보 검색 6
			return searchList;
		}
		return null;
	}

	@Override
	public Member searchOneByName(String name) {
		if(name != null) {
			for(Member mb: mList) {
				if(name.equals(mb.getName())) {
					return mb;
				}
			}
		}
		return null;
	}

	@Override
	public int searchIndexByName(String name) {
		int count = 0;
		if(name != null) {
			for(Member mb: mList) {
				if(name.equals(mb.getName())) {
					return count;
				}
				count++;
			}
		}
		return -1;
	}

	@Override
	public List<Member> selectAllMembers() {
		return mList;
	}

	@Override
	public String searchFailResult(Member member) {
		
		return null;
	}
	
	@Override
	public Member searchOneByFaceStyle(String faceStyle) {
			if(faceStyle != null) {
				for(Member mb: mList) {
					if(faceStyle.equals(mb.getFaceStyle())) {
						return mb;
					}
				}
			}
		return null;
	}

	public Member searchOneByHeight(int height) {
		if(height != 0) {
			for(Member mb: mList) {
				if(mb.getHeight() >= height) {
					return mb;
				}
			}
		}
	return null;
}
	public Member searchOneByAge(int age) {
		if(age != 0) {
			for(Member mb: mList) {
				if(mb.getAge()+5 >= mb.getAge() ) {
					return mb;
				}
			}
		}
		return null;
	}
}
