package com.iu.start.bankBook;

import java.util.ArrayList;
import java.util.List;

public interface BookDAO {

	
	//BANKBOOK table 에 insert
	//book num 현재시간 >밀리세컨즈
	// book sale 은 1로 입력
	public int setBankBook(BankBookDTO bankBookDTO) throws Exception;
	
	// bank book 조회 최신 순 
	public List<BankBookDTO> getList() throws Exception;
	
	public int setChangeSale(BankBookDTO bankBookDTO) throws Exception;
	
	
	//booknum 값으로 조회
	public BankBookDTO getDetail(BankBookDTO bankBookDTO) throws Exception;
	
	public int setUpdate(BankBookDTO bankBookDTO) throws Exception;
	
	
}
