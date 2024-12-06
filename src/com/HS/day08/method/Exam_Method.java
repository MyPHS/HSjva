package com.HS.day08.method;

public class Exam_Method {

	public static void main(String[] args) {
		Run_Method em = new Run_Method();
		em.noReturnNoParam();
	
		
		em.noReturnYesParam(202050502);
		
		System.out.println(1);
		System.out.println(em.yesReturnNoParam());
	
		int result = em.yesReturnYesParam(1000);
		System.out.println(result);
		
		result = em.sum(1,2,3,4,5);
		System.out.println("result : " + result);
	
	
	}
	
}
