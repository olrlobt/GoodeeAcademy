package com.iu.start.members;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.start.MyAbstractTest;

public class BankbookMembersDAOTest extends MyAbstractTest{

	
	@Autowired
	private BankMembersDAO bankMembersDAO;

	@Test
	public void setJoinTest()	throws Exception {
		
		int result = bankMembersDAO.setJoin("dg");
		throw new Exception();
		//assertEquals(1,result);
		
	}
	@Test
	public void getLogintTest()	throws Exception {
		
		Object result = bankMembersDAO.getLogin("df");
		assertNull(result);
		
	}
	
	@Test
	public void getSearch()	throws Exception {
		
		List<Object> result = bankMembersDAO.getSearch("df");
		assertNotEquals(0,result.size());
		
	}
	
	
	
}
