package com.iu.terran;

import com.iu.unit.Unit;

public class Marine extends Unit{

	

	
	private String weapon;
	
	public void move() {
		System.out.println("구보로 움직이기 ");
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
