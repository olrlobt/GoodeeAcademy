package com.iu.start.test;

import java.sql.Connection;

import com.iu.start.members.BankMembersDAO;
import com.iu.start.members.BankMembersDTO;
import com.iu.start.util.DBConnector;

public class DBConnctionTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			Connection con = DBConnector.getConnection();
		
			System.out.println(con != null);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BankMembersDTO bankMembersDTO = new BankMembersDTO();
		BankMembersDAO bankMembersDAO = new BankMembersDAO();
		bankMembersDAO.getSearchByID("ID");
	}

}
