package io.growing.graphql;

import io.growing.graphql.api.JobService;
import io.growing.graphql.model.EventImportJobDto;

import java.util.List;

public class JobServiceJavaExample {

    public static void main(String[] args) {
        //JobService是SDK提供的一个封装，使用者可以参考这个service，使得接口更加易用
        JobService jobService = new JobService();
        List<EventImportJobDto> eventImportJobs = jobService.eventImportJobs();
        System.out.println(eventImportJobs);
    }
}