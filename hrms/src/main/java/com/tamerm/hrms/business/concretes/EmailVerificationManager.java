package com.tamerm.hrms.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamerm.hrms.business.abstracts.VerificationService;
import com.tamerm.hrms.core.utilities.results.ErrorResult;
import com.tamerm.hrms.core.utilities.results.Result;
import com.tamerm.hrms.core.utilities.results.SuccessResult;
import com.tamerm.hrms.core.utilities.senders.email.EmailSender;
import com.tamerm.hrms.entities.concretes.User;

@Service
public class EmailVerificationManager implements VerificationService{
	
	EmailSender emailSender = new EmailSender();
	
	@Autowired
	public EmailVerificationManager() {
		
	}
	
	public Result send(String email,String code)
	{		
		boolean sendEmail = emailSender.sendVerificationCode(email, code);
		if(sendEmail == false)
		{
			return new ErrorResult();

		}else {
			return new SuccessResult();
		}
	}
	
//	public Result verify(String code, int userId) {
//		return this.verificationCodeService.verifyEmail(code, userId);
//		
//	}
	
}
