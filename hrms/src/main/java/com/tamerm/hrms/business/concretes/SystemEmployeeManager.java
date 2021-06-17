package com.tamerm.hrms.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamerm.hrms.business.abstracts.SystemEmployeeService;
import com.tamerm.hrms.core.utilities.results.ErrorResult;
import com.tamerm.hrms.core.utilities.results.Result;
import com.tamerm.hrms.core.utilities.results.SuccessResult;
import com.tamerm.hrms.dataAccess.abstracts.SystemEmployeeDao;
import com.tamerm.hrms.entities.concretes.SystemEmployee;

@Service
public class SystemEmployeeManager implements SystemEmployeeService {
	 
	SystemEmployeeDao systemEmployeeDao;
    
    @Autowired
    public SystemEmployeeManager(SystemEmployeeDao systemEmployeeDao) {
    	this.systemEmployeeDao=systemEmployeeDao;
    }
    
    @Override
    public List<SystemEmployee> getAll() {
        return this.systemEmployeeDao.findAll();
    }

    @Override
    public Result add(SystemEmployee systemEmployee) {
        List<Result> results = new ArrayList<Result>();
        boolean isFail = false;
        Result nullControl = nullControlForAdd(systemEmployee);
//        Result passwordAgainControl= passwordAgainControl(systemEmployee);
        
        results.add(nullControl);
//        results.add(passwordAgainControl);
        
        for (var result : results) {
            if(!result.isSuccess())
            {
                isFail = true;
                return result;
            }
        }
        
        if(isFail == false)
        {
            this.systemEmployeeDao.save(systemEmployee);
            return new SuccessResult("System Employee added.");
        }
        
        return new ErrorResult();    
    }
    
    public Result nullControlForAdd(SystemEmployee systemEmployee) {
        if (    systemEmployee.getFirstName() == ""
                || systemEmployee.getLastName() == ""
                || systemEmployee.getEmail() == ""
                || systemEmployee.getPassword() == "" )
        {
            return new ErrorResult("Fill the all required fields.");
        }
        return new SuccessResult();
    }
    
//    public Result passwordAgainControl(SystemEmployee systemEmployee, String passwordAgain) {
//		if(!(systemEmployee.getPassword().intern() == passwordAgain.intern())) {
//			return new ErrorResult("passwords do not match");
//		}
//		else {
//			return new SuccessResult();
//		}
//	}
    
}