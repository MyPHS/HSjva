package collection.practice;

import java.util.List;

public class MemberController {
	public static void main(String[] args) {
		MemberView view = new MemberView();
		MemberManage manage = new MemberManage();
		String name;
		int index;
		List<Member> mList;
		finish:
		while(true) {
			int menu = view.printMenu();
			switch(menu) {
				case 1:
					// #회원 정보 등록 1
					Member member = view.inputMember();
					// #회원 정보 등록 3
					manage.registerMember(member);
					break;
				case 2:
					// 이름, 나이, 성별을 입력받아 검색
//					member = view.inputData();
//					mList = manage.searchList(member);
//					view.displayMembers(mList);
					
					// # 회원 정보 검색 1
					name = view.inputName("검색");
					// # 회원 정보 검색 4
					mList = manage.searchListByName(name);
					// # 회원 정보 검색 7
					view.displayMembers(mList);
					break;
				case 3:
					mList = manage.selectAllMembers();
					view.displayMembers(mList);
					break;
				case 4:
					name = view.inputName("수정");
					index = manage.searchIndexByName(name);
					if(index != -1) {
						member = manage.searchOneByName(name);
						member = view.modifyMember(member);
						manage.modifyMember(index, member);
					}
					break;
				case 5:
					name = view.inputName("삭제");
					index = manage.searchIndexByName(name);
					if(index != -1) {
						manage.deleteMember(index);
					}
					break;
				case 6:
					int key = view.searchFavoriteType();
					String type = "";
					int height = 0;
					switch(key) {
					case 1: 
						type = view.inputSearchData();
						member = manage.searchOneByFaceStyle(type);
						break;
					case 2: 
						height = view.inputHeighData();
						member = manage.searchOneByHeight(height);
						break;
					case 3: break;
					default: break;
				}
					//manage.sear
					//member = manage.searchOneByName(name);
					break;
				case 0:
					view.displayMsg("프로그램이 종료되었습니다.");
					break finish;
				default:
					view.displayMsg("잘못 입력하셨습니다");
					break;
			}
		}
	}
}
