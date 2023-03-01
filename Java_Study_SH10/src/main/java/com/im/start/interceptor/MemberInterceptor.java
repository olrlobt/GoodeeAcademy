package com.im.start.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class MemberInterceptor extends HandlerInterceptorAdapter{

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		Object obj = session.getAttribute("member");
		
		if(obj != null ) {
			System.out.println("login 했음");
			return true ;
		}else {
			System.out.println("login 안 ㄴ했음");
			response.sendRedirect("../../../../../../../member/login");
			return false;	
		}
	}	
}
