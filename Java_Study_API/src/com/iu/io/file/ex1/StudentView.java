package com.iu.io.file.ex1;

import java.util.ArrayList;

public class StudentView {
	
	
	
	public void View(ArrayList<StudentDTO> ar) {
		System.out.println();
		System.out.println("\t이름 \t번호 \t국어 \t영어 \t수학 \t총점 \t평균");
		for ( StudentDTO dto : ar) {
			
			System.out.print("\t"+ dto.getName());
			System.out.print("\t"+ dto.getNum());
			System.out.print("\t"+ dto.getKor());
			System.out.print("\t"+ dto.getEng());
			System.out.println("\t"+ dto.getMath());
		}
	}
	public void View(String msg) {
		
		
	}
	public void View(StudentDTO st) {
		
		
	}
	
}
