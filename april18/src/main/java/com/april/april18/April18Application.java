package com.april.april18;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Primary;

import  com.april.april18.controller.*;


@ComponentScan(basePackages = {"com.april.april18.config"})
@SpringBootApplication
public class April18Application {

	public static void main(String[] args) {
		/*
		 * //Animal animal = new Dog(); Animal animal = new Cat(); Person p = new
		 * Person(animal); p.playwithAnimal();
		 */
		ConfigurableApplicationContext Context = SpringApplication.run(April18Application.class, args);
		Person bean = Context.getBean(Person.class);
		bean.playwithAnimal();
	}
	
	
	/*
	 * @Bean(name="samosa1") public Samosa getsamosa() { return new
	 * Samosa("tandoori samasa"); }
	 * 
	 * @Bean(name="samosa2")
	 * 
	 * @Primary public Samosa getsamosa1() { return new Samosa("mitha samosa"); }
	 */
	 
	 

}
