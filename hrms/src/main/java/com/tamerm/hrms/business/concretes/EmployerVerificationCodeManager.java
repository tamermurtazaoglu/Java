package com.tamerm.hrms.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamerm.hrms.business.abstracts.EmployerVerificationCodeService;
import com.tamerm.hrms.business.abstracts.VerificationService;
import com.tamerm.hrms.core.utilities.results.ErrorResult;
import com.tamerm.hrms.core.utilities.results.Result;
import com.tamerm.hrms.core.utilities.results.SuccessResult;
import com.tamerm.hrms.dataAccess.abstracts.EmployerVerificationCodeDao;
import com.tamerm.hrms.entities.concretes.Employer;
import com.tamerm.hrms.entities.concretes.EmployerVerificationCode;

@Service
public class EmployerVerificationCodeManager implements EmployerVerificationCodeService{
	
	EmployerVerificationCodeDao employerVerificationCodeDao;
	VerificationService verificationService;
	
	@Autowired
	public EmployerVerificationCodeManager(EmployerVerificationCodeDao employerVerificationCodeDao,VerificationService verificationService) {
		this.employerVerificationCodeDao = employerVerificationCodeDao;
		this.verificationService = verificationService;
	}
	
	@Override
	public String createCode() {
		return "XN4EA84";
	}

	@Override
	public Result add(Employer employer) {
		
		String code = createCode();
		EmployerVerificationCode employerVerificationCode = new EmployerVerificationCode();
		employerVerificationCode.setCode(code);
		employerVerificationCode.setEmployerId(employer.getId());
		employerVerificationCodeDao.save(employerVerificationCode);
		return verificationService.send(employer.getEmail(), code);
	}
	
	public Result verifyEmail(String code, int employerId) {
		List<EmployerVerificationCode> codes = employerVerificationCodeDao.findByCode(code);
		if(!codes.isEmpty())
		{
			for (EmployerVerificationCode employerVerificationCode : codes) {
				if(employerVerificationCode.getEmployerId()==employerId) {
					if(employerVerificationCode.isVerified()==true) return new ErrorResult("This account has already been verified.");
					employerVerificationCode.setVerified(true);
					employerVerificationCode.setVerificationDate(LocalDate.now());
					return new SuccessResult("E-mail is verified.");		
				}
			}
		}
		return new ErrorResult("This verification code is invalid.");
	}

	
}