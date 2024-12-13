package com.HS.day12.javaapi;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exam_Calendar {
	public static void main(String[] args) {
		// 그레고리안 달력, 이슬람력, 유대력, 태음력
		Calendar calendar = new GregorianCalendar();
		Calendar today = Calendar.getInstance();
		// 캘린더로 선언된 변수에 객체를 만드는 코드(객체초기화)
		// 기본적으로 오늘 날짜를 가져옴
		Calendar startDate = Calendar.getInstance();
		// 오늘 날짜로 된 객체를 특정 날짜로 변경하는 코드
		// 오버로딩된 set메소드로 년도, 월, 일, 시, 분 설정
		startDate.set(2024, 10, 8, 9, 10);
//		startDate.set(Calendar.HOUR_OF_DAY, 9);
//		startDate.set(Calendar.MINUTE, 10);
		printDate("개강일", startDate);
		printDate("지금", today);
		
		// # 1
		// 지금은 2024/12/12/목요일(16시) 오후 4시 31분 30초 0밀리초입니다.
		// # 2
		// 2024/11/18/화요일(9시) 오전 9시 00분 0초 0밀리초에 개강하였습니다.
		
//		System.out.println(today.get(Calendar.YEAR)+ "년");
//		System.out.println((today.get(Calendar.MONTH)+1)+"월");
//		System.out.println((today.get(Calendar.DAY_OF_MONTH))+"일");
//		System.out.println((today.get(Calendar.DATE))+"일");
//		System.out.println((today.get(Calendar.HOUR))+"시");
//		System.out.println((today.get(Calendar.MINUTE))+"분");
//		System.out.println((today.get(Calendar.SECOND))+"초");
//		System.out.println((today.get(Calendar.MILLISECOND))+"초");
//		System.out.println((today.get(Calendar.AM_PM)));

	}
	public static void printDate(String content, Calendar date) {
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH);
		int day = date.get(Calendar.DAY_OF_MONTH);
		//요일
		int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
		int hour = date.get(Calendar.HOUR);
		//24시간 표시
		int hourOfDay = date.get(Calendar.HOUR_OF_DAY);
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		int millisec = date.get(Calendar.MILLISECOND);
		//오전오후
		int ampm = date.get(Calendar.AM_PM);
		String dayWeek = "";
		
		//요일은 한글로 출력되지 않음. 따라서 각 요일에 맞게 한글로 요일이 출력되도록 설
		switch(dayOfWeek) {
		case Calendar.SUNDAY : dayWeek = "일요일";
		break;
		
		case Calendar.MONDAY : dayWeek = "월요일";
		break;
		
		case Calendar.TUESDAY : dayWeek = "화요일";
		break;
		
		case Calendar.WEDNESDAY : dayWeek = "수요일";
		break;
		
		case Calendar.THURSDAY : dayWeek = "목요일";
		break;
		
		case Calendar.FRIDAY : dayWeek = "금요일";
		break;
		
		case Calendar.SATURDAY : dayWeek = "토요일";
		break;
		}
		
		String ap = "";
		if(Calendar.AM == ampm) {
			ap = "오전";
		}
		else {
			ap = "오후";
		}
		
		System.out.println(content+" "+year +"/"+month+"/"+day+"/"+dayWeek+"("+hourOfDay+"시)"+ap+" "+hour
				+"시 "+minute+"분 " + second + "초 "+millisec+"입니다.");
//		System.out.println("2024/11/18/화요일(9시) 오전 9시 00분 0초 0밀리초에 개강하였습니다.");
		
	}
}
