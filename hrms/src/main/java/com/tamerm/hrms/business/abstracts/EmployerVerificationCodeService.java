package com.tamerm.hrms.business.abstracts;

import com.tamerm.hrms.core.utilities.results.Result;
import com.tamerm.hrms.entities.concretes.Employer;

public interface EmployerVerificationCodeService extends VerificationCodeService {
	Result add(Employer employer);
}