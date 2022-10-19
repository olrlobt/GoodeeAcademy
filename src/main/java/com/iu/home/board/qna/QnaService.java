package com.iu.home.board.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.home.util.Pager;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
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
	
	
	public int addList(QnaVO qnaVO)  throws Exception{
		
		for(MultipartFile f: qnaVO.getFiles()) {
			
			if(!f.isEmpty()) {
				log.info("f {}",f.getOriginalFilename());
			}
			
		}
		
		
		
		
		return 1;
	}
	
}
