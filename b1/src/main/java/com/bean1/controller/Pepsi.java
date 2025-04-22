package com.bean1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Pepsi {
	@Autowired
	private Soda soda;
	public Pepsi() 
	{
		System.out.println("pepsi is created");
	}
	public void drink() 
	{
		System.out.println("pepsi is very cool");
	}
	public Soda getSoda() {
		return soda;
	}
	public void setSoda(Soda soda) {
		this.soda = soda;
	}

}
