package com.im.start.bankbook;


import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.im.start.util.CommentPager;

@Controller
@RequestMapping(value = "/bankbook/*")
public class BankBookController {

	@Autowired
	private BankBookService bankBookService;
	
	
	
	// comment 호출하기 /bankbook/commentList  GET   page,bookNum
	
//	// 1. jsp에 출력하고 결과물을 응답으로 전송
//	@GetMapping("commentList")
//	public ModelAndView getCommentList(CommentPager commentPager) throws Exception{
//		
//		ModelAndView mv = new ModelAndView();
//		List<BankBookCommentDTO> li = bankBookService.getCommentList(commentPager);
//		mv.addObject("list",li);
//		mv.setViewName("common/commentList");
//		return mv;
//	}
//	
	
	
	@PostMapping("commentDelete")
	@ResponseBody
	public int setCommentDelete(BankBookCommentDTO bankBookCommentDTO) throws Exception{
		
		int result = bankBookService.setCommentDelete(bankBookCommentDTO);
		
		
		return result;
	}
	
	@PostMapping("commentUpdate")
	@ResponseBody
	public int setCommentUpdate(BankBookCommentDTO bankBookCommentDTO) throws Exception{
		
		int result = bankBookService.setCommentUpdate(bankBookCommentDTO);
		
		
		return result;
	}
	
	
	
	
	@GetMapping("commentList")
	@ResponseBody
	public Map<String, Object> getCommentList(CommentPager commentPager) throws Exception{
		
		List<BankBookCommentDTO> li = bankBookService.getCommentList(commentPager);
		
		
		
		//json
		//dto = {"num":1 , "bookNum" : 123 , "writer": 3355}
		//[{}]
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("list",li);
		map.put("pager",commentPager);
		
		
		
		
		return map;
	}
	
	
	@PostMapping("commentAdd")
	@ResponseBody
	public String setCommentAdd(BankBookCommentDTO bankBookCommentDTO) throws Exception{
		
		
		int result = bankBookService.setCommentAdd(bankBookCommentDTO);
		
		String jasonResult = "{\"result\":\""+result+"\"}";
		return jasonResult;
	}
	
	
	//------------------------------------------------------
	
	
	
	@RequestMapping(value = "list",method = RequestMethod.GET)
	public void getList(Model model) throws Exception {
		System.out.println("list get 실행");
		
		
		List<BankBookDTO> ar = bankBookService.getList();
		model.addAttribute("list",ar);
		
	
	}
	
	
	
	
	
	@RequestMapping(value = "add",method = RequestMethod.GET)
	public void Add() {
		System.out.println("add get 실행");
		
		
		
	}
	
	@RequestMapping(value = "add",method = RequestMethod.POST)
	public String Add(BankBookDTO bankBookDTO) throws Exception {
		System.out.println("add post 실행");
		bankBookDTO.setBookSale(false);
		bankBookDTO.setBookNum(System.currentTimeMillis());
		
		
		bankBookService.setBankBook(bankBookDTO);
		
		return "redirect:./list";
	}
	
	
	@RequestMapping(value = "detail",method = RequestMethod.GET)
	public void getDetail(BankBookDTO bankBookDTO,Model model) throws Exception {
		System.out.println("detail get 실행");
		
		
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		model.addAttribute("detail",bankBookDTO);
		
		
	}
	
	@RequestMapping(value = "update",method = RequestMethod.GET)
	public void setUpdate(BankBookDTO bankBookDTO,Model model) throws Exception {
		System.out.println("update get 실행 ");
		
		//bankBookService.setUpdate(bankBookDTO);
		bankBookDTO = bankBookService.getDetail(bankBookDTO);
		model.addAttribute("update", bankBookDTO);
		
		
	}
	
	
	@RequestMapping(value = "update",method = RequestMethod.POST)
	public String setUpdate(BankBookDTO bankBookDTO) throws Exception {
		System.out.println("update post 실행 ");
		
		
		bankBookService.setUpdate(bankBookDTO);
		
		
		return "redirect:./list";
		
	}
	
	
	@RequestMapping(value = "delete",method = RequestMethod.GET)
	public String Delete(BankBookDTO bankBookDTO) throws Exception {
		System.out.println("Delete 실행 ");
		
		bankBookService.delete(bankBookDTO);
		
		return "redirect:./list";
	}
	
	
}
