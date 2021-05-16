package com.asish.demo.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;

import com.asish.demo.entity.ChatMessage;

@Controller
public class ChatController {
	@MessageMapping("/chat.register")
	@SendTo("/topic/public")
	public ChatMessage register(@Payload ChatMessage message,SimpMessageHeaderAccessor accessor) {
		accessor.getSessionAttributes().put("username", message.getSender());
		return message;
	}
	@MessageMapping("/chat.send")
	@SendTo("/topic/public")
	public ChatMessage send(@Payload ChatMessage message) {
		return message;
	}

}
