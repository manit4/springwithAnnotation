package com.winter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {
	
	@Autowired
	Tea tea;
	
	public void takeOrder() {
		
		System.out.println("Order is done...");
		
		tea.prepareTea();
	}
	
	public Restaurant() {
		System.out.println("inside restaurant constr....");
	}

}
