package com.example.demo.board.service;

import java.io.Serializable;

import lombok.Data;

@Data
public class BoardVO extends Board {

	private String serachTitle ="";
	private String serachId ="";
	public String getSerachTitle() {
		return serachTitle;
	}
	public void setSerachTitle(String serachTitle) {
		this.serachTitle = serachTitle;
	}
	public String getSerachId() {
		return serachId;
	}
	public void setSerachId(String serachId) {
		this.serachId = serachId;
	}
	@Override
	public String toString() {
		return "BoardVO [serachTitle=" + serachTitle + ", serachId=" + serachId + "]";
	}

	



	
}
