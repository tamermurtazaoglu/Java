package com.tamerm.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tamerm.hrms.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer> {
	
}