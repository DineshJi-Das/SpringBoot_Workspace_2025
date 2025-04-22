package com.april.april18.controller;

//import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Cat implements Animal {

	@Override
	public void play() {
System.out.println("cat is playing");

		
	}

}
