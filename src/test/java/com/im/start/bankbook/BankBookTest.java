package com.im.start.bankbook;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.im.start.MyAbstractTest;
import com.im.start.bankbook.BankBookCommentDAO;
import com.im.start.bankbook.BankBookCommentDTO;
import com.im.start.board.impl.CommentDTO;


public class BankBookTest extends MyAbstractTest {

	@Autowired
	private BankBookCommentDAO bankBookCommentDAO;
	
	@Test
	public void getListTest() throws Exception{
		
		CommentDTO commnetdto = new CommentDTO();
		commnetdto.setNum(1661127403935L);
		List<BankBookCommentDTO> ar = bankBookCommentDAO.getList(commnetdto);
		
		System.out.println( "ar size ======== "+ar.size());
		
		assertNotNull(ar);
		
	}
	

}
