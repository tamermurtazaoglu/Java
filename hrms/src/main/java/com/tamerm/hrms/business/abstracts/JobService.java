package com.tamerm.hrms.business.abstracts;

import java.util.List;

import com.tamerm.hrms.entities.concretes.Job;


public interface JobService {
	List<Job> getAll();
}
