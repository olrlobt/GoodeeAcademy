package com.iu.lang.wrapper.ex1;

import java.util.Scanner;

public class WrapperEx1 {

	//ex1
	//스캐너로부터 주민번호를 입력받는다(불법) : 980317-1234567 형식으로 입력받기.
	//1. 납, 여 판단 
	//2. 현재 나이 출력
	//3. 3-5월 사이 출생은 봄 . 
	//	 6-8월 사이 여름
	// 	 9-11월 사이 가을
	// 	 12-2월 사이 겨울
	
	
	
	public void Ex1(){
		Scanner sc = new Scanner(System.in);
		String str = new String();
		
		
		System.out.println("주민번호를 입력하세요 . : ( - 포함)");
		str = sc.next();
		
		char gender = str.charAt(7); 
		int howold = 122 - Integer.parseInt(str.substring(0,2));
		int numseasons = Integer.parseInt(str.substring(2,4));
		
		String mmm,seasons;
		
		switch(gender) {
		
			case '1':
				mmm = "남자";
				break;
			case '3':
				mmm = "남자";
				break;
			default:
				mmm = "여자";

		}
		
		if(howold>=100)howold -= 100;
		
			
		if( 3<=numseasons && numseasons <=5) {
			
			seasons = "봄";
		}else if( 6<=numseasons && numseasons <=8) {
			
			seasons = "여름";
		}else if( 9<=numseasons && numseasons <=11) {
			
			seasons = "가을";
		}else {
			
			seasons = "겨울";
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.println(" 성별은 " + mmm );
		System.out.println(" 나이는 " + howold );
		System.out.println(" 계절은 " + seasons );
		
	}
	
	
	
}
