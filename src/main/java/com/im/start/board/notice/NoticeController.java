package com.im.start.board.notice;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.im.start.board.impl.BoardDTO;
import com.im.start.util.Pager;

@Controller
@RequestMapping("/notice/*")
public class NoticeController {

	@Autowired
	private NoticeService noticeService;
	
	
	@ModelAttribute("board")
	public String getBoard() {
		
		
		return "Notice";
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
		return mv;
	}
	//글조회
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String getDetail(BoardDTO boardDTO,Model model) throws Exception{
		boardDTO = noticeService.getDetail(boardDTO);
		model.addAttribute("dto",boardDTO);
		
		
		
		return "board/detail";
		
	}
	//글쓰기
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public void setAdd() throws Exception{
		
	}
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView setAdd(BoardDTO boardDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		int result =noticeService.setAdd(boardDTO);
		mv.setViewName("redirect:./list");
		//구 찌
		
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
