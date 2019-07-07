package com.learn.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
	//setter injection

	public static void main(String[] args) {
		//load the spring configure
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//retrieve the bean
		CricketCoach theCoach = context.getBean("myCricketCoach", CricketCoach.class);
		//call methods
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		//email & team
		System.out.println(theCoach.getEmailAddress());
		System.out.println(theCoach.getTeam());
		
		//close context
		context.close();

	}

}
