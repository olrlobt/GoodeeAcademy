package com.iu.object1.ex1;

public class StudentView {
	
	//viewmessage
	//문자열을 받아서 그 문자열을 출력
	
	//viewOne
	//학생정보 하나 받아서 출력
	
	
	//viewAll
	//학생들의 정보를 받아서 모든 정보를 출력
	Student student = new Student();
	
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
