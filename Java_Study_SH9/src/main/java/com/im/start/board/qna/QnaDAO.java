package com.im.start.board.qna;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.im.start.board.impl.BoardDAO;
import com.im.start.board.impl.BoardDTO;
import com.im.start.util.Pager;


@Repository
public class QnaDAO implements BoardDAO{


	@Autowired
	private SqlSession sqlSession;
	
	
	private String NAMESPACE = "com.im.start.board.qna.QnaDAO.";
	
	
	public int setStepUpdate(QnaDTO qnaDTO) throws Exception{
		
		
		return sqlSession.update(NAMESPACE+"setStepUpdate",qnaDTO);
	}
	
	public int setReplyAdd(QnaDTO qnaDTO) throws Exception{
		

		return sqlSession.update(NAMESPACE+"setReplyAdd",qnaDTO);
	}
	
	
	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"getDetail",boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.insert(NAMESPACE+"setAdd",boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.update(NAMESPACE+"setUpdate",boardDTO);
				
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.delete(NAMESPACE+"setDelete",boardDTO);
				
	}

	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectList(NAMESPACE+"getList",pager);
	}

	@Override
	public Long getNum(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		return sqlSession.selectOne(NAMESPACE+"getNum",pager);
	}
	
	
	
	
	
	
}
