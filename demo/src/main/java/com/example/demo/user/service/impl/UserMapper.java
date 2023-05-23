package com.example.demo.user.service.impl;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.user.service.UserVO;

@Mapper
public interface UserMapper {

	int selectGetLogIn(UserVO paramVo) throws Exception;

	Map<String, Object> selectGetLogInfo(UserVO paramVo)throws Exception;

}
