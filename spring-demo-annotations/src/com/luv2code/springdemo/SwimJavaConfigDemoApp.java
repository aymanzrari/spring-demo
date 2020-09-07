package com.luv2code.springdemo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Read spring config java class
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
				
		System.out.println(theCoach.getDailyWorkout());

		System.out.println(theCoach.getDailyFortune());

		System.out.println("Email : " +theCoach.getEmail());

		System.out.println("Team  : " +theCoach.getTeam());

		context.close();
	}

}
