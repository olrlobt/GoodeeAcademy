package com.iu.start.members;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller 
@RequestMapping(value = "/member/*")
// << 얘는 controller역할 , container 에게 이 클래스의 객체를 생성 위임
public class MemberController {

	
	// annotation
	// @ : 설명 + 실행
	
	// /member/login 실행해야되는 순수 메소드
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		System.out.println("로그인 실행");
		
		
		return "member/login";
		
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(HttpServletRequest request,BankMembersDTO bankMembersDTO) throws Exception {
		System.out.println(" DB 로그인 실행");
		
		BankMembersDAO bankMembersDAO = new BankMembersDAO();
		bankMembersDTO=bankMembersDAO.getLogin(bankMembersDTO);
		
		System.out.println();
		HttpSession session = request.getSession();
		session.setAttribute("log", bankMembersDTO);
		
		
		
		return "redirect:/";
	
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) throws Exception{
		System.out.println("Logout 실행");
		
		session.invalidate();
		
		return "redirect:/";
	}
	
	
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String join() {
		System.out.println("회원가입 GET 실행");
	
		
		return "member/join";
	}
	
	
	@RequestMapping(value = "join" ,method = RequestMethod.POST)
	public String join(BankMembersDTO bankmembers) throws Exception {
		System.out.println("회원가입  POST 실행");
		
		
		
//		BankMembersDTO bankMembersDTO = new BankMembersDTO();
//		bankMembersDTO.setID(request.getParameter("id"));
//		bankMembersDTO.setPW(request.getParameter("pw"));
//		bankMembersDTO.setName(request.getParameter("name"));
//		bankMembersDTO.setEmail(request.getParameter("email"));
//		bankMembersDTO.setPhone(request.getParameter("phone"));
		
		BankMembersDAO bankMembersDAO = new BankMembersDAO();
		int result = bankMembersDAO.setJoin(bankmembers);
		
//		System.out.println(result);
		
		return "redirect:/member/login";
		
	}
	@RequestMapping(value = "search", method = RequestMethod.GET)
	public void getSearchByID() throws Exception{
		System.out.println("SEARCH 실행");
		
	}
	
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public ModelAndView getSearchByID(String search) throws Exception{
		System.out.println("SEARCH  post 실행");
		
		ModelAndView mv = new ModelAndView();
		BankMembersDAO bankMembersDAO = new BankMembersDAO();
		ArrayList<BankMembersDTO> bankmembers = new ArrayList<BankMembersDTO>();
		bankmembers = bankMembersDAO.getSearchByID(search);
		
		mv.setViewName("member/list");
		mv.addObject("search",bankmembers);
		
		return mv;
	}
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public String list() throws Exception{
		System.out.println("List 실행");
		
		return "member/list";
	}
	
	
	
}
