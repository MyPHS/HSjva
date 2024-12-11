package com.HS.day10.oop.inheritance;

import com.HS.day10.oop.inheritance.point.Point;

class Super{
	public int pub;		//public은 모두 공개
	int def;			//default는 같은 패키지 내에서
	protected int pro;	//protected는 같은 패키지 + 상속한 자식클래스에만
	private int pri;	//private은 외부로부터 완벽차단
}

//Super에서 상속받은 sub클래스. sub는 자식요소이다.
class sub extends Super{
	void set() {
		super.pub = 1;
		super.def = 2;
		super.pro = 3;
//		super.pri = 4;
		Super sup = new Super();
		sup.pub = 502;
		sup.def = 1118;
		sup.pro = 1225;
//		sup.pri = 101;
	}
}
//다른 패키지에 있는 Point클래스에서 상속받은 ShapePoint.
class ShapePoint extends Point {
	void set() {
		Point p = new Point();
		p.pub = 114;
		//p.def = 119; 같은 패키지가 아님. default
		//p.pri = 113; 외부로부터 완벽차단 private
//		p.pro = 115; 같은 패키지가 아님
		super.pub = 111;
//		super.def = 11; 같은 패키지에서만 가능
		super.pro = 112; //protected는 상속된 경우에만 가능
//		super.pri = 116; 외부로부터 차단
	}
}
public class Exam_Protected {
	
}
