package com.iu.zerg;

import com.iu.unit.Unit;

public class Hydra extends Unit{
	
	

	
	private String weapon;
	
	public void move() {
		System.out.println(" 기어가기 ");
	}
	
	
	
	public void shoot() {
		System.out.println("ㅜ테 퉤퉽 퉤투 퉤 " );
	}
	
	public String getWeapon() {
		return weapon;
	}
	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}
	
	
	
	
}
