package com.iu.lang.string.ex1;

public class WorkerService {

	private String info;
	
	public WorkerService() {
		info = " iu-인사과-과장-0101111";
		info = info+", suji-IT-대리-0102222";
		info = info+", choa-영업-부장-0103333";
		info = info+", hani-마케팅-사원-0104444";
		
	}
	
	public String[] init() {
		// info 를 파싱해서 , WorkerDTO에 대입.
		// WorkerDTO를 모은 배열을 리턴
		
		String WorkerDTO[] = info.split(",");
		
		
		
		return WorkerDTO;
	}
	
	
	
	
	
	
	
}
