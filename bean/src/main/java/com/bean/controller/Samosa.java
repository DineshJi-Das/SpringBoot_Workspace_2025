package com.bean.controller;

import org.springframework.stereotype.Component;



@Component
public class Samosa {
	public Samosa() 
	{
		System.out.println("samosa creating");
	}
	public void eat() {
		System.out.println("samosa is spice");
		
	}

}
