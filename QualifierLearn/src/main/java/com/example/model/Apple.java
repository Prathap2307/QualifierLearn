package com.example.model;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.service.BeanTestInterface;

@Component("appleComponent")
public class Apple implements BeanTestInterface {

	@Override
	public String findWhichFruit() {
		
		System.out.println("apple fruit ----------------------------------------->");
		
		return "apple";
	}
	
	

}
