package com.april.april18.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Person {
	//@Autowired
	//@Qualifier("cat")
	@Autowired
	Animal animal;
	@Autowired
	Student student;
	@Autowired
	Samosa samosa;
	/*
	 * @Autowired Person(Animal animal,Student student) { this.animal=animal;
	 * this.student=student; }
	 */

	
	/*
	 * @Autowired public Person(@Qualifier("cat") Animal animal ) {
	 * this.animal=animal; }
	 */
	 
	 
	/*
	 * public Animal getAnimal() { return animal; }
	 */

	/*
	 * @Autowired public void setAnimal(Animal animal) {
	 * System.out.println("setting animal"); this.animal = animal; }
	 * 
	 * 
	 * public Student getStudent() { return student; }
	 * 
	 * @Autowired public void setStudent(Student student) {
	 * System.out.println("setting student"); this.student = student; }
	 */


	public void playwithAnimal() {
		animal.play();
		student.details();
		samosa.eat();
	}
	

}
