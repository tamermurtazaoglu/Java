package loginAndAuthSystemWithRegex.business.abstracts;

import java.util.ArrayList;
import java.util.List;

import loginAndAuthSystemWithRegex.entities.concretes.User;

public interface UserService {

	
	void register(User user);
	void login(String username, String password);
	void logout(User user);
	void registerWithService(User user);
	
}
