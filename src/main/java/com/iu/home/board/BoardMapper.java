package com.iu.home.board;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.iu.home.util.Pager;

@Mapper
public interface BoardMapper {

	public List<BoardVO> getList(Pager pager) throws Exception;
	public Long getCount(Pager pager) throws Exception;
	public BoardVO getDetail(BoardVO boardVO) throws Exception;
}
