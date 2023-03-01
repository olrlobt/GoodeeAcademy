package com.iu.lang.wrapper.ex1;

public class WrapperEx2 {

	//jumincheck
	//주민번호 입력
	//
	

	
	
	public void jumincheck(String jumin) {
		
		String jumin2 = jumin.replaceAll("[^0-9]","");
		String[] check = jumin2.split("");
		
		int i = 2;
		int num ;
		int sum = 0;
		
		
		int checknum = Integer.parseInt(check[check.length-1]);
		for(int j = 0 ; j < check.length-1 ; j ++) {
			String s = check[j];
			
			num = Integer.parseInt(s);
			sum += num * i++ ;
			
			if(i == 10) {
				i=2;
			}
			
		}
		
		 if ( checknum == 11 -(sum%11)) {
			 System.out.println("인간 입니다.");
		 }else if(      checknum ==   10%(11 -(sum%11))         ) {
			 System.out.println("인간 입니다.");
		 }else
			 System.out.println("not 인간 입니다.");
		
		
		
		
	}
}
