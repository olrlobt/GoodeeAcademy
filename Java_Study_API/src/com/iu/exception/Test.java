package com.iu.exception;

public class Test {

	
	
	public void t4() throws Exception{
		
		int num = 48;
		int num2 = 82;
		int num3 = num + num2 ;
		int num4 = num - num2 ;
		
		if (num3>99)
			throw new MyException();
		
		if (num4<0)
			throw new MyException("그런 숫자 몰라요");

		
		
		
		
		
	
	}
	
	
	
}
