package com.iu.home.board.qna;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.event.annotation.BeforeTestClass;


@SpringBootTest
class QnaMapperTest {

	private final Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private QnaMapper qnaMapper;
	
	private QnaVO qnaVo;
	
	@BeforeAll
	static void befoClass() throws Exception{
		
		System.out.println("테스트 전");
	}
	
	@AfterAll
	static void afterClass() throws Exception{
		
		System.out.println("테스트 후");
	}
	
	@BeforeEach
   void beforeEach() {
	      System.out.println("Test 메서드 실행 전");
	      qnaVo = new QnaVO();
	      qnaVo.setNum(1L);
   }
	   
	   @AfterEach
   void afterEach() {
      System.out.println("Test 메서드 실행 후");
   }
	
	
	
	
	
//	
//	//@Test
//	void test() throws Exception {
////		List<QnaVO> ar = qnaMapper.getList(); 
//		log.info("List {}",ar);
//		assertNotEquals(0, ar.size());
//		
//		
//		
//	}
//	
	
	//@Test
	void addTest() throws Exception {
		QnaVO qnaVO = new QnaVO();
		qnaVO.setTitle("tt"); 
		qnaVO.setWriter("ww");
		qnaVO.setContents("cc");
		
		
		int result = qnaMapper.addList(qnaVO); 
		log.info("List {}",result);
		assertEquals(1, result);
		
		
		
	}
	@Test
	void add100Test() throws Exception {
		
		for(int i= 0 ; i <50 ; i ++) {
			
			QnaVO qnaVO = new QnaVO();
			qnaVO.setTitle("tt" +i); 
			qnaVO.setWriter("ww"+i);
			qnaVO.setContents("cc"+i);
			int result = qnaMapper.addList(qnaVO); 
		}
		
		
		
		
		
		
		
		
		
	}
	

}
