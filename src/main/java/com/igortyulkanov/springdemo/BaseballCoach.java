package com.igortyulkanov.springdemo;

public class BaseballCoach  implements Coach{

    // define a private field for dependency
    private FortuneService fortuneService;
    @Override
    public String getDailyFortune() {
        // use my forutne servcie to get a forutne
        return fortuneService.getFortune();
    }

    // define a constructori for dependency injection
    public BaseballCoach (FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }
    @Override
    public String getDailyWorkout() {
        return "Spend 30 min on batting practice";
    }
}
