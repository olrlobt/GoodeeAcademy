package com.iu.start.bankBook;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iu.start.members.BankMembersDTO;
import com.iu.start.util.DBConnector;

@Repository
public class BankBookDAO implements BookDAO {

	@Autowired
	private SqlSession sqlSession;
	
	private final String NAMESPACE = "com.iu.start.bankBook.BankBookDAO.";
	
	@Override
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception {
		
		return sqlSession.insert(NAMESPACE+"setBankBook",bankBookDTO);
	}

	@Override
	public List<BankBookDTO> getList() throws Exception {
		
		return sqlSession.selectList(NAMESPACE+"getList");	
		
	}

	@Override
	public int setChangeSale(BankBookDTO bankBookDTO) throws Exception  {
	
		return sqlSession.update(NAMESPACE+ "setChangeSale",bankBookDTO);
	}


	@Override
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception {
		
		return sqlSession.selectOne(NAMESPACE+"getDetail",bankBookDTO);
	}

	@Override
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception {
		
		return sqlSession.update(NAMESPACE+"setUpdate",bankBookDTO);
		
	}
	
	public int setDelete(BankBookDTO bankBookDTO) throws Exception {
		
		return sqlSession.delete(NAMESPACE+"setDelete",bankBookDTO);
		
	}
	

}
