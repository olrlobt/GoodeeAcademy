package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentService {

	
	//findStudent
	
	
	
	//makeStudents 메서드 만들기
	
	
	public Student [] makestudents() {
		System.out.print("학생 수를 입력 해 주십시오. ");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();

		Student [] students = new Student[number];

		
		for ( int i = 0 ; i <students.length ; i ++ ) {
			
			Student student = new Student();
			System.out.println("이름 입력");
			student.name = sc.next();
			System.out.print("학생 번호 :");
			student.num = sc.nextInt();
			System.out.print("국어 점수 :");
			student.kor = sc.nextInt();
			System.out.print("영어 점수 :");
			student.eng = sc.nextInt();
			System.out.print("수학 점수 :");
			student.math = sc.nextInt();
			
			student.total = student.kor + student.eng + student.math;
			student.avg = student.total/3.0;
			students[i] = student;
		}
		return students;
	}
	//학생수를 입력받고 학생수만큼 정보를 입력
	//학생들을 리턴
}
