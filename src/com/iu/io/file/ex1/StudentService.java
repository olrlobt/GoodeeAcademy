package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService implements Service{

	
	
	ArrayList<StudentDTO> ar = new ArrayList<>();
	Scanner sc = new Scanner(System.in);
	
	
	
	
	@Override
	public ArrayList<StudentDTO> getList() throws Exception {
		StudentDAO dao = new StudentDAO();
		
		
		dao.getList(ar);
		
		return this.ar;
	}


	@Override
	public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}



	@Override
	public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception {
		
		String inp = new String();
		int inp1 ;
		StudentDTO dto = new StudentDTO();
		System.out.print("학생 이름 : ");
		inp = sc.next();
		dto.setName(inp);
		System.out.print("학생 번호 : ");
		inp1 = sc.nextInt();
		dto.setNum(inp1);
		System.out.print("국어 점수 : ");
		inp1 = sc.nextInt();
		dto.setNum(inp1);
		System.out.print("영어 점수 : ");
		inp1 = sc.nextInt();
		dto.setNum(inp1);
		System.out.print("수학 점수 : ");
		inp1 = sc.nextInt();
		dto.setNum(inp1);
		
		ar.add(dto);
		
		
	}


	@Override
	public int setList(ArrayList<StudentDTO> ar) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
	
}
