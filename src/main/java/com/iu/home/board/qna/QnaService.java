package com.iu.home.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iu.home.util.Pager;

@Service
public class QnaService {

	@Autowired
	private QnaMapper qnaMapper;
	
	
	public Long getCount() throws Exception{
		
		
		return qnaMapper.getCount();
	}
	
	public List<QnaVO> getList(Pager pager) throws Exception{
		
		
		pager.getRowNum();
		pager.getNum(getCount());
		
		
		
		return qnaMapper.getList(pager);
	}
	
}
