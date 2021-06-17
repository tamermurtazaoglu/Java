package com.tamerm.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tamerm.hrms.business.abstracts.CandidateService;
import com.tamerm.hrms.core.utilities.results.Result;
import com.tamerm.hrms.entities.concretes.Candidate;

@RestController
@RequestMapping("/api/candidate")
public class CandidateController {
	
	private CandidateService candidateService;
	
	@Autowired
	public CandidateController(CandidateService candidateService) {
		super();
		this.candidateService = candidateService;
	}
	
	@GetMapping("/getall")
	public List<Candidate> getAll() {
		return this.candidateService.getAll();
	}
	
	@PostMapping("/add")
	public Result add(@RequestBody Candidate candidate, String passwordAgain) {
		return this.candidateService.add(candidate);
	}
	
}
