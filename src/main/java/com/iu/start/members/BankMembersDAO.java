package com.iu.start.members;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.start.util.DBConnector;

@Repository
public class BankMembersDAO implements MembersDAO{

	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.iu.start.members.BankMembersDAO.";
	
	
	@Override
	public int setJoin(BankMembersDTO bankMembersDTO) throws Exception {
		
		
		return sqlSession.insert(NAMESPACE+"setJoin",bankMembersDTO);
	}

	@Override
	public List<BankMembersDTO> getSearchByID(String search) throws Exception {
		
		return sqlSession.selectList(NAMESPACE+"getSearchByID", search);
		
	}
	
	
	public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception{
		 
		
//		String sql = "SELECT ID,NAME,EMAIL FROM BANKMEMBERS WHERE ID = ? AND PW = ?";
		
		
		
		
		return sqlSession.selectOne(NAMESPACE+"getLogin",bankMembersDTO);
		
		
	}
	
	
	
}
