package com.iu.object3;

import java.util.Random;

public class ReturnTest {
	
	//호출시 숫자를 받아서 그 숫자만큼 랜덤한 수를 뽑아서 리턴
	public int [] makeRandom2(int count) {
		Random rd = new Random();
		int [] nums = new int [count];
		
		for(int i=0; i<count; i++) {
			nums[i]= rd.nextInt(30);
		}
		
		return nums;
	}
	
	public int makeRandom() {
		Random random = new Random();
		int num = random.nextInt(50);
		
		//return 하려는 data
		return num; 
	}
	public void info() {
		System.out.println("실행 후 그냥 종료");
	}


	
	
	
	// 타이틀 예금주 잔액 통장번호
	public int makeAccount(int num) {
		
		Random random = new Random();
		num = random.nextInt(num);
		
		
		
		return num;
		
		
	}
	
	
	public int makeRandom21(int num) {
		
		Random random = new Random();
		num = random.nextInt(num);
		
		
		
		return num;
		
		
	}
	
	
	public int makeRandom1() {
		
		Random random = new Random();
		int num = random.nextInt(50);
		
		
		
		return num;
		
		
	}
	
	
	public void info1() {
		
		System.out.println("걍 종 료 ");
		
		
	}
	
	
	
}
