package com.sample.controller;

public class SampleValueController {
	
	private String host;
	private int port;
	private String userName;
	private String password;
	
	public void setHost(String host) {
		this.host = host;
	}
	public void setPort(int port) {
		this.port = port;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void execute() {
		System.out.println("서버 연결정보");
		System.out.println("호스트명: " + host);
		System.out.println("포트번호: " + port);
		System.out.println("사용자명: " + userName);
		System.out.println("비밀번호: " + password);
	}
}
