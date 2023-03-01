package com.iu.lang.string.ex1;

public class WorkerView {

	//view
	//WorkerDTO들을 받아서 정보를 출력
	
	public void view(WorkerDTO DTO) {
		
		
		System.out.print(DTO.getName() + " ");
		System.out.print(DTO.getJob() + " ");
		System.out.print(DTO.getDepartment() + " ");
		System.out.println(DTO.getPhone() + " ");
		
		
		
		
	}
	
	
	
	
	
}
