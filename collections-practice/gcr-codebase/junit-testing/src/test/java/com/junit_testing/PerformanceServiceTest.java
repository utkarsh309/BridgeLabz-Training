package com.junit_testing;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class PerformanceServiceTest {

	@Test
	@Timeout(2)
	void testLongRunningTaskTimeout()throws InterruptedException{
		PerformanceService service=new PerformanceService();
		service.longRunningTask();
		
	}
}
