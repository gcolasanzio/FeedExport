package com.gucci.FeedExporter.tasks;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduledTasks {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @Scheduled(fixedDelayString = "${scheduling.job.delay}")
    //@Scheduled(cron = "${scheduling.job.cron.expression}")
    public void stampaRoba(){

        LOGGER.info(""+(new Date()).getTime());

        System.out.println((new Date()).getTime());
    }




}
