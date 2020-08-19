package io.growing.graphql.example.job;

import io.growing.graphql.api.JobService;
import io.growing.graphql.model.EventImportJobDto;

import java.util.List;

public class JobServiceJavaExample {

    public static void main(String[] args) {
        JobService jobService = new JobService();
        List<EventImportJobDto> eventImportJobs = jobService.eventImportJobs();
        System.out.println(eventImportJobs);
    }
}