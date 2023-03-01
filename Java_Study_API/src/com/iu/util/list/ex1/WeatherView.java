package com.iu.util.list.ex1;

import java.util.ArrayList;

public class WeatherView {
	ArrayList<CityDTO> citydto;
	
	public void view(ArrayList<CityDTO> citydto) {
		
		this.citydto = citydto;
		
		for(CityDTO cityddd : citydto) {
		
			if(citydto != null) {
			
				System.out.print("   \t도시명 :\t " + cityddd.getName());
				System.out.print("   \t기온 :\t" + cityddd.getGion());
				System.out.print("   \t습도 :\t" + cityddd.getHum());
				System.out.println("  \t날씨 :\t" + cityddd.getStatus());
			}
		}
		
	}
	public void view(CityDTO citydto) {
		
		
		if(citydto != null) {
			
			System.out.print("   \t도시명 :\t " + citydto.getName());
			System.out.print("   \t기온 :\t" + citydto.getGion());
			System.out.print("   \t습도 :\t" + citydto.getHum());
			System.out.println("  \t날씨 :\t" + citydto.getStatus());
			
		}else
			System.out.println(" 그딴 도시 없습니다 ! " );
		
		
		
		
	}


	public void view(String msg) {
	
	
	}
}
