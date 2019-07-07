package com.learn.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		
		Coach Coach1 = context.getBean("myCoach", Coach.class);
		Coach Coach2 = context.getBean("myCoach", Coach.class);
		
		//check if they are same
		//singleton vs prototype
		boolean result = (Coach1 == Coach2);
		System.out.println("\npointing to the same object: " + result);
		System.out.println("memory location for Coach1 :" + Coach1);
		System.out.println("memory location for Coach2 :" + Coach2 +"\n");
		
		context.close();

	}

}
