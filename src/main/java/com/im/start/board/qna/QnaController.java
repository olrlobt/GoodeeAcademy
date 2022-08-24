package com.im.start.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.im.start.board.impl.BoardDTO;


@Controller
@RequestMapping("/qna/*")
public class QnaController {

	
	@Autowired
	private QnaService qnaService;
	
	
	@RequestMapping(value = "list", method = RequestMethod.GET)
	public ModelAndView getList() throws Exception{
		
		ModelAndView mv = new ModelAndView();
		List<BoardDTO> ar = qnaService.getList();
		
		
		mv.addObject("list",ar);
		mv.setViewName("qna/list");
		return mv;
	}
	//글조회
	@RequestMapping(value = "detail", method = RequestMethod.GET)
	public String getDetail(BoardDTO boardDTO,Model model) throws Exception{
		boardDTO = qnaService.getDetail(boardDTO);
		model.addAttribute("dto",boardDTO);
		
		
		
		return "qna/detail";
		
	}
	//글쓰기
	@RequestMapping(value = "add", method = RequestMethod.GET)
	public void setAdd() throws Exception{
		
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
}
