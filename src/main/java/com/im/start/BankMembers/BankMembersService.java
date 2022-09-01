package com.im.start.BankMembers;

import java.io.File;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.im.start.BankMembers.BankMembersDTO;
import com.im.start.bankaccount.BankAccountDAO;
import com.im.start.bankaccount.BankAccountDTO;
import com.im.start.util.FileManager;

@Service
public class BankMembersService {
	
	@Autowired
	private BankMembersDAO bankMembersDAO;
	
	@Autowired
	private FileManager fileManager;
	
	
	
//	@Autowired
//	private ServletContext servletContext;
	
//	@Autowired
//	private BankAccountDAO bankAccountDAO;
//	
//	public Map<String, Object> getMyPage(BankMembersDTO bankMembersDTO) throws Exception{
//		Map<String, Object> map = new HashMap<String, Object>();
//		
//		
//		List<BankAccountDTO> ar =bankAccountDAO.getList(bankMembersDTO);
//		bankMembersDTO = bankMembersDAO.getMyPage(bankMembersDTO);
//		map.put("list", ar);
//		map.put("dto", bankMembersDTO);
//		
//		
//		
//		return map;
//	}
	
	
	public  BankMembersDTO getMyPage(BankMembersDTO bankMembersDTO) throws Exception{
		return bankMembersDAO.getMyPage(bankMembersDTO);
		
	}
	
	
	public BankMembersDTO getLogin(BankMembersDTO bankMembersDTO) throws Exception{
		return bankMembersDAO.getLogin(bankMembersDTO);
	}
	
	public int setJoin(BankMembersDTO bankMembersDTO,MultipartFile photo,ServletContext servletContext) throws Exception {
		
		// 1. HDD 파일 저장
		//  1)OS 기준으로 설정 /resources/upload/member
		//  2)OS 기준 저장할 폴더의 실제 경로를 반환
		
//		int result = bankMembersDAO.setJoin(bankMembersDTO);
//		String realpath = servletContext.getRealPath("resources/upload/member");
//		
//		// 3. 저장할 폴더의 정보를 가지는 자바 객체 생성
//		File file = new File(realpath);
//		
//		// file 이 없을때
//		if(photo.getSize() != 0) {
//		
//			if(!file.exists()) {
//				file.mkdirs();
//			}
//			
//			// 4. 중복되지 않는 파일명을 생성
//			//    -- 시간 , java api, ... 
//			
//			String fileName = UUID.randomUUID().toString();
//			
//	//		Calendar ca =Calendar.getInstance();
//	//		Long time = ca.getTimeInMillis();
//			
//			fileName = fileName + "_" + photo.getOriginalFilename();
//			
//			// 5. HDD에 파일 저장
//			// 어느 폴더에 어떤 이름으로 저장할 file 객체 생성
//			file = new File(file,fileName);
//			// 1)MultipartFile 클래스의 transferTo 메서드 사용
//	        photo.transferTo(file);
//	        // 2)FileCopyUtils 클래스의 copy 메서드 사용
//		
//	
//		// 2. 저장된 파일 정보를 DB에 저장
//	        BankMembersFileDTO bankMembersFileDTO = new BankMembersFileDTO();
//	        
//	        
//	        bankMembersFileDTO.setOriName(photo.getOriginalFilename());
//	        bankMembersFileDTO.setFileName(fileName);
//	        bankMembersFileDTO.setUserID(bankMembersDTO.getID());
//	        bankMembersDAO.setAddFile(bankMembersFileDTO);
//		
//		}
		int result = bankMembersDAO.setJoin(bankMembersDTO);
		
		String path = "resources/upload/member";
		
		if(!photo.isEmpty()) {
			String fileName = fileManager.saveFile(photo, path, servletContext);
			
			BankMembersFileDTO bankMembersFileDTO = new BankMembersFileDTO();
			bankMembersFileDTO.setFileName(fileName);
			bankMembersFileDTO.setOriName(photo.getOriginalFilename());
			bankMembersFileDTO.setUserID(bankMembersDTO.getID());
			
			bankMembersDAO.setAddFile(bankMembersFileDTO);
			
		}
		
		
		
		
		
		return result;
	}
	
	public List<BankMembersDTO> getSearchByID(String search) throws Exception {
		return bankMembersDAO.getSearchByID(search);
	}

}
