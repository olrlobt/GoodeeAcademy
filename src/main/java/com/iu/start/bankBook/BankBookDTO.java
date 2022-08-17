package com.iu.start.bankBook;

import org.springframework.stereotype.Component;

@Component
public class BankBookDTO {

	private long booknum;
	private String bookname;
	private double bookrate;
	private boolean booksale;
	
	
	
	
	public long getBooknum() {
		return booknum;
	}
	public void setBooknum(long booknum) {
		this.booknum = booknum;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public double getBookrate() {
		return bookrate;
	}
	public void setBookrate(double d) {
		this.bookrate = d;
	}
	public boolean isBooksale() {
		return booksale;
	}
	public void setBooksale(boolean booksale) {
		this.booksale = booksale;
	}
	
	
	
}
