package com.example.demo.board.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.board.service.BoardService;
import com.example.demo.board.service.BoardVO;

@Service("BoardService")
public class BoardServiceImpl implements BoardService{
	
	@Autowired
    protected BoardMapper boardMapper;
	/* 게시판 목록 수 */
	@Override
	public int setBoardCnt(BoardVO paramVo) throws Exception {
		return boardMapper.selectgetBoardCnt(paramVo);
	}
	/* 게시판 목록 */
	@Override
	public List<Map<String, Object>> setBoardList(BoardVO paramVo) throws Exception {
		return boardMapper.selectgetBoardList(paramVo);
	}
	/* 게시판 등록 */
	@Override
	public int setBoardInpt(BoardVO paramVo) throws Exception {
		return boardMapper.insertBoardInpt(paramVo);
	}
	/* 게시판 상세화면 */
	@Override
	public Map<String, Object> setBoardDetail(BoardVO paramVo) throws Exception {
		return boardMapper.selectgetBoardDetail(paramVo);
	}
	/* 게시글 수정 */
	@Override
	public int setBoardUpd(BoardVO paramVo) throws Exception {
		return boardMapper.updateBoard(paramVo);
	}
	/* 게시글 삭제 */
	@Override
	public int setBoardDel(BoardVO paramVo) throws Exception {
		return boardMapper.deleteBoard(paramVo);
	}



}
