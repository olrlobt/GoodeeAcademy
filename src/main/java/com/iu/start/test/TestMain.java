package com.iu.start.test;

import java.util.ArrayList;
import java.util.Scanner;

import com.iu.start.bankBook.BankBookDAO;
import com.iu.start.bankBook.BankBookDTO;
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
		
		
////		System.out.println(result);
		Scanner sc = new Scanner(System.in);
//		
//		BankMembersDTO bankMembersDTO = new BankMembersDTO();
//		BankMembersDAO bankMembersDAO = new BankMembersDAO();
//		
//		
//		String str = sc.next();
//		bankMembersDAO.getSearchByID(str);
//		long milliSecond = System.currentTimeMillis();
		BankBookDAO bankBookDAO = new BankBookDAO();
		BankBookDTO bankBookDTO = new BankBookDTO();
		bankBookDTO.setBooknum( System.currentTimeMillis());
		bankBookDTO.setBookname("dltmdgjs");
		bankBookDTO.setBookrate(3.5);
		bankBookDTO.setBooksale(false);
		
//		ArrayList<BankBookDTO> getlist = new ArrayList<BankBookDTO>();
		
		
		
		bankBookDAO.setBankBook(bankBookDTO);
//		getlist = bankBookDAO.getList();
//		
//		for(BankBookDTO dto : getlist) {
//			System.out.println("1");
//			
//		}
		bankBookDAO.setChangeSale(bankBookDTO);
		System.out.println("성공");
		
		BankBookDTO bankBookDTO1 = new BankBookDTO();
		bankBookDTO1.setBooknum((long)1659507945370L);
		
		bankBookDTO1 =bankBookDAO.getDetail(bankBookDTO1);
		
		System.out.println(""+ bankBookDTO1.getBooknum() + bankBookDTO1.getBookname());
		
	}

}
