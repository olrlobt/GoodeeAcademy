package com.iu.test;

import java.sql.SQLException;

import com.iu.countries.CountriesDAO;
import com.iu.regions.RegionsDAO;
import com.iu.regions.RegionsView;
import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
//		DBConnector dbConnector = new DBConnector();
		
		CountriesDAO dao = new CountriesDAO();
		RegionsDAO rdao = new RegionsDAO();
		RegionsView view = new RegionsView();
		
		
		
		
		view.view(rdao.getDetail(1));
		}
	
	
		
	}


