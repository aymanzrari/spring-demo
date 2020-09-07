package com.luv2code.springdemo;


import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService ;
	
	public TennisCoach() {
		System.out.println(">>Tennis Coach : Inside default constructor ");
	}
	
	//define my init method
		@PostConstruct
		public void doMyStartupStuff() {
			System.out.println(">> TennisCoach : inside of doMyStartupStuff() ");
		}
	
	//define my destroy method
		@PreDestroy
		public void doMyCleanupStuff() {
			System.out.println(">> TennisCoach : inside of doMyCleanupStuff() ");
		}
	
	
	/*@Autowired
	public TennisCoach(FortuneService thefortuneService) {
		fortuneService = thefortuneService;
	}
	*/
	

	/*@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		System.out.println(">>Tennis Coach : Inside setFortuneService() methode");
		this.fortuneService = fortuneService;
	}
    */
	
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
