package com.iu.lang.string;

public class StringStudy3 {

	public void studySplit() {
		String str = "iu,suji,choa,hani";
		String str2 = new String();
		
		String names[] = str.split(","); 
		// split은 입력받은 문자열 "iu,suji,choa,hani" 에서 문자열을 자르는 기준을 정해 잘라줌.
		// 이를 parsing 한다고 함. 
		
		for(String str1 : names) { // 향상된 for 문 //몇번째 도는지 알 수 없지만 , 간단하게 표현 가능
			System.out.println(str1);
		}
		
		
		for(int i = 0 ; i < names.length ; i++) { // 위 향상된 for문과 같은 기존 for 문
			String str1 = names[i];
			System.out.println(str1);
		}
	}
	
	
	
	
	
	
	
	public void studySplit2() {
		String info = "1997 12 24"; //
		String names[] = info.split(" "); // 공백이 입력 되어야 잘라짐. 
		// " " 가 아닌 "" 로 입력할 시 글자마다 잘라지게 됨.
		
		
		for(String str : names) { // 향상된 for 문 //몇번째 도는지 알 수 없지만 , 간단하게 표현 가능
			System.out.println(str);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
//	String info = "서울,대전-대구,부산-제주,광주-강릉"; // 해당 데이터를 도시별로 출력해 보시오
	// 조건 . split 을 2번 쓰면 안댐
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public void studySplit3() {
		String info = "서울,대전-대구,부산-제주,광주-강릉"; // 해당 데이터를 도시별로 출력해 보시오
		
		
		info = info.replace(",","-");
		
		String names[] = info.split("-"); 
		
		
		
		for(String str : names) { 
			System.out.println(str);
		}
		
		
	}
	
	
	
	
	
	
}
