package com.iu.start.bankaccount;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.iu.start.bankBook.BankBookDAO;
import com.iu.start.bankBook.BankBookDTO;
import com.iu.start.members.BankMembersDAO;
import com.iu.start.members.BankMembersDTO;


@Controller
@RequestMapping(value = "/bankAccount/*")
public class AccountrController {

	private BankAccountDAO bankAccountDAO;
	
	
	public AccountrController() {
		this.bankAccountDAO = new BankAccountDAO();
	}
	
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String add(BankAccountDTO bankAccountDTO, HttpSession session) throws Exception {
		System.out.println("BANKACCOUNT 실행");
		
		System.out.println(bankAccountDTO.getBookNum());
		System.out.println(session.getAttribute("log"));
		BankMembersDTO bankMembersDTO = (BankMembersDTO)session.getAttribute("log");
		bankAccountDTO.setUserID(bankMembersDTO.getID());
		
		
		int result = this.bankAccountDAO.add(bankAccountDTO);
		
		System.out.println(result);
		
		return "redirect:../bankbook/list";
		
	}
}
