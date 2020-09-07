package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach theCoach=context.getBean("tennisCoach",Coach.class);

		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);

		boolean resultat=(theCoach==alphaCoach);
		
		System.out.println("\n Pointing to the same object : " +resultat);

		System.out.println("\n Memory location for theCoach : " +theCoach);

		System.out.println("\n Memory location for alphaCoach : " +alphaCoach);

		context.close();
	}

}
