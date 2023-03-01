package com.im.start.board.notice;

import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.im.start.BankMembers.BankMembersDTO;
import com.im.start.board.impl.BoardDTO;
import com.im.start.util.Pager;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	
	@ModelAttribute("board")
	public String getBoard() {
		
		
		return "notice";
	}
	
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView getList(Pager pager) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		
		
		List<BoardDTO> ar = noticeService.getList(pager);
		
//		System.out.println("page ="+ pager.getPage());
//		System.out.println("startnum ="+pager.getStartNum());
//		System.out.println("lastnum ="+pager.getLastNum());
//		System.out.println("");
//		System.out.println("perPage ="+pager.getPerPage());
//		System.out.println("perBlock ="+pager.getPerBlock());
		
		
		mv.addObject("list",ar);
		mv.addObject("pager",pager);
		
		
		mv.setViewName("board/list");
		
//		if (ar.size()!=0) {
//			
//			throw new Exception();
//		}
		return mv;
	}
	//글조회
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String getDetail(BoardDTO boardDTO,Model model) throws Exception{
		boardDTO = noticeService.getDetail(boardDTO);
		model.addAttribute("dto",boardDTO);
		
		
		
		return "board/detail";
	}
	
	
	
	
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String setAdd(HttpSession session) throws Exception{
		BankMembersDTO bankMembersDTO=(BankMembersDTO) session.getAttribute("member");
		
		if(bankMembersDTO != null) {
			
			
			return "board/add";
			
		}else {
			
			return "redirect:../member/login";
		}
		
		
	}
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView setAdd(BoardDTO boardDTO,MultipartFile [] files,HttpSession session) throws Exception{
		ModelAndView mv = new ModelAndView();
		int result =noticeService.setAdd(boardDTO,files,session.getServletContext());
		
		//구 찌
		
		String message = "게시 실패 !!";
		String url = "./list";
		
		if(result != 0) {
			message = "게시 성공 !!";
			
		}
		
		mv.addObject("message",message);
		mv.addObject("url",url);
		
		mv.setViewName("common/result");
		
		
		return mv;
	}
	
	//글수정
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public ModelAndView setUpdate(BoardDTO boardDTO,ModelAndView mv) throws Exception{
		
		boardDTO = noticeService.getDetail(boardDTO);
		mv.addObject(boardDTO);
		mv.setViewName("board/update");
		
		return mv;
		
		
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String setUpdate(BoardDTO boardDTO) throws Exception{
		
		int result = noticeService.setUpdate(boardDTO);
		
		
		
		return "redirect:./detail?num="+boardDTO.getNum();
	}
	
	//글삭제
	@RequestMapping(value = "delete",method =  RequestMethod.GET)
	public String setDelete(BoardDTO boardDTO) throws Exception{
		int result = noticeService.setDelete(boardDTO);
		
		
		return "redirect:./list";
	}
	
	
	
	
}
