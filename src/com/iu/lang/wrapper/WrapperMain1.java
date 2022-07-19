package com.iu.lang.wrapper;

import java.util.Scanner;

import com.iu.lang.wrapper.ex1.WrapperEx1;
import com.iu.lang.wrapper.ex1.WrapperEx2;

public class WrapperMain1 {

	public static void main(String[] args) {
		
		
	
		WrapperEx1 ex1 = new WrapperEx1();
		WrapperEx2 ex2 = new WrapperEx2();
		Scanner sc = new Scanner(System.in);
		System.out.println("민증 번호를 내 놓거라. ");
		String jumin = sc.next();
		
		
		ex2.jumincheck(jumin);
		
		
		
		
		
		

	}

}
