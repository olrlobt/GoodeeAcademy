package com.iu.io.file.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StudentDAO { // DATA Access  Object

	//file data 에 접근하는 역할
	//1. getList
	//   파일의 내용을 읽어서 작업
	
	
	
	public int setList(ArrayList<StudentDTO> ar ) {
		
		//2.set list
		// 예외처리는 내부에서 처리
		// list로 받은 데이터들을 student data 에다가 작성
		// 기존 내용은 삭제
		// 작성 형식은 기존 형식과 동일하게
		// 1리턴 : 정상   0리턴 : 예외
		
		return 0;	
	}
	
	
	public void getList(ArrayList<StudentDTO> dtolist) throws FileNotFoundException, IOException {
		
	
		dtolist = new ArrayList<>();
		File file = new File("C:\\study","studentData.txt");
		String name = "";
		
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		boolean check = true;
		
		
		while( check) {
			name = br.readLine();
			if(name == null)
				break;
			
			try {
			//	String [] split = name.split(",");
				StringTokenizer st = new StringTokenizer(name,",");
				
				StudentDTO dto = new StudentDTO();
//				dto.setName(split[0]);
//				dto.setNum(Integer.parseInt(split[1]));
//				dto.setKor(Integer.parseInt(split[2]));
//				dto.setEng(Integer.parseInt(split[3]));
//				dto.setMath(Integer.parseInt(split[4]));
				dto.setName(st.nextToken());
				dto.setNum(Integer.parseInt(st.nextToken()));
				dto.setKor(Integer.parseInt(st.nextToken()));
				dto.setEng(Integer.parseInt(st.nextToken()));
				dto.setMath(Integer.parseInt(st.nextToken()));
				
				dtolist.add(dto);	
				
				
			}catch (Exception e) {
				// TODO: handle exception
			}
			
		}
		
	}
	



}
