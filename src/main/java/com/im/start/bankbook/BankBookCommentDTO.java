package com.im.start.bankbook;

import com.im.start.board.impl.CommentDTO;

public class BankBookCommentDTO extends CommentDTO {

	private Long BookNum;

	public Long getBookNum() {
		return BookNum;
	}

	public void setBookNum(Long bookNum) {
		BookNum = bookNum;
	}
	
	
}
