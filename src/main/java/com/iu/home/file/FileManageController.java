package com.iu.home.file;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import com.iu.home.board.qna.QnaFileVO;

@Controller
public class FileManageController {

	
	@GetMapping("/fileDown/{path}")
	public ModelAndView fileDown(@PathVariable String path,QnaFileVO qnaFileVO) throws Exception{
		
		ModelAndView mv = new ModelAndView();
		
		qnaFileVO.setFileName("83219722-0c1e-4acc-9198-b1caf4d6dcda_한글아이유.jpg");
		qnaFileVO.setOriName("한글아이유.jpg");
		
		
		mv.addObject("fileVO", qnaFileVO);
		mv.addObject("path", path);
		mv.setViewName("fileManager");
		
		return mv;
	}
	

	
}
