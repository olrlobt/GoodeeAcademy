package com.im.start.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.im.start.board.impl.CommentDTO;

@Repository
public class BankBookCommentDAO {

	@Autowired
	private SqlSession sqlSession;
	String NAMESPACE = "com.im.start.bankbook.BankBookCommentDAO.";
	
	
	public List<BankBookCommentDTO> getList(CommentDTO CommentDTO) throws Exception{
		
		
		return sqlSession.selectList(NAMESPACE + "getList",CommentDTO);
	}
	
	public int setAdd(CommentDTO CommentDTO) throws Exception{
		
		return sqlSession.selectOne(NAMESPACE + "setAdd",CommentDTO);
	}
	
	public int setDelete(CommentDTO CommentDTO) throws Exception{
		
		return sqlSession.selectOne(NAMESPACE + "setDelete",CommentDTO);
	}
	
	public int setUpdate(CommentDTO CommentDTO) throws Exception{
		
		return sqlSession.selectOne(NAMESPACE + "setUpdate",CommentDTO);
	}
	
	
	
}
