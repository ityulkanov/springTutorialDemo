package com.igortyulkanov.springdemo;

public class TrackCoach implements Coach {

    private FortuneService fortuneService;

    public TrackCoach(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyFortune() {
        return "Just do it " + fortuneService.getFortune();
    }

    @Override
    public String getDailyWorkout() {
        return "Was working out on track for 30 min";
    }
    // add an init method
    public void doMyStartupStuff() {
        System.out.println("Track Coach : inside my startucp mehtod ");
    }
    // add destroy method
    public void doMyCleanUpStuff() {
        System.out.println("TrackCoach : inside method domyCleanupStuff");
    }
}
