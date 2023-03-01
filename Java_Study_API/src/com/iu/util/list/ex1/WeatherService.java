package com.iu.util.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class WeatherService{

	private StringBuffer sb;
	Scanner sc = new Scanner(System.in);
	ArrayList<CityDTO> citydto = new ArrayList<>();
	
	
	
	
	
	
	
	public WeatherService() {
	
		sb= new StringBuffer();
		sb.append("Seoul,30.2,70,맑음,");
		sb.append("Daegu-38.9-90-흐림-");
		sb.append("Jeju,12.1,10,눈,");
		sb.append("Busan-0.5,85,태풍");
		
	
	}
	
	
	public void init(ArrayList<CityDTO> citydto) {
		//sb에 있는  data들을 파싱 .  citydto 에 담아서 리턴 (arraylist에 리턴)
		
		this.citydto = citydto;
		
		
		this.citydto.clear();
		
		String citybuffer = sb.toString();
		citybuffer= citybuffer.replace("-", ",");
		String[] citylist ;
		citylist = citybuffer.split(",");
		
		
		
		
		
		for(int i = 0 ; i < citylist.length ; i ++ ) {
			
			CityDTO city = new CityDTO();
			city.setName(citylist[i]);
			city.setGion(Double.parseDouble((citylist[++i])));
			city.setHum(Integer.parseInt(citylist[++i]));
			city.setStatus(citylist[++i]);
			
			this.citydto.add(city);
			
		}
		
	}
	
	
	public void add() {
		// city 정보를 입력받아서 추가한다.
		CityDTO city = new CityDTO();
		System.out.println(" 도시명을 입력하세요 : ");
		city.setName(sc.next());
		System.out.println(" 기온을 입력하세요 : ");
		city.setGion(sc.nextDouble());
		System.out.println(" 습도를 입력하세요 : ");
		city.setHum(sc.nextInt());
		System.out.println(" 날씨를 입력하세요 : ");
		city.setStatus(sc.next());
		
		citydto.add(city);
		
	}
	
	public void remove() {
		// 도시명을 입력받아서 삭제한다.
	
		System.out.println(" 삭제하고 싶은 도시명을 입력하세요 : ");
		String search = sc.next();
		System.out.println(" 삭제하고 싶은 도시명을 입력하세요 : " + search);
		for(CityDTO citydt : citydto) {
			
			if(search.toUpperCase().equals(citydt.getName().toUpperCase())) {
				
				this.citydto.remove(citydt);
				break;
				
			}else {
				// 도시명 없다고 뽑기
			}
			
		}
		
		
		
		
	}
	
	
	public CityDTO find() {
		// 도시명을 입력받아서 검색한다.  없으면 없다고 출력 
		
		System.out.println(" 검색하고 싶은 도시명을 입력하세요 : ");
		String search = sc.next();
		for(CityDTO citydt : citydto) {
			
			if( search.toUpperCase().equals(citydt.getName().toUpperCase())) {
				
				return citydt;
				
				
			}else {
				
			}
			
		}
		
		return null;
		
		
	}
	
}
