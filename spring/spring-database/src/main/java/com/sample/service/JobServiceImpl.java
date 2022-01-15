package com.sample.service;

import java.util.List;

import com.sample.dao.JobDao;
import com.sample.vo.Job;

public class JobServiceImpl implements JobService {
	
	private JobDao jobDao;
	
	public void setJobDao(JobDao jobDao) {
		this.jobDao = jobDao;
	}
	
	@Override
	public void insertNewJob(Job job) {
		if (getJobDetail(job.getId()) != null) {
			throw new RuntimeException("동일한 직종아이디가 이미 등록되어 있습니다");
		}
		if (job.getMaxSalary() <= job.getMinSalary()) {
			throw new RuntimeException("최대 급여는 최소 급여보다 작거나 같을 수 없습니다.");
		}
		jobDao.insertJob(job);
	}
	
	@Override
	public List<Job> getAllJobs() {
		return jobDao.getAllJobs();
	}

	@Override
	public List<Job> getJobBySalary(int minSalary, int maxSalary) {
		return jobDao.getJobsBySalary(minSalary, maxSalary);
	}

	@Override
	public Job getJobDetail(String jobId) {
		return jobDao.getJobById(jobId);
	}

}
