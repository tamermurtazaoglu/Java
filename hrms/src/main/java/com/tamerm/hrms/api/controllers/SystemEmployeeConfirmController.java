package com.tamerm.hrms.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.tamerm.hrms.business.abstracts.SystemEmployeeConfirmEmployerService;
import com.tamerm.hrms.core.utilities.results.Result;
import com.tamerm.hrms.entities.concretes.SystemEmployeeConfirmEmployer;

public class SystemEmployeeConfirmController {
	
	private SystemEmployeeConfirmEmployerService systemEmployeeConfirmEmployerService;
	
	@Autowired
	public SystemEmployeeConfirmController(SystemEmployeeConfirmEmployerService systemEmployeeConfirmEmployerService) {		
		this.systemEmployeeConfirmEmployerService = systemEmployeeConfirmEmployerService;
	}
	
	@PostMapping("/confirmemployer")
	public Result confirm(@RequestBody SystemEmployeeConfirmEmployer systemEmployeeConfirmEmployer) {
		return this.systemEmployeeConfirmEmployerService.confirmEmployer(systemEmployeeConfirmEmployer);
	}

}