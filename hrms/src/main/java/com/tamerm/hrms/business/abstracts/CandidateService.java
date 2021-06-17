package com.tamerm.hrms.business.abstracts;

import java.util.List;

import com.tamerm.hrms.core.utilities.results.Result;
import com.tamerm.hrms.entities.concretes.Candidate;

public interface CandidateService {
	List<Candidate> getAll(); 
	Result add(Candidate candidate);
}
