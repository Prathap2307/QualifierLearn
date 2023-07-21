package com.example.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.service.AnimalInterface;

@Component
@Primary
@Qualifier("dogQualifier")
public class Dog implements AnimalInterface {

	@Override
	public String findWhichAnimal() {
		// TODO Auto-generated method stub
		return "Dog";
	}

}
