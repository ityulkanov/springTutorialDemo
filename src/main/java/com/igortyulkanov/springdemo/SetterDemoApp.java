package com.igortyulkanov.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDemoApp {
    public static void main(String[] args) {
        // load the spring config file
        String configLocation;
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // retrieve the bean form spring container
        BasketballCoach theCoach = context.getBean("myBasketBallCoach", BasketballCoach.class);
        // call the methods on the bean
        System.out.println(theCoach.getDailyFortune());
        System.out.println(theCoach.getDailyWorkout());

        // close th context
        context.close();
    }
}
