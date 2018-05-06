package com.garlicts.framework.plugin.job;

import org.quartz.Job;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.spi.JobFactory;
import org.quartz.spi.TriggerFiredBundle;

import com.garlicts.framework.ioc.BeanContainerComponent;

public class GarlictsJobFactory implements JobFactory {

    @Override
    public Job newJob(TriggerFiredBundle bundle, Scheduler scheduler) throws SchedulerException {
        JobDetail jobDetail = bundle.getJobDetail();
        Class<? extends Job> jobClass = jobDetail.getJobClass();
        return BeanContainerComponent.getBean(jobClass);
    }
    
}
