package com.nit;

public class Socialmedia {
	private String username;
	private int like;
	public Socialmedia(String username, int like) {
		this.username = username;
		this.like = like;
	}
	public void Display(){
		System.out.println("your name is:"+username);
		System.out.println("your like is:"+like);
	}
	

}
