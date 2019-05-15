package com.igortyulkanov.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LifeCycleMethodsApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");
        Coach theCoach = context.getBean("myCoach", Coach.class);
        System.out.println(theCoach.getDailyFortune());

        context.close();
    }
}
