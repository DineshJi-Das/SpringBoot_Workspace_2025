package com.bean.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	Samosa samosa;
	@Autowired
	Pepsi pepsi;
	
	public void play() {
		samosa.eat();
		//pepsi.drink();
	}
	

}
