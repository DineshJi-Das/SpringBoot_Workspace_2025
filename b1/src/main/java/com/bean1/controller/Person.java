package com.bean1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Autowired
	Pepsi pepsi;
	public Person() 
	{
		System.out.println("preson constructor created");
	}
	public void play() {
		pepsi.drink();
	}

}
