package com.iu.home.board.qna;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.iu.home.util.Pager;

@Controller
@RequestMapping("/qna/*")
public class QnaController {

	
	private Logger log = LoggerFactory.getLogger(this.getClass());
	
	
	@Autowired
	private QnaService qnaService;
	
	@GetMapping("list")
	public ModelAndView getList(Pager pager) throws Exception{
		ModelAndView mv = new ModelAndView();
		
		List<QnaVO> ar = qnaService.getList(pager);
		
		mv.addObject("list",ar);
		mv.setViewName("/board/list");
		
		return mv;
	}
	
	
	
	
	@GetMapping("add")
	public String addList( ) throws Exception{
	
		
		return "/board/add";
	}
	
	
	@PostMapping("add")
	public String addList(QnaVO qnaVO, RedirectAttributes redirectAttributes) throws Exception{
	
		
		int result = qnaService.addList(qnaVO);
		
		log.info("성공");
		redirectAttributes.addAttribute("result",result);
		
		return "redirect:./list";
	}
	
	
	
	@GetMapping("detail")
	public ModelAndView getDetail(QnaVO qnaVO) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		qnaVO = qnaService.getDetail(qnaVO);
		
		
		
		mv.addObject("qna",qnaVO);
		mv.setViewName("/board/detail");
		return mv;
	}
	
}
