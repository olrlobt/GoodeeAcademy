package com.iu.object1.ex1;

public class StudentMain {
	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		//StudentController의 start 메서드 호출
		StudentController studentController = new StudentController();
		studentController.start();
		System.out.println("프로그램 종료");
	}
}
