package com.tamerm.hrms.business.abstracts;

import java.util.List;

import com.tamerm.hrms.core.utilities.results.Result;
import com.tamerm.hrms.entities.concretes.Job;


public interface JobService {
	List<Job> getAll();
	Result add(Job job);
}
