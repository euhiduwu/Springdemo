package com.example.demo.task;

import org.quartz.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class QuartzConfig {
    @Bean
    public JobDetail quartzTaskOne() {
        return JobBuilder.newJob(QuartzTaskOne.class).withIdentity("QuartzTaskOne").storeDurably().build();
    }

    @Bean
    public Trigger quartzTriggerOne() {
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(5)
                .repeatForever();
        return TriggerBuilder.newTrigger().forJob(quartzTaskOne())
                .withIdentity("QuartzTaskOne")
                .withSchedule(scheduleBuilder)
                .build();
    }

    @Bean
    public JobDetail quartzTaskTwo() {
        return JobBuilder.newJob(QuartzTaskTwo.class).withIdentity("QuartzTaskTwo").storeDurably().build();
    }

    @Bean
    public Trigger quartzTriggerTwo() {
        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.simpleSchedule()
                .withIntervalInSeconds(8)
                .repeatForever();
        return TriggerBuilder.newTrigger().forJob(quartzTaskTwo())
                .withIdentity("QuartzTaskTwo")
                .withSchedule(scheduleBuilder)
                .build();
    }
}
