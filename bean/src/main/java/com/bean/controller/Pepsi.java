package com.bean.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Scope("prototype")
@Component


public class Pepsi {
	
	
	public Soda getSoda() {
		return soda;
	}
	public void setSoda(Soda soda) {
		this.soda = soda;
	}
	@Autowired
	private Soda soda;
	public Pepsi() 
	{
		System.out.println("pepsi is creating");
	}
	public void drink() {
		System.out.println("pepsi is cool");
	}
	

}
