package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherController {
	
	Scanner sc = new Scanner(System.in);
	WeatherService WS = new WeatherService();
	WeatherView WV = new WeatherView();
	
	
	
	
	
	public void start() {
		// 1번 누르면 날씨정보 초기화 - init 호출
		// 2번 누르면 전국날씨 출력
		ArrayList<CityDTO> citydto = new ArrayList<>();
		
		
		Boolean start = true;
		while(start) {
			System.out.println("================");
			System.out.println("1. 날씨정보 초기화 ");
			System.out.println("2. 전국 날씨 출력 ");
			System.out.println("3. 지역 날씨 출력 ");
			System.out.println("4. 지역 정보 추가 ");
			System.out.println("5. 지역 정보 삭제 ");
			System.out.println("6. 종료 ");
			System.out.println("================");
			int num =sc.nextInt();
			
			
			
			
			
			switch (num) {
				case 1 : 
					WS.init(citydto);
					break;
				case 2 :	
					WV.view(citydto);
					break;
				case 3 :
					WV.view(WS.find());
					break;
				case 4 :
					WS.add();
					WV.view(citydto);
					break;
				case 5 :
					WS.remove();
					WV.view(citydto);
					break;
				case 6 :
					start = false;
					System.out.println("종료되었습니다. ");
					break;
					
				default :
						break;
			
			}
			
			
			
			
			
			
			
			
		}
		
	}

}
