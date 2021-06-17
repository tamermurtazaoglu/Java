package com.tamerm.hrms.business.abstracts;

import java.util.List;

import com.tamerm.hrms.core.utilities.results.Result;
import com.tamerm.hrms.entities.concretes.Employer;

public interface EmployerService {
	List<Employer> getAll();
	Result add(Employer employer);
}
