package com.im.start.BankMembers;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.im.start.bankaccount.AccountService;
import com.im.start.bankaccount.BankAccountDTO;

@Controller
@RequestMapping(value="/member/*")
public class BankMembersController {
	
	@Autowired
	private BankMembersService bankMembersService;
//	@Autowired
//	private AccountService accountService;
	
	
	
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String login() {
		System.out.println("로그인 실행");
		return "/member/login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(HttpSession session, BankMembersDTO bankMembersDTO, Model model) throws Exception {
		System.out.println("DB에 로그인 실행");
		bankMembersDTO = bankMembersService.getLogin(bankMembersDTO);
		System.out.println(bankMembersDTO);
		session.setAttribute("member", bankMembersDTO);
		// "redirect:다시 접속할 URL(절대경로,상대경로)"
		return "redirect:../";
	}
	
	@RequestMapping(value = "logOut" , method = RequestMethod.GET)
	public String logOut(HttpSession session) throws Exception{
		session.invalidate();
		return "redirect:../";
	}
	
	//Get
	@RequestMapping(value = "join", method = RequestMethod.GET)
	public String join() {
		System.out.println("조인 Get 실행");
		return "/member/join";
	}
	
	//Post
	@RequestMapping(value = "join", method = RequestMethod.POST)
	public String join(String ID,String PW,String NAME, String EMAIL, String PHONE) throws Exception {
		BankMembersDTO bankMembersDTO = new BankMembersDTO();
		bankMembersDTO.setID(ID);
		bankMembersDTO.setPW(PW);
		bankMembersDTO.setName(NAME);
		bankMembersDTO.setEmail(EMAIL);
		bankMembersDTO.setPhone(PHONE);
		int result = bankMembersService.setJoin(bankMembersDTO);
		if(result == 1) {
			System.out.println("성공");
		}
		else {
			System.out.println("실패");
		}
		System.out.println("조인 Post 실행");
		
		//로그인폼 페이지로 이동
		//redirect
		return "redirect:./login.file";
	}
	
	@RequestMapping(value = "search", method = RequestMethod.GET)
	public void getSearchByID() throws Exception {
		System.out.println("search GET 실행");
	}
	
	@RequestMapping(value = "search", method = RequestMethod.POST)
	public String getSearchByID(String search,Model model) throws Exception {
		System.out.println("search Post 실행");
		List<BankMembersDTO> ar = bankMembersService.getSearchByID(search);
		
		
		model.addAttribute("list", ar);
		return "member/list";
	}
	
	@RequestMapping(value = "myPage", method = RequestMethod.GET)
	public ModelAndView myPage(HttpSession session) throws Exception{
		System.out.println("my page get 실행");
		ModelAndView mv = new ModelAndView();
		BankMembersDTO bankMembersDTO = (BankMembersDTO) session.getAttribute("member");
		
//		Map<String, Object> map = bankMembersService.getMyPage(bankMembersDTO);
//		mv.addObject("map",map);
		bankMembersDTO = bankMembersService.getMyPage(bankMembersDTO);
	//	List<BankAccountDTO> ar = accountService.getList(bankMembersDTO);
		
		//mv.addObject("list",ar );
		mv.addObject("dto",bankMembersDTO);
		
		
		mv.setViewName("member/myPage");
		return mv;
	}


}
