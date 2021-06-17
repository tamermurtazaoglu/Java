package com.tamerm.hrms.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tamerm.hrms.business.abstracts.UserService;
import com.tamerm.hrms.core.utilities.results.ErrorResult;
import com.tamerm.hrms.core.utilities.results.Result;
import com.tamerm.hrms.core.utilities.results.SuccessResult;
import com.tamerm.hrms.dataAccess.abstracts.UserDao;
import com.tamerm.hrms.entities.concretes.User;

@Service
public class UserManager implements UserService{
	
	UserDao userDao;
	
	public UserManager(UserDao userDao) {
		this.userDao=userDao;
	}
	
	@Override
	public Result emailControl(User user) {
		List<User> users = this.userDao.findByEmail(user.getEmail()); 
		if(!(users.isEmpty()))
		{
			return new ErrorResult("This e-mail is already registered.");
		}
		return new SuccessResult();
	}

}