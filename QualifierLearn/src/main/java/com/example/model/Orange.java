package com.example.model;

import org.springframework.stereotype.Service;

import com.example.service.BeanTestInterface;

@Service("orangeComponent")
public class Orange implements BeanTestInterface {
	
	public void orangeComponentTestFn() {
		System.out.println("orangeComponentTestFn ----------------------------------------->");
	}

	@Override
	public String findWhichFruit() {
		// TODO Auto-generated method stub
		System.out.println("orange fruit ----------------------------------------->");
		
		return "orange";
	}

}
