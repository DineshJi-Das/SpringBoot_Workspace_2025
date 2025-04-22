package com.bean1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.bean1.controller.Pepsi;
import com.bean1.controller.Person;
import com.bean1.controller.Soda;

@SpringBootApplication
public class B1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(B1Application.class, args);
		/*
		 * Person pbean = context.getBean(Person.class); System.out.println(pbean);
		 * pbean.play();
		 */
		Pepsi pepbean = context.getBean(Pepsi.class);
		System.out.println(pepbean);
		//pepbean.drink();
		Soda soda = pepbean.getSoda();
		System.out.println(soda);
		Pepsi pb = context.getBean(Pepsi.class);
		System.out.println(pb);
		//pepbean.drink();
		Soda soda1 = pb.getSoda();
		System.out.println(soda1);
		
		 
	}

}
