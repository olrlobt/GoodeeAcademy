package com.iu.start.bankBook;

import java.util.ArrayList;

import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value = "/bankbook/*")
public class BankBookController {
	
	
	@RequestMapping(value = "list",method = RequestMethod.GET)
	public String list(HttpServletRequest request) throws Exception {
		System.out.println("리스트 실행");
		
		BankBookDAO bankBookDAO = new BankBookDAO();
		
		ArrayList<BankBookDTO> ar = bankBookDAO.getList();
		request.setAttribute("list", ar);
		
		return "bankbook/list";
	}

	
	@RequestMapping(value = "detail",method = RequestMethod.GET)
	public String detail(Long booknum) {
		System.out.println("디테일 실행");
		
		System.out.println("booknum + " + booknum);
		return "bankbook/detail";
	}
	
	
	@RequestMapping(value = "add",method = RequestMethod.GET)
	public String add() {
		System.out.println("add get 실행");
		return "bankbook/add";
	}
	@RequestMapping(value = "add",method = RequestMethod.POST)
	public String add(BankBookDTO bankbook) throws Exception {
		System.out.println("add post 실행");
		
		
		long milliSecond = System.currentTimeMillis();
		bankbook.setBooknum(milliSecond);
		bankbook.setBooksale(true);
		BankBookDAO bankBookDAO = new BankBookDAO();
		int result = bankBookDAO.setBankBook(bankbook);
		System.out.println(result);
		
		return "bankbook/add";
	}
	
}
