package com.learn.springdemo;

public class BaseballCoach implements Coach {
	//define private field
	private FortuneService fortServ;
	
	//define a constructor
	public BaseballCoach(FortuneService theFort) {
		fortServ = theFort;
	}
	
	 @Override
	 public String getDailyWorkout() {
		 
		 return "30mins practice";
	 }

	@Override
	public String getDailyFortune() {
		
		return fortServ.getFortune();
	}

}
