package com.winter;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.winter.config.SpringConfig;

public class Runner {
	
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
		
		Restaurant restaurant = context.getBean("restaurant", Restaurant.class);
		
		restaurant.takeOrder();
	}

}
