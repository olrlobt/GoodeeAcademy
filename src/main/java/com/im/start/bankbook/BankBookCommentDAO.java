package com.im.start.bankbook;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.im.start.board.impl.CommentDTO;
import com.im.start.util.CommentPager;

@Repository
public class BankBookCommentDAO {

	@Autowired
	private SqlSession sqlSession;
	String NAMESPACE = "com.im.start.bankbook.BankBookCommentDAO.";
	
	
	

	
	
	public Long getCommentListTotalCount(CommentPager commentPager) throws Exception{
		
		return sqlSession.selectOne(NAMESPACE + "getCommentListTotalCount",commentPager);
	}
	
	
	
	
	public List<BankBookCommentDTO> getList(CommentPager commentPager) throws Exception{
		
		
		return sqlSession.selectList(NAMESPACE + "getList",commentPager);
	}
	
	public int setAdd(BankBookCommentDTO bankBookCommentDTO) throws Exception{
		
		return sqlSession.insert(NAMESPACE + "setAdd",bankBookCommentDTO);
	}
	
	public int setDelete(BankBookCommentDTO bankBookCommentDTO) throws Exception{
		
		return sqlSession.delete(NAMESPACE + "setDelete",bankBookCommentDTO);
	}
	
	public int setUpdate(BankBookCommentDTO bankBookCommentDTO) throws Exception{
		
		return sqlSession.update(NAMESPACE + "setUpdate",bankBookCommentDTO);
	}
	
	
	
}
