package com.example.model;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.service.AnimalInterface;

@Component

@Qualifier("catQualifier")
public class Cat implements AnimalInterface {

	@Override
	public String findWhichAnimal() {
		// TODO Auto-generated method stub
		return "Cat";
	}

}
