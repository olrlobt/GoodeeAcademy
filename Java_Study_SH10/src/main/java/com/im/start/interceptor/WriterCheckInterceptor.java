package com.im.start.interceptor;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.im.start.BankMembers.BankMembersDTO;
import com.im.start.board.impl.BoardDTO;


public class WriterCheckInterceptor extends HandlerInterceptorAdapter{

	
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		
		String method = request.getMethod();
		
		if(method.equals("POST")) {
			return;
		}
		
		
		HttpSession session = request.getSession();
		BankMembersDTO bankMembersDTO =(BankMembersDTO) session.getAttribute("member");
		
		Map<String,Object> map = modelAndView.getModel();
		
		BoardDTO boardDTO = (BoardDTO) map.get("boardDTO");
		
		if(!bankMembersDTO.getID().equals(boardDTO.getWriter())) {
			modelAndView.setViewName("common/result");
			modelAndView.addObject("message","작성자만 수정이 가능");
			modelAndView.addObject("url","./list");
			
			
		}
		
		
		
	}
	
}



