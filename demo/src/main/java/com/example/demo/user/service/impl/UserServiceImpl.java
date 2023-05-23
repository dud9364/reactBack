package com.example.demo.user.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.user.service.UserService;
import com.example.demo.user.service.UserVO;

@Service("UserService")
public class UserServiceImpl implements UserService{
	
	@Autowired
    protected UserMapper userMapper;

	/*로그인시 id password 검사*/
	@Override
	public int setLoginIn(UserVO paramVo) throws Exception {
		return userMapper.selectGetLogIn(paramVo);
	}

	@Override
	public Map<String, Object> setLoginInfo(UserVO paramVo) throws Exception {
		return userMapper.selectGetLogInfo(paramVo);
	}

}
