package com.cmm.service;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

@Data
public class ResultVO {
	private int resultCode = 0;
	private String resultMessage="OK";
	private Map<String,Object> result = new HashMap<String,Object>();
	public String getResultMessage() {
		return resultMessage;
	}
	public void setResultMessage(String resultMessage) {
		this.resultMessage = resultMessage;
	}
	public Map<String, Object> getResult() {
		return result;
	}
	public void setResult(Map<String, Object> result) {
		this.result = result;
	}

	

}
