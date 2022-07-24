package com.iu.io.file;

import java.io.File;

public class FileMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("C:\\study");
		
		String [] names = file.list();
		for(String s : names) {
			System.out.println(s);
		}
		File [] files = file.listFiles();
		
		
		
		
		
		
	}

}
