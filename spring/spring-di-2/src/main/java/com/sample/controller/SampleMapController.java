package com.sample.controller;

import java.util.Map;

import com.sample.service.MessageService;

public class SampleMapController {
	
	/*
	 * MessageService인터페이스의 구현객체가 key, value쌍으로 저장되는 Map객체를 스프링 컨테이너로 부터 주입받는다.
	 * Map객체에는 
	 * 	{"sms": SmsMessageServiceImpl, "email":EmailMessageServiceImpl}과 유사한 형태로 MessageService 인터페이스의
	 *  구현객체들이 저장되어 있다.
	 * Map 객체에서 필요한 객체를 꺼내기 위해서는 "sms" 혹은 "email"과 같은 key값이 필요하다.
	 * 아래의 execute(String type, String from, String to, String title, String message)에서 type 매개변수로 "sms"혹은 "email" 중에서 하나를 전달받는다.
	 */
	private Map<String, MessageService> messageServices;
	
	public void setMessageServices(Map<String, MessageService> messageServices) {
		this.messageServices = messageServices;
	}
	
	public void execute(String type, String from, String to, String title, String message) {
		MessageService service = messageServices.get(type);
		service.send(from, to, title, message);
	}
}
