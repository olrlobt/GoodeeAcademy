package com.im.start.bankaccount;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.im.start.MyAbstractTest;
import com.im.start.BankMembers.BankMembersDTO;
import com.im.start.bankbook.BankBookDTO;

public class BankAccountDAOTest extends MyAbstractTest {

	@Autowired
	private BankAccountDAO bankAccountDAO;
	
	
	@Test
	public void getListTest() throws Exception{
		
		BankMembersDTO bankMemberDTO = new BankMembersDTO();
		
		bankMemberDTO.setID("ID1");
		
		List<BankAccountDTO> ar = bankAccountDAO.getList(bankMemberDTO);
		
		assertNotEquals(0, ar.size());
		
		
	}
	
	

}
