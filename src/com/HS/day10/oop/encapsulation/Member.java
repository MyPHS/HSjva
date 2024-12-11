package com.HS.day10.oop.encapsulation;

//클래스의 필드는 private
public class Member {
	private String name;
	private int age;
	private String job;
	private String education;
	private long salary;
	private boolean divorceYN;
	private boolean talmoYN;
	
	public Member() {}
	
	//메소드
	//setter(set 메소드)
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public void setEduation(String education) {
		this.education = education;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	public void setDivorceYN(boolean divorceYN) {
		this.divorceYN = divorceYN;
	}
	public void setTalmoYN(boolean talmoYN) {
		this.talmoYN = talmoYN;
	}
	// getter(get 메소드)
	public String getName() {
		//return 뒤에 어떠한 값이 있으면 void에서는 절대 쓸 수 없음.
		return this.name;
	}
	public int getAge() {
		return this.age;
	}
	public String getJob() {
		return this.job;
	}
	public String getEducation() {
		return this.getEducation();
	}
	public long getSalary() {
		return this.salary;
	}
	public boolean getDivorceYN() {
		return this.divorceYN;
	}
	public boolean getTalmoYN() {
		return this.talmoYN;
	}
	public void work() {
		
	}
	public void eat() {
		
	}
}
