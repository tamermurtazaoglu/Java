package com.tamerm.hrms.business.abstracts;

import com.tamerm.hrms.core.utilities.results.Result;

public interface VerificationService {
	Result send(String email,String code);
}