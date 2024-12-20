package com.HS.day18.thread;

	/*
	 * printNumbers와 downloadFiles를 쓰레드로 만들어 실행해주세요
	 */
	class PrintNumbers implements Runnable{

		@Override
		public void run() {
			for(int i = 1; i<=5; i++) {
				System.out.println(Thread.currentThread().getName()+" : " + i);
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	class DownloadFiles implements Runnable{
		@Override
		public void run() {
		String [] files = {"document.pdf", "image.jpg", "video.mp4"};
		for(String file: files) {
			System.out.println(Thread.currentThread().getName()+" : "+ file);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
	public class Exam_MultiThread {
	public static void main(String[] args) {
		Thread thread1 = new Thread(new PrintNumbers(), "카운트업" );
		Thread thread2 = new Thread(new DownloadFiles(), "다운로드 중...");
		thread1.start();
		thread2.start();
	}
}
