package com.im.start.bankbook;

import java.util.List;

import org.springframework.stereotype.Component;

import com.im.start.bankaccount.BankAccountDTO;

@Component
public class BankBookDTO {

	private long BookNum;
	private String BookName;
	private double BookRate;
	private boolean BookSale;
	private List<BankAccountDTO> bankAccountDTOs;
	
	
	public long getBookNum() {
		return BookNum;
	}
	public void setBookNum(long bookNum) {
		BookNum = bookNum;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public double getBookRate() {
		return BookRate;
	}
	public void setBookRate(double bookRate) {
		BookRate = bookRate;
	}
	public boolean isBookSale() {
		return BookSale;
	}
	public void setBookSale(boolean bookSale) {
		BookSale = bookSale;
	}
	
	
	

	
	
}
