package com.naren.springdemo;

public class TrackCoach implements Coach {

	private FortuneService fortuneService;

	TrackCoach(FortuneService theFortuneService) {
		this.fortuneService = theFortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Run for 30 min";
	}

	@Override
	public String getDailyFortune() {
		return "All the best " + fortuneService.getFortune();
	}

	// Add an init method
	public void doMyStartupStuff() {
		System.out.println("Track Coach init: inside method doMyStartupStuff");
	}

	// Add an destroy method
	public void destroyMyStartupStuff() {
		System.out.println("Track Coach destroy: inside method destroyMyStartupStuff");
	}

}
