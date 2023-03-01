package com.im.start.BankMembers;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.im.start.MyAbstractTest;

public class BankBookMemberDAOTest  extends MyAbstractTest{

	@Autowired
	private BankMembersDAO bankMembersDAO;
	
	@Test
	public void getMyPageTest() throws Exception{
		
		BankMembersDTO bankMembersDTO = new BankMembersDTO();
		bankMembersDTO.setID("ID1");
		bankMembersDTO=bankMembersDAO.getMyPage(bankMembersDTO);
		
		assertNotNull(bankMembersDTO);
		
	}

}
