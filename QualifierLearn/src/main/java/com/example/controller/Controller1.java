package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.service.AnimalInterface;
import com.example.service.BeanTestInterface;



@RestController
public class Controller1 {
	
	@Autowired
	@Qualifier("appleComponent")
	private BeanTestInterface beanTestInterfacePP;
	
	@GetMapping("/whichComponentTest")
	public String whichComponentTest() {
	
			return	beanTestInterfacePP.findWhichFruit();
		
	}
	
	
	/*  ANIMAL STARTS */
	@Autowired
	//@Qualifier("catQualifier")
	private AnimalInterface animalBox;
	
	@GetMapping("/whichComponentWithAnimal")
	public String whichComponentWithAnimal() {
	
			return	animalBox.findWhichAnimal();
		
	}
	
	/*  ANIMAL ENDS */

}
//POSTMAN

/* localhost:8080/whichComponentTest
 * 
 * 
 * 
 * localhost:8080/whichComponentWithAnimal

 *  localhost:5000/whichComponentTest
 *  */
