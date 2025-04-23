package com.bean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.bean.controller.Pepsi;
import com.bean.controller.Person;
import com.bean.controller.Samosa;
import com.bean.controller.Soda;
//@ComponentScan(basePackages = {"com.config"})
@SpringBootApplication
public class BeanApplication {

	public static void main(String[] args) {
		
		ConfigurableApplicationContext context = SpringApplication.run(BeanApplication.class, args);
		/*
		 * Person bean = context.getBean(Person.class); bean.play();
		 * 
		 * Pepsi b = context.getBean(Pepsi.class); System.out.println(b); //b.drink();
		 * Pepsi b1 = context.getBean(Pepsi.class); System.out.println(b1);
		 */
		Pepsi pepsibean = context.getBean(Pepsi.class);
		System.out.println(pepsibean);
		Soda soda = pepsibean.getSoda();
		System.out.println(soda);
		
	}
	
	/*
	 * @Bean public Samosa getSamosa() { return new Samosa(); }
	 */
	
	 

}
