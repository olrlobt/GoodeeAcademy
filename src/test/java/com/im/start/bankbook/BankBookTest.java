package com.im.start.bankbook;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.im.start.MyAbstractTest;
import com.im.start.bankbook.BankBookCommentDAO;
import com.im.start.bankbook.BankBookCommentDTO;
import com.im.start.board.impl.CommentDTO;
import com.im.start.util.CommentPager;


public class BankBookTest extends MyAbstractTest {

	@Autowired
	private BankBookCommentDAO bankBookCommentDAO;
	
	//@Test
	public void getListTest() throws Exception{
		
		CommentPager commentPager = new CommentPager();
		
		commentPager.setBookNum(1661127403935L);
		commentPager.setPage(1L);
		commentPager.getRowNum();
		List<BankBookCommentDTO> ar = bankBookCommentDAO.getList(commentPager);
		
		System.out.println( "ar size ======== "+ar.size());
		
		assertNotNull(ar);
		
	}
	//@Test
	public void getAddTest() throws Exception{
		
		BankBookCommentDTO bankBookCommentDTO = new BankBookCommentDTO();
		bankBookCommentDTO.setWriter("sssssss");
		bankBookCommentDTO.setContents("sssssss");
		bankBookCommentDTO.setBookNum(1661127403935L);
		int result = bankBookCommentDAO.setAdd(bankBookCommentDTO);
		
		
		assertEquals(1,result);
		
	}
	
	
	public void getDeleteTest() throws Exception{
		
		BankBookCommentDTO bankBookCommentDTO = new BankBookCommentDTO();
		bankBookCommentDTO.setWriter("sssssss");
		bankBookCommentDTO.setContents("sssssss");
		bankBookCommentDTO.setBookNum(1661127403935L);
		int result = bankBookCommentDAO.setAdd(bankBookCommentDTO);
		
		
		
		assertEquals(1,result);
		
	}
	//@Test
//	public void getCommentListTotalCountTest() throws Exception{
//		Long result = bankBookCommentDAO.getCommentListTotalCount();
//		
//		
//		System.out.println("result = " + result);
//		
//	}
	
	//@Test
	public void CommentDeleteTest() throws Exception{
		
		BankBookCommentDTO bankBookCommentDTO = new BankBookCommentDTO();
		bankBookCommentDTO.setNum(139L);
		
		int result = bankBookCommentDAO.setDelete(bankBookCommentDTO);
		
		assertEquals(1, result);
		
	}
	
	
	@Test
	public void CommentUpdateTest() throws Exception{
			
			BankBookCommentDTO bankBookCommentDTO = new BankBookCommentDTO();
			bankBookCommentDTO.setNum(140L);
			bankBookCommentDTO.setContents("hhhhhhhhhhhhhhhhhhhhhhhhhhh");
			int result = bankBookCommentDAO.setUpdate(bankBookCommentDTO);
			
			assertEquals(1, result);
			
	}
	

}
