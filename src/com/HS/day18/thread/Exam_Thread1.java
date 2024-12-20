package com.HS.day18.thread;

class CountUp extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 5; i++) {
			System.out.println(i);
			try {
				// 전달값으로 밀리초를 받음, 1ms = 1/1000초, 1000ms 1초 500ms는 0.5초
				// Thread.sleep()은 Checked Exception이라 반드시 예외처리(try~catch)를 해주어야 함.
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
		}
	}
}

class CountDown extends Thread {
	@Override
	public void run() {
		for(int i = 69; i>65; i--) {
			System.out.println((char)i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class Exam_Thread1 {
	public static void main(String[] args) {
		CountUp cUp = new CountUp();
		CountDown cDown = new CountDown();
		cUp.start();
		cDown.start();
		

	}
}
