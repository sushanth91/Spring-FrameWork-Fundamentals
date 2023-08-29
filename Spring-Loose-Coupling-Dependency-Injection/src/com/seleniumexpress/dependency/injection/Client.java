package com.seleniumexpress.dependency.injection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans.xml file loaded");

		Student stuMath = context.getBean("stuMath", Student.class);
		stuMath.cheating();
		
		Student stuJava = context.getBean("stuJava", Student.class);
		stuJava.cheating();
		
		Student stuScience = context.getBean("stuScience", Student.class);
		stuScience.cheating();

	}
}
