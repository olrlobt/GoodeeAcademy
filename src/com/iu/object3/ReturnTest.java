package com.iu.object3;

import java.util.Random;
import java.util.Scanner;

public class ReturnTest {
	//makeAccount
	// title, host, 통장번호, 잔액 입력받아서 리턴
	public Account makeAccount() {
		Scanner sc = new Scanner(System.in);
		Account ac = new Account();
		ac.title="자유입출금";
		ac.host="it";
		ac.numbers="1234";
		ac.balance = 500L;
				
		return ac;
	}
	
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

}
