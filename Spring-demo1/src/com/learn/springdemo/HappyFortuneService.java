package com.learn.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		
		return "today is a lucky Day!";
	}

}
