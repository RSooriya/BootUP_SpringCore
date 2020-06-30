package com.sooriya;

public class MyApp {

	public static void main(String args[])
	{
		// normal java 101 
		BaseballCoach theCoach = new BaseballCoach();
		System.out.println(theCoach.getDailyWorkout());
		TrackCoach coach = new TrackCoach();
		System.out.println(coach.getDailyWorkout());
	}
}
