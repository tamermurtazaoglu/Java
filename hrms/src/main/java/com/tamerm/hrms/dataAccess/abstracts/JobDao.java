package com.tamerm.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tamerm.hrms.entities.concretes.Job;

public interface JobDao extends JpaRepository<Job, Integer> {

}
