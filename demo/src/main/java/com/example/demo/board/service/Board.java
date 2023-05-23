package com.example.demo.board.service;

import lombok.Data;

@Data
public class Board {


	private int userId = 0;
	private int boardId = 0;
	private String boardTitle ="";
	private String boardContent = "";
	private String boardName = "";
	private String inptr ="";
	private String inptDt ="";
	
	
	public int getBoardId() {
		return boardId;
	}
	public void setBoardId(int boardId) {
		this.boardId = boardId;
	}
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getBoardTitle() {
		return boardTitle;
	}
	public void setBoardTitle(String boardTitle) {
		this.boardTitle = boardTitle;
	}
	public String getBoardContent() {
		return boardContent;
	}
	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}
	public String getInptr() {
		return inptr;
	}
	public void setInptr(String inptr) {
		this.inptr = inptr;
	}
	public String getInptDt() {
		return inptDt;
	}
	public void setInptDt(String inptDt) {
		this.inptDt = inptDt;
	}
	

	

}
