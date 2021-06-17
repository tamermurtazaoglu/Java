package com.tamerm.hrms.business.abstracts;

import com.tamerm.hrms.core.utilities.results.Result;
import com.tamerm.hrms.entities.concretes.Candidate;

public interface CandidateVerificationCodeService extends VerificationCodeService{
	Result add(Candidate candidate);
}