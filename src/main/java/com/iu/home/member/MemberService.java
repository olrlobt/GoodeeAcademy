package com.iu.home.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	private MemberMapper memberMapper;
	
	
	
	public MemberVO getLogin(MemberVO memberVO) throws Exception{
		
		return memberMapper.getLogin(memberVO);
	}
	
	
	public int getJoin(MemberVO memberVO) throws Exception{
		
		return memberMapper.getJoin(memberVO);
	}
}
