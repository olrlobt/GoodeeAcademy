package com.im.start.util;

import java.io.File;
import java.util.UUID;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;


@Component
public class FileManager {

//	@Autowired
//	private ServletContext servletContext;
	
	public String saveFile(MultipartFile multipartFile,String path, ServletContext servletContext) throws Exception{
		String realPath = servletContext.getRealPath(path);
		System.out.println("realePath:" + realPath);
		
		File file = new File(realPath);
		if(!file.exists()) {
			file.mkdirs();
		}
		
		String fileName = UUID.randomUUID().toString();
		fileName = fileName + "_" + multipartFile.getOriginalFilename();
		file = new File(file,fileName);
		multipartFile.transferTo(file);
		
		
		
		
		return fileName;
		
		
	}
	
	
	
}
