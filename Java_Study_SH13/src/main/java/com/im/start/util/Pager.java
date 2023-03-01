package com.im.start.util;

public class Pager {

	//jsp 용
	// mapper 용
	// parameter 용
	
	private Long page;
	private Long startNum;
	private Long lastNum;
	
	private Long startRow;
	private Long lastRow;
	
	private Long perPage;
	private Long perBlock;
	
	private String kind;
	private String search;
	
	
	public Pager() {
		this.perPage = 10L;
		this.perBlock = 5L;
	}
	
	/////////////////
	
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	public String getSearch() {
		if(this.search == null)
			this.search = "";
			
		return search;
	}
	public void setSearch(String search) {
		this.search = search;
	}
	
	
	
	////////////////
	
	
	public void getRowNum() throws Exception{
		this.startRow = (getPage()-1)*getPerPage()+1;
		this.lastRow = getPage()*getPerPage();
	}
	
	public void getNum(Long totalCount) throws Exception{
		 
		Long totalPage = totalCount/getPerPage();
		if(totalCount%getPerPage() != 0)totalPage++;
		
		if(getPage() > totalPage) {
			setPage(totalPage);
			
		}
		
		Long  totalBlock = totalPage/getPerBlock();
		if(totalPage%getPerBlock() != 0)totalBlock++;
		
		Long curBlock = getPage()/getPerBlock();
		if(getPage()%getPerBlock() != 0)curBlock++;
		
		this.startNum = (curBlock-1)*getPerBlock()+1;
		this.lastNum = curBlock*getPerBlock() ;
		
		
		if(curBlock == totalBlock) {
			this.lastNum = totalPage;
		}
		
	}
	
	
	
	
	
	
	
	
	public Long getPerPage() {
		if(this.perPage==null) this.perPage=10L;
		return perPage;
	}


	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}


	public Long getPerBlock() {
		
		return perBlock;
	}


	public void setPerBlock(Long perBlock) {
		this.perBlock = perBlock;
	}


	
	public Long getPage() {
		if(this.page == null || this.page <= 0) {
				this.page=1L;
		}
		return page;
	}
	
	
	public void setPage(Long page) {
		this.page = page;
	}
	public Long getStartNum() {
		return startNum;
	}
	public void setStartNum(Long startNum) {
		this.startNum = startNum;
	}
	public Long getLastNum() {
		return lastNum;
	}
	public void setLastNum(Long lastNum) {
		this.lastNum = lastNum;
	}
	public Long getStartRow() {
		return startRow;
	}
	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}
	public Long getLastRow() {
		return lastRow;
	}
	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}
	
}
