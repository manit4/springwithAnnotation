package com.winter;

import org.springframework.stereotype.Component;

@Component
public class Tea {
	
	public void prepareTea() {
		
		System.out.println("Your tea is being prepared...");
	}
	
	public Tea() {
		System.out.println("inside Tea constr...");
	}

}
