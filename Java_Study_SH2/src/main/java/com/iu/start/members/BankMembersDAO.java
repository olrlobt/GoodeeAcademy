package com.iu.start.members;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BankMembersDAO {

	@Autowired
	private SqlSession sqlSession;
	
	public int setJoin(String st) throws Exception {
		
		
		return 1;
		
	}
	
	
	
	
	public Object getLogin(String st) throws Exception{
		
		
		return null;
	}
	
	
	public List<Object> getSearch(String st) throws Exception{
		
		ArrayList<Object> ar = new ArrayList<Object>();
		
		
		return ar;
	}
	
	
}
