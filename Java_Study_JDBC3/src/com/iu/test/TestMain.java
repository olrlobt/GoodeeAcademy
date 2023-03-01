package com.iu.test;

import java.sql.SQLException;

import com.iu.util.DBConnector;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DBConnector dbConnector = new DBConnector();
		
		
			try {
				dbConnector.getConnection();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}


