package com.iu.unit;

public abstract class Unit {

	private int hp;
	private String color;
	private String Name;
	private int wings;
	
	
	// 
	
	public Unit (int hp) {
		System.out.println("Unit 생성자 " );
		
	}
	
	public abstract void move();
	public  void info() {
		System.out.println("info " );
		
	};
	
	
	public void attack() {
		System.out.println("공격  치직" );
	}
	public void work() {
		System.out.println("미네랄 치직" );
	}
	
	
	
	
	
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
	
	
	
}
