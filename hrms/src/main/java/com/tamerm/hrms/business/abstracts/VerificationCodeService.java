package com.tamerm.hrms.business.abstracts;

import com.tamerm.hrms.core.utilities.results.Result;

public interface VerificationCodeService {
	String createCode();
	Result verifyEmail(String code , int userId);
}