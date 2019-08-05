package com.naren.springdemo;

public class TrackCoach implements Coach {

	
	private FortuneService fortuneService;
	TrackCoach(FortuneService theFortuneService){
		this.fortuneService=theFortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run for 30 min";
	}

	@Override
	public String getDailyFortune() {
		return "All the best "+ fortuneService.getFortune();
	}

}
