package com.april.april18.scope;

import org.springframework.stereotype.Component;

@Component
public class Pepsi {
	public Pepsi() 
	{
		System.out.println("pepsi is created");
	}
	public void drink () {
		System.out.println("pepsi is cool");
		
	}

}
