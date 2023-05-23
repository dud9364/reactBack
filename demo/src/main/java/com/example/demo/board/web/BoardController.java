package com.example.demo.board.web;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cmm.service.ResultVO;
import com.example.demo.board.service.BoardService;
import com.example.demo.board.service.BoardVO;

@RestController
public class BoardController {

	@Autowired
    protected BoardService boardService;
	
	@RequestMapping(value="/boardList")
	@ResponseBody
   public ResultVO boardList(@RequestBody BoardVO paramVo)throws Exception{
			 ResultVO resultVO = new ResultVO();
			 Map<String,Object> resultMap = new HashMap<String,Object>();
			 int cnt = 0 ;
			 List<Map<String, Object>> list = new  ArrayList<>();
			 
			 try {
				 cnt = boardService.setBoardCnt(paramVo);
				 list = boardService.setBoardList(paramVo);
			 }catch(Exception e) {
				 System.out.println("e"+ e);
			 }

			 resultMap.put("cnt", cnt);
			 resultMap.put("list", list);
			 resultMap.put("paramVo", paramVo);
			 resultVO.setResult(resultMap);			 
			 
		   return resultVO;
	    }
	
	@RequestMapping(value="/boardInpt")
	@ResponseBody
   public ResultVO boardInpt(@RequestBody BoardVO paramVo)throws Exception{
			 ResultVO resultVO = new ResultVO();
			 Map<String,Object> resultMap = new HashMap<String,Object>();
			 int cnt = 0 ;
			 
			 try {
				 cnt = boardService.setBoardInpt(paramVo);

			 }catch(Exception e) {
				 System.out.println("e"+ e);
			 }

			 resultMap.put("cnt", cnt);
			 resultMap.put("paramVo", paramVo);
			 resultVO.setResult(resultMap);			 
			 
		   return resultVO;
	    }
	
	@RequestMapping(value="/boardDetail")
	@ResponseBody
   public ResultVO boardDetail(@RequestBody BoardVO paramVo)throws Exception{

			 ResultVO resultVO = new ResultVO();
			 Map<String,Object> resultMap = new HashMap<String,Object>();	 
			 Map<String,Object>  boardDetail = new HashMap<String,Object>();
			 
			 try {
				 boardDetail = boardService.setBoardDetail(paramVo);

			 }catch(Exception e) {
				 System.out.println("e"+ e);
			 }

			 resultMap.put("boardDetail", boardDetail);
			 resultMap.put("paramVo", paramVo);
			 resultVO.setResult(resultMap);			 
			 
		   return resultVO;
	    }
	
	@RequestMapping(value="/boardUpd")
	@ResponseBody
   public ResultVO boardUpd(@RequestBody BoardVO paramVo)throws Exception{

			 ResultVO resultVO = new ResultVO();
			 Map<String,Object> resultMap = new HashMap<String,Object>();	 
			 int  boardUpd = 0;
			 
			 try {
				 boardUpd = boardService.setBoardUpd(paramVo);

			 }catch(Exception e) {
				 System.out.println("e"+ e);
			 }

			 resultMap.put("boardUpd", boardUpd);
			 resultMap.put("paramVo", paramVo);
			 resultVO.setResult(resultMap);			 
			 
		   return resultVO;
	    }
	
	@RequestMapping(value="/boardDel")
	@ResponseBody
   public ResultVO boardDel(@RequestBody BoardVO paramVo)throws Exception{

			 ResultVO resultVO = new ResultVO();
			 Map<String,Object> resultMap = new HashMap<String,Object>();	 
			 int  boardDel = 0;
			 
			 try {
				 boardDel = boardService.setBoardDel(paramVo);

			 }catch(Exception e) {
				 System.out.println("e"+ e);
			 }

			 resultMap.put("boardDel", boardDel);
			 resultMap.put("paramVo", paramVo);
			 resultVO.setResult(resultMap);			 
			 
		   return resultVO;
	    }
	
	

}
