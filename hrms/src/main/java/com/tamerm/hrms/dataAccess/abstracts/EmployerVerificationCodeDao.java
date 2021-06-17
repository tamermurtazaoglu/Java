package com.tamerm.hrms.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tamerm.hrms.entities.concretes.EmployerVerificationCode;

public interface EmployerVerificationCodeDao extends JpaRepository<EmployerVerificationCode, Integer> {
	List<EmployerVerificationCode> findByCode(String code);
}