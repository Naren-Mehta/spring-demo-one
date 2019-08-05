package com.naren.springdemo;

public class CricketCoach implements Coach{

	private FortuneService fortuneService;
	
	public CricketCoach(){
		System.out.println("Cricket Coach non-args constructor. ");
	}
	
	//our setter method
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println("Inside Cricket Coach setter method. ");
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice 30 min for bowling";
	}

	@Override
	public String getDailyFortune() {
		return "play good cricket " + fortuneService.getFortune();
	}

}
