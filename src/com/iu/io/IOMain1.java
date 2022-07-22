package com.iu.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOMain1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		InputStream is = System.in; //byte
		InputStreamReader ir = new InputStreamReader(is); // 한글자
		BufferedReader br = new BufferedReader(ir);
		
		try {
			System.out.println(" 키보드 입력 후 엔터 ");
			String msg = br.readLine();
			System.out.println(msg);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

}
