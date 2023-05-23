package com.example.demo.user.service;

import java.util.List;
import java.util.Map;

public interface UserService {

	/*로그인시 id password 검사*/
	int setLoginIn(UserVO paramVo)throws Exception;

	Map<String, Object> setLoginInfo(UserVO paramVo)throws Exception;

	
}
