package com.im.start.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.im.start.board.impl.BoardDTO;
import com.im.start.util.Pager;


@Controller
@RequestMapping("/qna/*")
public class QnaController {

	
	@Autowired
	private QnaService qnaService;
	
	

	@ModelAttribute("board")
	public String getBoard() {
		
		
		return "QnA";
	}
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView getList(Pager pager) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		List<BoardDTO> ar = qnaService.getList(pager);
		
		
		mv.addObject("list",ar);
		mv.addObject("pager",pager);
		mv.setViewName("board/list");
		return mv;
	}
	//글조회
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String getDetail(BoardDTO boardDTO,Model model) throws Exception{
		boardDTO = qnaService.getDetail(boardDTO);
		model.addAttribute("dto",boardDTO);
		
		
		
		return "board/detail";
		
	}
	//글쓰기
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public String setAdd() throws Exception{
		
		
		return "board/add";
	}
	@RequestMapping(value = "add", method = RequestMethod.POST)
	public ModelAndView setAdd(BoardDTO boardDTO) throws Exception{
		ModelAndView mv = new ModelAndView();
		int result =qnaService.setAdd(boardDTO);
		mv.setViewName("redirect:./list");
		//구 찌
		
		return mv;
	}
	
	//글수정
	@RequestMapping(value = "update", method = RequestMethod.GET)
	public ModelAndView setUpdate(BoardDTO boardDTO,ModelAndView mv) throws Exception{
		
		boardDTO = qnaService.getDetail(boardDTO);
		mv.addObject(boardDTO);
		mv.setViewName("qna/update");
		
		return mv;
		
		
	}
	
	@RequestMapping(value = "update", method = RequestMethod.POST)
	public String setUpdate(BoardDTO boardDTO) throws Exception{
		
		int result = qnaService.setUpdate(boardDTO);
		
		
		
		return "redirect:./detail?num="+boardDTO.getNum();
	}
	
	//글삭제
	@RequestMapping(value = "delete",method =  RequestMethod.GET)
	public String setDelete(BoardDTO boardDTO) throws Exception{
		int result = qnaService.setDelete(boardDTO);
		
		
		return "redirect:./list";
	}
	
	@GetMapping("reply")
	public ModelAndView setReply() throws Exception{
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("board/reply");
		
		return mv;	
	}
	
	
	
	
	
	
	
	
}
