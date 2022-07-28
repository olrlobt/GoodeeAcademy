package com.iu.test;

import java.sql.SQLException;

import com.iu.countries.CountriesDAO;
import com.iu.regions.RegionsDAO;
import com.iu.regions.RegionsDTO;
import com.iu.regions.RegionsView;
import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		DBConnector dbConnector = new DBConnector();
		
		CountriesDAO dao = new CountriesDAO();
		RegionsDAO rdao = new RegionsDAO();
		RegionsView view = new RegionsView();
		
		RegionsDTO dto = new RegionsDTO();
		dto.setRegion_id(5);
		
		dto.setRegion_name("Mars");
		
		int result = rdao.setRegion(dto);
		
		System.out.println(result);
		
		//view.view(rdao.getDetail(1));
		}
	
	
		
	}


