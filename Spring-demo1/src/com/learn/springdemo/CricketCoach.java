package com.learn.springdemo;

public class CricketCoach implements Coach {
	
	private FortuneService fort;
	
	//fields
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("CriketCoach : non-arg construct called.");
	}
	
	
	
	public String getEmailAddress() {
		return emailAddress;
	}



	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
		System.out.println("inside email address");
	}



	public String getTeam() {
		return team;
	}



	public void setTeam(String team) {
		this.team = team;
		System.out.println("inside setTeam");
	}



	public void setFort(FortuneService fort) {
		this.fort = fort;
		System.out.println("CriketCoach : inside setter method.");
	}

	@Override
	public String getDailyWorkout() {
		
		return "practice fast bowling for 15 mins";
	}

	@Override
	public String getDailyFortune() {
		
		return fort.getFortune();
	}

}
