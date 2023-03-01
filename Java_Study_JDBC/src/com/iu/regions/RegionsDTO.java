package com.iu.regions;

public class RegionsDTO {

	
	//
	// 기본 생성자 필수
	//멤버변수명은 Table의 컬럼명과 동일하게 선언
	
	private Integer region_id;   // int 는 null을 넣을 수 없다.
	private String region_name;
	
	
	
	
	public Integer getRegion_id() {
		return region_id;
	}
	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}
	public String getRegion_name() {
		return region_name;
	}
	public void setRegion_name(String region_name) {
		this.region_name = region_name;
	}
	
	
	
	
}
