package com.rw;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.rw.sports.controller.SportsController;

public class MainClass {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("beans.xml");
		
		SportsController sports = context.getBean("sports", SportsController.class);
		sports.getSports();
		
	}

}
