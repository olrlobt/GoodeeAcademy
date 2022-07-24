package com.iu.io.file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		
//		 File : 파일이나 폴더의 정보를 담는 클래스
//		 : 실제 파일이나 폴더가 없을수도 있음
		 
		
		File file = new File("C:\\study\\test.txt"); 
		// parent :  폴더 . child : 파일, 폴더명 (최종)
		
		File path = new File("C:\\study");
		file = new File(path,"test.txt");
		
		
		
		
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.isDirectory());
		System.out.println(file.length());

		
		
		
		file = new File("C:\\study\\sub");
		if(!file.exists()) {
			file.mkdir();
		}
		
		file = new File("C:\\study\\sub2\\tq");
		if(!file.exists()) {
			file.mkdirs();
		}
		
		
		
	}

}
