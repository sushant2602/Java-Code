package com.example.quartz.QuartzExample;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SimpleScheduleBuilder;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

import com.example.schedular.practice.QuartzPractical;

public class App 
{
    public static void main( String[] args ) throws SchedulerException
    {
    	JobDetail jDetail = JobBuilder.newJob(QuartzPractical.class).build();
    	
    	Trigger trig = TriggerBuilder.newTrigger().withIdentity("CroneTrigger")
    			.withSchedule(SimpleScheduleBuilder.simpleSchedule().withIntervalInSeconds(02)
    					.repeatForever()).build();
    	
    	Scheduler schedular = StdSchedulerFactory.getDefaultScheduler();
    	
    	schedular.start();
    	schedular.scheduleJob(jDetail,trig);
    }
}
