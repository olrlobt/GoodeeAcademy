package com.iu.lang.string.ex1;

public class WorkerDTO { //DTO 는 DATA TRANSFER OBJECT의 약자로, 데이터 교환 객체이다.
//DTO는 로직 갖지 않는 순수한 데이터 객체 (getter 와 setter) 만 갖는다
// 이외에도 VO 등 이 있다.
	
	private String name;
	private String department;
	private String job;
	private String phone;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	
	
	
	
}
