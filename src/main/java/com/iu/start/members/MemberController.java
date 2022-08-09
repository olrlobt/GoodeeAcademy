package com.iu.start.members;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller 
@RequestMapping(value = "/member/*")
// << 얘는 controller역할 , container 에게 이 클래스의 객체를 생성 위임
public class MemberController {

	
	// annotation
	// @ : 설명 + 실행
	
	// /member/login 실행해야되는 순수 메소드
	@RequestMapping(value = "login")
	public String login() {
		System.out.println("로그인 실행");
		
		
		return "member/login";
		
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
		
		return "member/join";
		
	}
	
}
