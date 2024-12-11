package com.HS.day10.overridng;


		class SuperClass{
			void paint() {
				draw();
				
			}
			void draw() {
				System.out.println("Super Object");
			}
			
			
		}
		class SubClass extends SuperClass{
			void paint() {
				super.paint();
				super.draw();
				
			}
			void draw() {
				System.out.println("Sub Object");
			}
		}
		public class Exercise_overriding {
		public static void main(String[] args) {
			SuperClass ex = new SubClass();
			ex.paint();
		}
	}


