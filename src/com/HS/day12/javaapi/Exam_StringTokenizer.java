package com.HS.day12.javaapi;

import java.util.StringTokenizer;

public class Exam_StringTokenizer {
	public static void main(String[] args) {
		String query = "name=james&addr=seoul&age=33";
		//&를 기준으로 끊어서 배열에 삽입
		String [] words = query.split("&");
		for(String word : words) {
			System.out.println(word);
		}
		System.out.println();
		StringTokenizer st = new StringTokenizer(query, "&");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	}
}
