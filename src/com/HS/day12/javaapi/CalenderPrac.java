package com.HS.day12.javaapi;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalenderPrac {
	public static void main(String[] args) {
		Calendar calendar = new GregorianCalendar();
		Calendar today = Calendar.getInstance();
		Calendar Date = Calendar.getInstance();
		Date.set(2023, 11, 20, 9, 10);
		printDate("지난 내 생일", Date);
		
	}
	public static void printDate(String content, Calendar date) {
		int year = date.get(Calendar.YEAR);
		int month = date.get(Calendar.MONTH);
		int day = date.get(Calendar.DAY_OF_MONTH);
		int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
		int hour = date.get(Calendar.HOUR);
		int hourOfDay = date.get(Calendar.HOUR_OF_DAY);
		int minute = date.get(Calendar.MINUTE);
		int second = date.get(Calendar.SECOND);
		int millisec = date.get(Calendar.MILLISECOND);
		int ampm = date.get(Calendar.AM_PM);
		String dayWeek = "";
		
		switch(dayOfWeek) {
		case Calendar.SUNDAY : dayWeek = "일요일";
		break;
		
		case Calendar.MONDAY : dayWeek = "월요일";
		break;
		
		case Calendar.TUESDAY : dayWeek = "화요일";
		break;
		
		case Calendar.WEDNESDAY : dayWeek = "수요일";
		break;
		
		case Calendar.THURSDAY: dayWeek = "목요일";
		break;
		
		case Calendar.FRIDAY : dayWeek = "금요일";
		break;
		
		case Calendar.SATURDAY : dayWeek = "토요일";
		break;
		}
		System.out.println(content+" "+year + "/"+month+"/"+day+"/"+dayWeek+"("+hourOfDay+"시)"+" "+hour+"시 "+ minute+"분 " + second+ "초입니다.");
	}
}
