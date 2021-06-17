package com.tamerm.hrms.business.concretes;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamerm.hrms.business.abstracts.SystemEmployeeConfirmEmployerService;
import com.tamerm.hrms.core.utilities.results.Result;
import com.tamerm.hrms.core.utilities.results.SuccessResult;
import com.tamerm.hrms.dataAccess.abstracts.SystemEmployeeConfirmEmployerDao;
import com.tamerm.hrms.entities.concretes.SystemEmployeeConfirmEmployer;

@Service
public class SystemEmployeeConfirmEmployerManager implements SystemEmployeeConfirmEmployerService {
	
	SystemEmployeeConfirmEmployerDao systemEmployeeConfirmEmployerDao;
	
	@Autowired
	public SystemEmployeeConfirmEmployerManager(SystemEmployeeConfirmEmployerDao systemEmployeeConfirmEmployerDao) {
		this.systemEmployeeConfirmEmployerDao = systemEmployeeConfirmEmployerDao;
	}
	
//	@Override
//	public Result add(SystemEmployeeConfirmEmployer systemEmployeeConfirmEmployer) {
//		 this.systemEmployeeConfirmEmployerDao.save(systemEmployeeConfirmEmployer); 
//		 return new SuccessResult("System employee confirm employer added");
//	}
	
	@Override
	public Result confirmEmployer(SystemEmployeeConfirmEmployer systemEmployeeConfirmEmployer) {
		systemEmployeeConfirmEmployer.setConfirmDate(Date.valueOf(LocalDate.now()));
		systemEmployeeConfirmEmployer.setConfirmed(true);
		systemEmployeeConfirmEmployerDao.save(systemEmployeeConfirmEmployer);
		
		return new SuccessResult("Employer is confirmed.");
	}
}