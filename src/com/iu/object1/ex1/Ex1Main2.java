package com.iu.object1.ex1;

import java.util.Scanner;

public class Ex1Main2 {

	public static void main(String[] args) {
		System.out.println("프로그램 시작");
		Scanner sc = new Scanner(System.in);
		Student [] students= new Student[3];
		Student st = new Student();
		
		for(int i=0 ; i < students.length;i++) {
			
			System.out.println("이름 입력 : ");
			st.name = sc.next();
			students[i] = st;
			
			
		}
		
		for(int i = 0 ; i < students.length;i++) {
			System.out.println(students[i].name);
		}
		
		

		System.out.println("프로그램 끝");
	}

}
