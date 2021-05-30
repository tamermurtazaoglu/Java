package com.tamerm.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamerm.hrms.business.abstracts.JobService;
import com.tamerm.hrms.dataAccess.abstracts.JobDao;
import com.tamerm.hrms.entities.concretes.Job;

@Service
public class JobManager implements JobService{

	JobDao JobDao;
	
	@Autowired
	public JobManager(JobDao jobDao) {
		this.JobDao = jobDao;
	}
	
	@Override
	public List<Job> getAll() {
		return this.JobDao.findAll();
	}
	
}
