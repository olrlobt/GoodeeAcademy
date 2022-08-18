package com.im.start.BankMembers;

import static org.junit.Assert.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.log;

import java.util.List;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import com.im.start.MyAbstractTest;

public class BankMembersDAOTest  extends MyAbstractTest{

	@Autowired
	private BankMembersDAO bankMembersDAO;
	
	static BankMembersDTO bankMembersDTO;
	
	@BeforeClass
	public static void startSetting() throws Exception{
		bankMembersDTO = new BankMembersDTO();
		bankMembersDTO.setUser_name("zzz");
		bankMembersDTO.setPassword("zzz");
		bankMembersDTO.setName("Seung3");
		bankMembersDTO.setEmail("3@naver3");
		
		bankMembersDTO.setPhone("010-00003");
	}
	
	@AfterClass
	public static void endSetting() throws Exception{
		
		
	}
	
	
	@Test 
	public void getLoginT()throws Exception {
		
		bankMembersDTO = bankMembersDAO.getLogin(bankMembersDTO);
		assertNotNull(bankMembersDTO);
	}
	
	
	@Test
	public void setJoinT() throws Exception {
		
		bankMembersDTO= new BankMembersDTO();
		bankMembersDTO.setEmail("qwqwqw");
		bankMembersDTO.setName("qwqwqw");
		bankMembersDTO.setPassword("qwqwqw");
		bankMembersDTO.setPhone("qwqwqw");
		bankMembersDTO.setUser_name("qwqwqw");
		
		int result = bankMembersDAO.setJoin(bankMembersDTO);
		
		
		
		
		assertEquals(0,result);
		
	}
	

	@Test
	public void getSearchByIDT() throws Exception {
		
		 List<BankMembersDTO> ar=bankMembersDAO.getSearchByID("A");
		
		 assertNotEquals(ar.size(), 0);
		
	}
}
