package com.example.demo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cmm.service.ResultVO;
import com.example.demo.user.service.UserService;
import com.example.demo.user.service.UserVO;

@RestController
public class HelloController {

	@Autowired
    protected UserService userService;
	
	@GetMapping("/hello")
	   public List<String> Hello()throws Exception{
			System.out.println("===================hello============================");
	        return Arrays.asList("서버 포트는 8081", "리액트 포트는 3000");
	    }
	
	 @RequestMapping(value="/login")
	 @ResponseBody
	  public ResultVO login(@RequestBody UserVO paramVo)throws Exception{
		 
			 ResultVO resultVO = new ResultVO();
			 Map<String,Object> resultMap = new HashMap<String,Object>();

			 int cnt = userService.setLoginIn(paramVo);
			Map<String, Object> loginInfo = userService.setLoginInfo(paramVo);

			 resultMap.put("cnt", cnt);
			 resultMap.put("paramVo", paramVo);
			 resultMap.put("loginInfo", loginInfo);
			 resultVO.setResult(resultMap);
			 
	      return resultVO;
	  }
	
	

}
