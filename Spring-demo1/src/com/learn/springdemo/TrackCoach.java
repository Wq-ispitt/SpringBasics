package com.learn.springdemo;

public class TrackCoach implements Coach {
	private FortuneService fort;
	
	
	public TrackCoach() {
		
	}

	public TrackCoach(FortuneService fort) {
		this.fort = fort;
	}

	@Override
	public String getDailyWorkout() {
		
		return "Run a hard 4k";
	}

	@Override
	public String getDailyFortune() {
		
		return "just do it :" + fort.getFortune();
	}
	
	//add an init method
	public void doInit() {
		System.out.println("trackcoach : inside doinit method");
	}
	
	//add a destroy method
	public void doDestroy() {
		System.out.println("trackcoach: inside doDestroy method");
	}
}
