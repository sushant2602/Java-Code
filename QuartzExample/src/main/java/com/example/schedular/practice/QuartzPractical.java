package com.example.schedular.practice;

import java.sql.Date;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class QuartzPractical implements Job {

	public void execute(JobExecutionContext context) throws JobExecutionException {
		

		
		System.out.println("Hurrayyy");
		System.out.println("The Time now is "+new Date(0));
		
	}

}
