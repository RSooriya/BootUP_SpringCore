package com.sooriya;

public class MyApp {

	public static void main(String args[])
	{
		BaseballCoach theCoach = new BaseballCoach();
		System.out.println(theCoach.getDailyWorkout());
		TrackCoach coach = new TrackCoach();
		System.out.println(coach.getDailyWorkout());
	}
}
