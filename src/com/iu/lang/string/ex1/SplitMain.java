package com.iu.lang.string.ex1;

public class SplitMain {

	public static void main(String[] args) {


		WorkerService WS = new WorkerService();
		WorkerView WV = new WorkerView();
		WorkerDTO WD = new WorkerDTO();
		
		
		
		for(String DTO : WS.init()) {
			
			WorkerDTO WD1 = new WorkerDTO();
			String DTO1 [] = DTO.split("-");
			
			
			WD1.setName(DTO1[0]);
			WD1.setJob(DTO1[1]);
			WD1.setDepartment(DTO1[2]);
			WD1.setPhone(DTO1[3]);
			
			WV.view(WD1);

		}
			
		
		
		
		int num = 10;
		String.valueOf(num);
		System.out.println("String.valueOf(num)" + num);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
