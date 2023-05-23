package com.example.demo.user.service;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserVO extends User {

	private String SerachID ="";

	public String getSerachID() {
		return SerachID;
	}

	public void setSerachID(String serachID) {
		SerachID = serachID;
	}

	@Override
	public String toString() {
		return "UserVO [SerachID=" + SerachID + "]";
	}
	
}
