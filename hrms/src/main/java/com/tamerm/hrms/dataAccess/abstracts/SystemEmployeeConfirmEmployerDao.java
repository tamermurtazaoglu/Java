package com.tamerm.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tamerm.hrms.entities.concretes.SystemEmployeeConfirmEmployer;

public interface SystemEmployeeConfirmEmployerDao extends JpaRepository<SystemEmployeeConfirmEmployer, Integer>  {

}
