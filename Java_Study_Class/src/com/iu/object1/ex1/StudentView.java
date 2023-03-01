package com.iu.object1.ex1;

import java.util.Scanner;

public class StudentView {
	
	//viewmessage
	//문자열을 받아서 그 문자열을 출력
	Scanner sc = new Scanner(System.in);
	Student student = new Student();
	//viewOne
	//학생정보 하나 받아서 출력
	
	public void viewMessage() {
		System.out.println("그런 애는 여기에 없단다");
	}
	public void viewOne(Student student) {
		
			System.out.println(student.name +"\t"
					+student.num+"\t"
					+student.kor+"\t"
					+student.eng+"\t"
					+student.math+"\t"
					+student.total+"\t"
					+student.avg);
		
	}
	
	//viewAll
	//학생들의 정보를 받아서 모든 정보를 출력
	
	
	public void viewAll(Student[] students) {
		System.out.println("학생이름\t 학생번호\t 국어점수\t 영어점수\t 수학점수\t 총점\t 평균");
		for (int i = 0 ; i <students.length ; i ++) {
			
			System.out.println(students[i].name +"\t"
								+students[i].num+"\t"
								+students[i].kor+"\t"
								+students[i].eng+"\t"
								+students[i].math+"\t"
								+students[i].total+"\t"
								+students[i].avg);
			
			
			
		}
	}
}
