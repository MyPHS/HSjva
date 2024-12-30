package com.HS.day2x.music.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.HS.day2x.music.model.vo.AscSinger;
import com.HS.day2x.music.model.vo.DescSinger;
import com.HS.day2x.music.model.vo.DescTitle;
import com.HS.day2x.music.model.vo.Music;

public class MusicManage {
	List<Music> mList;
	
	public MusicManage() {
		this.mList = new ArrayList<Music>();
	}
	public void register(Music music) {
		mList.add(music);
	}
	// TODO 데이터의 최종 저장소가 존재
	public List<Music> getAllMusic() {
		return mList;
	}
	public void registerMusicAtFirst(Music music) {
		mList.add(0, music);
	}
	public Music searchMusicByTitle(String title) {
		if(!"".equals(title) && title != null) {
			for(Music music : mList) {
				if(title.equals(music.getTitle())) {
					return music;
				}
			}
		}
		return null;
	}
	// 객체를 넘겨받고 mList에서 제거
	public void deleteMusic(Music music) {
//		mList.set(0, music);
		mList.remove(music);
	}
	// 곡명으로 인덱스 값 찾기
	public int searchIndexByTitle(String title) {
		if(!"".equals(title) && null!= title) {
			for(int i = 0; i < mList.size(); i++) {
				if(title.equals(mList.get(i).getTitle())) {
					return i;
				}
			}
		}
		return -1;
	}
	//곡 정보 수정
	public void modifyMusic(int index, Music music) {
		mList.set(index, music);
	}
	public void sortByTitleASC() {
		/*
		 * 정렬하기
		 * 1. 알고리즘 사용
		 * 2. Collections 클래스 사용
		 */
		Collections.sort(mList);
	}
	//내림차순 정렬이 됨
	public void sortByTitleDESC() {
		Collections.sort(mList, new DescTitle());
	}
	public void sortBySingerASC() {
		Collections.sort(mList, new AscSinger());
	}
	public void sortBySingerDESC() {
		Collections.sort(mList, new DescSinger());
	}
}
