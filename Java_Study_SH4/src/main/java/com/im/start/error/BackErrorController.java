package com.im.start.error;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class BackErrorController {

	
	
	@ExceptionHandler(NullPointerException.class)
	public ModelAndView exceptionTest() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("errors/error_404");
	
		return mv;
	}
	@ExceptionHandler(Exception.class)
	public ModelAndView exceptionTest2() {
		ModelAndView mv = new ModelAndView();
		
		mv.setViewName("errors/error_404");
	
		return mv;
	}
}
