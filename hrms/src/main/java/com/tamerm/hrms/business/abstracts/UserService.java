package com.tamerm.hrms.business.abstracts;

import com.tamerm.hrms.core.utilities.results.Result;
import com.tamerm.hrms.dataAccess.abstracts.UserDao;
import com.tamerm.hrms.entities.concretes.User;

public interface UserService {
	Result emailControl(User user);
}
