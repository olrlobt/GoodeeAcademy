package com.iu.ex1;

public class Iu {

	
	private String name;
	private int age;
	
	private Iu() {}
	
	public static Iu getInstance() {
		Iu iu = new Iu();
		
		
		return iu;
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
	
	
	// public void set 변수명 (데이터 타입 변수명){}
	
	
	
	
	
	
	
}
