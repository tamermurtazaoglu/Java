package com.tamerm.hrms.business.abstracts;

import com.tamerm.hrms.core.utilities.results.Result;
import com.tamerm.hrms.entities.concretes.SystemEmployeeConfirmEmployer;

public interface SystemEmployeeConfirmEmployerService {
	Result confirmEmployer(SystemEmployeeConfirmEmployer systemEmployeeConfirm);
	//Result add(SystemEmployeeConfirmEmployer systemEmployeeConfirmEmployer);
}
