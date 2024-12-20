package collection.practice;

public class Member {
	
	private String name;
	private int age;
	private String gender;
	private String faceStyle;
	private int height;
	
	
	public Member() {}
	public Member(String name, int age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public String getFaceStyle() {
		return faceStyle;
	}
	public void setFaceStyle(String faceStyle) {
		this.faceStyle = faceStyle;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
