package com.tamerm.hrms.business.abstracts;

import java.util.List;

import com.tamerm.hrms.core.utilities.results.Result;
import com.tamerm.hrms.entities.concretes.SystemEmployee;

public interface SystemEmployeeService {
	List<SystemEmployee> getAll();
	Result add(SystemEmployee systemEmployee);
}
