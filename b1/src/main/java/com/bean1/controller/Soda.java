package com.bean1.controller;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Soda {
	public Soda() 
	{
		System.out.println("soda is creating");
	}
	public void sdrink() {
		System.out.println("soda is harm for body");
		
	}

}
