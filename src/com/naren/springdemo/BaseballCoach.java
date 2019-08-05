package com.naren.springdemo;

public class BaseballCoach implements Coach{

	//Define a private field for the dependency
	private FortuneService fortuneService;
	
	//define a constructor for dependency injection
	public BaseballCoach(FortuneService theFortuneService) {
		this.fortuneService=theFortuneService;
	}
	
	public String getDailyWorkout() {
		return "Spend 30 minuts on batting practice";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	
}
