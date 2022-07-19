package com.iu.lang.string;

public class StringStudy3 {

	
	public void studySplit2() {
		
		
		
	}
	
	
	
	
	
	public void studySplit() {
		String str = "iu,suji,choa,hani";
		String str2 = new String();
		
		String names[] = str.split(",");
		
		for(String str1 : names) { // 향상된 for 문 //몇번째 도는지 알 수 없지만 , 간단하게 표현 가능
			System.out.println(str1);
		}
		
		
		for(int i = 0 ; i < names.length ; i++) { // 위 향상된 for문과 같은 기존 for 문
			String str1 = names[i];
			System.out.println(str1);
		}
		
		
		
	}
	
	
	
	
}
