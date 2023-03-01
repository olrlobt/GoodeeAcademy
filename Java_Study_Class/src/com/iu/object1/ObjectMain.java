package com.iu.object1;

public class ObjectMain {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작");

		Monster monster = new Monster();
		System.out.println(monster);
		
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		monster.name="오크";
		monster.hp = 100;
		monster.level = 5;
		System.out.println(monster.name);
		System.out.println(monster.level);
		System.out.println(monster.hp);
		
		Monster monster2 = new Monster();
		monster2.name="오크";
		monster2.hp = 100;
		monster2.level = 5;
		
		
		System.out.println(monster== monster2);
		
		Weapon sword = new Weapon();
		sword.name = "단검";
		sword.damage = 10;
		sword.inchant = 1;
	
		monster.weapon = sword;
		System.out.println(monster.weapon.name);
		
		
		
		
		
		
		
		
		System.out.println("프로그램 종료");
	}
}


