package com.tamerm.hrms.business.concretes;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tamerm.hrms.business.abstracts.CandidateVerificationCodeService;
import com.tamerm.hrms.business.abstracts.VerificationService;
import com.tamerm.hrms.core.utilities.results.ErrorResult;
import com.tamerm.hrms.core.utilities.results.Result;
import com.tamerm.hrms.core.utilities.results.SuccessResult;
import com.tamerm.hrms.dataAccess.abstracts.CandidateVerificationCodeDao;
import com.tamerm.hrms.entities.concretes.Candidate;
import com.tamerm.hrms.entities.concretes.CandidateVerificationCode;

@Service
public class CandidateVerificationCodeManager implements CandidateVerificationCodeService{
	
	
	CandidateVerificationCodeDao candidateVerificationCodeDao;
	VerificationService verificationService;
	
	@Autowired
	public CandidateVerificationCodeManager(CandidateVerificationCodeDao candidateVerificationCodeDao,VerificationService verificationService) {
		this.candidateVerificationCodeDao = candidateVerificationCodeDao;
		this.verificationService = verificationService;
	}
		
	@Override
	public String createCode() {
		return "X52FB2KL";
	}
		
	@Override
	public Result add(Candidate candidate)
	{
		String code = createCode();
		CandidateVerificationCode candidateVerificationCode = new CandidateVerificationCode();
		
		candidateVerificationCode.setCode(code);
		candidateVerificationCode.setCandidateId(candidate.getId());
		candidateVerificationCodeDao.save(candidateVerificationCode);
		
		return verificationService.send(candidate.getEmail(), code);	
	}
	
	public Result verifyEmail(String code, int candidateId) {
		List<CandidateVerificationCode> codes = candidateVerificationCodeDao.findByCode(code);
		if(!codes.isEmpty())
		{
			for (CandidateVerificationCode candidateVerificationCode : codes) {
				if(candidateVerificationCode.getCandidateId()==candidateId) {
					if(candidateVerificationCode.isVerified()==true) return new ErrorResult("This account has already been verified.");
					candidateVerificationCode.setVerified(true);
					candidateVerificationCode.setVerificationDate(LocalDate.now());
					return new SuccessResult("Account is verified.");		
				}
			}
					
		}
		return new ErrorResult("This verification code is invalid.");
	}
	
} 
