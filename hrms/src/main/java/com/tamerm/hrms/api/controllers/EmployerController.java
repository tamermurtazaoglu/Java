package com.tamerm.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tamerm.hrms.business.abstracts.EmployerService;
import com.tamerm.hrms.core.utilities.results.Result;
import com.tamerm.hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployerController {
	
	private EmployerService employerService;
	
	@Autowired
	public EmployerController(EmployerService employerService) {
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public List<Employer> getAll() {
		return this.employerService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Employer employer, @RequestBody String passwordAgain) {
		return this.employerService.add(employer);
	}
	
}
