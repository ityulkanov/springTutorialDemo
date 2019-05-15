package com.igortyulkanov.springdemo;

import lombok.Data;

@Data
public class CricketCoach implements Coach {

    private FortuneService fortuneService;
    private String emailAddress;
    private String team;


    // setter for dependency
    public void setFortuneService(FortuneService fortuneService) {
        System.out.println("Cricket coach inside setter method");
        this.fortuneService = fortuneService;
    }


    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    // Create a no arg constructor
    public CricketCoach(){
        System.out.println("CricketCoack: inside no arg constructor");
    }
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowlong for 15 min a day=";
    }

}
