package com.im.start.bankaccount;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.im.start.BankMembers.BankMembersDTO;


@Service
public class AccountService {

	@Autowired
	private BankAccountDAO bankAccountDAO;
	
	
	public List<BankAccountDTO> getList(BankMembersDTO bankMembersDTO){
		
		
		return bankAccountDAO.getList(bankMembersDTO);
	}
	
	public int add(BankAccountDTO bankAccountDTO) throws Exception {
		
		
		return bankAccountDAO.add(bankAccountDTO);
	}
	

}
