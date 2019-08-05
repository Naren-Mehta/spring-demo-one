package com.naren.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeAppDemo {
	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanScope-applicationContext.xml");
		Coach theCoach = context.getBean("myCoach", Coach.class);
		Coach alphaCoach = context.getBean("myCoach", Coach.class);

		boolean result = (theCoach == alphaCoach);

		System.out.println("==result==" + result);
		
		System.out.println("The coach===>"+theCoach);
		System.out.println("The alphaCoach===>"+alphaCoach);


	}
}
