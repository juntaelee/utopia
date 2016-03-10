package com.heaven.mvc.board.service;

import java.util.List;

import com.heaven.mvc.board.domain.BoardVO;

public interface BoardService {
	public List<BoardVO> list();
	
	public boolean delete(BoardVO boardVO);
	
	public BoardVO edit(BoardVO boardVO);
	
	public void write(BoardVO boardVO);
	
	public BoardVO read(int seq);
}
