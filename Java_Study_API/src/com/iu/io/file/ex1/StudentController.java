package com.iu.io.file.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {
	
	StudentView SV = new StudentView();
	
	StudentDAO dao = new StudentDAO();
	StudentService Service = new StudentService();
	
	
	public void start() throws Exception {
		ArrayList<StudentDTO> ar = new ArrayList<>();
		
		
		// 메뉴 
		// 1.학생정보출력 - 모든학생 정보 출력 ( 파일 읽기)
		// 2.학생정보검색 - 한명 검색해서 출력
		// 3.학생정보추가 - add
		// 4.학생정보삭제 - delete
		// 5.백     업 - 현재 리스트 파일을 덮어 씌우기 - set리스트 호출해서
		// 6.종료
		
		Scanner sc = new Scanner(System.in);
		int i = 0 ;
		
		boolean start = true;
		while(start) {
		
		
			System.out.println("==============");
			System.out.println("1.학생정보출력");
			System.out.println("2.학생정보검색");
			System.out.println("3.학생정보추가");
			System.out.println("4.학생정보삭제");
			System.out.println("5.백     업");
			System.out.println("6.종     료");
			System.out.println("==============");
		
			i = sc.nextInt();
			
			dao.getList(ar);
			switch(i) {
			
			case 1:
				SV.View(Service.getList());	
				break;
			case 2:
				Service.getStudent(ar);
				break;
			case 3:
				Service.setStudentAdd(ar);
				break;
			case 4:
				Service.setStudentDelete(ar);
				break;
			case 5:
				Service.setList(ar);
				break;
			case 6:
				System.out.println("프로그램 종료");
				start = false;
				break;
			
			
			}
			
			
		
		}
		
	}
	
	
	
	
}
