package com.tamerm.hrms.core.utilities.adapters;

import org.springframework.stereotype.Service;

import com.tamerm.hrms.MernisTest.MernisVerification;
import com.tamerm.hrms.entities.concretes.User;

@Service
public class MernisServiceAdapter {
	public boolean verify(User user)
	{
		MernisVerification adapter = new MernisVerification();
		return adapter.verify(user);
	}

}
