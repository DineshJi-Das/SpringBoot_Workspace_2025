package com.april.april18.controller;

import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Dog implements Animal{

	@Override
	public void play() {
		System.out.println("dog is playing");


		
	}

}
