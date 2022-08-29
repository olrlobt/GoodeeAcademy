package com.im.start.board.notice;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.im.start.board.impl.BoardDTO;
import com.im.start.board.impl.BoardFileDTO;
import com.im.start.board.impl.BoardService;
import com.im.start.util.FileManager;
import com.im.start.util.Pager;

@Service
public class NoticeService implements BoardService{

	@Autowired
	private NoticeDAO noticeDAO;
	
//	@Autowired
//	private ServletContext servletContext;
	
	@Autowired
	private FileManager fileManager;
	
		
	
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		
		
	    Long totalCount = noticeDAO.getNum(pager);
//	    System.out.println("totalCount = " + totalCount);
	    pager.getNum(totalCount);
		pager.getRowNum();
		return noticeDAO.getList(pager);
	}

	@Override
	public BoardDTO getDetail(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.getDetail(boardDTO);
	}

	@Override
	public int setAdd(BoardDTO boardDTO,MultipartFile [] files,ServletContext servletContext) throws Exception {
		// TODO Auto-generated method stub
		int result = noticeDAO.setAdd(boardDTO);
		
		String path = "resources/upload/notice";
		
		for(MultipartFile file : files) {
			if(file.isEmpty()) {
				continue;
			}
			String fileName = fileManager.saveFile(file, path, servletContext);
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			boardFileDTO.setFileName(fileName);
			boardFileDTO.setOriName(file.getOriginalFilename());
			boardFileDTO.setNum(boardDTO.getNum());
			
			noticeDAO.setAddFiles(boardFileDTO);
			
			
		}
		
		return result;
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setUpdate(boardDTO);
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return noticeDAO.setDelete(boardDTO);
	}

}
