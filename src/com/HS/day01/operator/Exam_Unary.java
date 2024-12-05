package com.HS.day01.operator;

public class Exam_Unary {

	public static void main(String[] args) {
		/*
		 * 단항 연산자
		 * a++, ++a -> a = a+1;
		 */
		int num = 1;
		System.out.println(num++);//num++ -> 다음에 나오는 num은 num+1이 됨.
		System.out.println(++num);//++num -> num에 1을 더해서 바로 대입함.
//		num++ ++num num = 1 3 3
//		num++ num++ num = 1 2 3
//		++num ++num num = 2 3 3
		/*
		 * a가 10, b는 20, c는 30입니다.
		 * a++;
		 * b = (--a) + b;
		 * c = (a++) + (--b);
		 * 연산을 끝마친 후의 abc의 값을 구하라.
		 * 11 30 39
		 * 
		 * 문제 2
		 * x는 100, y는 33, z는 0입니다.
		 * x--;
		 * z= x-- + --y;
		 * x = 99 + x++ + x;
		 * y = y-- + y + ++y;
		 * x y z의 값은?
		 * z = 99+32 = 131
		 * x = 99+98 + 99=296
		 * y = 32+ 31 + 32 = 95
		 */
		int x = 100;
		int y = 33;
		int z = 0;
		x--;
		int z1 = x-- + --y;
		int x1 = 99 + x++ + x;
		int y1 = y-- + y + ++y;
		
		System.out.println(z1);
		System.out.println(x1);
		System.out.println(y1);
		
		/*
		 * 문제3
		 * a는 5, b는 10입니다.
		 * c = (++a) + b;
		 * d = c / a;
		 * e = c % a;
		 * f = e++;
		 * g = (--b) + (d--);
		 * h = 2;
		 * i = a++ + b / (--c / f) * (g-- - d) % (++e + h);
		 * a: ?, b: ?, c: ?, d: ?, e: ?, f: ?, g: ?, h: ?, i: ?의 값은 무엇일까요?
		 */
	}

}