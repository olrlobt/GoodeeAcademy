package com.im.start.board.qna;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.im.start.MyAbstractTest;
import com.im.start.board.impl.BoardDTO;
import com.im.start.board.notice.NoticeDAO;
import com.im.start.board.notice.NoticeDTO;

public class QnaDAOTest extends MyAbstractTest{

	@Autowired
	private QnaDAO dao;
	

//	@Test
//	public void getListTest() throws Exception{
//		
//		List<BoardDTO> ar = new ArrayList<BoardDTO>();
//		dao.getList();
//		ar = dao.getList();
//		
//		assertNotEquals(0,ar.size());
//		
//	}
//	
	@Test
	public void getDetail() throws Exception{
		NoticeDTO noticeDTO = new NoticeDTO();
		
		noticeDTO.setNum(1L);
		noticeDTO=(NoticeDTO) dao.getDetail(noticeDTO);
		
		assertNotNull(noticeDTO);
		
	}
	
	@Test
	public void setUpdate() throws Exception{
		
		NoticeDTO noticeDTO = new NoticeDTO();
		noticeDTO.setNum(21L);
		noticeDTO.setContents("hihi");
		noticeDTO.setTitle("hihi");
		noticeDTO.setWriter("hihi");
		
		int result = dao.setUpdate(noticeDTO);
		
		assertEquals(1, result);
		
		
	}
	
	@Test
	public void setDelete() throws Exception{
		
		
		NoticeDTO noticeDTO = new NoticeDTO();
		
		noticeDTO.setNum(22L);
		int result = dao.setDelete(noticeDTO);
		
		assertEquals(1, result);
		
	}
	
//	@Test
	public void setAdd() throws Exception{
		
		for(int i = 0 ; i < 100; i ++ ) {
			QnaDTO qnaDTO = new QnaDTO();
			qnaDTO.setTitle("Title" + i);
			qnaDTO.setContents("contents" + i);
			qnaDTO.setWriter("writer" + i);
			
			int result = dao.setAdd(qnaDTO);
			if(i%10 ==0) { 
				Thread.sleep(500);
			}
		}
		
		
		
		
		System.out.println("finish");
	}
	
	
	
}
