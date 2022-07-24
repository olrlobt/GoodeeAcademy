package com.iu.io.file.ex1;

import java.util.ArrayList;

public interface Service {

	//
	
	// studentDAO의  getList를 호출해서 총점과 평균을 각각 
	// 계산해서 대입. 그 List 를 리턴
	
	// studentDAO의 setList 를 호출하고.
	// 결과 리턴
	
	// 찾으려고 하는 학생의 번호를 입력받아
	// 찾은 학생 리턴
	
	// 삭제 하려고 하는 학생의 번호를 입력받아
	// 학생 삭제
	// 삭제가 성공하면 1 리턴. 못찾으면 0리턴;
	
	// 학생 한 명 추가
	// 
	
	public ArrayList<StudentDTO> getList() throws Exception;
	public int setList(ArrayList<StudentDTO> ar)throws Exception;
	public StudentDTO getStudent(ArrayList<StudentDTO> ar) throws Exception;
	public int setStudentDelete(ArrayList<StudentDTO> ar) throws Exception;
	public void setStudentAdd(ArrayList<StudentDTO> ar) throws Exception;



	
	
	
	
}
