package com.example.demo.user.web;

import java.util.HashMap;
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
public class UserController {

	@Autowired
    protected BoardService userService;
	

}
