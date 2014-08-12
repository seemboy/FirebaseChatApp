package com.firebasechatapp.model;

public class Message {

	private String message;
	private User author;
	
	
	public Message() {
	}


	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}


	public User getAuthor() {
		return author;
	}


	public void setAuthor(User author) {
		this.author = author;
	}
	
	
	
}
