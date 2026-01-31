package com.junit_testing;

public class PerformanceService {

	public String longRunningTask() throws InterruptedException{
		//Simulate 3 seconds delay
		Thread.sleep(3000);
		return "Task Completed";
	}
}

