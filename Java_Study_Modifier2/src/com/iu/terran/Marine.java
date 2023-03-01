package com.iu.terran;

import com.iu.unit.Unit;

public class Marine extends Unit{

	

	
	private String weapon;
	
	
	public Marine() {
		super(0);
		System.out.println("마린 생성자 " );
	}
	
	
	public void info() {
		super.info();
		System.out.println("마린 info " );
		
	}
	
	
	public void move() {
		System.out.println("터벅터벅 " );
		
	}
	
	
	
	public void shoot() {
		System.out.println("우당탕탕탕" );
	}
	
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	
}
