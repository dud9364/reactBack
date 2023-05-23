package com.example.demo.board.service;

import java.util.List;
import java.util.Map;

public interface BoardService {
	/* 게시판 목록 수 */
	int setBoardCnt(BoardVO paramVo)throws Exception;
	/* 게시판 목록 */
	List<Map<String, Object>> setBoardList(BoardVO paramVo)throws Exception;
	/* 게시판 등록 */
	int setBoardInpt(BoardVO paramVo)throws Exception;
	/* 게시판 상세화면 */
	Map<String, Object> setBoardDetail(BoardVO paramVo)throws Exception;
	/* 게시글 수정 */
	int setBoardUpd(BoardVO paramVo)throws Exception;
	/* 게시글 삭제 */
	int setBoardDel(BoardVO paramVo)throws Exception;




	
}
