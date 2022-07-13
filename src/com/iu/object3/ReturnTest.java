package com.iu.object3;

import java.util.Random;

public class ReturnTest {

	
	
	
	// 타이틀 예금주 잔액 통장번호
	public int makeAccount(int num) {
		
		Random random = new Random();
		num = random.nextInt(num);
		
		
		
		return num;
		
		
	}
	
	
	public int makeRandom2(int num) {
		
		Random random = new Random();
		num = random.nextInt(num);
		
		
		
		return num;
		
		
	}
	
	
	public int makeRandom() {
		
		Random random = new Random();
		int num = random.nextInt(50);
		
		
		
		return num;
		
		
	}
	
	
	public void info() {
		
		System.out.println("걍 종 료 ");
		
		
	}
	
	
	
}
