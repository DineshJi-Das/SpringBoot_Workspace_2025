package com.stsmvc1.practive.controller;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//@RequestMapping()
@Controller

public class Practice1 {
	@RequestMapping("/index")
	public String getPractice() {
		System.out.println("hello");
		return "index";
		}
	@RequestMapping("/project")
	public String services() {
		return "login";
		
	}

}
