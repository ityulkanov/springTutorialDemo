package com.igortyulkanov.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        // load spring config file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MyLoggerConfig logger = context.getBean("myLoggerConfig", MyLoggerConfig.class);
        // retrieve a bean from spring container
        Coach theCoach = context.getBean("myCoach", Coach.class);
        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        // calling method for fortunes
        System.out.println(theCoach.getDailyFortune());
        // close the context
        context.close();
    }
}
