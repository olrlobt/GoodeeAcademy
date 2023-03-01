package com.iu.regions;

import java.sql.ResultSet;

public class RegionsView {

	//view
	
	public void view(RegionsDTO dto) {
		
		System.out.println(dto.getRegion_id());
		System.out.println(dto.getRegion_name());
		
		
	}
	
	
}
