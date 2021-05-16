package com.asish.demo.entity;

import java.awt.TrayIcon.MessageType;

public class ChatMessage {
	private String content;
	private String sender;
	private MessageType type;
	
	public enum MessageType{
		JOIN,
		CHAT,
		LEAVE
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getSender() {
		return sender;
	}

	public void setSender(String sender) {
		this.sender = sender;
	}

	public MessageType getType() {
		return type;
	}

	public void setType(MessageType type) {
		this.type = type;
	}
	

}
