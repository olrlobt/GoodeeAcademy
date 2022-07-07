package com.iu.control;

import java.util.Scanner;

public class Control2 {

	public static void main(String[] args) {
	
		int num=0;
		String wwww ="홀수";
		
		System.out.print("입력 : ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		if(num%2 == 0) {
	        wwww = "짝수";
	      }
		
		System.out.println(wwww + " 입니당 ");
		
	}

}
