package com.iu.start.bankBook;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BankBookService {

	@Autowired
	private BankBookDAO bankBookDAO;
	
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception{
		
		return bankBookDAO.setBankBook(bankBookDTO);
	}
	
	// bank book 조회 최신 순 
	public ArrayList<BankBookDTO> getList() throws Exception{
		
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
	
	public int setDelete(BankBookDTO bankBookDTO) throws Exception{
		
		
		return bankBookDAO.setDelete(bankBookDTO);
	}
	
}
