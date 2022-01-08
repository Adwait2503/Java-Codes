package com.te.spring.springbean.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.te.spring.springbean.Cat;
import com.te.spring.springbean.Dog;
import com.te.spring.springbean.Lion;
import com.te.spring.springbean.Pet;

@Configuration
@ComponentScan(basePackages = "com.te.spring.springbean,com.te.spring.springbean.test")
public class Config {
//	@Bean("Dog")
//	@Primary
//	public Dog getDog() {
//		return new Dog();
//	}
//
//	@Bean("Cat")
//	public Cat getCat() {
//		return new Cat();
//	}
//
//	@Bean("Lion")
//	public Lion getLion() {
//		return new Lion();
//	}
//
//	@Bean("Pet")
//	public Pet getPet() {
//		return new Pet();
//	}
}
