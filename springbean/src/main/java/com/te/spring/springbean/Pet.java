package com.te.spring.springbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Pet {

	String name;
	@Autowired
	@Qualifier("lion")
	Animal animal;

	public void doThings() {
		if (animal.isPet()) {
			animal.eat();
			animal.makesound();
		} else {
			System.out.println("This is Not a Pet...");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", animal=" + animal + "]";
	}

}