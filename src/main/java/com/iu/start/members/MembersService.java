package com.iu.start.members;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class MembersService {

	@Autowired
	private BankMembersDAO bankMembersDAO;
	
	
	public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception{
	
	
		return bankMembersDAO.getLogin(bankMembersDTO);
		
	}
	
	public List<BankMembersDTO> getSearchByID(String search) throws Exception {
		
		return bankMembersDAO.getSearchByID(search);
	}
	
	
	public int setJoin(BankMembersDTO bankMembersDTO) throws Exception {
		
		return bankMembersDAO.setJoin(bankMembersDTO);
	}
	
}
