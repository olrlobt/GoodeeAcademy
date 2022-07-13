package com.iu.object3;

import java.util.Scanner;

public class Object3Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReturnTest rt = new ReturnTest();
		
		rt.info();
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println(" 숫자 입력 " );
		int num = sc.nextInt();
		
		num = rt.makeRandom21(num);
		
		
		System.out.println(num);
		
		
	}

}
