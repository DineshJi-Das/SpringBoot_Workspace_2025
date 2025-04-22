package com.april.april18.controller;


public class Samosa {
	String name;
	public Samosa(String name) 
	{
		System.out.println("this is "+name);
		this.name=name;
	}
	
	public void eat() {
		System.out.println("samosa is very spice");
		System.out.println(name);
	}

}
