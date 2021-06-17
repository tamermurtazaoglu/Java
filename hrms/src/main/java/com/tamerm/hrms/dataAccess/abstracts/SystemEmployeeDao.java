package com.tamerm.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tamerm.hrms.entities.concretes.SystemEmployee;

public interface SystemEmployeeDao extends JpaRepository<SystemEmployee, Integer> {
	
}