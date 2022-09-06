package com.im.start.bankbook;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BankBookService {

	@Autowired
	private BankBookDAO bankBookDAO;
	
	
	@Autowired
	private BankBookCommentDAO bankBookCommentDAO;
	
	public int setCommentAdd(BankBookCommentDTO bankBookCommentDTO) throws Exception{
		
		
		return bankBookCommentDAO.setAdd(bankBookCommentDTO);
	}
	public int setCommentDelete(BankBookCommentDTO bankBookCommentDTO) throws Exception{
		
		
		return bankBookCommentDAO.setDelete(bankBookCommentDTO);
	}
	public int setCommentUpdate(BankBookCommentDTO bankBookCommentDTO) throws Exception{
		
		
		return bankBookCommentDAO.setUpdate(bankBookCommentDTO);
	}
	public List<BankBookCommentDTO> getCommentList(BankBookCommentDTO bankBookCommentDTO) throws Exception{
		
		
		return bankBookCommentDAO.getList(bankBookCommentDTO);
	}
	
	
//	---------------------------------------------------------------------------
	
	
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception{
		
		return bankBookDAO.setBankBook(bankBookDTO);
	}
	
	// bank book 조회 최신 순 
	public List<BankBookDTO> getList() throws Exception{
		
		return bankBookDAO.getList();
	}
	
	public int setChangeSale(BankBookDTO bankBookDTO) throws Exception{
		
		return bankBookDAO.setChangeSale(bankBookDTO);
	}
	
	
	//booknum 값으로 조회
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception{
		
		return bankBookDAO.getDetail(bankBookDTO);
	}
	
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception{
		
		return bankBookDAO.setUpdate(bankBookDTO);
	}
	
	public int delete(BankBookDTO bankBookDTO) throws Exception{
		
		return bankBookDAO.delete(bankBookDTO);
	}
	
	
}
