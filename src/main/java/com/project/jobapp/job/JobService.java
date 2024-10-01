package com.project.jobapp.job;

import java.util.List;


public interface JobService {
    List<Job> findAll();
    void createJob(Job job);
    Job findById(Long id);
    Boolean deleteJob(Long id);
    Boolean updateJob(Long id, Job updatedJob);
}
