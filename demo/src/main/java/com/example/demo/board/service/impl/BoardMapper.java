package com.example.demo.board.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.board.service.BoardVO;

@Mapper
public interface BoardMapper {
	/* 게시판 목록 수 */
	int selectgetBoardCnt(BoardVO paramVo) throws Exception;
	/* 게시판 목록 */
	List<Map<String, Object>> selectgetBoardList(BoardVO paramVo) throws Exception;
	/* 게시판 등록 */
	int insertBoardInpt(BoardVO paramVo)throws Exception;
	/* 게시판 상세화면 */
	Map<String, Object> selectgetBoardDetail(BoardVO paramVo)throws Exception;
	/* 게시판 수정 */
	int updateBoard(BoardVO paramVo)throws Exception;
	/* 게시글 삭제 */
	int deleteBoard(BoardVO paramVo)throws Exception;




}
