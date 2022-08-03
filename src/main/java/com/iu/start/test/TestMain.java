package com.iu.start.test;

import java.util.Scanner;

import com.iu.start.members.BankMembersDAO;
import com.iu.start.members.BankMembersDTO;

public class TestMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		int result = 0;
		
		
//		bankMembersDTO.setID("123");
//		bankMembersDTO.setPW("456");
//		bankMembersDTO.setName("789");
//		bankMembersDTO.setEmail("101112");
//		bankMembersDTO.setPhone("131415");
//		
//		result = bankMembersDAO.setJoin(bankMembersDTO);
		
		
//		System.out.println(result);
		Scanner sc = new Scanner(System.in);
		
		BankMembersDTO bankMembersDTO = new BankMembersDTO();
		BankMembersDAO bankMembersDAO = new BankMembersDAO();
		
		
		String str = sc.next();
		bankMembersDAO.getSearchByID(str);
		
		
		
		
		
	}

}
