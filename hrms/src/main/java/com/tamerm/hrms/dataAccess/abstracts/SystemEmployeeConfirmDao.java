package com.tamerm.hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tamerm.hrms.entities.concretes.SystemEmployeeConfirm;

public interface SystemEmployeeConfirmDao extends JpaRepository<SystemEmployeeConfirm, Integer> {

}
