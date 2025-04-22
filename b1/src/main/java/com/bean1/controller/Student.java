package com.bean1.controller;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class Student {
	public Student() 
	{
		System.out.println("student created");
	}
	@PostConstruct
	public void study() {
		System.out.println("student is studying");
	}
	@PreDestroy
	public void destry() {
		System.out.println("destroy");
	}

}
