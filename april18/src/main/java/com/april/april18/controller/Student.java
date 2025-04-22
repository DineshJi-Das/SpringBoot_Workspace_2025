package com.april.april18.controller;

import org.springframework.stereotype.Component;

@Component
public class Student {
	Student()
	{
		System.out.println("Student is creating");
	}
	public void details() 
	{
		System.out.println("i am Student");
	}

}
