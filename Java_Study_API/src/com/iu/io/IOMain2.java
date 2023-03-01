package com.iu.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class IOMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InputStream is = System.in; //01 처리
		InputStreamReader ir = new InputStreamReader(is);// 01을 모아 글자를 만드는 애
		BufferedReader br = new BufferedReader(ir);  // 글자를 모아 문자열을 만드는 애
		
		
		System.out.println(" 입력 ");
		
		try {
			String msg = br.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 연결 된 역순으로 자원 해제
			
			
			try {
				br.close();
				ir.close();
				is.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			
		}
		
		
		
		
		
	}

}
